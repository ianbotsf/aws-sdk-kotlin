// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PacketHeaderStatement
import aws.sdk.kotlin.services.ec2.model.Protocol
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

internal fun deserializePacketHeaderStatementDocument(deserializer: Deserializer): PacketHeaderStatement {
    val builder = PacketHeaderStatement.Builder()
    val DESTINATIONADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("destinationAddressSet"), XmlCollectionName("item"))
    val DESTINATIONPORTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("destinationPortSet"), XmlCollectionName("item"))
    val DESTINATIONPREFIXLISTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("destinationPrefixListSet"), XmlCollectionName("item"))
    val PROTOCOLS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("protocolSet"), XmlCollectionName("item"))
    val SOURCEADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("sourceAddressSet"), XmlCollectionName("item"))
    val SOURCEPORTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("sourcePortSet"), XmlCollectionName("item"))
    val SOURCEPREFIXLISTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("sourcePrefixListSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PacketHeaderStatement"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESTINATIONADDRESSES_DESCRIPTOR)
        field(DESTINATIONPORTS_DESCRIPTOR)
        field(DESTINATIONPREFIXLISTS_DESCRIPTOR)
        field(PROTOCOLS_DESCRIPTOR)
        field(SOURCEADDRESSES_DESCRIPTOR)
        field(SOURCEPORTS_DESCRIPTOR)
        field(SOURCEPREFIXLISTS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESTINATIONADDRESSES_DESCRIPTOR.index -> builder.destinationAddresses =
                    deserializer.deserializeList(DESTINATIONADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                DESTINATIONPORTS_DESCRIPTOR.index -> builder.destinationPorts =
                    deserializer.deserializeList(DESTINATIONPORTS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                DESTINATIONPREFIXLISTS_DESCRIPTOR.index -> builder.destinationPrefixLists =
                    deserializer.deserializeList(DESTINATIONPREFIXLISTS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PROTOCOLS_DESCRIPTOR.index -> builder.protocols =
                    deserializer.deserializeList(PROTOCOLS_DESCRIPTOR) {
                        val col0 = mutableListOf<Protocol>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { Protocol.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SOURCEADDRESSES_DESCRIPTOR.index -> builder.sourceAddresses =
                    deserializer.deserializeList(SOURCEADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SOURCEPORTS_DESCRIPTOR.index -> builder.sourcePorts =
                    deserializer.deserializeList(SOURCEPORTS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SOURCEPREFIXLISTS_DESCRIPTOR.index -> builder.sourcePrefixLists =
                    deserializer.deserializeList(SOURCEPREFIXLISTS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
