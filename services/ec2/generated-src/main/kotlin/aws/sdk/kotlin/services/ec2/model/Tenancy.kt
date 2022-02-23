// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class Tenancy {

    abstract val value: kotlin.String

    object Dedicated : aws.sdk.kotlin.services.ec2.model.Tenancy() {
        override val value: kotlin.String = "dedicated"
        override fun toString(): kotlin.String = value
    }

    object Default : aws.sdk.kotlin.services.ec2.model.Tenancy() {
        override val value: kotlin.String = "default"
        override fun toString(): kotlin.String = value
    }

    object Host : aws.sdk.kotlin.services.ec2.model.Tenancy() {
        override val value: kotlin.String = "host"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.Tenancy() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.Tenancy = when(str) {
            "dedicated" -> Dedicated
            "default" -> Default
            "host" -> Host
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.Tenancy> = listOf(
            Dedicated,
            Default,
            Host
        )
    }
}
