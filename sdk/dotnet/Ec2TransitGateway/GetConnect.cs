// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2TransitGateway
{
    public static class GetConnect
    {
        /// <summary>
        /// Get information on an EC2 Transit Gateway Connect.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### By Filter
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Ec2TransitGateway.GetConnect.InvokeAsync(new Aws.Ec2TransitGateway.GetConnectArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Aws.Ec2TransitGateway.Inputs.GetConnectFilterArgs
        ///                 {
        ///                     Name = "transport-transit-gateway-attachment-id",
        ///                     Values = 
        ///                     {
        ///                         "tgw-attach-12345678",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### By Identifier
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Ec2TransitGateway.GetConnect.InvokeAsync(new Aws.Ec2TransitGateway.GetConnectArgs
        ///         {
        ///             TransitGatewayConnectId = "tgw-attach-12345678",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectResult> InvokeAsync(GetConnectArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetConnectResult>("aws:ec2transitgateway/getConnect:getConnect", args ?? new GetConnectArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on an EC2 Transit Gateway Connect.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### By Filter
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Ec2TransitGateway.GetConnect.InvokeAsync(new Aws.Ec2TransitGateway.GetConnectArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Aws.Ec2TransitGateway.Inputs.GetConnectFilterArgs
        ///                 {
        ///                     Name = "transport-transit-gateway-attachment-id",
        ///                     Values = 
        ///                     {
        ///                         "tgw-attach-12345678",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### By Identifier
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Ec2TransitGateway.GetConnect.InvokeAsync(new Aws.Ec2TransitGateway.GetConnectArgs
        ///         {
        ///             TransitGatewayConnectId = "tgw-attach-12345678",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetConnectResult> Invoke(GetConnectInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetConnectResult>("aws:ec2transitgateway/getConnect:getConnect", args ?? new GetConnectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetConnectFilterArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public List<Inputs.GetConnectFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetConnectFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Connect
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier of the EC2 Transit Gateway Connect.
        /// </summary>
        [Input("transitGatewayConnectId")]
        public string? TransitGatewayConnectId { get; set; }

        public GetConnectArgs()
        {
        }
    }

    public sealed class GetConnectInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetConnectFilterInputArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public InputList<Inputs.GetConnectFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetConnectFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Connect
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier of the EC2 Transit Gateway Connect.
        /// </summary>
        [Input("transitGatewayConnectId")]
        public Input<string>? TransitGatewayConnectId { get; set; }

        public GetConnectInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetConnectResult
    {
        public readonly ImmutableArray<Outputs.GetConnectFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The tunnel protocol
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Connect
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly string TransitGatewayConnectId;
        /// <summary>
        /// EC2 Transit Gateway identifier
        /// </summary>
        public readonly string TransitGatewayId;
        /// <summary>
        /// The underlaying VPC attachment
        /// </summary>
        public readonly string TransportAttachmentId;

        [OutputConstructor]
        private GetConnectResult(
            ImmutableArray<Outputs.GetConnectFilterResult> filters,

            string id,

            string protocol,

            ImmutableDictionary<string, string> tags,

            string transitGatewayConnectId,

            string transitGatewayId,

            string transportAttachmentId)
        {
            Filters = filters;
            Id = id;
            Protocol = protocol;
            Tags = tags;
            TransitGatewayConnectId = transitGatewayConnectId;
            TransitGatewayId = transitGatewayId;
            TransportAttachmentId = transportAttachmentId;
        }
    }
}
