// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification
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

internal fun serializeIamInstanceProfileSpecificationDocument(serializer: Serializer, input: IamInstanceProfileSpecification) {
    val ARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Arn"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("IamInstanceProfileSpecification"))
        field(ARN_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.arn?.let { field(ARN_DESCRIPTOR, it) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
    }
}
