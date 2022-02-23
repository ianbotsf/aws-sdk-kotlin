// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a DeleteItem operation.
 */
class DeleteItemRequest private constructor(builder: Builder) {
    /**
     * A condition that must be satisfied in order for a conditional DeleteItem
     * to succeed.
     * An expression can contain any of the following:
     *
     *
     * Functions: attribute_exists | attribute_not_exists | attribute_type |
     * contains | begins_with | size
     *
     * These function names are case-sensitive.
     *
     * Comparison operators: = | <> |
     * < | > | <= | >= |
     * BETWEEN | IN
     *
     *
     * Logical operators: AND | OR | NOT
     *
     *
     *
     * For more information about condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
     * Guide.
     */
    val conditionExpression: kotlin.String? = builder.conditionExpression
    /**
     * This is a legacy parameter. Use ConditionExpression instead. For more
     * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator in the Amazon DynamoDB Developer
     * Guide.
     */
    val conditionalOperator: aws.sdk.kotlin.services.dynamodb.model.ConditionalOperator? = builder.conditionalOperator
    /**
     * This is a legacy parameter. Use ConditionExpression instead. For more
     * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected in the Amazon DynamoDB Developer
     * Guide.
     */
    val expected: Map<String, ExpectedAttributeValue>? = builder.expected
    /**
     * One or more substitution tokens for attribute names in an expression. The following
     * are some use cases for using ExpressionAttributeNames:
     *
     *
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     *
     * To create a placeholder for repeating occurrences of an attribute name in an
     * expression.
     *
     * To prevent special characters in an attribute name from being misinterpreted
     * in an expression.
     *
     *
     * Use the # character in an expression to dereference
     * an attribute name. For example, consider the following attribute name:
     *
     *
     *
     * Percentile
     *
     *
     *
     * The name of this attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words in the Amazon DynamoDB Developer
     * Guide). To work around this, you could specify the following for
     * ExpressionAttributeNames:
     *
     *
     *
     * {"#P":"Percentile"}
     *
     *
     *
     * You could then use this substitution in an expression, as in this example:
     *
     *
     *
     * #P = :val
     *
     *
     *
     *
     * Tokens that begin with the : character are
     * expression attribute values, which are placeholders for the
     * actual value at runtime.
     *
     * For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes in the Amazon DynamoDB Developer
     * Guide.
     */
    val expressionAttributeNames: Map<String, String>? = builder.expressionAttributeNames
    /**
     * One or more values that can be substituted in an expression.
     * Use the : (colon) character in an expression to
     * dereference an attribute value. For example, suppose that you wanted to check whether
     * the value of the ProductStatus attribute was one of the following:
     *
     * Available | Backordered | Discontinued
     *
     * You would first need to specify ExpressionAttributeValues as
     * follows:
     *
     * { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"},
     * ":disc":{"S":"Discontinued"} }
     *
     * You could then use these values in an expression, such as this:
     *
     * ProductStatus IN (:avail, :back, :disc)
     *
     * For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
     * Guide.
     */
    val expressionAttributeValues: Map<String, AttributeValue>? = builder.expressionAttributeValues
    /**
     * A map of attribute names to AttributeValue objects, representing the
     * primary key of the item to delete.
     * For the primary key, you must provide all of the attributes. For example, with a
     * simple primary key, you only need to provide a value for the partition key. For a
     * composite primary key, you must provide values for both the partition key and the sort
     * key.
     */
    val key: Map<String, AttributeValue>? = builder.key
    /**
     * Determines the level of detail about either provisioned or on-demand throughput
     * consumption that is returned in the response:
     *
     *
     *
     * INDEXES - The response includes the aggregate
     * ConsumedCapacity for the operation, together with
     * ConsumedCapacity for each table and secondary index that was
     * accessed.
     * Note that some operations, such as GetItem and
     * BatchGetItem, do not access any indexes at all. In these cases,
     * specifying INDEXES will only return ConsumedCapacity
     * information for table(s).
     *
     *
     * TOTAL - The response includes only the aggregate
     * ConsumedCapacity for the operation.
     *
     *
     * NONE - No ConsumedCapacity details are included in the
     * response.
     */
    val returnConsumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ReturnConsumedCapacity? = builder.returnConsumedCapacity
    /**
     * Determines whether item collection metrics are returned. If set to SIZE,
     * the response includes statistics about item collections, if any, that were modified
     * during the operation are returned in the response. If set to NONE (the
     * default), no statistics are returned.
     */
    val returnItemCollectionMetrics: aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics? = builder.returnItemCollectionMetrics
    /**
     * Use ReturnValues if you want to get the item attributes as they appeared
     * before they were deleted. For DeleteItem, the valid values are:
     *
     *
     *
     * NONE - If ReturnValues is not specified, or if its
     * value is NONE, then nothing is returned. (This setting is the
     * default for ReturnValues.)
     *
     *
     * ALL_OLD - The content of the old item is returned.
     *
     *
     *
     * The ReturnValues parameter is used by several DynamoDB operations;
     * however, DeleteItem does not recognize any values other than
     * NONE or ALL_OLD.
     */
    val returnValues: aws.sdk.kotlin.services.dynamodb.model.ReturnValue? = builder.returnValues
    /**
     * The name of the table from which to delete the item.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteItemRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteItemRequest(")
        append("conditionExpression=$conditionExpression,")
        append("conditionalOperator=$conditionalOperator,")
        append("expected=$expected,")
        append("expressionAttributeNames=$expressionAttributeNames,")
        append("expressionAttributeValues=$expressionAttributeValues,")
        append("key=$key,")
        append("returnConsumedCapacity=$returnConsumedCapacity,")
        append("returnItemCollectionMetrics=$returnItemCollectionMetrics,")
        append("returnValues=$returnValues,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conditionExpression?.hashCode() ?: 0
        result = 31 * result + (conditionalOperator?.hashCode() ?: 0)
        result = 31 * result + (expected?.hashCode() ?: 0)
        result = 31 * result + (expressionAttributeNames?.hashCode() ?: 0)
        result = 31 * result + (expressionAttributeValues?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (returnConsumedCapacity?.hashCode() ?: 0)
        result = 31 * result + (returnItemCollectionMetrics?.hashCode() ?: 0)
        result = 31 * result + (returnValues?.hashCode() ?: 0)
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteItemRequest

        if (conditionExpression != other.conditionExpression) return false
        if (conditionalOperator != other.conditionalOperator) return false
        if (expected != other.expected) return false
        if (expressionAttributeNames != other.expressionAttributeNames) return false
        if (expressionAttributeValues != other.expressionAttributeValues) return false
        if (key != other.key) return false
        if (returnConsumedCapacity != other.returnConsumedCapacity) return false
        if (returnItemCollectionMetrics != other.returnItemCollectionMetrics) return false
        if (returnValues != other.returnValues) return false
        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteItemRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A condition that must be satisfied in order for a conditional DeleteItem
         * to succeed.
         * An expression can contain any of the following:
         *
         *
         * Functions: attribute_exists | attribute_not_exists | attribute_type |
         * contains | begins_with | size
         *
         * These function names are case-sensitive.
         *
         * Comparison operators: = | <> |
         * < | > | <= | >= |
         * BETWEEN | IN
         *
         *
         * Logical operators: AND | OR | NOT
         *
         *
         *
         * For more information about condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        var conditionExpression: kotlin.String? = null
        /**
         * This is a legacy parameter. Use ConditionExpression instead. For more
         * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator in the Amazon DynamoDB Developer
         * Guide.
         */
        var conditionalOperator: aws.sdk.kotlin.services.dynamodb.model.ConditionalOperator? = null
        /**
         * This is a legacy parameter. Use ConditionExpression instead. For more
         * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected in the Amazon DynamoDB Developer
         * Guide.
         */
        var expected: Map<String, ExpectedAttributeValue>? = null
        /**
         * One or more substitution tokens for attribute names in an expression. The following
         * are some use cases for using ExpressionAttributeNames:
         *
         *
         * To access an attribute whose name conflicts with a DynamoDB reserved
         * word.
         *
         * To create a placeholder for repeating occurrences of an attribute name in an
         * expression.
         *
         * To prevent special characters in an attribute name from being misinterpreted
         * in an expression.
         *
         *
         * Use the # character in an expression to dereference
         * an attribute name. For example, consider the following attribute name:
         *
         *
         *
         * Percentile
         *
         *
         *
         * The name of this attribute conflicts with a reserved word, so it cannot be used
         * directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words in the Amazon DynamoDB Developer
         * Guide). To work around this, you could specify the following for
         * ExpressionAttributeNames:
         *
         *
         *
         * {"#P":"Percentile"}
         *
         *
         *
         * You could then use this substitution in an expression, as in this example:
         *
         *
         *
         * #P = :val
         *
         *
         *
         *
         * Tokens that begin with the : character are
         * expression attribute values, which are placeholders for the
         * actual value at runtime.
         *
         * For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes in the Amazon DynamoDB Developer
         * Guide.
         */
        var expressionAttributeNames: Map<String, String>? = null
        /**
         * One or more values that can be substituted in an expression.
         * Use the : (colon) character in an expression to
         * dereference an attribute value. For example, suppose that you wanted to check whether
         * the value of the ProductStatus attribute was one of the following:
         *
         * Available | Backordered | Discontinued
         *
         * You would first need to specify ExpressionAttributeValues as
         * follows:
         *
         * { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"},
         * ":disc":{"S":"Discontinued"} }
         *
         * You could then use these values in an expression, such as this:
         *
         * ProductStatus IN (:avail, :back, :disc)
         *
         * For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        var expressionAttributeValues: Map<String, AttributeValue>? = null
        /**
         * A map of attribute names to AttributeValue objects, representing the
         * primary key of the item to delete.
         * For the primary key, you must provide all of the attributes. For example, with a
         * simple primary key, you only need to provide a value for the partition key. For a
         * composite primary key, you must provide values for both the partition key and the sort
         * key.
         */
        var key: Map<String, AttributeValue>? = null
        /**
         * Determines the level of detail about either provisioned or on-demand throughput
         * consumption that is returned in the response:
         *
         *
         *
         * INDEXES - The response includes the aggregate
         * ConsumedCapacity for the operation, together with
         * ConsumedCapacity for each table and secondary index that was
         * accessed.
         * Note that some operations, such as GetItem and
         * BatchGetItem, do not access any indexes at all. In these cases,
         * specifying INDEXES will only return ConsumedCapacity
         * information for table(s).
         *
         *
         * TOTAL - The response includes only the aggregate
         * ConsumedCapacity for the operation.
         *
         *
         * NONE - No ConsumedCapacity details are included in the
         * response.
         */
        var returnConsumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ReturnConsumedCapacity? = null
        /**
         * Determines whether item collection metrics are returned. If set to SIZE,
         * the response includes statistics about item collections, if any, that were modified
         * during the operation are returned in the response. If set to NONE (the
         * default), no statistics are returned.
         */
        var returnItemCollectionMetrics: aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics? = null
        /**
         * Use ReturnValues if you want to get the item attributes as they appeared
         * before they were deleted. For DeleteItem, the valid values are:
         *
         *
         *
         * NONE - If ReturnValues is not specified, or if its
         * value is NONE, then nothing is returned. (This setting is the
         * default for ReturnValues.)
         *
         *
         * ALL_OLD - The content of the old item is returned.
         *
         *
         *
         * The ReturnValues parameter is used by several DynamoDB operations;
         * however, DeleteItem does not recognize any values other than
         * NONE or ALL_OLD.
         */
        var returnValues: aws.sdk.kotlin.services.dynamodb.model.ReturnValue? = null
        /**
         * The name of the table from which to delete the item.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteItemRequest) : this() {
            this.conditionExpression = x.conditionExpression
            this.conditionalOperator = x.conditionalOperator
            this.expected = x.expected
            this.expressionAttributeNames = x.expressionAttributeNames
            this.expressionAttributeValues = x.expressionAttributeValues
            this.key = x.key
            this.returnConsumedCapacity = x.returnConsumedCapacity
            this.returnItemCollectionMetrics = x.returnItemCollectionMetrics
            this.returnValues = x.returnValues
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteItemRequest = DeleteItemRequest(this)
    }
}
