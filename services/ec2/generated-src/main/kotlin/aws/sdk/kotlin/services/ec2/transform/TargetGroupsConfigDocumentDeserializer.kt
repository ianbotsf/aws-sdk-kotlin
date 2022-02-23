// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TargetGroup
import aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig
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

internal fun deserializeTargetGroupsConfigDocument(deserializer: Deserializer): TargetGroupsConfig {
    val builder = TargetGroupsConfig.Builder()
    val TARGETGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("targetGroups"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TargetGroupsConfig"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(TARGETGROUPS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                TARGETGROUPS_DESCRIPTOR.index -> builder.targetGroups =
                    deserializer.deserializeList(TARGETGROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<TargetGroup>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTargetGroupDocument(deserializer) } else { deserializeNull(); continue }
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
