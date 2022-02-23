// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class LocalGatewayRouteType {

    abstract val value: kotlin.String

    object Propagated : aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType() {
        override val value: kotlin.String = "propagated"
        override fun toString(): kotlin.String = value
    }

    object Static : aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType() {
        override val value: kotlin.String = "static"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType = when(str) {
            "propagated" -> Propagated
            "static" -> Static
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType> = listOf(
            Propagated,
            Static
        )
    }
}
