// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda
{
    /// <summary>
    /// ## Example Usage
    /// ### Basic Example
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var lambdaLayer = new Aws.Lambda.LayerVersion("lambdaLayer", new Aws.Lambda.LayerVersionArgs
    ///         {
    ///             CompatibleRuntimes = 
    ///             {
    ///                 "nodejs12.x",
    ///             },
    ///             Code = new FileArchive("lambda_layer_payload.zip"),
    ///             LayerName = "lambda_layer_name",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Lambda Layer with Compatible Architectures
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var lambdaLayer = new Aws.Lambda.LayerVersion("lambdaLayer", new Aws.Lambda.LayerVersionArgs
    ///         {
    ///             CompatibleArchitectures = 
    ///             {
    ///                 "arm64",
    ///                 "x86_64",
    ///             },
    ///             CompatibleRuntimes = 
    ///             {
    ///                 "nodejs12.x",
    ///             },
    ///             Code = new FileArchive("lambda_layer_payload.zip"),
    ///             LayerName = "lambda_layer_name",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Specifying the Deployment Package
    /// 
    /// AWS Lambda Layers expect source code to be provided as a deployment package whose structure varies depending on which `compatible_runtimes` this layer specifies.
    /// See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) for the valid values of `compatible_runtimes`.
    /// 
    /// Once you have created your deployment package you can specify it either directly as a local file (using the `filename` argument) or
    /// indirectly via Amazon S3 (using the `s3_bucket`, `s3_key` and `s3_object_version` arguments). When providing the deployment
    /// package via S3 it may be useful to use the `aws.s3.BucketObjectv2` resource to upload it.
    /// 
    /// For larger deployment packages it is recommended by Amazon to upload via S3, since the S3 API has better support for uploading large files efficiently.
    /// 
    /// ## Import
    /// 
    /// Lambda Layers can be imported using `arn`.
    /// 
    /// ```sh
    ///  $ pulumi import aws:lambda/layerVersion:LayerVersion \
    /// ```
    /// 
    ///  aws_lambda_layer_version.test_layer \
    /// 
    ///  arn:aws:lambda:_REGION_:_ACCOUNT_ID_:layer:_LAYER_NAME_:_LAYER_VERSION_
    /// </summary>
    [AwsResourceType("aws:lambda/layerVersion:LayerVersion")]
    public partial class LayerVersion : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Lambda Layer with version.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
        /// </summary>
        [Output("code")]
        public Output<Archive?> Code { get; private set; } = null!;

        /// <summary>
        /// List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
        /// </summary>
        [Output("compatibleArchitectures")]
        public Output<ImmutableArray<string>> CompatibleArchitectures { get; private set; } = null!;

        /// <summary>
        /// List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
        /// </summary>
        [Output("compatibleRuntimes")]
        public Output<ImmutableArray<string>> CompatibleRuntimes { get; private set; } = null!;

        /// <summary>
        /// Date this resource was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// Description of what your Lambda Layer does.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// ARN of the Lambda Layer without version.
        /// </summary>
        [Output("layerArn")]
        public Output<string> LayerArn { get; private set; } = null!;

        /// <summary>
        /// Unique name for your Lambda Layer
        /// </summary>
        [Output("layerName")]
        public Output<string> LayerName { get; private set; } = null!;

        /// <summary>
        /// License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
        /// </summary>
        [Output("licenseInfo")]
        public Output<string?> LicenseInfo { get; private set; } = null!;

        /// <summary>
        /// S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
        /// </summary>
        [Output("s3Bucket")]
        public Output<string?> S3Bucket { get; private set; } = null!;

        /// <summary>
        /// S3 key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Output("s3Key")]
        public Output<string?> S3Key { get; private set; } = null!;

        /// <summary>
        /// Object version containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Output("s3ObjectVersion")]
        public Output<string?> S3ObjectVersion { get; private set; } = null!;

        /// <summary>
        /// ARN of a signing job.
        /// </summary>
        [Output("signingJobArn")]
        public Output<string> SigningJobArn { get; private set; } = null!;

        /// <summary>
        /// ARN for a signing profile version.
        /// </summary>
        [Output("signingProfileVersionArn")]
        public Output<string> SigningProfileVersionArn { get; private set; } = null!;

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Output("skipDestroy")]
        public Output<bool?> SkipDestroy { get; private set; } = null!;

        [Output("sourceCodeHash")]
        public Output<string> SourceCodeHash { get; private set; } = null!;

        /// <summary>
        /// Size in bytes of the function .zip file.
        /// </summary>
        [Output("sourceCodeSize")]
        public Output<int> SourceCodeSize { get; private set; } = null!;

        /// <summary>
        /// Lambda Layer version.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a LayerVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LayerVersion(string name, LayerVersionArgs args, CustomResourceOptions? options = null)
            : base("aws:lambda/layerVersion:LayerVersion", name, args ?? new LayerVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LayerVersion(string name, Input<string> id, LayerVersionState? state = null, CustomResourceOptions? options = null)
            : base("aws:lambda/layerVersion:LayerVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LayerVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LayerVersion Get(string name, Input<string> id, LayerVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new LayerVersion(name, id, state, options);
        }
    }

    public sealed class LayerVersionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
        /// </summary>
        [Input("code")]
        public Input<Archive>? Code { get; set; }

        [Input("compatibleArchitectures")]
        private InputList<string>? _compatibleArchitectures;

        /// <summary>
        /// List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
        /// </summary>
        public InputList<string> CompatibleArchitectures
        {
            get => _compatibleArchitectures ?? (_compatibleArchitectures = new InputList<string>());
            set => _compatibleArchitectures = value;
        }

        [Input("compatibleRuntimes")]
        private InputList<string>? _compatibleRuntimes;

        /// <summary>
        /// List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
        /// </summary>
        public InputList<string> CompatibleRuntimes
        {
            get => _compatibleRuntimes ?? (_compatibleRuntimes = new InputList<string>());
            set => _compatibleRuntimes = value;
        }

        /// <summary>
        /// Description of what your Lambda Layer does.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique name for your Lambda Layer
        /// </summary>
        [Input("layerName", required: true)]
        public Input<string> LayerName { get; set; } = null!;

        /// <summary>
        /// License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
        /// </summary>
        [Input("licenseInfo")]
        public Input<string>? LicenseInfo { get; set; }

        /// <summary>
        /// S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
        /// </summary>
        [Input("s3Bucket")]
        public Input<string>? S3Bucket { get; set; }

        /// <summary>
        /// S3 key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("s3Key")]
        public Input<string>? S3Key { get; set; }

        /// <summary>
        /// Object version containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("s3ObjectVersion")]
        public Input<string>? S3ObjectVersion { get; set; }

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        [Input("sourceCodeHash")]
        public Input<string>? SourceCodeHash { get; set; }

        public LayerVersionArgs()
        {
        }
    }

    public sealed class LayerVersionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Lambda Layer with version.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
        /// </summary>
        [Input("code")]
        public Input<Archive>? Code { get; set; }

        [Input("compatibleArchitectures")]
        private InputList<string>? _compatibleArchitectures;

        /// <summary>
        /// List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
        /// </summary>
        public InputList<string> CompatibleArchitectures
        {
            get => _compatibleArchitectures ?? (_compatibleArchitectures = new InputList<string>());
            set => _compatibleArchitectures = value;
        }

        [Input("compatibleRuntimes")]
        private InputList<string>? _compatibleRuntimes;

        /// <summary>
        /// List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
        /// </summary>
        public InputList<string> CompatibleRuntimes
        {
            get => _compatibleRuntimes ?? (_compatibleRuntimes = new InputList<string>());
            set => _compatibleRuntimes = value;
        }

        /// <summary>
        /// Date this resource was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        /// <summary>
        /// Description of what your Lambda Layer does.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// ARN of the Lambda Layer without version.
        /// </summary>
        [Input("layerArn")]
        public Input<string>? LayerArn { get; set; }

        /// <summary>
        /// Unique name for your Lambda Layer
        /// </summary>
        [Input("layerName")]
        public Input<string>? LayerName { get; set; }

        /// <summary>
        /// License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
        /// </summary>
        [Input("licenseInfo")]
        public Input<string>? LicenseInfo { get; set; }

        /// <summary>
        /// S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
        /// </summary>
        [Input("s3Bucket")]
        public Input<string>? S3Bucket { get; set; }

        /// <summary>
        /// S3 key of an object containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("s3Key")]
        public Input<string>? S3Key { get; set; }

        /// <summary>
        /// Object version containing the function's deployment package. Conflicts with `filename`.
        /// </summary>
        [Input("s3ObjectVersion")]
        public Input<string>? S3ObjectVersion { get; set; }

        /// <summary>
        /// ARN of a signing job.
        /// </summary>
        [Input("signingJobArn")]
        public Input<string>? SigningJobArn { get; set; }

        /// <summary>
        /// ARN for a signing profile version.
        /// </summary>
        [Input("signingProfileVersionArn")]
        public Input<string>? SigningProfileVersionArn { get; set; }

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        [Input("sourceCodeHash")]
        public Input<string>? SourceCodeHash { get; set; }

        /// <summary>
        /// Size in bytes of the function .zip file.
        /// </summary>
        [Input("sourceCodeSize")]
        public Input<int>? SourceCodeSize { get; set; }

        /// <summary>
        /// Lambda Layer version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public LayerVersionState()
        {
        }
    }
}
