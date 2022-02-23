// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class BurstablePerformance {

    abstract val value: kotlin.String

    object Excluded : aws.sdk.kotlin.services.ec2.model.BurstablePerformance() {
        override val value: kotlin.String = "excluded"
        override fun toString(): kotlin.String = value
    }

    object Included : aws.sdk.kotlin.services.ec2.model.BurstablePerformance() {
        override val value: kotlin.String = "included"
        override fun toString(): kotlin.String = value
    }

    object Required : aws.sdk.kotlin.services.ec2.model.BurstablePerformance() {
        override val value: kotlin.String = "required"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.BurstablePerformance() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.BurstablePerformance = when(str) {
            "excluded" -> Excluded
            "included" -> Included
            "required" -> Required
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.BurstablePerformance> = listOf(
            Excluded,
            Included,
            Required
        )
    }
}
