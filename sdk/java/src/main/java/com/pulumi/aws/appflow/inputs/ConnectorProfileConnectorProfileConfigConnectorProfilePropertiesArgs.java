// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs Empty = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs();

    /**
     * The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
     * 
     */
    @Import(name="amplitude")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs> amplitude;

    /**
     * @return The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs>> amplitude() {
        return Optional.ofNullable(this.amplitude);
    }

    /**
     * The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
     * 
     */
    @Import(name="customConnector")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs> customConnector;

    /**
     * @return The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs>> customConnector() {
        return Optional.ofNullable(this.customConnector);
    }

    /**
     * The connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="datadog")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs> datadog;

    /**
     * @return The connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs>> datadog() {
        return Optional.ofNullable(this.datadog);
    }

    /**
     * The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="dynatrace")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs> dynatrace;

    /**
     * @return The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs>> dynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }

    /**
     * The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
     * 
     */
    @Import(name="googleAnalytics")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs> googleAnalytics;

    /**
     * @return The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs>> googleAnalytics() {
        return Optional.ofNullable(this.googleAnalytics);
    }

    /**
     * The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
     * 
     */
    @Import(name="honeycode")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs> honeycode;

    /**
     * @return The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs>> honeycode() {
        return Optional.ofNullable(this.honeycode);
    }

    /**
     * The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="inforNexus")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs> inforNexus;

    /**
     * @return The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs>> inforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }

    /**
     * The connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="marketo")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs> marketo;

    /**
     * @return The connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs>> marketo() {
        return Optional.ofNullable(this.marketo);
    }

    /**
     * The connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
     * 
     */
    @Import(name="redshift")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs> redshift;

    /**
     * @return The connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs>> redshift() {
        return Optional.ofNullable(this.redshift);
    }

    /**
     * The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
     * 
     */
    @Import(name="salesforce")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs> salesforce;

    /**
     * @return The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs>> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }

    /**
     * The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
     * 
     */
    @Import(name="sapoData")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs> sapoData;

    /**
     * @return The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs>> sapoData() {
        return Optional.ofNullable(this.sapoData);
    }

    /**
     * The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="serviceNow")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs> serviceNow;

    /**
     * @return The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs>> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }

    /**
     * The connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
     * 
     */
    @Import(name="singular")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs> singular;

    /**
     * @return The connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs>> singular() {
        return Optional.ofNullable(this.singular);
    }

    /**
     * The connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="slack")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs> slack;

    /**
     * @return The connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs>> slack() {
        return Optional.ofNullable(this.slack);
    }

    /**
     * The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
     * 
     */
    @Import(name="snowflake")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs> snowflake;

    /**
     * @return The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs>> snowflake() {
        return Optional.ofNullable(this.snowflake);
    }

    /**
     * The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
     * 
     */
    @Import(name="trendmicro")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs> trendmicro;

    /**
     * @return The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs>> trendmicro() {
        return Optional.ofNullable(this.trendmicro);
    }

    /**
     * The connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="veeva")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs> veeva;

    /**
     * @return The connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs>> veeva() {
        return Optional.ofNullable(this.veeva);
    }

    /**
     * The connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
     * 
     */
    @Import(name="zendesk")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs> zendesk;

    /**
     * @return The connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs>> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs() {}

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs $) {
        this.amplitude = $.amplitude;
        this.customConnector = $.customConnector;
        this.datadog = $.datadog;
        this.dynatrace = $.dynatrace;
        this.googleAnalytics = $.googleAnalytics;
        this.honeycode = $.honeycode;
        this.inforNexus = $.inforNexus;
        this.marketo = $.marketo;
        this.redshift = $.redshift;
        this.salesforce = $.salesforce;
        this.sapoData = $.sapoData;
        this.serviceNow = $.serviceNow;
        this.singular = $.singular;
        this.slack = $.slack;
        this.snowflake = $.snowflake;
        this.trendmicro = $.trendmicro;
        this.veeva = $.veeva;
        this.zendesk = $.zendesk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs();
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs defaults) {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amplitude The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder amplitude(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs> amplitude) {
            $.amplitude = amplitude;
            return this;
        }

        /**
         * @param amplitude The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder amplitude(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs amplitude) {
            return amplitude(Output.of(amplitude));
        }

        /**
         * @param customConnector The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder customConnector(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs> customConnector) {
            $.customConnector = customConnector;
            return this;
        }

        /**
         * @param customConnector The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder customConnector(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs customConnector) {
            return customConnector(Output.of(customConnector));
        }

        /**
         * @param datadog The connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder datadog(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs> datadog) {
            $.datadog = datadog;
            return this;
        }

        /**
         * @param datadog The connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder datadog(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs datadog) {
            return datadog(Output.of(datadog));
        }

        /**
         * @param dynatrace The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder dynatrace(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs> dynatrace) {
            $.dynatrace = dynatrace;
            return this;
        }

        /**
         * @param dynatrace The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder dynatrace(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs dynatrace) {
            return dynatrace(Output.of(dynatrace));
        }

        /**
         * @param googleAnalytics The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder googleAnalytics(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs> googleAnalytics) {
            $.googleAnalytics = googleAnalytics;
            return this;
        }

        /**
         * @param googleAnalytics The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder googleAnalytics(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs googleAnalytics) {
            return googleAnalytics(Output.of(googleAnalytics));
        }

        /**
         * @param honeycode The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder honeycode(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs> honeycode) {
            $.honeycode = honeycode;
            return this;
        }

        /**
         * @param honeycode The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder honeycode(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs honeycode) {
            return honeycode(Output.of(honeycode));
        }

        /**
         * @param inforNexus The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder inforNexus(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs> inforNexus) {
            $.inforNexus = inforNexus;
            return this;
        }

        /**
         * @param inforNexus The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder inforNexus(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs inforNexus) {
            return inforNexus(Output.of(inforNexus));
        }

        /**
         * @param marketo The connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder marketo(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs> marketo) {
            $.marketo = marketo;
            return this;
        }

        /**
         * @param marketo The connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder marketo(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs marketo) {
            return marketo(Output.of(marketo));
        }

        /**
         * @param redshift The connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder redshift(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs> redshift) {
            $.redshift = redshift;
            return this;
        }

        /**
         * @param redshift The connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder redshift(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs redshift) {
            return redshift(Output.of(redshift));
        }

        /**
         * @param salesforce The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder salesforce(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs> salesforce) {
            $.salesforce = salesforce;
            return this;
        }

        /**
         * @param salesforce The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder salesforce(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs salesforce) {
            return salesforce(Output.of(salesforce));
        }

        /**
         * @param sapoData The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder sapoData(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs> sapoData) {
            $.sapoData = sapoData;
            return this;
        }

        /**
         * @param sapoData The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder sapoData(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs sapoData) {
            return sapoData(Output.of(sapoData));
        }

        /**
         * @param serviceNow The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs> serviceNow) {
            $.serviceNow = serviceNow;
            return this;
        }

        /**
         * @param serviceNow The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs serviceNow) {
            return serviceNow(Output.of(serviceNow));
        }

        /**
         * @param singular The connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder singular(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs> singular) {
            $.singular = singular;
            return this;
        }

        /**
         * @param singular The connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder singular(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs singular) {
            return singular(Output.of(singular));
        }

        /**
         * @param slack The connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder slack(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs> slack) {
            $.slack = slack;
            return this;
        }

        /**
         * @param slack The connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder slack(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs slack) {
            return slack(Output.of(slack));
        }

        /**
         * @param snowflake The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder snowflake(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs> snowflake) {
            $.snowflake = snowflake;
            return this;
        }

        /**
         * @param snowflake The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder snowflake(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs snowflake) {
            return snowflake(Output.of(snowflake));
        }

        /**
         * @param trendmicro The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder trendmicro(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs> trendmicro) {
            $.trendmicro = trendmicro;
            return this;
        }

        /**
         * @param trendmicro The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
         * 
         * @return builder
         * 
         */
        public Builder trendmicro(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs trendmicro) {
            return trendmicro(Output.of(trendmicro));
        }

        /**
         * @param veeva The connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder veeva(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs> veeva) {
            $.veeva = veeva;
            return this;
        }

        /**
         * @param veeva The connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder veeva(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs veeva) {
            return veeva(Output.of(veeva));
        }

        /**
         * @param zendesk The connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder zendesk(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs> zendesk) {
            $.zendesk = zendesk;
            return this;
        }

        /**
         * @param zendesk The connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
         * 
         * @return builder
         * 
         */
        public Builder zendesk(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs zendesk) {
            return zendesk(Output.of(zendesk));
        }

        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs build() {
            return $;
        }
    }

}
