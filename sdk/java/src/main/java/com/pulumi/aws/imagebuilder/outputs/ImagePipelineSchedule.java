// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImagePipelineSchedule {
    /**
     * @return Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    private final @Nullable String pipelineExecutionStartCondition;
    /**
     * @return Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     */
    private final String scheduleExpression;
    /**
     * @return The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
     * 
     */
    private final @Nullable String timezone;

    @CustomType.Constructor
    private ImagePipelineSchedule(
        @CustomType.Parameter("pipelineExecutionStartCondition") @Nullable String pipelineExecutionStartCondition,
        @CustomType.Parameter("scheduleExpression") String scheduleExpression,
        @CustomType.Parameter("timezone") @Nullable String timezone) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        this.scheduleExpression = scheduleExpression;
        this.timezone = timezone;
    }

    /**
     * @return Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    public Optional<String> pipelineExecutionStartCondition() {
        return Optional.ofNullable(this.pipelineExecutionStartCondition);
    }
    /**
     * @return Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     */
    public String scheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * @return The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pipelineExecutionStartCondition;
        private String scheduleExpression;
        private @Nullable String timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.timezone = defaults.timezone;
        }

        public Builder pipelineExecutionStartCondition(@Nullable String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }        public ImagePipelineSchedule build() {
            return new ImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression, timezone);
        }
    }
}
