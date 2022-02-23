// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class ObjectLockLegalHoldStatus {

    abstract val value: kotlin.String

    object Off : aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus() {
        override val value: kotlin.String = "OFF"
        override fun toString(): kotlin.String = value
    }

    object On : aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus() {
        override val value: kotlin.String = "ON"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus = when(str) {
            "OFF" -> Off
            "ON" -> On
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus> = listOf(
            Off,
            On
        )
    }
}
