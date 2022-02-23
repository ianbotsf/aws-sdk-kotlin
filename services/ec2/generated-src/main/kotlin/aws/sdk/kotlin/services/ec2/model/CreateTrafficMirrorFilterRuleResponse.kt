// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTrafficMirrorFilterRuleResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The Traffic Mirror rule.
     */
    val trafficMirrorFilterRule: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule? = builder.trafficMirrorFilterRule

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterRuleResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTrafficMirrorFilterRuleResponse(")
        append("clientToken=$clientToken,")
        append("trafficMirrorFilterRule=$trafficMirrorFilterRule)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (trafficMirrorFilterRule?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTrafficMirrorFilterRuleResponse

        if (clientToken != other.clientToken) return false
        if (trafficMirrorFilterRule != other.trafficMirrorFilterRule) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterRuleResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * The Traffic Mirror rule.
         */
        var trafficMirrorFilterRule: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterRuleResponse) : this() {
            this.clientToken = x.clientToken
            this.trafficMirrorFilterRule = x.trafficMirrorFilterRule
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterRuleResponse = CreateTrafficMirrorFilterRuleResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule] inside the given [block]
         */
        fun trafficMirrorFilterRule(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule.Builder.() -> kotlin.Unit) {
            this.trafficMirrorFilterRule = aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule.invoke(block)
        }
    }
}
