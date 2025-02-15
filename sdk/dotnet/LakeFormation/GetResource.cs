// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation
{
    public static class GetResource
    {
        /// <summary>
        /// Provides details about a Lake Formation resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.LakeFormation.GetResource.InvokeAsync(new Aws.LakeFormation.GetResourceArgs
        ///         {
        ///             Arn = "arn:aws:s3:::tf-acc-test-9151654063908211878",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResourceResult> InvokeAsync(GetResourceArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetResourceResult>("aws:lakeformation/getResource:getResource", args ?? new GetResourceArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a Lake Formation resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.LakeFormation.GetResource.InvokeAsync(new Aws.LakeFormation.GetResourceArgs
        ///         {
        ///             Arn = "arn:aws:s3:::tf-acc-test-9151654063908211878",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetResourceResult> Invoke(GetResourceInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetResourceResult>("aws:lakeformation/getResource:getResource", args ?? new GetResourceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResourceArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the resource, an S3 path.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        public GetResourceArgs()
        {
        }
    }

    public sealed class GetResourceInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the resource, an S3 path.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        public GetResourceInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetResourceResult
    {
        public readonly string Arn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        /// </summary>
        public readonly string LastModified;
        /// <summary>
        /// Role that the resource was registered with.
        /// </summary>
        public readonly string RoleArn;

        [OutputConstructor]
        private GetResourceResult(
            string arn,

            string id,

            string lastModified,

            string roleArn)
        {
            Arn = arn;
            Id = id;
            LastModified = lastModified;
            RoleArn = roleArn;
        }
    }
}
