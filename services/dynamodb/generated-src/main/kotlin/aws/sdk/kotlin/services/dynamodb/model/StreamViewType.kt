// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

sealed class StreamViewType {

    abstract val value: kotlin.String

    object KeysOnly : aws.sdk.kotlin.services.dynamodb.model.StreamViewType() {
        override val value: kotlin.String = "KEYS_ONLY"
        override fun toString(): kotlin.String = value
    }

    object NewAndOldImages : aws.sdk.kotlin.services.dynamodb.model.StreamViewType() {
        override val value: kotlin.String = "NEW_AND_OLD_IMAGES"
        override fun toString(): kotlin.String = value
    }

    object NewImage : aws.sdk.kotlin.services.dynamodb.model.StreamViewType() {
        override val value: kotlin.String = "NEW_IMAGE"
        override fun toString(): kotlin.String = value
    }

    object OldImage : aws.sdk.kotlin.services.dynamodb.model.StreamViewType() {
        override val value: kotlin.String = "OLD_IMAGE"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.StreamViewType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.StreamViewType = when(str) {
            "KEYS_ONLY" -> KeysOnly
            "NEW_AND_OLD_IMAGES" -> NewAndOldImages
            "NEW_IMAGE" -> NewImage
            "OLD_IMAGE" -> OldImage
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.StreamViewType> = listOf(
            KeysOnly,
            NewAndOldImages,
            NewImage,
            OldImage
        )
    }
}
