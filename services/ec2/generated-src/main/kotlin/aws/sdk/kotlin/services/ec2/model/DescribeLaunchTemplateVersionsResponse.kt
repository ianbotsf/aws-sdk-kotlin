// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeLaunchTemplateVersionsResponse private constructor(builder: Builder) {
    /**
     * Information about the launch template versions.
     */
    val launchTemplateVersions: List<LaunchTemplateVersion>? = builder.launchTemplateVersions
    /**
     * The token to use to retrieve the next page of results. This value is
     * null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeLaunchTemplateVersionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLaunchTemplateVersionsResponse(")
        append("launchTemplateVersions=$launchTemplateVersions,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplateVersions?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeLaunchTemplateVersionsResponse

        if (launchTemplateVersions != other.launchTemplateVersions) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeLaunchTemplateVersionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the launch template versions.
         */
        var launchTemplateVersions: List<LaunchTemplateVersion>? = null
        /**
         * The token to use to retrieve the next page of results. This value is
         * null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeLaunchTemplateVersionsResponse) : this() {
            this.launchTemplateVersions = x.launchTemplateVersions
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeLaunchTemplateVersionsResponse = DescribeLaunchTemplateVersionsResponse(this)
    }
}
