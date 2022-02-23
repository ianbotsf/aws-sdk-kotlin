// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class ReportInstanceStatusRequest private constructor(builder: Builder) {
    /**
     * Descriptive text about the health state of your instance.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The time at which the reported instance health state ended.
     */
    val endTime: aws.smithy.kotlin.runtime.time.Instant? = builder.endTime
    /**
     * The instances.
     */
    val instances: List<String>? = builder.instances
    /**
     * The reason codes that describe the health state of your instance.
     *
     *
     *
     * instance-stuck-in-state: My instance is stuck in a state.
     *
     *
     * unresponsive: My instance is unresponsive.
     *
     *
     * not-accepting-credentials: My instance is not accepting my
     * credentials.
     *
     *
     * password-not-available: A password is not available for my
     * instance.
     *
     *
     * performance-network: My instance is experiencing performance
     * problems that I believe are network related.
     *
     *
     * performance-instance-store: My instance is experiencing performance
     * problems that I believe are related to the instance stores.
     *
     *
     * performance-ebs-volume: My instance is experiencing performance
     * problems that I believe are related to an EBS volume.
     *
     *
     * performance-other: My instance is experiencing performance
     * problems.
     *
     *
     * other: &#91;explain using the description parameter&#93;
     */
    val reasonCodes: List<ReportInstanceReasonCodes>? = builder.reasonCodes
    /**
     * The time at which the reported instance health state began.
     */
    val startTime: aws.smithy.kotlin.runtime.time.Instant? = builder.startTime
    /**
     * The status of all instances listed.
     */
    val status: aws.sdk.kotlin.services.ec2.model.ReportStatusType? = builder.status

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReportInstanceStatusRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReportInstanceStatusRequest(")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("endTime=$endTime,")
        append("instances=$instances,")
        append("reasonCodes=$reasonCodes,")
        append("startTime=$startTime,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (endTime?.hashCode() ?: 0)
        result = 31 * result + (instances?.hashCode() ?: 0)
        result = 31 * result + (reasonCodes?.hashCode() ?: 0)
        result = 31 * result + (startTime?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReportInstanceStatusRequest

        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (endTime != other.endTime) return false
        if (instances != other.instances) return false
        if (reasonCodes != other.reasonCodes) return false
        if (startTime != other.startTime) return false
        if (status != other.status) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReportInstanceStatusRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Descriptive text about the health state of your instance.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The time at which the reported instance health state ended.
         */
        var endTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The instances.
         */
        var instances: List<String>? = null
        /**
         * The reason codes that describe the health state of your instance.
         *
         *
         *
         * instance-stuck-in-state: My instance is stuck in a state.
         *
         *
         * unresponsive: My instance is unresponsive.
         *
         *
         * not-accepting-credentials: My instance is not accepting my
         * credentials.
         *
         *
         * password-not-available: A password is not available for my
         * instance.
         *
         *
         * performance-network: My instance is experiencing performance
         * problems that I believe are network related.
         *
         *
         * performance-instance-store: My instance is experiencing performance
         * problems that I believe are related to the instance stores.
         *
         *
         * performance-ebs-volume: My instance is experiencing performance
         * problems that I believe are related to an EBS volume.
         *
         *
         * performance-other: My instance is experiencing performance
         * problems.
         *
         *
         * other: &#91;explain using the description parameter&#93;
         */
        var reasonCodes: List<ReportInstanceReasonCodes>? = null
        /**
         * The time at which the reported instance health state began.
         */
        var startTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The status of all instances listed.
         */
        var status: aws.sdk.kotlin.services.ec2.model.ReportStatusType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReportInstanceStatusRequest) : this() {
            this.description = x.description
            this.dryRun = x.dryRun
            this.endTime = x.endTime
            this.instances = x.instances
            this.reasonCodes = x.reasonCodes
            this.startTime = x.startTime
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReportInstanceStatusRequest = ReportInstanceStatusRequest(this)
    }
}
