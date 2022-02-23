// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeBundleTasksRequest private constructor(builder: Builder) {
    /**
     * The bundle task IDs.
     * Default: Describes all your bundle tasks.
     */
    val bundleIds: List<String>? = builder.bundleIds
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
     * bundle-id - The ID of the bundle task.
     *
     *
     * error-code - If the task failed, the error code returned.
     *
     *
     * error-message - If the task failed, the error message returned.
     *
     *
     * instance-id - The ID of the instance.
     *
     *
     * progress - The level of task completion, as a percentage (for example, 20%).
     *
     *
     * s3-bucket - The Amazon S3 bucket to store the AMI.
     *
     *
     * s3-prefix - The beginning of the AMI name.
     *
     *
     * start-time - The time the task started (for example, 2013-09-15T17:15:20.000Z).
     *
     *
     * state - The state of the task (pending | waiting-for-shutdown | bundling |
     * storing | cancelling | complete | failed).
     *
     *
     * update-time - The time of the most recent update for the task.
     */
    val filters: List<Filter>? = builder.filters

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeBundleTasksRequest(")
        append("bundleIds=$bundleIds,")
        append("dryRun=$dryRun,")
        append("filters=$filters)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bundleIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeBundleTasksRequest

        if (bundleIds != other.bundleIds) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bundle task IDs.
         * Default: Describes all your bundle tasks.
         */
        var bundleIds: List<String>? = null
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
         * bundle-id - The ID of the bundle task.
         *
         *
         * error-code - If the task failed, the error code returned.
         *
         *
         * error-message - If the task failed, the error message returned.
         *
         *
         * instance-id - The ID of the instance.
         *
         *
         * progress - The level of task completion, as a percentage (for example, 20%).
         *
         *
         * s3-bucket - The Amazon S3 bucket to store the AMI.
         *
         *
         * s3-prefix - The beginning of the AMI name.
         *
         *
         * start-time - The time the task started (for example, 2013-09-15T17:15:20.000Z).
         *
         *
         * state - The state of the task (pending | waiting-for-shutdown | bundling |
         * storing | cancelling | complete | failed).
         *
         *
         * update-time - The time of the most recent update for the task.
         */
        var filters: List<Filter>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksRequest) : this() {
            this.bundleIds = x.bundleIds
            this.dryRun = x.dryRun
            this.filters = x.filters
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksRequest = DescribeBundleTasksRequest(this)
    }
}
