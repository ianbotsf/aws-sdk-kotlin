// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVolumesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     *
     *
     *
     * attachment.attach-time - The time stamp when the attachment
     * initiated.
     *
     *
     * attachment.delete-on-termination - Whether the volume is deleted on
     * instance termination.
     *
     *
     * attachment.device - The device name specified in the block device mapping
     * (for example, /dev/sda1).
     *
     *
     * attachment.instance-id - The ID of the instance the volume is attached
     * to.
     *
     *
     * attachment.status - The attachment state (attaching |
     * attached | detaching).
     *
     *
     * availability-zone - The Availability Zone in which the volume was
     * created.
     *
     *
     * create-time - The time stamp when the volume was created.
     *
     *
     * encrypted - Indicates whether the volume is encrypted (true
     * | false)
     *
     *
     * multi-attach-enabled - Indicates whether the volume is enabled for Multi-Attach (true
     * | false)
     *
     *
     *
     * fast-restored - Indicates whether the volume was created from a
     * snapshot that is enabled for fast snapshot restore (true |
     * false).
     *
     *
     * size - The size of the volume, in GiB.
     *
     *
     * snapshot-id - The snapshot from which the volume was created.
     *
     *
     * status - The state of the volume (creating |
     * available | in-use | deleting |
     * deleted | error).
     *
     *
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     *
     *
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     *
     *
     * volume-id - The volume ID.
     *
     *
     * volume-type - The Amazon EBS volume type (gp2 | gp3 | io1 | io2 |
     * st1 | sc1| standard)
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of volume results returned by DescribeVolumes in paginated
     * output. When this parameter is used, DescribeVolumes only returns
     * MaxResults results in a single page along with a NextToken
     * response element. The remaining results of the initial request can be seen by sending another
     * DescribeVolumes request with the returned NextToken value. This
     * value can be between 5 and 500; if MaxResults is given a value larger than 500,
     * only 500 results are returned. If this parameter is not used, then
     * DescribeVolumes returns all results. You cannot specify this parameter and the
     * volume IDs parameter in the same request.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The NextToken value returned from a previous paginated
     * DescribeVolumes request where MaxResults was used and the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous
     * results that returned the NextToken value. This value is null when
     * there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The volume IDs.
     */
    val volumeIds: List<String>? = builder.volumeIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVolumesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVolumesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("volumeIds=$volumeIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (volumeIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVolumesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (volumeIds != other.volumeIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVolumesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         *
         *
         *
         * attachment.attach-time - The time stamp when the attachment
         * initiated.
         *
         *
         * attachment.delete-on-termination - Whether the volume is deleted on
         * instance termination.
         *
         *
         * attachment.device - The device name specified in the block device mapping
         * (for example, /dev/sda1).
         *
         *
         * attachment.instance-id - The ID of the instance the volume is attached
         * to.
         *
         *
         * attachment.status - The attachment state (attaching |
         * attached | detaching).
         *
         *
         * availability-zone - The Availability Zone in which the volume was
         * created.
         *
         *
         * create-time - The time stamp when the volume was created.
         *
         *
         * encrypted - Indicates whether the volume is encrypted (true
         * | false)
         *
         *
         * multi-attach-enabled - Indicates whether the volume is enabled for Multi-Attach (true
         * | false)
         *
         *
         *
         * fast-restored - Indicates whether the volume was created from a
         * snapshot that is enabled for fast snapshot restore (true |
         * false).
         *
         *
         * size - The size of the volume, in GiB.
         *
         *
         * snapshot-id - The snapshot from which the volume was created.
         *
         *
         * status - The state of the volume (creating |
         * available | in-use | deleting |
         * deleted | error).
         *
         *
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         *
         *
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         *
         *
         * volume-id - The volume ID.
         *
         *
         * volume-type - The Amazon EBS volume type (gp2 | gp3 | io1 | io2 |
         * st1 | sc1| standard)
         */
        var filters: List<Filter>? = null
        /**
         * The maximum number of volume results returned by DescribeVolumes in paginated
         * output. When this parameter is used, DescribeVolumes only returns
         * MaxResults results in a single page along with a NextToken
         * response element. The remaining results of the initial request can be seen by sending another
         * DescribeVolumes request with the returned NextToken value. This
         * value can be between 5 and 500; if MaxResults is given a value larger than 500,
         * only 500 results are returned. If this parameter is not used, then
         * DescribeVolumes returns all results. You cannot specify this parameter and the
         * volume IDs parameter in the same request.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The NextToken value returned from a previous paginated
         * DescribeVolumes request where MaxResults was used and the results
         * exceeded the value of that parameter. Pagination continues from the end of the previous
         * results that returned the NextToken value. This value is null when
         * there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * The volume IDs.
         */
        var volumeIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVolumesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.volumeIds = x.volumeIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVolumesRequest = DescribeVolumesRequest(this)
    }
}
