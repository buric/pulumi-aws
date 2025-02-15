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
    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflake
    {
        /// <summary>
        /// The name of the account.
        /// </summary>
        public readonly string? AccountName;
        /// <summary>
        /// The name of the Amazon S3 bucket associated with Snowflake.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
        /// </summary>
        public readonly string? BucketPrefix;
        /// <summary>
        /// The Snowflake Private Link service name to be used for private data transfers.
        /// </summary>
        public readonly string? PrivateLinkServiceName;
        /// <summary>
        /// The AWS Region of the Snowflake account.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account. This is written in the following format: `&lt;Database&gt;.&lt;Schema&gt;.&lt;Stage Name&gt;`.
        /// </summary>
        public readonly string Stage;
        /// <summary>
        /// The name of the Snowflake warehouse.
        /// </summary>
        public readonly string Warehouse;

        [OutputConstructor]
        private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflake(
            string? accountName,

            string bucketName,

            string? bucketPrefix,

            string? privateLinkServiceName,

            string? region,

            string stage,

            string warehouse)
        {
            AccountName = accountName;
            BucketName = bucketName;
            BucketPrefix = bucketPrefix;
            PrivateLinkServiceName = privateLinkServiceName;
            Region = region;
            Stage = stage;
            Warehouse = warehouse;
        }
    }
}
