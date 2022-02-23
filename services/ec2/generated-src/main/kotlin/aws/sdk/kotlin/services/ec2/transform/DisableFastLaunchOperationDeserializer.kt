// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DisableFastLaunchResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse
import aws.sdk.kotlin.services.ec2.model.FastLaunchResourceType
import aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse
import aws.sdk.kotlin.services.ec2.model.FastLaunchStateCode
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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


internal class DisableFastLaunchOperationDeserializer: HttpDeserialize<DisableFastLaunchResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DisableFastLaunchResponse {
        if (!response.status.isSuccess()) {
            throwDisableFastLaunchError(context, response)
        }
        val builder = DisableFastLaunchResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDisableFastLaunchOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDisableFastLaunchError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw Ec2Exception("Failed to parse response as 'ec2Query' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        else -> Ec2Exception(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeDisableFastLaunchOperationBody(builder: DisableFastLaunchResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val LAUNCHTEMPLATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("launchTemplate"))
    val MAXPARALLELLAUNCHES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("maxParallelLaunches"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceType"))
    val SNAPSHOTCONFIGURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("snapshotConfiguration"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STATETRANSITIONREASON_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("stateTransitionReason"))
    val STATETRANSITIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("stateTransitionTime"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DisableFastLaunchResult"))
        field(IMAGEID_DESCRIPTOR)
        field(LAUNCHTEMPLATE_DESCRIPTOR)
        field(MAXPARALLELLAUNCHES_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
        field(SNAPSHOTCONFIGURATION_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATETRANSITIONREASON_DESCRIPTOR)
        field(STATETRANSITIONTIME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                LAUNCHTEMPLATE_DESCRIPTOR.index -> builder.launchTemplate = deserializeFastLaunchLaunchTemplateSpecificationResponseDocument(deserializer)
                MAXPARALLELLAUNCHES_DESCRIPTOR.index -> builder.maxParallelLaunches = deserializeInt()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                RESOURCETYPE_DESCRIPTOR.index -> builder.resourceType = deserializeString().let { FastLaunchResourceType.fromValue(it) }
                SNAPSHOTCONFIGURATION_DESCRIPTOR.index -> builder.snapshotConfiguration = deserializeFastLaunchSnapshotConfigurationResponseDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { FastLaunchStateCode.fromValue(it) }
                STATETRANSITIONREASON_DESCRIPTOR.index -> builder.stateTransitionReason = deserializeString()
                STATETRANSITIONTIME_DESCRIPTOR.index -> builder.stateTransitionTime = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
