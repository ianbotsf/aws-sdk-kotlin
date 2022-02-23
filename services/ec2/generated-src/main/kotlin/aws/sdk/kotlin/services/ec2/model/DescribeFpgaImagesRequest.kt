// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeFpgaImagesRequest private constructor(builder: Builder) {
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
     * create-time - The creation time of the AFI.
     *
     *
     * fpga-image-id - The FPGA image identifier (AFI ID).
     *
     *
     * fpga-image-global-id - The global FPGA image identifier (AGFI ID).
     *
     *
     * name - The name of the AFI.
     *
     *
     * owner-id - The Amazon Web Services account ID of the AFI owner.
     *
     *
     * product-code - The product code.
     *
     *
     * shell-version - The version of the Amazon Web Services Shell that was used to create the bitstream.
     *
     *
     * state - The state of the AFI (pending | failed | available | unavailable).
     *
     *
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     *
     *
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     *
     *
     * update-time - The time of the most recent update.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The AFI IDs.
     */
    val fpgaImageIds: List<String>? = builder.fpgaImageIds
    /**
     * The maximum number of results to return in a single call.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token to retrieve the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Filters the AFI by owner. Specify an Amazon Web Services account ID, self
     * (owner is the sender of the request), or an Amazon Web Services owner alias (valid values are
     * amazon | aws-marketplace).
     */
    val owners: List<String>? = builder.owners

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFpgaImagesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFpgaImagesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("fpgaImageIds=$fpgaImageIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("owners=$owners)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (owners?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFpgaImagesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (fpgaImageIds != other.fpgaImageIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (owners != other.owners) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFpgaImagesRequest = Builder(this).apply(block).build()

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
         * create-time - The creation time of the AFI.
         *
         *
         * fpga-image-id - The FPGA image identifier (AFI ID).
         *
         *
         * fpga-image-global-id - The global FPGA image identifier (AGFI ID).
         *
         *
         * name - The name of the AFI.
         *
         *
         * owner-id - The Amazon Web Services account ID of the AFI owner.
         *
         *
         * product-code - The product code.
         *
         *
         * shell-version - The version of the Amazon Web Services Shell that was used to create the bitstream.
         *
         *
         * state - The state of the AFI (pending | failed | available | unavailable).
         *
         *
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         *
         *
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         *
         *
         * update-time - The time of the most recent update.
         */
        var filters: List<Filter>? = null
        /**
         * The AFI IDs.
         */
        var fpgaImageIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token to retrieve the next page of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * Filters the AFI by owner. Specify an Amazon Web Services account ID, self
         * (owner is the sender of the request), or an Amazon Web Services owner alias (valid values are
         * amazon | aws-marketplace).
         */
        var owners: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFpgaImagesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.fpgaImageIds = x.fpgaImageIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.owners = x.owners
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFpgaImagesRequest = DescribeFpgaImagesRequest(this)
    }
}
