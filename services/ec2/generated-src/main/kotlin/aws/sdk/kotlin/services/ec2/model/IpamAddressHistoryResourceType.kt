// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class IpamAddressHistoryResourceType {

    abstract val value: kotlin.String

    object Eip : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override val value: kotlin.String = "eip"
        override fun toString(): kotlin.String = value
    }

    object Instance : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override val value: kotlin.String = "instance"
        override fun toString(): kotlin.String = value
    }

    object NetworkInterface : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override val value: kotlin.String = "network-interface"
        override fun toString(): kotlin.String = value
    }

    object Subnet : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override val value: kotlin.String = "subnet"
        override fun toString(): kotlin.String = value
    }

    object Vpc : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override val value: kotlin.String = "vpc"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType = when(str) {
            "eip" -> Eip
            "instance" -> Instance
            "network-interface" -> NetworkInterface
            "subnet" -> Subnet
            "vpc" -> Vpc
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.IpamAddressHistoryResourceType> = listOf(
            Eip,
            Instance,
            NetworkInterface,
            Subnet,
            Vpc
        )
    }
}
