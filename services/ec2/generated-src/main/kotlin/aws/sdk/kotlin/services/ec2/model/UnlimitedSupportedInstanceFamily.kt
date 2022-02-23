// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class UnlimitedSupportedInstanceFamily {

    abstract val value: kotlin.String

    object T2 : aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily() {
        override val value: kotlin.String = "t2"
        override fun toString(): kotlin.String = value
    }

    object T3 : aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily() {
        override val value: kotlin.String = "t3"
        override fun toString(): kotlin.String = value
    }

    object T3A : aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily() {
        override val value: kotlin.String = "t3a"
        override fun toString(): kotlin.String = value
    }

    object T4G : aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily() {
        override val value: kotlin.String = "t4g"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily = when(str) {
            "t2" -> T2
            "t3" -> T3
            "t3a" -> T3A
            "t4g" -> T4G
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily> = listOf(
            T2,
            T3,
            T3A,
            T4G
        )
    }
}
