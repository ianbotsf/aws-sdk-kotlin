// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DisableKinesisStreamingDestinationResponse private constructor(builder: Builder) {
    /**
     * The current status of the replication.
     */
    val destinationStatus: aws.sdk.kotlin.services.dynamodb.model.DestinationStatus? = builder.destinationStatus
    /**
     * The ARN for the specific Kinesis data stream.
     */
    val streamArn: kotlin.String? = builder.streamArn
    /**
     * The name of the table being modified.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DisableKinesisStreamingDestinationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisableKinesisStreamingDestinationResponse(")
        append("destinationStatus=$destinationStatus,")
        append("streamArn=$streamArn,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationStatus?.hashCode() ?: 0
        result = 31 * result + (streamArn?.hashCode() ?: 0)
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisableKinesisStreamingDestinationResponse

        if (destinationStatus != other.destinationStatus) return false
        if (streamArn != other.streamArn) return false
        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DisableKinesisStreamingDestinationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The current status of the replication.
         */
        var destinationStatus: aws.sdk.kotlin.services.dynamodb.model.DestinationStatus? = null
        /**
         * The ARN for the specific Kinesis data stream.
         */
        var streamArn: kotlin.String? = null
        /**
         * The name of the table being modified.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DisableKinesisStreamingDestinationResponse) : this() {
            this.destinationStatus = x.destinationStatus
            this.streamArn = x.streamArn
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DisableKinesisStreamingDestinationResponse = DisableKinesisStreamingDestinationResponse(this)
    }
}
