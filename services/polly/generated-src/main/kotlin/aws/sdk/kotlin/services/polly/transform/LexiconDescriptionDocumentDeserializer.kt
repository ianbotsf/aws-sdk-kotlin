// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.services.polly.model.LexiconDescription
import aws.smithy.kotlin.runtime.serde.Deserializer
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
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun deserializeLexiconDescriptionDocument(deserializer: Deserializer): LexiconDescription {
    val builder = LexiconDescription.Builder()
    val ATTRIBUTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Attributes"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Name"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTES_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTRIBUTES_DESCRIPTOR.index -> builder.attributes = deserializeLexiconAttributesDocument(deserializer)
                NAME_DESCRIPTOR.index -> builder.name = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
