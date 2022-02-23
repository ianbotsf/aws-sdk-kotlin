// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class AssociationStatusCode {

    abstract val value: kotlin.String

    object Associated : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override val value: kotlin.String = "associated"
        override fun toString(): kotlin.String = value
    }

    object Associating : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override val value: kotlin.String = "associating"
        override fun toString(): kotlin.String = value
    }

    object AssociationFailed : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override val value: kotlin.String = "association-failed"
        override fun toString(): kotlin.String = value
    }

    object Disassociated : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override val value: kotlin.String = "disassociated"
        override fun toString(): kotlin.String = value
    }

    object Disassociating : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override val value: kotlin.String = "disassociating"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AssociationStatusCode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AssociationStatusCode = when(str) {
            "associated" -> Associated
            "associating" -> Associating
            "association-failed" -> AssociationFailed
            "disassociated" -> Disassociated
            "disassociating" -> Disassociating
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AssociationStatusCode> = listOf(
            Associated,
            Associating,
            AssociationFailed,
            Disassociated,
            Disassociating
        )
    }
}
