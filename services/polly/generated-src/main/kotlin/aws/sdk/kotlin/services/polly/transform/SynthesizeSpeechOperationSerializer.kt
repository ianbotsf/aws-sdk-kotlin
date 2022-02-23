// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.services.polly.model.Engine
import aws.sdk.kotlin.services.polly.model.LanguageCode
import aws.sdk.kotlin.services.polly.model.OutputFormat
import aws.sdk.kotlin.services.polly.model.SpeechMarkType
import aws.sdk.kotlin.services.polly.model.SynthesizeSpeechRequest
import aws.sdk.kotlin.services.polly.model.TextType
import aws.sdk.kotlin.services.polly.model.VoiceId
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class SynthesizeSpeechOperationSerializer: HttpSerialize<SynthesizeSpeechRequest> {
    override suspend fun serialize(context: ExecutionContext, input: SynthesizeSpeechRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/v1/speech"
        }

        val payload = serializeSynthesizeSpeechOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/json")
        return builder
    }
}

private fun serializeSynthesizeSpeechOperationBody(context: ExecutionContext, input: SynthesizeSpeechRequest): ByteArray {
    val serializer = JsonSerializer()
    val ENGINE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Engine"))
    val LANGUAGECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("LanguageCode"))
    val LEXICONNAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("LexiconNames"))
    val OUTPUTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("OutputFormat"))
    val SAMPLERATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("SampleRate"))
    val SPEECHMARKTYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("SpeechMarkTypes"))
    val TEXT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Text"))
    val TEXTTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TextType"))
    val VOICEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("VoiceId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ENGINE_DESCRIPTOR)
        field(LANGUAGECODE_DESCRIPTOR)
        field(LEXICONNAMES_DESCRIPTOR)
        field(OUTPUTFORMAT_DESCRIPTOR)
        field(SAMPLERATE_DESCRIPTOR)
        field(SPEECHMARKTYPES_DESCRIPTOR)
        field(TEXT_DESCRIPTOR)
        field(TEXTTYPE_DESCRIPTOR)
        field(VOICEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.engine?.let { field(ENGINE_DESCRIPTOR, it.value) }
        input.languageCode?.let { field(LANGUAGECODE_DESCRIPTOR, it.value) }
        if (input.lexiconNames != null) {
            listField(LEXICONNAMES_DESCRIPTOR) {
                for (el0 in input.lexiconNames) {
                    serializeString(el0)
                }
            }
        }
        input.outputFormat?.let { field(OUTPUTFORMAT_DESCRIPTOR, it.value) }
        input.sampleRate?.let { field(SAMPLERATE_DESCRIPTOR, it) }
        if (input.speechMarkTypes != null) {
            listField(SPEECHMARKTYPES_DESCRIPTOR) {
                for (el0 in input.speechMarkTypes) {
                    serializeString(el0.value)
                }
            }
        }
        input.text?.let { field(TEXT_DESCRIPTOR, it) }
        input.textType?.let { field(TEXTTYPE_DESCRIPTOR, it.value) }
        input.voiceId?.let { field(VOICEID_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
