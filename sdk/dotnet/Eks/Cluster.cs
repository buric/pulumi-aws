// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks
{
    /// <summary>
    /// Manages an EKS Cluster.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Eks.Cluster("example", new Aws.Eks.ClusterArgs
    ///         {
    ///             RoleArn = aws_iam_role.Example.Arn,
    ///             VpcConfig = new Aws.Eks.Inputs.ClusterVpcConfigArgs
    ///             {
    ///                 SubnetIds = 
    ///                 {
    ///                     aws_subnet.Example1.Id,
    ///                     aws_subnet.Example2.Id,
    ///                 },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 aws_iam_role_policy_attachment.Example_AmazonEKSClusterPolicy,
    ///                 aws_iam_role_policy_attachment.Example_AmazonEKSVPCResourceController,
    ///             },
    ///         });
    ///         this.Endpoint = example.Endpoint;
    ///         this.Kubeconfig_certificate_authority_data = example.CertificateAuthority.Apply(certificateAuthority =&gt; certificateAuthority.Data);
    ///     }
    /// 
    ///     [Output("endpoint")]
    ///     public Output&lt;string&gt; Endpoint { get; set; }
    ///     [Output("kubeconfig-certificate-authority-data")]
    ///     public Output&lt;string&gt; Kubeconfig_certificate_authority_data { get; set; }
    /// }
    /// ```
    /// ### Example IAM Role for EKS Cluster
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Iam.Role("example", new Aws.Iam.RoleArgs
    ///         {
    ///             AssumeRolePolicy = @"{
    ///   ""Version"": ""2012-10-17"",
    ///   ""Statement"": [
    ///     {
    ///       ""Effect"": ""Allow"",
    ///       ""Principal"": {
    ///         ""Service"": ""eks.amazonaws.com""
    ///       },
    ///       ""Action"": ""sts:AssumeRole""
    ///     }
    ///   ]
    /// }
    /// ",
    ///         });
    ///         var example_AmazonEKSClusterPolicy = new Aws.Iam.RolePolicyAttachment("example-AmazonEKSClusterPolicy", new Aws.Iam.RolePolicyAttachmentArgs
    ///         {
    ///             PolicyArn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy",
    ///             Role = example.Name,
    ///         });
    ///         // Optionally, enable Security Groups for Pods
    ///         // Reference: https://docs.aws.amazon.com/eks/latest/userguide/security-groups-for-pods.html
    ///         var example_AmazonEKSVPCResourceController = new Aws.Iam.RolePolicyAttachment("example-AmazonEKSVPCResourceController", new Aws.Iam.RolePolicyAttachmentArgs
    ///         {
    ///             PolicyArn = "arn:aws:iam::aws:policy/AmazonEKSVPCResourceController",
    ///             Role = example.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Enabling Control Plane Logging
    /// 
    /// [EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) can be enabled via the `enabled_cluster_log_types` argument. To manage the CloudWatch Log Group retention period, the `aws.cloudwatch.LogGroup` resource can be used.
    /// 
    /// &gt; The below configuration uses [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) to prevent ordering issues with EKS automatically creating the log group first and a variable for naming consistency. Other ordering and naming methodologies may be more appropriate for your environment.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var clusterName = config.Get("clusterName") ?? "example";
    ///         var exampleLogGroup = new Aws.CloudWatch.LogGroup("exampleLogGroup", new Aws.CloudWatch.LogGroupArgs
    ///         {
    ///             RetentionInDays = 7,
    ///         });
    ///         // ... potentially other configuration ...
    ///         var exampleCluster = new Aws.Eks.Cluster("exampleCluster", new Aws.Eks.ClusterArgs
    ///         {
    ///             EnabledClusterLogTypes = 
    ///             {
    ///                 "api",
    ///                 "audit",
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleLogGroup,
    ///             },
    ///         });
    ///         // ... other configuration ...
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// EKS Clusters can be imported using the `name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:eks/cluster:Cluster my_cluster my_cluster
    /// ```
    /// </summary>
    [AwsResourceType("aws:eks/cluster:Cluster")]
    public partial class Cluster : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the cluster.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
        /// </summary>
        [Output("certificateAuthorities")]
        public Output<ImmutableArray<Outputs.ClusterCertificateAuthority>> CertificateAuthorities { get; private set; } = null!;

        /// <summary>
        /// The first certificate authority. Base64 encoded certificate data required to communicate with your cluster.
        /// </summary>
        [Output("certificateAuthority")]
        public Output<Outputs.ClusterCertificateAuthority> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Unix epoch timestamp in seconds for when the cluster was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// List of addons to remove upon creation. Any addon listed will be "adopted" and then removed. This allows for the creation of a baremetal cluster where no addon is deployed and direct management of addons via Pulumi Kubernetes resources. Valid entries are `kube-proxy`, `coredns` and `vpc-cni`. **Only** works on first creation of a cluster.
        /// </summary>
        [Output("defaultAddonsToRemoves")]
        public Output<ImmutableArray<string>> DefaultAddonsToRemoves { get; private set; } = null!;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        [Output("enabledClusterLogTypes")]
        public Output<ImmutableArray<string>> EnabledClusterLogTypes { get; private set; } = null!;

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Output("encryptionConfig")]
        public Output<Outputs.ClusterEncryptionConfig?> EncryptionConfig { get; private set; } = null!;

        /// <summary>
        /// Endpoint for your Kubernetes API server.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
        /// </summary>
        [Output("identities")]
        public Output<ImmutableArray<Outputs.ClusterIdentity>> Identities { get; private set; } = null!;

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Output("kubernetesNetworkConfig")]
        public Output<Outputs.ClusterKubernetesNetworkConfig> KubernetesNetworkConfig { get; private set; } = null!;

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Platform version for the cluster.
        /// </summary>
        [Output("platformVersion")]
        public Output<string> PlatformVersion { get; private set; } = null!;

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.ClusterVpcConfig> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("aws:eks/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:eks/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : Pulumi.ResourceArgs
    {
        [Input("defaultAddonsToRemoves")]
        private InputList<string>? _defaultAddonsToRemoves;

        /// <summary>
        /// List of addons to remove upon creation. Any addon listed will be "adopted" and then removed. This allows for the creation of a baremetal cluster where no addon is deployed and direct management of addons via Pulumi Kubernetes resources. Valid entries are `kube-proxy`, `coredns` and `vpc-cni`. **Only** works on first creation of a cluster.
        /// </summary>
        public InputList<string> DefaultAddonsToRemoves
        {
            get => _defaultAddonsToRemoves ?? (_defaultAddonsToRemoves = new InputList<string>());
            set => _defaultAddonsToRemoves = value;
        }

        [Input("enabledClusterLogTypes")]
        private InputList<string>? _enabledClusterLogTypes;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        public InputList<string> EnabledClusterLogTypes
        {
            get => _enabledClusterLogTypes ?? (_enabledClusterLogTypes = new InputList<string>());
            set => _enabledClusterLogTypes = value;
        }

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.ClusterEncryptionConfigArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Input("kubernetesNetworkConfig")]
        public Input<Inputs.ClusterKubernetesNetworkConfigArgs>? KubernetesNetworkConfig { get; set; }

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// </summary>
        [Input("vpcConfig", required: true)]
        public Input<Inputs.ClusterVpcConfigArgs> VpcConfig { get; set; } = null!;

        public ClusterArgs()
        {
        }
    }

    public sealed class ClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the cluster.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("certificateAuthorities")]
        private InputList<Inputs.ClusterCertificateAuthorityGetArgs>? _certificateAuthorities;

        /// <summary>
        /// Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
        /// </summary>
        public InputList<Inputs.ClusterCertificateAuthorityGetArgs> CertificateAuthorities
        {
            get => _certificateAuthorities ?? (_certificateAuthorities = new InputList<Inputs.ClusterCertificateAuthorityGetArgs>());
            set => _certificateAuthorities = value;
        }

        /// <summary>
        /// The first certificate authority. Base64 encoded certificate data required to communicate with your cluster.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<Inputs.ClusterCertificateAuthorityGetArgs>? CertificateAuthority { get; set; }

        /// <summary>
        /// Unix epoch timestamp in seconds for when the cluster was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("defaultAddonsToRemoves")]
        private InputList<string>? _defaultAddonsToRemoves;

        /// <summary>
        /// List of addons to remove upon creation. Any addon listed will be "adopted" and then removed. This allows for the creation of a baremetal cluster where no addon is deployed and direct management of addons via Pulumi Kubernetes resources. Valid entries are `kube-proxy`, `coredns` and `vpc-cni`. **Only** works on first creation of a cluster.
        /// </summary>
        public InputList<string> DefaultAddonsToRemoves
        {
            get => _defaultAddonsToRemoves ?? (_defaultAddonsToRemoves = new InputList<string>());
            set => _defaultAddonsToRemoves = value;
        }

        [Input("enabledClusterLogTypes")]
        private InputList<string>? _enabledClusterLogTypes;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        public InputList<string> EnabledClusterLogTypes
        {
            get => _enabledClusterLogTypes ?? (_enabledClusterLogTypes = new InputList<string>());
            set => _enabledClusterLogTypes = value;
        }

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.ClusterEncryptionConfigGetArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// Endpoint for your Kubernetes API server.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("identities")]
        private InputList<Inputs.ClusterIdentityGetArgs>? _identities;

        /// <summary>
        /// Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
        /// </summary>
        public InputList<Inputs.ClusterIdentityGetArgs> Identities
        {
            get => _identities ?? (_identities = new InputList<Inputs.ClusterIdentityGetArgs>());
            set => _identities = value;
        }

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Input("kubernetesNetworkConfig")]
        public Input<Inputs.ClusterKubernetesNetworkConfigGetArgs>? KubernetesNetworkConfig { get; set; }

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Platform version for the cluster.
        /// </summary>
        [Input("platformVersion")]
        public Input<string>? PlatformVersion { get; set; }

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ClusterVpcConfigGetArgs>? VpcConfig { get; set; }

        public ClusterState()
        {
        }
    }
}
