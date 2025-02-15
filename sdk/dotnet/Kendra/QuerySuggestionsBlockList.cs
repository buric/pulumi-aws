// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra
{
    /// <summary>
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
    ///         var example = new Aws.Kendra.QuerySuggestionsBlockList("example", new Aws.Kendra.QuerySuggestionsBlockListArgs
    ///         {
    ///             IndexId = aws_kendra_index.Example.Id,
    ///             RoleArn = aws_iam_role.Example.Arn,
    ///             SourceS3Path = new Aws.Kendra.Inputs.QuerySuggestionsBlockListSourceS3PathArgs
    ///             {
    ///                 Bucket = aws_s3_bucket.Example.Id,
    ///                 Key = "example/suggestions.txt",
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "Name", "Example Kendra Index" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_kendra_query_suggestions_block_list` can be imported using the unique identifiers of the block list and index separated by a slash (`/`), e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList example blocklist-123456780/idx-8012925589
    /// ```
    /// </summary>
    [AwsResourceType("aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList")]
    public partial class QuerySuggestionsBlockList : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the block list.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The description for a block list.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The identifier of the index for a block list.
        /// </summary>
        [Output("indexId")]
        public Output<string> IndexId { get; private set; } = null!;

        /// <summary>
        /// The name for the block list.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique indentifier of the block list.
        /// </summary>
        [Output("querySuggestionsBlockListId")]
        public Output<string> QuerySuggestionsBlockListId { get; private set; } = null!;

        /// <summary>
        /// The IAM (Identity and Access Management) role used to access the block list text file in S3.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// The S3 path where your block list text file sits in S3. Detailed below.
        /// </summary>
        [Output("sourceS3Path")]
        public Output<Outputs.QuerySuggestionsBlockListSourceS3Path> SourceS3Path { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a QuerySuggestionsBlockList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public QuerySuggestionsBlockList(string name, QuerySuggestionsBlockListArgs args, CustomResourceOptions? options = null)
            : base("aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList", name, args ?? new QuerySuggestionsBlockListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private QuerySuggestionsBlockList(string name, Input<string> id, QuerySuggestionsBlockListState? state = null, CustomResourceOptions? options = null)
            : base("aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing QuerySuggestionsBlockList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static QuerySuggestionsBlockList Get(string name, Input<string> id, QuerySuggestionsBlockListState? state = null, CustomResourceOptions? options = null)
        {
            return new QuerySuggestionsBlockList(name, id, state, options);
        }
    }

    public sealed class QuerySuggestionsBlockListArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description for a block list.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier of the index for a block list.
        /// </summary>
        [Input("indexId", required: true)]
        public Input<string> IndexId { get; set; } = null!;

        /// <summary>
        /// The name for the block list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The IAM (Identity and Access Management) role used to access the block list text file in S3.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// The S3 path where your block list text file sits in S3. Detailed below.
        /// </summary>
        [Input("sourceS3Path", required: true)]
        public Input<Inputs.QuerySuggestionsBlockListSourceS3PathArgs> SourceS3Path { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public QuerySuggestionsBlockListArgs()
        {
        }
    }

    public sealed class QuerySuggestionsBlockListState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the block list.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The description for a block list.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier of the index for a block list.
        /// </summary>
        [Input("indexId")]
        public Input<string>? IndexId { get; set; }

        /// <summary>
        /// The name for the block list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique indentifier of the block list.
        /// </summary>
        [Input("querySuggestionsBlockListId")]
        public Input<string>? QuerySuggestionsBlockListId { get; set; }

        /// <summary>
        /// The IAM (Identity and Access Management) role used to access the block list text file in S3.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// The S3 path where your block list text file sits in S3. Detailed below.
        /// </summary>
        [Input("sourceS3Path")]
        public Input<Inputs.QuerySuggestionsBlockListSourceS3PathGetArgs>? SourceS3Path { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public QuerySuggestionsBlockListState()
        {
        }
    }
}
