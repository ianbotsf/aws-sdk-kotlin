// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GetReservedInstancesExchangeQuoteRequest
import aws.sdk.kotlin.services.ec2.model.TargetConfigurationRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class GetReservedInstancesExchangeQuoteOperationSerializer: HttpSerialize<GetReservedInstancesExchangeQuoteRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetReservedInstancesExchangeQuoteRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeGetReservedInstancesExchangeQuoteOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeGetReservedInstancesExchangeQuoteOperationBody(context: ExecutionContext, input: GetReservedInstancesExchangeQuoteRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val RESERVEDINSTANCEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ReservedInstanceId"), FormUrlFlattened)
    val TARGETCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TargetConfiguration"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("GetReservedInstancesExchangeQuoteRequest"))
        trait(QueryLiteral("Action", "GetReservedInstancesExchangeQuote"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(RESERVEDINSTANCEIDS_DESCRIPTOR)
        field(TARGETCONFIGURATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.reservedInstanceIds != null) {
            listField(RESERVEDINSTANCEIDS_DESCRIPTOR) {
                for (el0 in input.reservedInstanceIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.targetConfigurations != null) {
            listField(TARGETCONFIGURATIONS_DESCRIPTOR) {
                for (el0 in input.targetConfigurations) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTargetConfigurationRequestDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
