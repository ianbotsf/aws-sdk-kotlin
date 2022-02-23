// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptionsRequest
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
import aws.smithy.kotlin.runtime.time.TimestampFormat

internal fun serializeLaunchTemplateSpotMarketOptionsRequestDocument(serializer: Serializer, input: LaunchTemplateSpotMarketOptionsRequest) {
    val BLOCKDURATIONMINUTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("BlockDurationMinutes"))
    val INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceInterruptionBehavior"))
    val MAXPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("MaxPrice"))
    val SPOTINSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SpotInstanceType"))
    val VALIDUNTIL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("ValidUntil"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateSpotMarketOptionsRequest"))
        field(BLOCKDURATIONMINUTES_DESCRIPTOR)
        field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR)
        field(MAXPRICE_DESCRIPTOR)
        field(SPOTINSTANCETYPE_DESCRIPTOR)
        field(VALIDUNTIL_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.maxPrice?.let { field(MAXPRICE_DESCRIPTOR, it) }
        input.spotInstanceType?.let { field(SPOTINSTANCETYPE_DESCRIPTOR, it.value) }
        input.blockDurationMinutes?.let { field(BLOCKDURATIONMINUTES_DESCRIPTOR, it) }
        input.validUntil?.let { field(VALIDUNTIL_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.instanceInterruptionBehavior?.let { field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR, it.value) }
    }
}
