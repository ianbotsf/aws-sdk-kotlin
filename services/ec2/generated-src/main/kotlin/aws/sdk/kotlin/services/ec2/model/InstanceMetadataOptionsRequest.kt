// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The metadata options for the instance.
 */
class InstanceMetadataOptionsRequest private constructor(builder: Builder) {
    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     * If you specify a value of disabled, you cannot access your
     * instance metadata.
     * Default: enabled
     */
    val httpEndpoint: aws.sdk.kotlin.services.ec2.model.InstanceMetadataEndpointState? = builder.httpEndpoint
    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     */
    val httpProtocolIpv6: aws.sdk.kotlin.services.ec2.model.InstanceMetadataProtocolState? = builder.httpProtocolIpv6
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
     * number, the further instance metadata requests can travel.
     * Default: 1
     * Possible values: Integers from 1 to 64
     */
    val httpPutResponseHopLimit: kotlin.Int? = builder.httpPutResponseHopLimit
    /**
     * The state of token usage for your instance metadata requests.
     * If the state is optional, you can choose to retrieve instance metadata
     * with or without a signed token header on your request. If you retrieve the IAM role
     * credentials without a token, the version 1.0 role credentials are returned. If you
     * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
     * credentials are returned.
     * If the state is required, you must send a signed token header with any
     * instance metadata retrieval requests. In this state, retrieving the IAM role credentials
     * always returns the version 2.0 credentials; the version 1.0 credentials are not
     * available.
     * Default: optional
     */
    val httpTokens: aws.sdk.kotlin.services.ec2.model.HttpTokensState? = builder.httpTokens
    /**
     * Set to enabled to allow access to instance tags from the instance metadata. Set to disabled to turn off
     * access to instance tags from the instance metadata. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with instance tags using the instance metadata.
     * Default: disabled
     */
    val instanceMetadataTags: aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState? = builder.instanceMetadataTags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceMetadataOptionsRequest(")
        append("httpEndpoint=$httpEndpoint,")
        append("httpProtocolIpv6=$httpProtocolIpv6,")
        append("httpPutResponseHopLimit=$httpPutResponseHopLimit,")
        append("httpTokens=$httpTokens,")
        append("instanceMetadataTags=$instanceMetadataTags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = httpEndpoint?.hashCode() ?: 0
        result = 31 * result + (httpProtocolIpv6?.hashCode() ?: 0)
        result = 31 * result + (httpPutResponseHopLimit ?: 0)
        result = 31 * result + (httpTokens?.hashCode() ?: 0)
        result = 31 * result + (instanceMetadataTags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceMetadataOptionsRequest

        if (httpEndpoint != other.httpEndpoint) return false
        if (httpProtocolIpv6 != other.httpProtocolIpv6) return false
        if (httpPutResponseHopLimit != other.httpPutResponseHopLimit) return false
        if (httpTokens != other.httpTokens) return false
        if (instanceMetadataTags != other.instanceMetadataTags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Enables or disables the HTTP metadata endpoint on your instances.
         * If you specify a value of disabled, you cannot access your
         * instance metadata.
         * Default: enabled
         */
        var httpEndpoint: aws.sdk.kotlin.services.ec2.model.InstanceMetadataEndpointState? = null
        /**
         * Enables or disables the IPv6 endpoint for the instance metadata service.
         */
        var httpProtocolIpv6: aws.sdk.kotlin.services.ec2.model.InstanceMetadataProtocolState? = null
        /**
         * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
         * number, the further instance metadata requests can travel.
         * Default: 1
         * Possible values: Integers from 1 to 64
         */
        var httpPutResponseHopLimit: kotlin.Int? = null
        /**
         * The state of token usage for your instance metadata requests.
         * If the state is optional, you can choose to retrieve instance metadata
         * with or without a signed token header on your request. If you retrieve the IAM role
         * credentials without a token, the version 1.0 role credentials are returned. If you
         * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
         * credentials are returned.
         * If the state is required, you must send a signed token header with any
         * instance metadata retrieval requests. In this state, retrieving the IAM role credentials
         * always returns the version 2.0 credentials; the version 1.0 credentials are not
         * available.
         * Default: optional
         */
        var httpTokens: aws.sdk.kotlin.services.ec2.model.HttpTokensState? = null
        /**
         * Set to enabled to allow access to instance tags from the instance metadata. Set to disabled to turn off
         * access to instance tags from the instance metadata. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with instance tags using the instance metadata.
         * Default: disabled
         */
        var instanceMetadataTags: aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsRequest) : this() {
            this.httpEndpoint = x.httpEndpoint
            this.httpProtocolIpv6 = x.httpProtocolIpv6
            this.httpPutResponseHopLimit = x.httpPutResponseHopLimit
            this.httpTokens = x.httpTokens
            this.instanceMetadataTags = x.instanceMetadataTags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsRequest = InstanceMetadataOptionsRequest(this)
    }
}
