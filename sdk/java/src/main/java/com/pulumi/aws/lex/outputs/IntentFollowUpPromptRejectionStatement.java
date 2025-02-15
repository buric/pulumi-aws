// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.IntentFollowUpPromptRejectionStatementMessage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentFollowUpPromptRejectionStatement {
    /**
     * @return A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    private final List<IntentFollowUpPromptRejectionStatementMessage> messages;
    /**
     * @return The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    private final @Nullable String responseCard;

    @CustomType.Constructor
    private IntentFollowUpPromptRejectionStatement(
        @CustomType.Parameter("messages") List<IntentFollowUpPromptRejectionStatementMessage> messages,
        @CustomType.Parameter("responseCard") @Nullable String responseCard) {
        this.messages = messages;
        this.responseCard = responseCard;
    }

    /**
     * @return A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    public List<IntentFollowUpPromptRejectionStatementMessage> messages() {
        return this.messages;
    }
    /**
     * @return The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    public Optional<String> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowUpPromptRejectionStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IntentFollowUpPromptRejectionStatementMessage> messages;
        private @Nullable String responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowUpPromptRejectionStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder messages(List<IntentFollowUpPromptRejectionStatementMessage> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }
        public Builder messages(IntentFollowUpPromptRejectionStatementMessage... messages) {
            return messages(List.of(messages));
        }
        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = responseCard;
            return this;
        }        public IntentFollowUpPromptRejectionStatement build() {
            return new IntentFollowUpPromptRejectionStatement(messages, responseCard);
        }
    }
}
