// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DescribeExportResponse private constructor(builder: Builder) {
    /**
     * Represents the properties of the export.
     */
    val exportDescription: aws.sdk.kotlin.services.dynamodb.model.ExportDescription? = builder.exportDescription

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DescribeExportResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeExportResponse(")
        append("exportDescription=$exportDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exportDescription?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeExportResponse

        if (exportDescription != other.exportDescription) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DescribeExportResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Represents the properties of the export.
         */
        var exportDescription: aws.sdk.kotlin.services.dynamodb.model.ExportDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DescribeExportResponse) : this() {
            this.exportDescription = x.exportDescription
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DescribeExportResponse = DescribeExportResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ExportDescription] inside the given [block]
         */
        fun exportDescription(block: aws.sdk.kotlin.services.dynamodb.model.ExportDescription.Builder.() -> kotlin.Unit) {
            this.exportDescription = aws.sdk.kotlin.services.dynamodb.model.ExportDescription.invoke(block)
        }
    }
}
