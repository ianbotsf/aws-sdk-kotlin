// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.services.sts.model.Tag
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeTagDocument(serializer: Serializer, input: Tag) {
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Key"))
    val VALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Value"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("Tag"))
        field(KEY_DESCRIPTOR)
        field(VALUE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.key?.let { field(KEY_DESCRIPTOR, it) }
        input.value?.let { field(VALUE_DESCRIPTOR, it) }
    }
}
