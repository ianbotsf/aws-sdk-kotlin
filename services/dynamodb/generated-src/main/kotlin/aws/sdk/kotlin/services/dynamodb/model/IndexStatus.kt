// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

sealed class IndexStatus {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.dynamodb.model.IndexStatus() {
        override val value: kotlin.String = "ACTIVE"
        override fun toString(): kotlin.String = value
    }

    object Creating : aws.sdk.kotlin.services.dynamodb.model.IndexStatus() {
        override val value: kotlin.String = "CREATING"
        override fun toString(): kotlin.String = value
    }

    object Deleting : aws.sdk.kotlin.services.dynamodb.model.IndexStatus() {
        override val value: kotlin.String = "DELETING"
        override fun toString(): kotlin.String = value
    }

    object Updating : aws.sdk.kotlin.services.dynamodb.model.IndexStatus() {
        override val value: kotlin.String = "UPDATING"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.IndexStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.IndexStatus = when(str) {
            "ACTIVE" -> Active
            "CREATING" -> Creating
            "DELETING" -> Deleting
            "UPDATING" -> Updating
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.IndexStatus> = listOf(
            Active,
            Creating,
            Deleting,
            Updating
        )
    }
}
