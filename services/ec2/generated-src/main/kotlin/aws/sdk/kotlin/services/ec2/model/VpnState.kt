// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class VpnState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.VpnState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    object Deleted : aws.sdk.kotlin.services.ec2.model.VpnState() {
        override val value: kotlin.String = "deleted"
        override fun toString(): kotlin.String = value
    }

    object Deleting : aws.sdk.kotlin.services.ec2.model.VpnState() {
        override val value: kotlin.String = "deleting"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.VpnState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.VpnState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.VpnState = when(str) {
            "available" -> Available
            "deleted" -> Deleted
            "deleting" -> Deleting
            "pending" -> Pending
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.VpnState> = listOf(
            Available,
            Deleted,
            Deleting,
            Pending
        )
    }
}
