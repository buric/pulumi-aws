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
    public sealed class FlowSourceFlowConfigSourceConnectorProperties
    {
        /// <summary>
        /// The operation to be performed on the provided Amplitude source fields. The only valid value is `BETWEEN`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitude? Amplitude;
        /// <summary>
        /// Operators supported by the custom connector. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector? CustomConnector;
        /// <summary>
        /// The operation to be performed on the provided Datadog source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadog? Datadog;
        /// <summary>
        /// The operation to be performed on the provided Dynatrace source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatrace? Dynatrace;
        /// <summary>
        /// The operation to be performed on the provided Google Analytics source fields. Valid values are `PROJECTION` and `BETWEEN`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics? GoogleAnalytics;
        /// <summary>
        /// The operation to be performed on the provided Infor Nexus source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexus? InforNexus;
        /// <summary>
        /// The operation to be performed on the provided Marketo source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketo? Marketo;
        /// <summary>
        /// The operation to be performed on the provided Amazon S3 source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesS3? S3;
        /// <summary>
        /// The operation to be performed on the provided Salesforce source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforce? Salesforce;
        /// <summary>
        /// The operation to be performed on the provided SAPOData source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoData? SapoData;
        /// <summary>
        /// The operation to be performed on the provided ServiceNow source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNow? ServiceNow;
        /// <summary>
        /// The operation to be performed on the provided Singular source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSingular? Singular;
        /// <summary>
        /// The operation to be performed on the provided Slack source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSlack? Slack;
        /// <summary>
        /// The operation to be performed on the provided Trend Micro source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro? Trendmicro;
        /// <summary>
        /// The operation to be performed on the provided Veeva source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesVeeva? Veeva;
        /// <summary>
        /// The operation to be performed on the provided Zendesk source fields. Valid values are `PROJECTION`, `GREATER_THAN`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
        /// </summary>
        public readonly Outputs.FlowSourceFlowConfigSourceConnectorPropertiesZendesk? Zendesk;

        [OutputConstructor]
        private FlowSourceFlowConfigSourceConnectorProperties(
            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitude? amplitude,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector? customConnector,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadog? datadog,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatrace? dynatrace,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics? googleAnalytics,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexus? inforNexus,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketo? marketo,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesS3? s3,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforce? salesforce,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoData? sapoData,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNow? serviceNow,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSingular? singular,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesSlack? slack,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro? trendmicro,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesVeeva? veeva,

            Outputs.FlowSourceFlowConfigSourceConnectorPropertiesZendesk? zendesk)
        {
            Amplitude = amplitude;
            CustomConnector = customConnector;
            Datadog = datadog;
            Dynatrace = dynatrace;
            GoogleAnalytics = googleAnalytics;
            InforNexus = inforNexus;
            Marketo = marketo;
            S3 = s3;
            Salesforce = salesforce;
            SapoData = sapoData;
            ServiceNow = serviceNow;
            Singular = singular;
            Slack = slack;
            Trendmicro = trendmicro;
            Veeva = veeva;
            Zendesk = zendesk;
        }
    }
}
