// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Athena.Inputs
{

    public sealed class WorkgroupConfigurationResultConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        /// </summary>
        [Input("aclConfiguration")]
        public Input<Inputs.WorkgroupConfigurationResultConfigurationAclConfigurationArgs>? AclConfiguration { get; set; }

        /// <summary>
        /// Configuration block with encryption settings. See Encryption Configuration below.
        /// </summary>
        [Input("encryptionConfiguration")]
        public Input<Inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs>? EncryptionConfiguration { get; set; }

        /// <summary>
        /// The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        /// <summary>
        /// The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
        /// </summary>
        [Input("outputLocation")]
        public Input<string>? OutputLocation { get; set; }

        public WorkgroupConfigurationResultConfigurationArgs()
        {
        }
    }
}
