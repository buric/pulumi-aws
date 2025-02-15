// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig
    {
        /// <summary>
        /// Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. Valid values are `None` and `SingleFile`.
        /// </summary>
        public readonly string? AggregationType;

        [OutputConstructor]
        private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig(string? aggregationType)
        {
            AggregationType = aggregationType;
        }
    }
}
