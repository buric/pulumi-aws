// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    public static class GetUsers
    {
        /// <summary>
        /// Use this data source to get the ARNs and Names of IAM Users.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### All users in an account
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Users filtered by name regex
        /// 
        /// Users whose username contains `abc`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync(new Aws.Iam.GetUsersArgs
        ///         {
        ///             NameRegex = ".*abc.*",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Users filtered by path prefix
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync(new Aws.Iam.GetUsersArgs
        ///         {
        ///             PathPrefix = "/custom-path",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("aws:iam/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the ARNs and Names of IAM Users.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### All users in an account
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Users filtered by name regex
        /// 
        /// Users whose username contains `abc`
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync(new Aws.Iam.GetUsersArgs
        ///         {
        ///             NameRegex = ".*abc.*",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Users filtered by path prefix
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var users = Output.Create(Aws.Iam.GetUsers.InvokeAsync(new Aws.Iam.GetUsersArgs
        ///         {
        ///             PathPrefix = "/custom-path",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetUsersResult>("aws:iam/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API. This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. Combine this with other options to narrow down the list AWS returns.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
        /// </summary>
        [Input("pathPrefix")]
        public string? PathPrefix { get; set; }

        public GetUsersArgs()
        {
        }
    }

    public sealed class GetUsersInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API. This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. Combine this with other options to narrow down the list AWS returns.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
        /// </summary>
        [Input("pathPrefix")]
        public Input<string>? PathPrefix { get; set; }

        public GetUsersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        /// <summary>
        /// Set of ARNs of the matched IAM users.
        /// </summary>
        public readonly ImmutableArray<string> Arns;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? NameRegex;
        /// <summary>
        /// Set of Names of the matched IAM users.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? PathPrefix;

        [OutputConstructor]
        private GetUsersResult(
            ImmutableArray<string> arns,

            string id,

            string? nameRegex,

            ImmutableArray<string> names,

            string? pathPrefix)
        {
            Arns = arns;
            Id = id;
            NameRegex = nameRegex;
            Names = names;
            PathPrefix = pathPrefix;
        }
    }
}
