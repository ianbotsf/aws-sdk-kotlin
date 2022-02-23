// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a local secondary index.
 */
class LocalSecondaryIndexDescription private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    val indexArn: kotlin.String? = builder.indexArn
    /**
     * Represents the name of the local secondary index.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * The total size of the specified index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this
     * value.
     */
    val indexSizeBytes: kotlin.Long = builder.indexSizeBytes
    /**
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this
     * value.
     */
    val itemCount: kotlin.Long = builder.itemCount
    /**
     * The complete key schema for the local secondary index, consisting of one or more pairs
     * of attribute names and key types:
     *
     *
     *
     * HASH - partition key
     *
     *
     * RANGE - sort key
     *
     *
     *
     * The partition key of an item is also known as its hash
     * attribute. The term "hash attribute" derives from DynamoDB's usage of
     * an internal hash function to evenly distribute data items across partitions, based
     * on their partition key values.
     * The sort key of an item is also known as its range attribute.
     * The term "range attribute" derives from the way DynamoDB stores items with the same
     * partition key physically close together, in sorted order by the sort key
     * value.
     */
    val keySchema: List<KeySchemaElement>? = builder.keySchema
    /**
     * Represents attributes that are copied (projected) from the table into the global
     * secondary index. These are in addition to the primary key attributes and index key
     * attributes, which are automatically projected.
     */
    val projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = builder.projection

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LocalSecondaryIndexDescription(")
        append("indexArn=$indexArn,")
        append("indexName=$indexName,")
        append("indexSizeBytes=$indexSizeBytes,")
        append("itemCount=$itemCount,")
        append("keySchema=$keySchema,")
        append("projection=$projection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexArn?.hashCode() ?: 0
        result = 31 * result + (indexName?.hashCode() ?: 0)
        result = 31 * result + (indexSizeBytes.hashCode())
        result = 31 * result + (itemCount.hashCode())
        result = 31 * result + (keySchema?.hashCode() ?: 0)
        result = 31 * result + (projection?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LocalSecondaryIndexDescription

        if (indexArn != other.indexArn) return false
        if (indexName != other.indexName) return false
        if (indexSizeBytes != other.indexSizeBytes) return false
        if (itemCount != other.itemCount) return false
        if (keySchema != other.keySchema) return false
        if (projection != other.projection) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) that uniquely identifies the index.
         */
        var indexArn: kotlin.String? = null
        /**
         * Represents the name of the local secondary index.
         */
        var indexName: kotlin.String? = null
        /**
         * The total size of the specified index, in bytes. DynamoDB updates this value
         * approximately every six hours. Recent changes might not be reflected in this
         * value.
         */
        var indexSizeBytes: kotlin.Long = 0L
        /**
         * The number of items in the specified index. DynamoDB updates this value
         * approximately every six hours. Recent changes might not be reflected in this
         * value.
         */
        var itemCount: kotlin.Long = 0L
        /**
         * The complete key schema for the local secondary index, consisting of one or more pairs
         * of attribute names and key types:
         *
         *
         *
         * HASH - partition key
         *
         *
         * RANGE - sort key
         *
         *
         *
         * The partition key of an item is also known as its hash
         * attribute. The term "hash attribute" derives from DynamoDB's usage of
         * an internal hash function to evenly distribute data items across partitions, based
         * on their partition key values.
         * The sort key of an item is also known as its range attribute.
         * The term "range attribute" derives from the way DynamoDB stores items with the same
         * partition key physically close together, in sorted order by the sort key
         * value.
         */
        var keySchema: List<KeySchemaElement>? = null
        /**
         * Represents attributes that are copied (projected) from the table into the global
         * secondary index. These are in addition to the primary key attributes and index key
         * attributes, which are automatically projected.
         */
        var projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexDescription) : this() {
            this.indexArn = x.indexArn
            this.indexName = x.indexName
            this.indexSizeBytes = x.indexSizeBytes
            this.itemCount = x.itemCount
            this.keySchema = x.keySchema
            this.projection = x.projection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexDescription = LocalSecondaryIndexDescription(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.Projection] inside the given [block]
         */
        fun projection(block: aws.sdk.kotlin.services.dynamodb.model.Projection.Builder.() -> kotlin.Unit) {
            this.projection = aws.sdk.kotlin.services.dynamodb.model.Projection.invoke(block)
        }
    }
}
