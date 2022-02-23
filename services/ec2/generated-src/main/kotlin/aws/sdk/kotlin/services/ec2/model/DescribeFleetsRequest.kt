// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeFleetsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     *
     *
     *
     * activity-status - The progress of the EC2 Fleet ( error |
     * pending-fulfillment | pending-termination |
     * fulfilled).
     *
     *
     * excess-capacity-termination-policy - Indicates whether to terminate
     * running instances if the target capacity is decreased below the current EC2 Fleet size
     * (true | false).
     *
     *
     * fleet-state - The state of the EC2 Fleet (submitted |
     * active | deleted | failed |
     * deleted-running | deleted-terminating |
     * modifying).
     *
     *
     * replace-unhealthy-instances - Indicates whether EC2 Fleet should replace
     * unhealthy instances (true | false).
     *
     *
     * type - The type of request (instant |
     * request | maintain).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the EC2 Fleets.
     *
     * If a fleet is of type instant, you must specify the fleet ID, otherwise
     * it does not appear in the response.
     */
    val fleetIds: List<String>? = builder.fleetIds
    /**
     * The maximum number of results to return in a single call. Specify a value between 1 and
     * 1000. The default value is 1000. To retrieve the remaining results, make another call with
     * the returned NextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFleetsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFleetsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("fleetIds=$fleetIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (fleetIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFleetsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (fleetIds != other.fleetIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFleetsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         *
         *
         *
         * activity-status - The progress of the EC2 Fleet ( error |
         * pending-fulfillment | pending-termination |
         * fulfilled).
         *
         *
         * excess-capacity-termination-policy - Indicates whether to terminate
         * running instances if the target capacity is decreased below the current EC2 Fleet size
         * (true | false).
         *
         *
         * fleet-state - The state of the EC2 Fleet (submitted |
         * active | deleted | failed |
         * deleted-running | deleted-terminating |
         * modifying).
         *
         *
         * replace-unhealthy-instances - Indicates whether EC2 Fleet should replace
         * unhealthy instances (true | false).
         *
         *
         * type - The type of request (instant |
         * request | maintain).
         */
        var filters: List<Filter>? = null
        /**
         * The IDs of the EC2 Fleets.
         *
         * If a fleet is of type instant, you must specify the fleet ID, otherwise
         * it does not appear in the response.
         */
        var fleetIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call. Specify a value between 1 and
         * 1000. The default value is 1000. To retrieve the remaining results, make another call with
         * the returned NextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFleetsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.fleetIds = x.fleetIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFleetsRequest = DescribeFleetsRequest(this)
    }
}
