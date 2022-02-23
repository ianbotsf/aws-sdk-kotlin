// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class VpcState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.VpcState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.VpcState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.VpcState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.VpcState = when(str) {
            "available" -> Available
            "pending" -> Pending
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.VpcState> = listOf(
            Available,
            Pending
        )
    }
}
