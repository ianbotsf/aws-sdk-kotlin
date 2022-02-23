// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class FleetType {

    abstract val value: kotlin.String

    object Instant : aws.sdk.kotlin.services.ec2.model.FleetType() {
        override val value: kotlin.String = "instant"
        override fun toString(): kotlin.String = value
    }

    object Maintain : aws.sdk.kotlin.services.ec2.model.FleetType() {
        override val value: kotlin.String = "maintain"
        override fun toString(): kotlin.String = value
    }

    object Request : aws.sdk.kotlin.services.ec2.model.FleetType() {
        override val value: kotlin.String = "request"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FleetType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FleetType = when(str) {
            "instant" -> Instant
            "maintain" -> Maintain
            "request" -> Request
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FleetType> = listOf(
            Instant,
            Maintain,
            Request
        )
    }
}
