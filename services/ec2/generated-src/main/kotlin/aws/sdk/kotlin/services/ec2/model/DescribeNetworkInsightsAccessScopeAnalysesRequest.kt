// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class DescribeNetworkInsightsAccessScopeAnalysesRequest private constructor(builder: Builder) {
    /**
     * Filters the results based on the start time. The analysis must have started on or after this time.
     */
    val analysisStartTimeBegin: aws.smithy.kotlin.runtime.time.Instant? = builder.analysisStartTimeBegin
    /**
     * Filters the results based on the start time. The analysis must have started on or before this time.
     */
    val analysisStartTimeEnd: aws.smithy.kotlin.runtime.time.Instant? = builder.analysisStartTimeEnd
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * There are no supported filters.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The IDs of the Network Access Scope analyses.
     */
    val networkInsightsAccessScopeAnalysisIds: List<String>? = builder.networkInsightsAccessScopeAnalysisIds
    /**
     * The ID of the Network Access Scope.
     */
    val networkInsightsAccessScopeId: kotlin.String? = builder.networkInsightsAccessScopeId
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkInsightsAccessScopeAnalysesRequest(")
        append("analysisStartTimeBegin=$analysisStartTimeBegin,")
        append("analysisStartTimeEnd=$analysisStartTimeEnd,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("networkInsightsAccessScopeAnalysisIds=$networkInsightsAccessScopeAnalysisIds,")
        append("networkInsightsAccessScopeId=$networkInsightsAccessScopeId,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = analysisStartTimeBegin?.hashCode() ?: 0
        result = 31 * result + (analysisStartTimeEnd?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (networkInsightsAccessScopeAnalysisIds?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsAccessScopeId?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkInsightsAccessScopeAnalysesRequest

        if (analysisStartTimeBegin != other.analysisStartTimeBegin) return false
        if (analysisStartTimeEnd != other.analysisStartTimeEnd) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (networkInsightsAccessScopeAnalysisIds != other.networkInsightsAccessScopeAnalysisIds) return false
        if (networkInsightsAccessScopeId != other.networkInsightsAccessScopeId) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Filters the results based on the start time. The analysis must have started on or after this time.
         */
        var analysisStartTimeBegin: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Filters the results based on the start time. The analysis must have started on or before this time.
         */
        var analysisStartTimeEnd: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * There are no supported filters.
         */
        var filters: List<Filter>? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The IDs of the Network Access Scope analyses.
         */
        var networkInsightsAccessScopeAnalysisIds: List<String>? = null
        /**
         * The ID of the Network Access Scope.
         */
        var networkInsightsAccessScopeId: kotlin.String? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesRequest) : this() {
            this.analysisStartTimeBegin = x.analysisStartTimeBegin
            this.analysisStartTimeEnd = x.analysisStartTimeEnd
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.networkInsightsAccessScopeAnalysisIds = x.networkInsightsAccessScopeAnalysisIds
            this.networkInsightsAccessScopeId = x.networkInsightsAccessScopeId
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesRequest = DescribeNetworkInsightsAccessScopeAnalysesRequest(this)
    }
}
