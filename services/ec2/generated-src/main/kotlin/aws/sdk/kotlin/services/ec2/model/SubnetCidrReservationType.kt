// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class SubnetCidrReservationType {

    abstract val value: kotlin.String

    object Explicit : aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType() {
        override val value: kotlin.String = "explicit"
        override fun toString(): kotlin.String = value
    }

    object Prefix : aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType() {
        override val value: kotlin.String = "prefix"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType = when(str) {
            "explicit" -> Explicit
            "prefix" -> Prefix
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType> = listOf(
            Explicit,
            Prefix
        )
    }
}
