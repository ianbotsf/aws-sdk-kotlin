// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class QuoteFields {

    abstract val value: kotlin.String

    object Always : aws.sdk.kotlin.services.s3.model.QuoteFields() {
        override val value: kotlin.String = "ALWAYS"
        override fun toString(): kotlin.String = value
    }

    object Asneeded : aws.sdk.kotlin.services.s3.model.QuoteFields() {
        override val value: kotlin.String = "ASNEEDED"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.QuoteFields() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.QuoteFields = when(str) {
            "ALWAYS" -> Always
            "ASNEEDED" -> Asneeded
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.QuoteFields> = listOf(
            Always,
            Asneeded
        )
    }
}
