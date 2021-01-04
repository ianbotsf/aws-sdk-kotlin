/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */
package aws.sdk.kotlin.codegen

import aws.sdk.kotlin.codegen.awsjson.AwsJson1_0
import aws.sdk.kotlin.codegen.restjson.RestJson1
import software.amazon.smithy.kotlin.codegen.integration.KotlinIntegration
import software.amazon.smithy.kotlin.codegen.integration.ProtocolGenerator

/**
 * Integration that registers protocol generators this package provides
 */
class SdkProtocolGeneratorSupplier : KotlinIntegration {
    /**
     * Gets the sort order of the customization from -128 to 127, with lowest
     * executed first.
     *
     * @return Returns the sort order, defaults to -10.
     */
    override val order: Byte = -10

    // NOTE: Adding protocol tests as gradle test targets can be enabled here:
    // codegen/protocol-test-codegen/build.gradle.kts:73
    override val protocolGenerators: List<ProtocolGenerator> = listOf(AwsJson1_0(), RestJson1())
}