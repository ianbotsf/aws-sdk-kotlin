/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.codegen.protocols.eventstream

import aws.sdk.kotlin.codegen.AwsRuntimeTypes
import software.amazon.smithy.codegen.core.CodegenException
import software.amazon.smithy.codegen.core.Symbol
import software.amazon.smithy.kotlin.codegen.core.*
import software.amazon.smithy.kotlin.codegen.lang.KotlinTypes
import software.amazon.smithy.kotlin.codegen.model.*
import software.amazon.smithy.kotlin.codegen.rendering.protocol.ProtocolGenerator
import software.amazon.smithy.kotlin.codegen.rendering.serde.*
import software.amazon.smithy.model.shapes.*
import software.amazon.smithy.model.traits.EventHeaderTrait
import software.amazon.smithy.model.traits.EventPayloadTrait

/**
 * Implements rendering serialize implementation for event streams implemented using the
 * `vnd.amazon.event-stream` content-type
 *
 * @param sdg the structured data serializer generator
 * @param payloadContentType the content-type to use when sending structured data (e.g. `application/json`)
 */
class EventStreamSerializerGenerator(
    private val sdg: StructuredDataSerializerGenerator,
    private val payloadContentType: String,
) {

    /**
     * Return the function responsible for serializing an operation output that targets an event stream
     *
     * ```
     * private suspend fun serializeFooOperationBody(input: FooInput): HttpBody { ... }
     * ```
     */
    fun requestHandler(ctx: ProtocolGenerator.GenerationContext, op: OperationShape): Symbol =
        // FIXME - don't use the body serializer name since we may need to re-use it (albeit with a different signature, we should still be more explicit than this)
        op.bodySerializer(ctx.settings) { writer ->
            val inputSymbol = ctx.symbolProvider.toSymbol(ctx.model.expectShape<StructureShape>(op.input.get()))
            writer.withBlock(
                "private suspend fun #L(context: #T, input: #T): #T {",
                "}",
                op.bodySerializerName(),
                RuntimeTypes.Core.ExecutionContext,
                inputSymbol,
                RuntimeTypes.Http.HttpBody
            ) {
                renderSerializeEventStream(ctx, op, writer)
            }
        }

    private fun renderSerializeEventStream(
        ctx: ProtocolGenerator.GenerationContext,
        op: OperationShape,
        writer: KotlinWriter
    ) {
        val input = ctx.model.expectShape<StructureShape>(op.input.get())
        val streamingMember = input.findStreamingMember(ctx.model) ?: error("expected a streaming member for $input")
        val streamShape = ctx.model.expectShape<UnionShape>(streamingMember.target)

        writer.write("val stream = input.#L ?: return #T.Empty", streamingMember.defaultName(), RuntimeTypes.Http.HttpBody)
        writer.write("val signingConfig = context.#T()", AwsRuntimeTypes.AwsEventStream.newEventStreamSigningConfig)

        val encodeFn = encodeEventStreamMessage(ctx, op, streamShape)
        writer.write("val messages = stream.#T {", RuntimeTypes.KotlinxCoroutines.Flow.map)
            .indent()
            .indent()
            .write("#T(it)", encodeFn)
            .dedent()
            .write("}")
            .write(".#T(context, signingConfig)", AwsRuntimeTypes.AwsEventStream.sign)
            .write(".#T()", AwsRuntimeTypes.AwsEventStream.encode)
            .dedent()

        writer.write("")
        writer.write("return messages.#T()", AwsRuntimeTypes.AwsEventStream.asEventStreamHttpBody)
    }

    private fun encodeEventStreamMessage(
        ctx: ProtocolGenerator.GenerationContext,
        op: OperationShape,
        streamShape: UnionShape,
    ): Symbol = buildSymbol {
        val streamSymbol = ctx.symbolProvider.toSymbol(streamShape)
        val fnName = "encode${op.capitalizedDefaultName()}${streamSymbol.name}EventMessage"
        name = fnName
        namespace = ctx.settings.pkg.subpackage("transform")
        // place it in same file as the operation serializer
        definitionFile = "${op.serializerName()}.kt"

        renderBy = { writer ->
            // FIXME - make internal and share across operations?
            writer.withBlock(
                "private fun #L(input: #T): #T = #T {", "}",
                fnName,
                streamSymbol,
                AwsRuntimeTypes.AwsEventStream.Message,
                AwsRuntimeTypes.AwsEventStream.buildMessage
            ) {
                addStringHeader(":message-type", "event")

                withBlock("when(input) {", "}") {
                    streamShape.filterEventStreamErrors(ctx.model)
                        .forEach { member ->
                            withBlock(
                                "is #T.#L -> {", "}",
                                streamSymbol,
                                member.unionVariantName()
                            ) {
                                addStringHeader(":event-type", member.memberName)
                                val target = ctx.model.expectShape(member.target)
                                target.members().forEach { targetMember ->
                                    when {
                                        targetMember.hasTrait<EventHeaderTrait>() -> renderSerializeEventHeader(ctx, targetMember, writer)
                                        targetMember.hasTrait<EventPayloadTrait>() -> renderSerializeEventPayload(ctx, targetMember, writer)
                                    }
                                }
                            }
                        }
                    write("is #T.SdkUnknown -> error(#S)", streamSymbol, "cannot serialize the unknown event type!")
                }
            }
        }
    }

    private fun renderSerializeEventHeader(ctx: ProtocolGenerator.GenerationContext, member: MemberShape, writer: KotlinWriter) {
        val target = ctx.model.expectShape(member.target)
        val headerValue = when (target.type) {
            ShapeType.BOOLEAN -> "Bool"
            ShapeType.BYTE -> "Byte"
            ShapeType.SHORT -> "Int16"
            ShapeType.INTEGER -> "Int32"
            ShapeType.LONG -> "Int64"
            ShapeType.BLOB -> "ByteArray"
            ShapeType.STRING -> "String"
            ShapeType.TIMESTAMP -> "Timestamp"
            else -> throw CodegenException("unsupported shape type `${target.type}` for eventHeader member `$member`; target: $target")
        }
        val conversion = if (target.type == ShapeType.BYTE) ".toUByte()" else ""

        writer.write(
            "input.value.#L?.let { addHeader(#S, #T.#L(it$conversion)) }",
            member.defaultName(),
            member.memberName,
            AwsRuntimeTypes.AwsEventStream.HeaderValue,
            headerValue
        )
    }

    private fun renderSerializeEventPayload(ctx: ProtocolGenerator.GenerationContext, member: MemberShape, writer: KotlinWriter) {
        // structure > :test(member > :test(blob, string, structure, union))
        val target = ctx.model.expectShape(member.target)
        when (target.type) {
            // input is the sealed class, each variant is generated with `value` as the property name of the type being wrapped
            ShapeType.BLOB -> {
                writer.addStringHeader(":content-type", "application/octet-stream")
                writer.write("payload = input.value.#L", member.defaultName())
            }
            ShapeType.STRING -> {
                writer.addStringHeader(":content-type", "text/plain")
                writer.write("payload = input.value.#L.#T()", member.defaultName(), KotlinTypes.Text.encodeToByteArray)
            }
            ShapeType.STRUCTURE, ShapeType.UNION -> {
                writer.addStringHeader(":content-type", payloadContentType)
                // re-use the payload serializer
                val serializeFn = sdg.payloadSerializer(ctx, member)
                writer.write("payload = #T(input.value)", serializeFn)
            }
            else -> throw CodegenException("unsupported shape type `${target.type}` for target: $target; expected blob, string, structure, or union for eventPayload member: $member")
        }
    }

    private fun KotlinWriter.addStringHeader(name: String, value: String) {
        write("addHeader(#S, #T.String(#S))", name, AwsRuntimeTypes.AwsEventStream.HeaderValue, value)
    }
}
