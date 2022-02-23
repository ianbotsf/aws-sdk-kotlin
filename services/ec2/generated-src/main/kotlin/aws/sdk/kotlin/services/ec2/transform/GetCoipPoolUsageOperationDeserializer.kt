// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CoipAddressUsage
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.GetCoipPoolUsageResponse
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class GetCoipPoolUsageOperationDeserializer: HttpDeserialize<GetCoipPoolUsageResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetCoipPoolUsageResponse {
        if (!response.status.isSuccess()) {
            throwGetCoipPoolUsageError(context, response)
        }
        val builder = GetCoipPoolUsageResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetCoipPoolUsageOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwGetCoipPoolUsageError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeGetCoipPoolUsageOperationBody(builder: GetCoipPoolUsageResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val COIPADDRESSUSAGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("coipAddressUsageSet"), XmlCollectionName("item"))
    val COIPPOOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("coipPoolId"))
    val LOCALGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("GetCoipPoolUsageResult"))
        field(COIPADDRESSUSAGES_DESCRIPTOR)
        field(COIPPOOLID_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                COIPADDRESSUSAGES_DESCRIPTOR.index -> builder.coipAddressUsages =
                    deserializer.deserializeList(COIPADDRESSUSAGES_DESCRIPTOR) {
                        val col0 = mutableListOf<CoipAddressUsage>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeCoipAddressUsageDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                COIPPOOLID_DESCRIPTOR.index -> builder.coipPoolId = deserializeString()
                LOCALGATEWAYROUTETABLEID_DESCRIPTOR.index -> builder.localGatewayRouteTableId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
