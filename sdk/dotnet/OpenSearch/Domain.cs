// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch
{
    /// <summary>
    /// Manages an Amazon OpenSearch Domain.
    /// 
    /// ## Elasticsearch vs. OpenSearch
    /// 
    /// Amazon OpenSearch Service is the successor to Amazon Elasticsearch Service and supports OpenSearch and legacy Elasticsearch OSS (up to 7.10, the final open source version of the software).
    /// 
    /// OpenSearch Domain configurations are similar in many ways to Elasticsearch Domain configurations. However, there are important differences including these:
    /// 
    /// * OpenSearch has `engine_version` while Elasticsearch has `elasticsearch_version`
    /// * Versions are specified differently - _e.g._, `Elasticsearch_7.10` with OpenSearch vs. `7.10` for Elasticsearch.
    /// * `instance_type` argument values end in `search` for OpenSearch vs. `elasticsearch` for Elasticsearch (_e.g._, `t2.micro.search` vs. `t2.micro.elasticsearch`).
    /// * The AWS-managed service-linked role for OpenSearch is called `AWSServiceRoleForAmazonOpenSearchService` instead of `AWSServiceRoleForAmazonElasticsearchService` for Elasticsearch.
    /// 
    /// There are also some potentially unexpected similarities in configurations:
    /// 
    /// * ARNs for both are prefaced with `arn:aws:es:`.
    /// * Both OpenSearch and Elasticsearch use assume role policies that refer to the `Principal` `Service` as `es.amazonaws.com`.
    /// * IAM policy actions, such as those you will find in `access_policies`, are prefaced with `es:` for both.
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
    ///         var example = new Aws.OpenSearch.Domain("example", new Aws.OpenSearch.DomainArgs
    ///         {
    ///             ClusterConfig = new Aws.OpenSearch.Inputs.DomainClusterConfigArgs
    ///             {
    ///                 InstanceType = "r4.large.search",
    ///             },
    ///             EngineVersion = "Elasticsearch_7.10",
    ///             Tags = 
    ///             {
    ///                 { "Domain", "TestDomain" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Access Policy
    /// 
    /// &gt; See also: [`aws.opensearch.DomainPolicy` resource](https://www.terraform.io/docs/providers/aws/r/opensearch_domain_policy.html)
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
    ///         var domain = config.Get("domain") ?? "tf-test";
    ///         var currentRegion = Output.Create(Aws.GetRegion.InvokeAsync());
    ///         var currentCallerIdentity = Output.Create(Aws.GetCallerIdentity.InvokeAsync());
    ///         var example = new Aws.OpenSearch.Domain("example", new Aws.OpenSearch.DomainArgs
    ///         {
    ///             AccessPolicies = Output.Tuple(currentRegion, currentCallerIdentity).Apply(values =&gt;
    ///             {
    ///                 var currentRegion = values.Item1;
    ///                 var currentCallerIdentity = values.Item2;
    ///                 return @$"{{
    ///   ""Version"": ""2012-10-17"",
    ///   ""Statement"": [
    ///     {{
    ///       ""Action"": ""es:*"",
    ///       ""Principal"": ""*"",
    ///       ""Effect"": ""Allow"",
    ///       ""Resource"": ""arn:aws:es:{currentRegion.Name}:{currentCallerIdentity.AccountId}:domain/{domain}/*"",
    ///       ""Condition"": {{
    ///         ""IpAddress"": {{""aws:SourceIp"": [""66.193.100.22/32""]}}
    ///       }}
    ///     }}
    ///   ]
    /// }}
    /// ";
    ///             }),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Log Publishing to CloudWatch Logs
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleLogGroup = new Aws.CloudWatch.LogGroup("exampleLogGroup", new Aws.CloudWatch.LogGroupArgs
    ///         {
    ///         });
    ///         var exampleLogResourcePolicy = new Aws.CloudWatch.LogResourcePolicy("exampleLogResourcePolicy", new Aws.CloudWatch.LogResourcePolicyArgs
    ///         {
    ///             PolicyName = "example",
    ///             PolicyDocument = @"{
    ///   ""Version"": ""2012-10-17"",
    ///   ""Statement"": [
    ///     {
    ///       ""Effect"": ""Allow"",
    ///       ""Principal"": {
    ///         ""Service"": ""es.amazonaws.com""
    ///       },
    ///       ""Action"": [
    ///         ""logs:PutLogEvents"",
    ///         ""logs:PutLogEventsBatch"",
    ///         ""logs:CreateLogStream""
    ///       ],
    ///       ""Resource"": ""arn:aws:logs:*""
    ///     }
    ///   ]
    /// }
    /// ",
    ///         });
    ///         // .. other configuration ...
    ///         var exampleDomain = new Aws.OpenSearch.Domain("exampleDomain", new Aws.OpenSearch.DomainArgs
    ///         {
    ///             LogPublishingOptions = 
    ///             {
    ///                 new Aws.OpenSearch.Inputs.DomainLogPublishingOptionArgs
    ///                 {
    ///                     CloudwatchLogGroupArn = exampleLogGroup.Arn,
    ///                     LogType = "INDEX_SLOW_LOGS",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### VPC based OpenSearch
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
    ///         var vpc = config.RequireObject&lt;dynamic&gt;("vpc");
    ///         var domain = config.Get("domain") ?? "tf-test";
    ///         var exampleVpc = Output.Create(Aws.Ec2.GetVpc.InvokeAsync(new Aws.Ec2.GetVpcArgs
    ///         {
    ///             Tags = 
    ///             {
    ///                 { "Name", vpc },
    ///             },
    ///         }));
    ///         var exampleSubnetIds = exampleVpc.Apply(exampleVpc =&gt; Output.Create(Aws.Ec2.GetSubnetIds.InvokeAsync(new Aws.Ec2.GetSubnetIdsArgs
    ///         {
    ///             VpcId = exampleVpc.Id,
    ///             Tags = 
    ///             {
    ///                 { "Tier", "private" },
    ///             },
    ///         })));
    ///         var currentRegion = Output.Create(Aws.GetRegion.InvokeAsync());
    ///         var currentCallerIdentity = Output.Create(Aws.GetCallerIdentity.InvokeAsync());
    ///         var exampleSecurityGroup = new Aws.Ec2.SecurityGroup("exampleSecurityGroup", new Aws.Ec2.SecurityGroupArgs
    ///         {
    ///             Description = "Managed by Terraform",
    ///             VpcId = exampleVpc.Apply(exampleVpc =&gt; exampleVpc.Id),
    ///             Ingress = 
    ///             {
    ///                 new Aws.Ec2.Inputs.SecurityGroupIngressArgs
    ///                 {
    ///                     FromPort = 443,
    ///                     ToPort = 443,
    ///                     Protocol = "tcp",
    ///                     CidrBlocks = 
    ///                     {
    ///                         exampleVpc.Apply(exampleVpc =&gt; exampleVpc.CidrBlock),
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var exampleServiceLinkedRole = new Aws.Iam.ServiceLinkedRole("exampleServiceLinkedRole", new Aws.Iam.ServiceLinkedRoleArgs
    ///         {
    ///             AwsServiceName = "opensearchservice.amazonaws.com",
    ///         });
    ///         var exampleDomain = new Aws.OpenSearch.Domain("exampleDomain", new Aws.OpenSearch.DomainArgs
    ///         {
    ///             EngineVersion = "OpenSearch_1.0",
    ///             ClusterConfig = new Aws.OpenSearch.Inputs.DomainClusterConfigArgs
    ///             {
    ///                 InstanceType = "m4.large.search",
    ///                 ZoneAwarenessEnabled = true,
    ///             },
    ///             VpcOptions = new Aws.OpenSearch.Inputs.DomainVpcOptionsArgs
    ///             {
    ///                 SubnetIds = 
    ///                 {
    ///                     exampleSubnetIds.Apply(exampleSubnetIds =&gt; exampleSubnetIds.Ids?[0]),
    ///                     exampleSubnetIds.Apply(exampleSubnetIds =&gt; exampleSubnetIds.Ids?[1]),
    ///                 },
    ///                 SecurityGroupIds = 
    ///                 {
    ///                     exampleSecurityGroup.Id,
    ///                 },
    ///             },
    ///             AdvancedOptions = 
    ///             {
    ///                 { "rest.action.multi.allow_explicit_index", "true" },
    ///             },
    ///             AccessPolicies = Output.Tuple(currentRegion, currentCallerIdentity).Apply(values =&gt;
    ///             {
    ///                 var currentRegion = values.Item1;
    ///                 var currentCallerIdentity = values.Item2;
    ///                 return @$"{{
    /// 	""Version"": ""2012-10-17"",
    /// 	""Statement"": [
    /// 		{{
    /// 			""Action"": ""es:*"",
    /// 			""Principal"": ""*"",
    /// 			""Effect"": ""Allow"",
    /// 			""Resource"": ""arn:aws:es:{currentRegion.Name}:{currentCallerIdentity.AccountId}:domain/{domain}/*""
    /// 		}}
    /// 	]
    /// }}
    /// ";
    ///             }),
    ///             Tags = 
    ///             {
    ///                 { "Domain", "TestDomain" },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleServiceLinkedRole,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// OpenSearch domains can be imported using the `domain_name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:opensearch/domain:Domain example domain_name
    /// ```
    /// </summary>
    [AwsResourceType("aws:opensearch/domain:Domain")]
    public partial class Domain : Pulumi.CustomResource
    {
        /// <summary>
        /// IAM policy document specifying the access policies for the domain.
        /// </summary>
        [Output("accessPolicies")]
        public Output<string> AccessPolicies { get; private set; } = null!;

        [Output("advancedOptions")]
        public Output<ImmutableDictionary<string, string>> AdvancedOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
        /// </summary>
        [Output("advancedSecurityOptions")]
        public Output<Outputs.DomainAdvancedSecurityOptions> AdvancedSecurityOptions { get; private set; } = null!;

        /// <summary>
        /// ARN of the domain.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the Auto-Tune options of the domain. Detailed below.
        /// </summary>
        [Output("autoTuneOptions")]
        public Output<Outputs.DomainAutoTuneOptions> AutoTuneOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the cluster of the domain. Detailed below.
        /// </summary>
        [Output("clusterConfig")]
        public Output<Outputs.DomainClusterConfig> ClusterConfig { get; private set; } = null!;

        /// <summary>
        /// Configuration block for authenticating Kibana with Cognito. Detailed below.
        /// </summary>
        [Output("cognitoOptions")]
        public Output<Outputs.DomainCognitoOptions?> CognitoOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block for domain endpoint HTTP(S) related options. Detailed below.
        /// </summary>
        [Output("domainEndpointOptions")]
        public Output<Outputs.DomainDomainEndpointOptions> DomainEndpointOptions { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the domain.
        /// </summary>
        [Output("domainId")]
        public Output<string> DomainId { get; private set; } = null!;

        /// <summary>
        /// Name of the domain.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
        /// </summary>
        [Output("ebsOptions")]
        public Output<Outputs.DomainEbsOptions> EbsOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
        /// </summary>
        [Output("encryptAtRest")]
        public Output<Outputs.DomainEncryptAtRest> EncryptAtRest { get; private set; } = null!;

        /// <summary>
        /// Domain-specific endpoint used to submit index, search, and data upload requests.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`. See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains). Defaults to `OpenSearch_1.1`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string?> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Domain-specific endpoint for kibana without https scheme.
        /// </summary>
        [Output("kibanaEndpoint")]
        public Output<string> KibanaEndpoint { get; private set; } = null!;

        /// <summary>
        /// Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
        /// </summary>
        [Output("logPublishingOptions")]
        public Output<ImmutableArray<Outputs.DomainLogPublishingOption>> LogPublishingOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block for node-to-node encryption options. Detailed below.
        /// </summary>
        [Output("nodeToNodeEncryption")]
        public Output<Outputs.DomainNodeToNodeEncryption> NodeToNodeEncryption { get; private set; } = null!;

        /// <summary>
        /// Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
        /// </summary>
        [Output("snapshotOptions")]
        public Output<Outputs.DomainSnapshotOptions?> SnapshotOptions { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
        /// </summary>
        [Output("vpcOptions")]
        public Output<Outputs.DomainVpcOptions?> VpcOptions { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:opensearch/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("aws:opensearch/domain:Domain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Domain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Domain Get(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
        {
            return new Domain(name, id, state, options);
        }
    }

    public sealed class DomainArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// IAM policy document specifying the access policies for the domain.
        /// </summary>
        [Input("accessPolicies")]
        public Input<string>? AccessPolicies { get; set; }

        [Input("advancedOptions")]
        private InputMap<string>? _advancedOptions;
        public InputMap<string> AdvancedOptions
        {
            get => _advancedOptions ?? (_advancedOptions = new InputMap<string>());
            set => _advancedOptions = value;
        }

        /// <summary>
        /// Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
        /// </summary>
        [Input("advancedSecurityOptions")]
        public Input<Inputs.DomainAdvancedSecurityOptionsArgs>? AdvancedSecurityOptions { get; set; }

        /// <summary>
        /// Configuration block for the Auto-Tune options of the domain. Detailed below.
        /// </summary>
        [Input("autoTuneOptions")]
        public Input<Inputs.DomainAutoTuneOptionsArgs>? AutoTuneOptions { get; set; }

        /// <summary>
        /// Configuration block for the cluster of the domain. Detailed below.
        /// </summary>
        [Input("clusterConfig")]
        public Input<Inputs.DomainClusterConfigArgs>? ClusterConfig { get; set; }

        /// <summary>
        /// Configuration block for authenticating Kibana with Cognito. Detailed below.
        /// </summary>
        [Input("cognitoOptions")]
        public Input<Inputs.DomainCognitoOptionsArgs>? CognitoOptions { get; set; }

        /// <summary>
        /// Configuration block for domain endpoint HTTP(S) related options. Detailed below.
        /// </summary>
        [Input("domainEndpointOptions")]
        public Input<Inputs.DomainDomainEndpointOptionsArgs>? DomainEndpointOptions { get; set; }

        /// <summary>
        /// Name of the domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
        /// </summary>
        [Input("ebsOptions")]
        public Input<Inputs.DomainEbsOptionsArgs>? EbsOptions { get; set; }

        /// <summary>
        /// Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
        /// </summary>
        [Input("encryptAtRest")]
        public Input<Inputs.DomainEncryptAtRestArgs>? EncryptAtRest { get; set; }

        /// <summary>
        /// Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`. See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains). Defaults to `OpenSearch_1.1`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        [Input("logPublishingOptions")]
        private InputList<Inputs.DomainLogPublishingOptionArgs>? _logPublishingOptions;

        /// <summary>
        /// Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
        /// </summary>
        public InputList<Inputs.DomainLogPublishingOptionArgs> LogPublishingOptions
        {
            get => _logPublishingOptions ?? (_logPublishingOptions = new InputList<Inputs.DomainLogPublishingOptionArgs>());
            set => _logPublishingOptions = value;
        }

        /// <summary>
        /// Configuration block for node-to-node encryption options. Detailed below.
        /// </summary>
        [Input("nodeToNodeEncryption")]
        public Input<Inputs.DomainNodeToNodeEncryptionArgs>? NodeToNodeEncryption { get; set; }

        /// <summary>
        /// Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
        /// </summary>
        [Input("snapshotOptions")]
        public Input<Inputs.DomainSnapshotOptionsArgs>? SnapshotOptions { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
        /// </summary>
        [Input("vpcOptions")]
        public Input<Inputs.DomainVpcOptionsArgs>? VpcOptions { get; set; }

        public DomainArgs()
        {
        }
    }

    public sealed class DomainState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// IAM policy document specifying the access policies for the domain.
        /// </summary>
        [Input("accessPolicies")]
        public Input<string>? AccessPolicies { get; set; }

        [Input("advancedOptions")]
        private InputMap<string>? _advancedOptions;
        public InputMap<string> AdvancedOptions
        {
            get => _advancedOptions ?? (_advancedOptions = new InputMap<string>());
            set => _advancedOptions = value;
        }

        /// <summary>
        /// Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
        /// </summary>
        [Input("advancedSecurityOptions")]
        public Input<Inputs.DomainAdvancedSecurityOptionsGetArgs>? AdvancedSecurityOptions { get; set; }

        /// <summary>
        /// ARN of the domain.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Configuration block for the Auto-Tune options of the domain. Detailed below.
        /// </summary>
        [Input("autoTuneOptions")]
        public Input<Inputs.DomainAutoTuneOptionsGetArgs>? AutoTuneOptions { get; set; }

        /// <summary>
        /// Configuration block for the cluster of the domain. Detailed below.
        /// </summary>
        [Input("clusterConfig")]
        public Input<Inputs.DomainClusterConfigGetArgs>? ClusterConfig { get; set; }

        /// <summary>
        /// Configuration block for authenticating Kibana with Cognito. Detailed below.
        /// </summary>
        [Input("cognitoOptions")]
        public Input<Inputs.DomainCognitoOptionsGetArgs>? CognitoOptions { get; set; }

        /// <summary>
        /// Configuration block for domain endpoint HTTP(S) related options. Detailed below.
        /// </summary>
        [Input("domainEndpointOptions")]
        public Input<Inputs.DomainDomainEndpointOptionsGetArgs>? DomainEndpointOptions { get; set; }

        /// <summary>
        /// Unique identifier for the domain.
        /// </summary>
        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        /// <summary>
        /// Name of the domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
        /// </summary>
        [Input("ebsOptions")]
        public Input<Inputs.DomainEbsOptionsGetArgs>? EbsOptions { get; set; }

        /// <summary>
        /// Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
        /// </summary>
        [Input("encryptAtRest")]
        public Input<Inputs.DomainEncryptAtRestGetArgs>? EncryptAtRest { get; set; }

        /// <summary>
        /// Domain-specific endpoint used to submit index, search, and data upload requests.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`. See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains). Defaults to `OpenSearch_1.1`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Domain-specific endpoint for kibana without https scheme.
        /// </summary>
        [Input("kibanaEndpoint")]
        public Input<string>? KibanaEndpoint { get; set; }

        [Input("logPublishingOptions")]
        private InputList<Inputs.DomainLogPublishingOptionGetArgs>? _logPublishingOptions;

        /// <summary>
        /// Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
        /// </summary>
        public InputList<Inputs.DomainLogPublishingOptionGetArgs> LogPublishingOptions
        {
            get => _logPublishingOptions ?? (_logPublishingOptions = new InputList<Inputs.DomainLogPublishingOptionGetArgs>());
            set => _logPublishingOptions = value;
        }

        /// <summary>
        /// Configuration block for node-to-node encryption options. Detailed below.
        /// </summary>
        [Input("nodeToNodeEncryption")]
        public Input<Inputs.DomainNodeToNodeEncryptionGetArgs>? NodeToNodeEncryption { get; set; }

        /// <summary>
        /// Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
        /// </summary>
        [Input("snapshotOptions")]
        public Input<Inputs.DomainSnapshotOptionsGetArgs>? SnapshotOptions { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
        /// </summary>
        [Input("vpcOptions")]
        public Input<Inputs.DomainVpcOptionsGetArgs>? VpcOptions { get; set; }

        public DomainState()
        {
        }
    }
}
