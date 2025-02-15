// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake
    {
        /// <summary>
        /// The object key for the Amazon S3 bucket in which the source files are stored.
        /// </summary>
        public readonly string? BucketPrefix;
        /// <summary>
        /// The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        public readonly Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig? ErrorHandlingConfig;
        /// <summary>
        /// The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Snowflake.
        /// </summary>
        public readonly string IntermediateBucketName;
        /// <summary>
        /// The object specified in the Veeva flow source.
        /// </summary>
        public readonly string Object;

        [OutputConstructor]
        private FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake(
            string? bucketPrefix,

            Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig? errorHandlingConfig,

            string intermediateBucketName,

            string @object)
        {
            BucketPrefix = bucketPrefix;
            ErrorHandlingConfig = errorHandlingConfig;
            IntermediateBucketName = intermediateBucketName;
            Object = @object;
        }
    }
}
