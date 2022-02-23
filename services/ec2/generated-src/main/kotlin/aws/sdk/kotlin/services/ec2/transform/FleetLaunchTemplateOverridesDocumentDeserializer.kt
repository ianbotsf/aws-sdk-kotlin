// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides
import aws.sdk.kotlin.services.ec2.model.InstanceType
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

internal fun deserializeFleetLaunchTemplateOverridesDocument(deserializer: Deserializer): FleetLaunchTemplateOverrides {
    val builder = FleetLaunchTemplateOverrides.Builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val INSTANCEREQUIREMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceRequirements"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val MAXPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("maxPrice"))
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("placement"))
    val PRIORITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, XmlSerialName("priority"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val WEIGHTEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, XmlSerialName("weightedCapacity"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FleetLaunchTemplateOverrides"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(INSTANCEREQUIREMENTS_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(MAXPRICE_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(PRIORITY_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(WEIGHTEDCAPACITY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                INSTANCEREQUIREMENTS_DESCRIPTOR.index -> builder.instanceRequirements = deserializeInstanceRequirementsDocument(deserializer)
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString().let { InstanceType.fromValue(it) }
                MAXPRICE_DESCRIPTOR.index -> builder.maxPrice = deserializeString()
                PLACEMENT_DESCRIPTOR.index -> builder.placement = deserializePlacementResponseDocument(deserializer)
                PRIORITY_DESCRIPTOR.index -> builder.priority = deserializeDouble()
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                WEIGHTEDCAPACITY_DESCRIPTOR.index -> builder.weightedCapacity = deserializeDouble()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
