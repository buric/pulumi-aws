// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53
{
    public static class GetTrafficPolicyDocument
    {
        /// <summary>
        /// Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as [`aws.route53.TrafficPolicy`](https://www.terraform.io/docs/providers/aws/r/route53_traffic_policy.html).
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var current = Output.Create(Aws.GetRegion.InvokeAsync());
        ///         var exampleTrafficPolicyDocument = Output.Tuple(current, current).Apply(values =&gt;
        ///         {
        ///             var current = values.Item1;
        ///             var current1 = values.Item2;
        ///             return Output.Create(Aws.Route53.GetTrafficPolicyDocument.InvokeAsync(new Aws.Route53.GetTrafficPolicyDocumentArgs
        ///             {
        ///                 RecordType = "A",
        ///                 StartRule = "site_switch",
        ///                 Endpoints = 
        ///                 {
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentEndpointArgs
        ///                     {
        ///                         Id = "my_elb",
        ///                         Type = "elastic-load-balancer",
        ///                         Value = $"elb-111111.{current.Name}.elb.amazonaws.com",
        ///                     },
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentEndpointArgs
        ///                     {
        ///                         Id = "site_down_banner",
        ///                         Type = "s3-website",
        ///                         Region = current1.Name,
        ///                         Value = "www.example.com",
        ///                     },
        ///                 },
        ///                 Rules = 
        ///                 {
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentRuleArgs
        ///                     {
        ///                         Id = "site_switch",
        ///                         Type = "failover",
        ///                         Primary = new Aws.Route53.Inputs.GetTrafficPolicyDocumentRulePrimaryArgs
        ///                         {
        ///                             EndpointReference = "my_elb",
        ///                         },
        ///                         Secondary = new Aws.Route53.Inputs.GetTrafficPolicyDocumentRuleSecondaryArgs
        ///                         {
        ///                             EndpointReference = "site_down_banner",
        ///                         },
        ///                     },
        ///                 },
        ///             }));
        ///         });
        ///         var exampleTrafficPolicy = new Aws.Route53.TrafficPolicy("exampleTrafficPolicy", new Aws.Route53.TrafficPolicyArgs
        ///         {
        ///             Comment = "example comment",
        ///             Document = exampleTrafficPolicyDocument.Apply(exampleTrafficPolicyDocument =&gt; exampleTrafficPolicyDocument.Json),
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTrafficPolicyDocumentResult> InvokeAsync(GetTrafficPolicyDocumentArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTrafficPolicyDocumentResult>("aws:route53/getTrafficPolicyDocument:getTrafficPolicyDocument", args ?? new GetTrafficPolicyDocumentArgs(), options.WithDefaults());

        /// <summary>
        /// Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as [`aws.route53.TrafficPolicy`](https://www.terraform.io/docs/providers/aws/r/route53_traffic_policy.html).
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var current = Output.Create(Aws.GetRegion.InvokeAsync());
        ///         var exampleTrafficPolicyDocument = Output.Tuple(current, current).Apply(values =&gt;
        ///         {
        ///             var current = values.Item1;
        ///             var current1 = values.Item2;
        ///             return Output.Create(Aws.Route53.GetTrafficPolicyDocument.InvokeAsync(new Aws.Route53.GetTrafficPolicyDocumentArgs
        ///             {
        ///                 RecordType = "A",
        ///                 StartRule = "site_switch",
        ///                 Endpoints = 
        ///                 {
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentEndpointArgs
        ///                     {
        ///                         Id = "my_elb",
        ///                         Type = "elastic-load-balancer",
        ///                         Value = $"elb-111111.{current.Name}.elb.amazonaws.com",
        ///                     },
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentEndpointArgs
        ///                     {
        ///                         Id = "site_down_banner",
        ///                         Type = "s3-website",
        ///                         Region = current1.Name,
        ///                         Value = "www.example.com",
        ///                     },
        ///                 },
        ///                 Rules = 
        ///                 {
        ///                     new Aws.Route53.Inputs.GetTrafficPolicyDocumentRuleArgs
        ///                     {
        ///                         Id = "site_switch",
        ///                         Type = "failover",
        ///                         Primary = new Aws.Route53.Inputs.GetTrafficPolicyDocumentRulePrimaryArgs
        ///                         {
        ///                             EndpointReference = "my_elb",
        ///                         },
        ///                         Secondary = new Aws.Route53.Inputs.GetTrafficPolicyDocumentRuleSecondaryArgs
        ///                         {
        ///                             EndpointReference = "site_down_banner",
        ///                         },
        ///                     },
        ///                 },
        ///             }));
        ///         });
        ///         var exampleTrafficPolicy = new Aws.Route53.TrafficPolicy("exampleTrafficPolicy", new Aws.Route53.TrafficPolicyArgs
        ///         {
        ///             Comment = "example comment",
        ///             Document = exampleTrafficPolicyDocument.Apply(exampleTrafficPolicyDocument =&gt; exampleTrafficPolicyDocument.Json),
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTrafficPolicyDocumentResult> Invoke(GetTrafficPolicyDocumentInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTrafficPolicyDocumentResult>("aws:route53/getTrafficPolicyDocument:getTrafficPolicyDocument", args ?? new GetTrafficPolicyDocumentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficPolicyDocumentArgs : Pulumi.InvokeArgs
    {
        [Input("endpoints")]
        private List<Inputs.GetTrafficPolicyDocumentEndpointArgs>? _endpoints;

        /// <summary>
        /// Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
        /// </summary>
        public List<Inputs.GetTrafficPolicyDocumentEndpointArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new List<Inputs.GetTrafficPolicyDocumentEndpointArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
        /// </summary>
        [Input("recordType")]
        public string? RecordType { get; set; }

        [Input("rules")]
        private List<Inputs.GetTrafficPolicyDocumentRuleArgs>? _rules;

        /// <summary>
        /// Configuration block for definitions of the rules that you want to use in this traffic policy. See below
        /// </summary>
        public List<Inputs.GetTrafficPolicyDocumentRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetTrafficPolicyDocumentRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// An endpoint to be as the starting point for the traffic policy.
        /// </summary>
        [Input("startEndpoint")]
        public string? StartEndpoint { get; set; }

        /// <summary>
        /// A rule to be as the starting point for the traffic policy.
        /// </summary>
        [Input("startRule")]
        public string? StartRule { get; set; }

        /// <summary>
        /// Version of the traffic policy format.
        /// </summary>
        [Input("version")]
        public string? Version { get; set; }

        public GetTrafficPolicyDocumentArgs()
        {
        }
    }

    public sealed class GetTrafficPolicyDocumentInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("endpoints")]
        private InputList<Inputs.GetTrafficPolicyDocumentEndpointInputArgs>? _endpoints;

        /// <summary>
        /// Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
        /// </summary>
        public InputList<Inputs.GetTrafficPolicyDocumentEndpointInputArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.GetTrafficPolicyDocumentEndpointInputArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
        /// </summary>
        [Input("recordType")]
        public Input<string>? RecordType { get; set; }

        [Input("rules")]
        private InputList<Inputs.GetTrafficPolicyDocumentRuleInputArgs>? _rules;

        /// <summary>
        /// Configuration block for definitions of the rules that you want to use in this traffic policy. See below
        /// </summary>
        public InputList<Inputs.GetTrafficPolicyDocumentRuleInputArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.GetTrafficPolicyDocumentRuleInputArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// An endpoint to be as the starting point for the traffic policy.
        /// </summary>
        [Input("startEndpoint")]
        public Input<string>? StartEndpoint { get; set; }

        /// <summary>
        /// A rule to be as the starting point for the traffic policy.
        /// </summary>
        [Input("startRule")]
        public Input<string>? StartRule { get; set; }

        /// <summary>
        /// Version of the traffic policy format.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetTrafficPolicyDocumentInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTrafficPolicyDocumentResult
    {
        public readonly ImmutableArray<Outputs.GetTrafficPolicyDocumentEndpointResult> Endpoints;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Standard JSON policy document rendered based on the arguments above.
        /// </summary>
        public readonly string Json;
        public readonly string? RecordType;
        public readonly ImmutableArray<Outputs.GetTrafficPolicyDocumentRuleResult> Rules;
        public readonly string? StartEndpoint;
        public readonly string? StartRule;
        public readonly string? Version;

        [OutputConstructor]
        private GetTrafficPolicyDocumentResult(
            ImmutableArray<Outputs.GetTrafficPolicyDocumentEndpointResult> endpoints,

            string id,

            string json,

            string? recordType,

            ImmutableArray<Outputs.GetTrafficPolicyDocumentRuleResult> rules,

            string? startEndpoint,

            string? startRule,

            string? version)
        {
            Endpoints = endpoints;
            Id = id;
            Json = json;
            RecordType = recordType;
            Rules = rules;
            StartEndpoint = startEndpoint;
            StartRule = startRule;
            Version = version;
        }
    }
}
