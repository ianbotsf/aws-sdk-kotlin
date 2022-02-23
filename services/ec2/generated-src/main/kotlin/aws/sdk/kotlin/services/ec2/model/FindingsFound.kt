// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class FindingsFound {

    abstract val value: kotlin.String

    object False : aws.sdk.kotlin.services.ec2.model.FindingsFound() {
        override val value: kotlin.String = "false"
        override fun toString(): kotlin.String = value
    }

    object True : aws.sdk.kotlin.services.ec2.model.FindingsFound() {
        override val value: kotlin.String = "true"
        override fun toString(): kotlin.String = value
    }

    object Unknown : aws.sdk.kotlin.services.ec2.model.FindingsFound() {
        override val value: kotlin.String = "unknown"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FindingsFound() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FindingsFound = when(str) {
            "false" -> False
            "true" -> True
            "unknown" -> Unknown
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FindingsFound> = listOf(
            False,
            True,
            Unknown
        )
    }
}
