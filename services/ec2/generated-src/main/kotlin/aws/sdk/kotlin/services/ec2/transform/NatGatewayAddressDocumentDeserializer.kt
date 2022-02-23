// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.NatGatewayAddress
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

internal fun deserializeNatGatewayAddressDocument(deserializer: Deserializer): NatGatewayAddress {
    val builder = NatGatewayAddress.Builder()
    val ALLOCATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("allocationId"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val PRIVATEIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateIp"))
    val PUBLICIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("publicIp"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NatGatewayAddress"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ALLOCATIONID_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PRIVATEIP_DESCRIPTOR)
        field(PUBLICIP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ALLOCATIONID_DESCRIPTOR.index -> builder.allocationId = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                PRIVATEIP_DESCRIPTOR.index -> builder.privateIp = deserializeString()
                PUBLICIP_DESCRIPTOR.index -> builder.publicIp = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
