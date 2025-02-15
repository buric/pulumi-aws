// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Location
{
    public static class GetMap
    {
        /// <summary>
        /// Retrieve information about a Location Service Map.
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
        ///         var example = Output.Create(Aws.Location.GetMap.InvokeAsync(new Aws.Location.GetMapArgs
        ///         {
        ///             MapName = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMapResult> InvokeAsync(GetMapArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMapResult>("aws:location/getMap:getMap", args ?? new GetMapArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about a Location Service Map.
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
        ///         var example = Output.Create(Aws.Location.GetMap.InvokeAsync(new Aws.Location.GetMapArgs
        ///         {
        ///             MapName = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMapResult> Invoke(GetMapInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetMapResult>("aws:location/getMap:getMap", args ?? new GetMapInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMapArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the map resource.
        /// </summary>
        [Input("mapName", required: true)]
        public string MapName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the map.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetMapArgs()
        {
        }
    }

    public sealed class GetMapInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the map resource.
        /// </summary>
        [Input("mapName", required: true)]
        public Input<string> MapName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the map.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetMapInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetMapResult
    {
        /// <summary>
        /// List of configurations that specify the map tile style selected from a partner data provider.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMapConfigurationResult> Configurations;
        /// <summary>
        /// The timestamp for when the map resource was created in ISO 8601 format.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The optional description for the map resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Amazon Resource Name (ARN) for the map resource.
        /// </summary>
        public readonly string MapArn;
        public readonly string MapName;
        /// <summary>
        /// Key-value map of resource tags for the map.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The timestamp for when the map resource was last updated in ISO 8601 format.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetMapResult(
            ImmutableArray<Outputs.GetMapConfigurationResult> configurations,

            string createTime,

            string description,

            string id,

            string mapArn,

            string mapName,

            ImmutableDictionary<string, string> tags,

            string updateTime)
        {
            Configurations = configurations;
            CreateTime = createTime;
            Description = description;
            Id = id;
            MapArn = mapArn;
            MapName = mapName;
            Tags = tags;
            UpdateTime = updateTime;
        }
    }
}
