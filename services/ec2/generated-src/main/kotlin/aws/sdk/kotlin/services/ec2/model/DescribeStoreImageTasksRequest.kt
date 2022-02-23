// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeStoreImageTasksRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is
     * DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     *
     *
     *
     * task-state - Returns tasks in a certain state (InProgress |
     * Completed | Failed)
     *
     *
     * bucket - Returns task information for tasks that targeted a specific
     * bucket. For the filter value, specify the bucket name.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     */
    val imageIds: List<String>? = builder.imageIds
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining
     * results, make another call with the returned NextToken value. This value can be
     * between 1 and 200. You cannot specify this parameter and the ImageIDs parameter
     * in the same call.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeStoreImageTasksRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeStoreImageTasksRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("imageIds=$imageIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (imageIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeStoreImageTasksRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (imageIds != other.imageIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeStoreImageTasksRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is
         * DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         *
         *
         *
         * task-state - Returns tasks in a certain state (InProgress |
         * Completed | Failed)
         *
         *
         * bucket - Returns task information for tasks that targeted a specific
         * bucket. For the filter value, specify the bucket name.
         */
        var filters: List<Filter>? = null
        /**
         * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
         */
        var imageIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining
         * results, make another call with the returned NextToken value. This value can be
         * between 1 and 200. You cannot specify this parameter and the ImageIDs parameter
         * in the same call.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeStoreImageTasksRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.imageIds = x.imageIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeStoreImageTasksRequest = DescribeStoreImageTasksRequest(this)
    }
}
