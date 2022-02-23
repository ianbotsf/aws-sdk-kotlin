// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class TrafficMirrorTargetType {

    abstract val value: kotlin.String

    object NetworkInterface : aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType() {
        override val value: kotlin.String = "network-interface"
        override fun toString(): kotlin.String = value
    }

    object NetworkLoadBalancer : aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType() {
        override val value: kotlin.String = "network-load-balancer"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType = when(str) {
            "network-interface" -> NetworkInterface
            "network-load-balancer" -> NetworkLoadBalancer
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType> = listOf(
            NetworkInterface,
            NetworkLoadBalancer
        )
    }
}
