// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FlowLog
import aws.sdk.kotlin.services.ec2.model.LogDestinationType
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TrafficType
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeFlowLogDocument(deserializer: Deserializer): FlowLog {
    val builder = FlowLog.Builder()
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val DELIVERLOGSERRORMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("deliverLogsErrorMessage"))
    val DELIVERLOGSPERMISSIONARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("deliverLogsPermissionArn"))
    val DELIVERLOGSSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("deliverLogsStatus"))
    val DESTINATIONOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("destinationOptions"))
    val FLOWLOGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("flowLogId"))
    val FLOWLOGSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("flowLogStatus"))
    val LOGDESTINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("logDestination"))
    val LOGDESTINATIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("logDestinationType"))
    val LOGFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("logFormat"))
    val LOGGROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("logGroupName"))
    val MAXAGGREGATIONINTERVAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("maxAggregationInterval"))
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRAFFICTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("trafficType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FlowLog"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CREATIONTIME_DESCRIPTOR)
        field(DELIVERLOGSERRORMESSAGE_DESCRIPTOR)
        field(DELIVERLOGSPERMISSIONARN_DESCRIPTOR)
        field(DELIVERLOGSSTATUS_DESCRIPTOR)
        field(DESTINATIONOPTIONS_DESCRIPTOR)
        field(FLOWLOGID_DESCRIPTOR)
        field(FLOWLOGSTATUS_DESCRIPTOR)
        field(LOGDESTINATION_DESCRIPTOR)
        field(LOGDESTINATIONTYPE_DESCRIPTOR)
        field(LOGFORMAT_DESCRIPTOR)
        field(LOGGROUPNAME_DESCRIPTOR)
        field(MAXAGGREGATIONINTERVAL_DESCRIPTOR)
        field(RESOURCEID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRAFFICTYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                DELIVERLOGSERRORMESSAGE_DESCRIPTOR.index -> builder.deliverLogsErrorMessage = deserializeString()
                DELIVERLOGSPERMISSIONARN_DESCRIPTOR.index -> builder.deliverLogsPermissionArn = deserializeString()
                DELIVERLOGSSTATUS_DESCRIPTOR.index -> builder.deliverLogsStatus = deserializeString()
                DESTINATIONOPTIONS_DESCRIPTOR.index -> builder.destinationOptions = deserializeDestinationOptionsResponseDocument(deserializer)
                FLOWLOGID_DESCRIPTOR.index -> builder.flowLogId = deserializeString()
                FLOWLOGSTATUS_DESCRIPTOR.index -> builder.flowLogStatus = deserializeString()
                LOGDESTINATION_DESCRIPTOR.index -> builder.logDestination = deserializeString()
                LOGDESTINATIONTYPE_DESCRIPTOR.index -> builder.logDestinationType = deserializeString().let { LogDestinationType.fromValue(it) }
                LOGFORMAT_DESCRIPTOR.index -> builder.logFormat = deserializeString()
                LOGGROUPNAME_DESCRIPTOR.index -> builder.logGroupName = deserializeString()
                MAXAGGREGATIONINTERVAL_DESCRIPTOR.index -> builder.maxAggregationInterval = deserializeInt()
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRAFFICTYPE_DESCRIPTOR.index -> builder.trafficType = deserializeString().let { TrafficType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
