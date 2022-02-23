// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.CreateGlobalTableRequest
import aws.sdk.kotlin.services.dynamodb.model.Replica
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


internal class CreateGlobalTableOperationSerializer: HttpSerialize<CreateGlobalTableRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateGlobalTableRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateGlobalTableOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeCreateGlobalTableOperationBody(context: ExecutionContext, input: CreateGlobalTableRequest): ByteArray {
    val serializer = JsonSerializer()
    val GLOBALTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableName"))
    val REPLICATIONGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ReplicationGroup"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALTABLENAME_DESCRIPTOR)
        field(REPLICATIONGROUP_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.globalTableName?.let { field(GLOBALTABLENAME_DESCRIPTOR, it) }
        if (input.replicationGroup != null) {
            listField(REPLICATIONGROUP_DESCRIPTOR) {
                for (el0 in input.replicationGroup) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeReplicaDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
