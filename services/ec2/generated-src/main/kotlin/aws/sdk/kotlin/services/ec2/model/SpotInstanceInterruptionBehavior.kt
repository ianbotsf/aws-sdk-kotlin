// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class SpotInstanceInterruptionBehavior {

    abstract val value: kotlin.String

    object Hibernate : aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior() {
        override val value: kotlin.String = "hibernate"
        override fun toString(): kotlin.String = value
    }

    object Stop : aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior() {
        override val value: kotlin.String = "stop"
        override fun toString(): kotlin.String = value
    }

    object Terminate : aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior() {
        override val value: kotlin.String = "terminate"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior = when(str) {
            "hibernate" -> Hibernate
            "stop" -> Stop
            "terminate" -> Terminate
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.SpotInstanceInterruptionBehavior> = listOf(
            Hibernate,
            Stop,
            Terminate
        )
    }
}
