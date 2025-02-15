// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DocDB
{
    /// <summary>
    /// Manages an DocumentDB Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon DocumentDB automatically replicates the data to the secondary regions using dedicated infrastructure.
    /// 
    /// More information about DocumentDB Global Clusters can be found in the [DocumentDB Developer Guide](https://docs.aws.amazon.com/documentdb/latest/developerguide/global-clusters.html).
    /// 
    /// ## Example Usage
    /// ### New Global Cluster From Existing DB Cluster
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // ... other configuration ...
    ///         var exampleCluster = new Aws.DocDB.Cluster("exampleCluster", new Aws.DocDB.ClusterArgs
    ///         {
    ///         });
    ///         var exampleGlobalCluster = new Aws.DocDB.GlobalCluster("exampleGlobalCluster", new Aws.DocDB.GlobalClusterArgs
    ///         {
    ///             GlobalClusterIdentifier = "example",
    ///             SourceDbClusterIdentifier = exampleCluster.Arn,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_docdb_global_cluster` can be imported by using the Global Cluster identifier, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:docdb/globalCluster:GlobalCluster example example
    /// ```
    /// 
    ///  Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the Terraform configuration on an imported resource, Terraform will always show a difference. To workaround this behavior, either omit the argument from the Terraform configuration or use [`ignore_changes`](https://www.terraform.io/docs/configuration/meta-arguments/lifecycle.html#ignore_changes) to hide the difference, e.g. terraform resource "aws_docdb_global_cluster" "example" {
    /// 
    /// # ... other configuration ...
    /// 
    /// # There is no API for reading source_db_cluster_identifier
    /// 
    ///  lifecycle {
    /// 
    ///  ignore_changes = [source_db_cluster_identifier]
    /// 
    ///  } }
    /// </summary>
    [AwsResourceType("aws:docdb/globalCluster:GlobalCluster")]
    public partial class GlobalCluster : Pulumi.CustomResource
    {
        /// <summary>
        /// Global Cluster Amazon Resource Name (ARN)
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name for an automatically created database on cluster creation.
        /// </summary>
        [Output("databaseName")]
        public Output<string?> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        /// </summary>
        [Output("deletionProtection")]
        public Output<bool?> DeletionProtection { get; private set; } = null!;

        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        /// * **NOTE:** Upgrading major versions is not supported.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The global cluster identifier.
        /// </summary>
        [Output("globalClusterIdentifier")]
        public Output<string> GlobalClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// Set of objects containing Global Cluster members.
        /// </summary>
        [Output("globalClusterMembers")]
        public Output<ImmutableArray<Outputs.GlobalClusterGlobalClusterMember>> GlobalClusterMembers { get; private set; } = null!;

        /// <summary>
        /// AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        /// </summary>
        [Output("globalClusterResourceId")]
        public Output<string> GlobalClusterResourceId { get; private set; } = null!;

        [Output("sourceDbClusterIdentifier")]
        public Output<string> SourceDbClusterIdentifier { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("storageEncrypted")]
        public Output<bool> StorageEncrypted { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalCluster(string name, GlobalClusterArgs args, CustomResourceOptions? options = null)
            : base("aws:docdb/globalCluster:GlobalCluster", name, args ?? new GlobalClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalCluster(string name, Input<string> id, GlobalClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:docdb/globalCluster:GlobalCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalCluster Get(string name, Input<string> id, GlobalClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalCluster(name, id, state, options);
        }
    }

    public sealed class GlobalClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name for an automatically created database on cluster creation.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        /// * **NOTE:** Upgrading major versions is not supported.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The global cluster identifier.
        /// </summary>
        [Input("globalClusterIdentifier", required: true)]
        public Input<string> GlobalClusterIdentifier { get; set; } = null!;

        [Input("sourceDbClusterIdentifier")]
        public Input<string>? SourceDbClusterIdentifier { get; set; }

        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        public GlobalClusterArgs()
        {
        }
    }

    public sealed class GlobalClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Global Cluster Amazon Resource Name (ARN)
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name for an automatically created database on cluster creation.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
        /// * **NOTE:** Upgrading major versions is not supported.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The global cluster identifier.
        /// </summary>
        [Input("globalClusterIdentifier")]
        public Input<string>? GlobalClusterIdentifier { get; set; }

        [Input("globalClusterMembers")]
        private InputList<Inputs.GlobalClusterGlobalClusterMemberGetArgs>? _globalClusterMembers;

        /// <summary>
        /// Set of objects containing Global Cluster members.
        /// </summary>
        public InputList<Inputs.GlobalClusterGlobalClusterMemberGetArgs> GlobalClusterMembers
        {
            get => _globalClusterMembers ?? (_globalClusterMembers = new InputList<Inputs.GlobalClusterGlobalClusterMemberGetArgs>());
            set => _globalClusterMembers = value;
        }

        /// <summary>
        /// AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
        /// </summary>
        [Input("globalClusterResourceId")]
        public Input<string>? GlobalClusterResourceId { get; set; }

        [Input("sourceDbClusterIdentifier")]
        public Input<string>? SourceDbClusterIdentifier { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        public GlobalClusterState()
        {
        }
    }
}
