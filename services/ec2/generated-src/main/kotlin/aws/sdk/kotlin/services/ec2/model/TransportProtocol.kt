// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class TransportProtocol {

    abstract val value: kotlin.String

    object Tcp : aws.sdk.kotlin.services.ec2.model.TransportProtocol() {
        override val value: kotlin.String = "tcp"
        override fun toString(): kotlin.String = value
    }

    object Udp : aws.sdk.kotlin.services.ec2.model.TransportProtocol() {
        override val value: kotlin.String = "udp"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TransportProtocol() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TransportProtocol = when(str) {
            "tcp" -> Tcp
            "udp" -> Udp
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TransportProtocol> = listOf(
            Tcp,
            Udp
        )
    }
}
