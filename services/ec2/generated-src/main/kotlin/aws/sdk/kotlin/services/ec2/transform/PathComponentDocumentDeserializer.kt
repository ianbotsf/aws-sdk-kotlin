// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PathComponent
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

internal fun deserializePathComponentDocument(deserializer: Deserializer): PathComponent {
    val builder = PathComponent.Builder()
    val ACLRULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("aclRule"))
    val ATTACHEDTO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("attachedTo"))
    val COMPONENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("component"))
    val DESTINATIONVPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("destinationVpc"))
    val INBOUNDHEADER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("inboundHeader"))
    val OUTBOUNDHEADER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("outboundHeader"))
    val ROUTETABLEROUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("routeTableRoute"))
    val SECURITYGROUPRULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("securityGroupRule"))
    val SEQUENCENUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("sequenceNumber"))
    val SOURCEVPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("sourceVpc"))
    val SUBNET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("subnet"))
    val VPC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vpc"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PathComponent"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACLRULE_DESCRIPTOR)
        field(ATTACHEDTO_DESCRIPTOR)
        field(COMPONENT_DESCRIPTOR)
        field(DESTINATIONVPC_DESCRIPTOR)
        field(INBOUNDHEADER_DESCRIPTOR)
        field(OUTBOUNDHEADER_DESCRIPTOR)
        field(ROUTETABLEROUTE_DESCRIPTOR)
        field(SECURITYGROUPRULE_DESCRIPTOR)
        field(SEQUENCENUMBER_DESCRIPTOR)
        field(SOURCEVPC_DESCRIPTOR)
        field(SUBNET_DESCRIPTOR)
        field(VPC_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACLRULE_DESCRIPTOR.index -> builder.aclRule = deserializeAnalysisAclRuleDocument(deserializer)
                ATTACHEDTO_DESCRIPTOR.index -> builder.attachedTo = deserializeAnalysisComponentDocument(deserializer)
                COMPONENT_DESCRIPTOR.index -> builder.component = deserializeAnalysisComponentDocument(deserializer)
                DESTINATIONVPC_DESCRIPTOR.index -> builder.destinationVpc = deserializeAnalysisComponentDocument(deserializer)
                INBOUNDHEADER_DESCRIPTOR.index -> builder.inboundHeader = deserializeAnalysisPacketHeaderDocument(deserializer)
                OUTBOUNDHEADER_DESCRIPTOR.index -> builder.outboundHeader = deserializeAnalysisPacketHeaderDocument(deserializer)
                ROUTETABLEROUTE_DESCRIPTOR.index -> builder.routeTableRoute = deserializeAnalysisRouteTableRouteDocument(deserializer)
                SECURITYGROUPRULE_DESCRIPTOR.index -> builder.securityGroupRule = deserializeAnalysisSecurityGroupRuleDocument(deserializer)
                SEQUENCENUMBER_DESCRIPTOR.index -> builder.sequenceNumber = deserializeInt()
                SOURCEVPC_DESCRIPTOR.index -> builder.sourceVpc = deserializeAnalysisComponentDocument(deserializer)
                SUBNET_DESCRIPTOR.index -> builder.subnet = deserializeAnalysisComponentDocument(deserializer)
                VPC_DESCRIPTOR.index -> builder.vpc = deserializeAnalysisComponentDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
