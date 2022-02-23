// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

sealed class TableStatus {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "ACTIVE"
        override fun toString(): kotlin.String = value
    }

    object Archived : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "ARCHIVED"
        override fun toString(): kotlin.String = value
    }

    object Archiving : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "ARCHIVING"
        override fun toString(): kotlin.String = value
    }

    object Creating : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "CREATING"
        override fun toString(): kotlin.String = value
    }

    object Deleting : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "DELETING"
        override fun toString(): kotlin.String = value
    }

    object InaccessibleEncryptionCredentials : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
        override fun toString(): kotlin.String = value
    }

    object Updating : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override val value: kotlin.String = "UPDATING"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.TableStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.TableStatus = when(str) {
            "ACTIVE" -> Active
            "ARCHIVED" -> Archived
            "ARCHIVING" -> Archiving
            "CREATING" -> Creating
            "DELETING" -> Deleting
            "INACCESSIBLE_ENCRYPTION_CREDENTIALS" -> InaccessibleEncryptionCredentials
            "UPDATING" -> Updating
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.TableStatus> = listOf(
            Active,
            Archived,
            Archiving,
            Creating,
            Deleting,
            InaccessibleEncryptionCredentials,
            Updating
        )
    }
}
