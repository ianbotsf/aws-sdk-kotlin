// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class FpgaImageAttributeName {

    abstract val value: kotlin.String

    object Description : aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName() {
        override val value: kotlin.String = "description"
        override fun toString(): kotlin.String = value
    }

    object LoadPermission : aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName() {
        override val value: kotlin.String = "loadPermission"
        override fun toString(): kotlin.String = value
    }

    object Name : aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName() {
        override val value: kotlin.String = "name"
        override fun toString(): kotlin.String = value
    }

    object ProductCodes : aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName() {
        override val value: kotlin.String = "productCodes"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName = when(str) {
            "description" -> Description
            "loadPermission" -> LoadPermission
            "name" -> Name
            "productCodes" -> ProductCodes
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName> = listOf(
            Description,
            LoadPermission,
            Name,
            ProductCodes
        )
    }
}
