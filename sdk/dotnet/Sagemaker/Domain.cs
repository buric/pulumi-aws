// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker Domain resource.
    /// 
    /// ## Example Usage
    /// ### Basic usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleDomain = new Aws.Sagemaker.Domain("exampleDomain", new Aws.Sagemaker.DomainArgs
    ///         {
    ///             DomainName = "example",
    ///             AuthMode = "IAM",
    ///             VpcId = aws_vpc.Test.Id,
    ///             SubnetIds = 
    ///             {
    ///                 aws_subnet.Test.Id,
    ///             },
    ///             DefaultUserSettings = new Aws.Sagemaker.Inputs.DomainDefaultUserSettingsArgs
    ///             {
    ///                 ExecutionRole = aws_iam_role.Test.Arn,
    ///             },
    ///         });
    ///         var examplePolicyDocument = Output.Create(Aws.Iam.GetPolicyDocument.InvokeAsync(new Aws.Iam.GetPolicyDocumentArgs
    ///         {
    ///             Statements = 
    ///             {
    ///                 new Aws.Iam.Inputs.GetPolicyDocumentStatementArgs
    ///                 {
    ///                     Actions = 
    ///                     {
    ///                         "sts:AssumeRole",
    ///                     },
    ///                     Principals = 
    ///                     {
    ///                         new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalArgs
    ///                         {
    ///                             Type = "Service",
    ///                             Identifiers = 
    ///                             {
    ///                                 "sagemaker.amazonaws.com",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         }));
    ///         var exampleRole = new Aws.Iam.Role("exampleRole", new Aws.Iam.RoleArgs
    ///         {
    ///             Path = "/",
    ///             AssumeRolePolicy = examplePolicyDocument.Apply(examplePolicyDocument =&gt; examplePolicyDocument.Json),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Using Custom Images
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var testImage = new Aws.Sagemaker.Image("testImage", new Aws.Sagemaker.ImageArgs
    ///         {
    ///             ImageName = "example",
    ///             RoleArn = aws_iam_role.Test.Arn,
    ///         });
    ///         var testAppImageConfig = new Aws.Sagemaker.AppImageConfig("testAppImageConfig", new Aws.Sagemaker.AppImageConfigArgs
    ///         {
    ///             AppImageConfigName = "example",
    ///             KernelGatewayImageConfig = new Aws.Sagemaker.Inputs.AppImageConfigKernelGatewayImageConfigArgs
    ///             {
    ///                 KernelSpec = new Aws.Sagemaker.Inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs
    ///                 {
    ///                     Name = "example",
    ///                 },
    ///             },
    ///         });
    ///         var testImageVersion = new Aws.Sagemaker.ImageVersion("testImageVersion", new Aws.Sagemaker.ImageVersionArgs
    ///         {
    ///             ImageName = testImage.Id,
    ///             BaseImage = "base-image",
    ///         });
    ///         var testDomain = new Aws.Sagemaker.Domain("testDomain", new Aws.Sagemaker.DomainArgs
    ///         {
    ///             DomainName = "example",
    ///             AuthMode = "IAM",
    ///             VpcId = aws_vpc.Test.Id,
    ///             SubnetIds = 
    ///             {
    ///                 aws_subnet.Test.Id,
    ///             },
    ///             DefaultUserSettings = new Aws.Sagemaker.Inputs.DomainDefaultUserSettingsArgs
    ///             {
    ///                 ExecutionRole = aws_iam_role.Test.Arn,
    ///                 KernelGatewayAppSettings = new Aws.Sagemaker.Inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsArgs
    ///                 {
    ///                     CustomImages = 
    ///                     {
    ///                         new Aws.Sagemaker.Inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs
    ///                         {
    ///                             AppImageConfigName = testAppImageConfig.AppImageConfigName,
    ///                             ImageName = testImageVersion.ImageName,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// SageMaker Code Domains can be imported using the `id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/domain:Domain test_domain d-8jgsjtilstu8
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/domain:Domain")]
    public partial class Domain : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
        /// </summary>
        [Output("appNetworkAccessType")]
        public Output<string?> AppNetworkAccessType { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Domain.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
        /// </summary>
        [Output("authMode")]
        public Output<string> AuthMode { get; private set; } = null!;

        /// <summary>
        /// The default user settings. See Default User Settings below.
        /// </summary>
        [Output("defaultUserSettings")]
        public Output<Outputs.DomainDefaultUserSettings> DefaultUserSettings { get; private set; } = null!;

        /// <summary>
        /// The domain name.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Amazon Elastic File System (EFS) managed by this Domain.
        /// </summary>
        [Output("homeEfsFileSystemId")]
        public Output<string> HomeEfsFileSystemId { get; private set; } = null!;

        /// <summary>
        /// The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
        /// </summary>
        [Output("retentionPolicy")]
        public Output<Outputs.DomainRetentionPolicy?> RetentionPolicy { get; private set; } = null!;

        /// <summary>
        /// The SSO managed application instance ID.
        /// </summary>
        [Output("singleSignOnManagedApplicationInstanceId")]
        public Output<string> SingleSignOnManagedApplicationInstanceId { get; private set; } = null!;

        /// <summary>
        /// The VPC subnets that Studio uses for communication.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The domain's URL.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/domain:Domain", name, state, MakeResourceOptions(options, id))
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
        /// Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
        /// </summary>
        [Input("appNetworkAccessType")]
        public Input<string>? AppNetworkAccessType { get; set; }

        /// <summary>
        /// The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
        /// </summary>
        [Input("authMode", required: true)]
        public Input<string> AuthMode { get; set; } = null!;

        /// <summary>
        /// The default user settings. See Default User Settings below.
        /// </summary>
        [Input("defaultUserSettings", required: true)]
        public Input<Inputs.DomainDefaultUserSettingsArgs> DefaultUserSettings { get; set; } = null!;

        /// <summary>
        /// The domain name.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
        /// </summary>
        [Input("retentionPolicy")]
        public Input<Inputs.DomainRetentionPolicyArgs>? RetentionPolicy { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The VPC subnets that Studio uses for communication.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public DomainArgs()
        {
        }
    }

    public sealed class DomainState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
        /// </summary>
        [Input("appNetworkAccessType")]
        public Input<string>? AppNetworkAccessType { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Domain.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
        /// </summary>
        [Input("authMode")]
        public Input<string>? AuthMode { get; set; }

        /// <summary>
        /// The default user settings. See Default User Settings below.
        /// </summary>
        [Input("defaultUserSettings")]
        public Input<Inputs.DomainDefaultUserSettingsGetArgs>? DefaultUserSettings { get; set; }

        /// <summary>
        /// The domain name.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// The ID of the Amazon Elastic File System (EFS) managed by this Domain.
        /// </summary>
        [Input("homeEfsFileSystemId")]
        public Input<string>? HomeEfsFileSystemId { get; set; }

        /// <summary>
        /// The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
        /// </summary>
        [Input("retentionPolicy")]
        public Input<Inputs.DomainRetentionPolicyGetArgs>? RetentionPolicy { get; set; }

        /// <summary>
        /// The SSO managed application instance ID.
        /// </summary>
        [Input("singleSignOnManagedApplicationInstanceId")]
        public Input<string>? SingleSignOnManagedApplicationInstanceId { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The VPC subnets that Studio uses for communication.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The domain's URL.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public DomainState()
        {
        }
    }
}
