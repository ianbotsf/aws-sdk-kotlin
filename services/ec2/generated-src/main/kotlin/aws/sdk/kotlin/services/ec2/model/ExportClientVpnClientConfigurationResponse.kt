// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ExportClientVpnClientConfigurationResponse private constructor(builder: Builder) {
    /**
     * The contents of the Client VPN endpoint configuration file.
     */
    val clientConfiguration: kotlin.String? = builder.clientConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportClientVpnClientConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportClientVpnClientConfigurationResponse(")
        append("clientConfiguration=$clientConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportClientVpnClientConfigurationResponse

        if (clientConfiguration != other.clientConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportClientVpnClientConfigurationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The contents of the Client VPN endpoint configuration file.
         */
        var clientConfiguration: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportClientVpnClientConfigurationResponse) : this() {
            this.clientConfiguration = x.clientConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportClientVpnClientConfigurationResponse = ExportClientVpnClientConfigurationResponse(this)
    }
}
