// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexUpdate
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeGlobalSecondaryIndexUpdateDocument(serializer: Serializer, input: GlobalSecondaryIndexUpdate) {
    val CREATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Create"))
    val DELETE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Delete"))
    val UPDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Update"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CREATE_DESCRIPTOR)
        field(DELETE_DESCRIPTOR)
        field(UPDATE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.update?.let { field(UPDATE_DESCRIPTOR, it, ::serializeUpdateGlobalSecondaryIndexActionDocument) }
        input.create?.let { field(CREATE_DESCRIPTOR, it, ::serializeCreateGlobalSecondaryIndexActionDocument) }
        input.delete?.let { field(DELETE_DESCRIPTOR, it, ::serializeDeleteGlobalSecondaryIndexActionDocument) }
    }
}
