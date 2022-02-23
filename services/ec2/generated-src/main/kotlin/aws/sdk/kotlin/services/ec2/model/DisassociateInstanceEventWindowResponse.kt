// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateInstanceEventWindowResponse private constructor(builder: Builder) {
    /**
     * Information about the event window.
     */
    val instanceEventWindow: aws.sdk.kotlin.services.ec2.model.InstanceEventWindow? = builder.instanceEventWindow

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateInstanceEventWindowResponse(")
        append("instanceEventWindow=$instanceEventWindow)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceEventWindow?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateInstanceEventWindowResponse

        if (instanceEventWindow != other.instanceEventWindow) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the event window.
         */
        var instanceEventWindow: aws.sdk.kotlin.services.ec2.model.InstanceEventWindow? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowResponse) : this() {
            this.instanceEventWindow = x.instanceEventWindow
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowResponse = DisassociateInstanceEventWindowResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceEventWindow] inside the given [block]
         */
        fun instanceEventWindow(block: aws.sdk.kotlin.services.ec2.model.InstanceEventWindow.Builder.() -> kotlin.Unit) {
            this.instanceEventWindow = aws.sdk.kotlin.services.ec2.model.InstanceEventWindow.invoke(block)
        }
    }
}
