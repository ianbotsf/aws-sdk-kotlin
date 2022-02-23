// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeClassicLinkInstancesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     *
     *
     *
     * group-id - The ID of a VPC security group that's associated with the instance.
     *
     *
     *
     * instance-id - The ID of the instance.
     *
     *
     *
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     *
     *
     *
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     *
     *
     *
     *
     * vpc-id - The ID of the VPC to which the instance is
     * linked.
     *
     *
     * vpc-id - The ID of the VPC that the instance is linked to.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     */
    val instanceIds: List<String>? = builder.instanceIds
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeClassicLinkInstancesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeClassicLinkInstancesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("instanceIds=$instanceIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeClassicLinkInstancesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (instanceIds != other.instanceIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeClassicLinkInstancesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         *
         *
         *
         * group-id - The ID of a VPC security group that's associated with the instance.
         *
         *
         *
         * instance-id - The ID of the instance.
         *
         *
         *
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         *
         *
         *
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         *
         *
         *
         *
         * vpc-id - The ID of the VPC to which the instance is
         * linked.
         *
         *
         * vpc-id - The ID of the VPC that the instance is linked to.
         */
        var filters: List<Filter>? = null
        /**
         * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
         */
        var instanceIds: List<String>? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         * Constraint: If the value is greater than 1000, we return only 1000 items.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeClassicLinkInstancesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.instanceIds = x.instanceIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeClassicLinkInstancesRequest = DescribeClassicLinkInstancesRequest(this)
    }
}
