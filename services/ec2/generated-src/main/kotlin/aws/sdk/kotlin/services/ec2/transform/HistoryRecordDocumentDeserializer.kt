// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EventType
import aws.sdk.kotlin.services.ec2.model.HistoryRecord
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeHistoryRecordDocument(deserializer: Deserializer): HistoryRecord {
    val builder = HistoryRecord.Builder()
    val EVENTINFORMATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("eventInformation"))
    val EVENTTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("eventType"))
    val TIMESTAMP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("timestamp"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("HistoryRecord"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(EVENTINFORMATION_DESCRIPTOR)
        field(EVENTTYPE_DESCRIPTOR)
        field(TIMESTAMP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EVENTINFORMATION_DESCRIPTOR.index -> builder.eventInformation = deserializeEventInformationDocument(deserializer)
                EVENTTYPE_DESCRIPTOR.index -> builder.eventType = deserializeString().let { EventType.fromValue(it) }
                TIMESTAMP_DESCRIPTOR.index -> builder.timestamp = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
