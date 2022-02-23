// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateRouteTableResponse private constructor(builder: Builder) {
    /**
     * Information about the route table.
     */
    val routeTable: aws.sdk.kotlin.services.ec2.model.RouteTable? = builder.routeTable

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateRouteTableResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateRouteTableResponse(")
        append("routeTable=$routeTable)")
    }

    override fun hashCode(): kotlin.Int {
        var result = routeTable?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateRouteTableResponse

        if (routeTable != other.routeTable) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateRouteTableResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the route table.
         */
        var routeTable: aws.sdk.kotlin.services.ec2.model.RouteTable? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateRouteTableResponse) : this() {
            this.routeTable = x.routeTable
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateRouteTableResponse = CreateRouteTableResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RouteTable] inside the given [block]
         */
        fun routeTable(block: aws.sdk.kotlin.services.ec2.model.RouteTable.Builder.() -> kotlin.Unit) {
            this.routeTable = aws.sdk.kotlin.services.ec2.model.RouteTable.invoke(block)
        }
    }
}
