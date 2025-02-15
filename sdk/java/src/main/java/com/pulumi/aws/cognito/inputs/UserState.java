// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * A map that contains user attributes and attribute values to be set for the user.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,String>> attributes;

    /**
     * @return A map that contains user attributes and attribute values to be set for the user.
     * 
     */
    public Optional<Output<Map<String,String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that user creation triggers. Amazon Cognito does not store the `client_metadata` value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
     * 
     */
    @Import(name="clientMetadata")
    private @Nullable Output<Map<String,String>> clientMetadata;

    /**
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that user creation triggers. Amazon Cognito does not store the `client_metadata` value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
     * 
     */
    public Optional<Output<Map<String,String>>> clientMetadata() {
        return Optional.ofNullable(this.clientMetadata);
    }

    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * A list of mediums to the welcome message will be sent through. Allowed values are `EMAIL` and `SMS`. If it&#39;s provided, make sure you have also specified `email` attribute for the `EMAIL` medium and `phone_number` for the `SMS`. More than one value can be specified. Amazon Cognito does not store the `desired_delivery_mediums` value. Defaults to `[&#34;SMS&#34;]`.
     * 
     */
    @Import(name="desiredDeliveryMediums")
    private @Nullable Output<List<String>> desiredDeliveryMediums;

    /**
     * @return A list of mediums to the welcome message will be sent through. Allowed values are `EMAIL` and `SMS`. If it&#39;s provided, make sure you have also specified `email` attribute for the `EMAIL` medium and `phone_number` for the `SMS`. More than one value can be specified. Amazon Cognito does not store the `desired_delivery_mediums` value. Defaults to `[&#34;SMS&#34;]`.
     * 
     */
    public Optional<Output<List<String>>> desiredDeliveryMediums() {
        return Optional.ofNullable(this.desiredDeliveryMediums);
    }

    /**
     * Specifies whether the user should be enabled after creation. The welcome message will be sent regardless of the `enabled` value. The behavior can be changed with `message_action` argument. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether the user should be enabled after creation. The welcome message will be sent regardless of the `enabled` value. The behavior can be changed with `message_action` argument. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * If this parameter is set to True and the `phone_number` or `email` address specified in the `attributes` parameter already exists as an alias with a different user, Amazon Cognito will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. Amazon Cognito does not store the `force_alias_creation` value. Defaults to `false`.
     * 
     */
    @Import(name="forceAliasCreation")
    private @Nullable Output<Boolean> forceAliasCreation;

    /**
     * @return If this parameter is set to True and the `phone_number` or `email` address specified in the `attributes` parameter already exists as an alias with a different user, Amazon Cognito will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. Amazon Cognito does not store the `force_alias_creation` value. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> forceAliasCreation() {
        return Optional.ofNullable(this.forceAliasCreation);
    }

    @Import(name="lastModifiedDate")
    private @Nullable Output<String> lastModifiedDate;

    public Optional<Output<String>> lastModifiedDate() {
        return Optional.ofNullable(this.lastModifiedDate);
    }

    /**
     * Set to `RESEND` to resend the invitation message to a user that already exists and reset the expiration limit on the user&#39;s account. Set to `SUPPRESS` to suppress sending the message. Only one value can be specified. Amazon Cognito does not store the `message_action` value.
     * 
     */
    @Import(name="messageAction")
    private @Nullable Output<String> messageAction;

    /**
     * @return Set to `RESEND` to resend the invitation message to a user that already exists and reset the expiration limit on the user&#39;s account. Set to `SUPPRESS` to suppress sending the message. Only one value can be specified. Amazon Cognito does not store the `message_action` value.
     * 
     */
    public Optional<Output<String>> messageAction() {
        return Optional.ofNullable(this.messageAction);
    }

    @Import(name="mfaSettingLists")
    private @Nullable Output<List<String>> mfaSettingLists;

    public Optional<Output<List<String>>> mfaSettingLists() {
        return Optional.ofNullable(this.mfaSettingLists);
    }

    /**
     * The user&#39;s permanent password. This password must conform to the password policy specified by user pool the user belongs to. The welcome message always contains only `temporary_password` value. You can suppress sending the welcome message with the `message_action` argument. Amazon Cognito does not store the `password` value. Conflicts with `temporary_password`.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The user&#39;s permanent password. This password must conform to the password policy specified by user pool the user belongs to. The welcome message always contains only `temporary_password` value. You can suppress sending the welcome message with the `message_action` argument. Amazon Cognito does not store the `password` value. Conflicts with `temporary_password`.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="preferredMfaSetting")
    private @Nullable Output<String> preferredMfaSetting;

    public Optional<Output<String>> preferredMfaSetting() {
        return Optional.ofNullable(this.preferredMfaSetting);
    }

    /**
     * current user status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return current user status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * unique user id that is never reassignable to another user.
     * 
     */
    @Import(name="sub")
    private @Nullable Output<String> sub;

    /**
     * @return unique user id that is never reassignable to another user.
     * 
     */
    public Optional<Output<String>> sub() {
        return Optional.ofNullable(this.sub);
    }

    /**
     * The user&#39;s temporary password. Conflicts with `password`.
     * 
     */
    @Import(name="temporaryPassword")
    private @Nullable Output<String> temporaryPassword;

    /**
     * @return The user&#39;s temporary password. Conflicts with `password`.
     * 
     */
    public Optional<Output<String>> temporaryPassword() {
        return Optional.ofNullable(this.temporaryPassword);
    }

    /**
     * The user pool ID for the user pool where the user will be created.
     * 
     */
    @Import(name="userPoolId")
    private @Nullable Output<String> userPoolId;

    /**
     * @return The user pool ID for the user pool where the user will be created.
     * 
     */
    public Optional<Output<String>> userPoolId() {
        return Optional.ofNullable(this.userPoolId);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * The user&#39;s validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. Amazon Cognito does not store the `validation_data` value. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
     * 
     */
    @Import(name="validationData")
    private @Nullable Output<Map<String,String>> validationData;

    /**
     * @return The user&#39;s validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. Amazon Cognito does not store the `validation_data` value. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
     * 
     */
    public Optional<Output<Map<String,String>>> validationData() {
        return Optional.ofNullable(this.validationData);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.attributes = $.attributes;
        this.clientMetadata = $.clientMetadata;
        this.creationDate = $.creationDate;
        this.desiredDeliveryMediums = $.desiredDeliveryMediums;
        this.enabled = $.enabled;
        this.forceAliasCreation = $.forceAliasCreation;
        this.lastModifiedDate = $.lastModifiedDate;
        this.messageAction = $.messageAction;
        this.mfaSettingLists = $.mfaSettingLists;
        this.password = $.password;
        this.preferredMfaSetting = $.preferredMfaSetting;
        this.status = $.status;
        this.sub = $.sub;
        this.temporaryPassword = $.temporaryPassword;
        this.userPoolId = $.userPoolId;
        this.username = $.username;
        this.validationData = $.validationData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes A map that contains user attributes and attribute values to be set for the user.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes A map that contains user attributes and attribute values to be set for the user.
         * 
         * @return builder
         * 
         */
        public Builder attributes(Map<String,String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param clientMetadata A map of custom key-value pairs that you can provide as input for any custom workflows that user creation triggers. Amazon Cognito does not store the `client_metadata` value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
         * 
         * @return builder
         * 
         */
        public Builder clientMetadata(@Nullable Output<Map<String,String>> clientMetadata) {
            $.clientMetadata = clientMetadata;
            return this;
        }

        /**
         * @param clientMetadata A map of custom key-value pairs that you can provide as input for any custom workflows that user creation triggers. Amazon Cognito does not store the `client_metadata` value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
         * 
         * @return builder
         * 
         */
        public Builder clientMetadata(Map<String,String> clientMetadata) {
            return clientMetadata(Output.of(clientMetadata));
        }

        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        /**
         * @param desiredDeliveryMediums A list of mediums to the welcome message will be sent through. Allowed values are `EMAIL` and `SMS`. If it&#39;s provided, make sure you have also specified `email` attribute for the `EMAIL` medium and `phone_number` for the `SMS`. More than one value can be specified. Amazon Cognito does not store the `desired_delivery_mediums` value. Defaults to `[&#34;SMS&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder desiredDeliveryMediums(@Nullable Output<List<String>> desiredDeliveryMediums) {
            $.desiredDeliveryMediums = desiredDeliveryMediums;
            return this;
        }

        /**
         * @param desiredDeliveryMediums A list of mediums to the welcome message will be sent through. Allowed values are `EMAIL` and `SMS`. If it&#39;s provided, make sure you have also specified `email` attribute for the `EMAIL` medium and `phone_number` for the `SMS`. More than one value can be specified. Amazon Cognito does not store the `desired_delivery_mediums` value. Defaults to `[&#34;SMS&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder desiredDeliveryMediums(List<String> desiredDeliveryMediums) {
            return desiredDeliveryMediums(Output.of(desiredDeliveryMediums));
        }

        /**
         * @param desiredDeliveryMediums A list of mediums to the welcome message will be sent through. Allowed values are `EMAIL` and `SMS`. If it&#39;s provided, make sure you have also specified `email` attribute for the `EMAIL` medium and `phone_number` for the `SMS`. More than one value can be specified. Amazon Cognito does not store the `desired_delivery_mediums` value. Defaults to `[&#34;SMS&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder desiredDeliveryMediums(String... desiredDeliveryMediums) {
            return desiredDeliveryMediums(List.of(desiredDeliveryMediums));
        }

        /**
         * @param enabled Specifies whether the user should be enabled after creation. The welcome message will be sent regardless of the `enabled` value. The behavior can be changed with `message_action` argument. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether the user should be enabled after creation. The welcome message will be sent regardless of the `enabled` value. The behavior can be changed with `message_action` argument. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param forceAliasCreation If this parameter is set to True and the `phone_number` or `email` address specified in the `attributes` parameter already exists as an alias with a different user, Amazon Cognito will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. Amazon Cognito does not store the `force_alias_creation` value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder forceAliasCreation(@Nullable Output<Boolean> forceAliasCreation) {
            $.forceAliasCreation = forceAliasCreation;
            return this;
        }

        /**
         * @param forceAliasCreation If this parameter is set to True and the `phone_number` or `email` address specified in the `attributes` parameter already exists as an alias with a different user, Amazon Cognito will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. Amazon Cognito does not store the `force_alias_creation` value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder forceAliasCreation(Boolean forceAliasCreation) {
            return forceAliasCreation(Output.of(forceAliasCreation));
        }

        public Builder lastModifiedDate(@Nullable Output<String> lastModifiedDate) {
            $.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder lastModifiedDate(String lastModifiedDate) {
            return lastModifiedDate(Output.of(lastModifiedDate));
        }

        /**
         * @param messageAction Set to `RESEND` to resend the invitation message to a user that already exists and reset the expiration limit on the user&#39;s account. Set to `SUPPRESS` to suppress sending the message. Only one value can be specified. Amazon Cognito does not store the `message_action` value.
         * 
         * @return builder
         * 
         */
        public Builder messageAction(@Nullable Output<String> messageAction) {
            $.messageAction = messageAction;
            return this;
        }

        /**
         * @param messageAction Set to `RESEND` to resend the invitation message to a user that already exists and reset the expiration limit on the user&#39;s account. Set to `SUPPRESS` to suppress sending the message. Only one value can be specified. Amazon Cognito does not store the `message_action` value.
         * 
         * @return builder
         * 
         */
        public Builder messageAction(String messageAction) {
            return messageAction(Output.of(messageAction));
        }

        public Builder mfaSettingLists(@Nullable Output<List<String>> mfaSettingLists) {
            $.mfaSettingLists = mfaSettingLists;
            return this;
        }

        public Builder mfaSettingLists(List<String> mfaSettingLists) {
            return mfaSettingLists(Output.of(mfaSettingLists));
        }

        public Builder mfaSettingLists(String... mfaSettingLists) {
            return mfaSettingLists(List.of(mfaSettingLists));
        }

        /**
         * @param password The user&#39;s permanent password. This password must conform to the password policy specified by user pool the user belongs to. The welcome message always contains only `temporary_password` value. You can suppress sending the welcome message with the `message_action` argument. Amazon Cognito does not store the `password` value. Conflicts with `temporary_password`.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The user&#39;s permanent password. This password must conform to the password policy specified by user pool the user belongs to. The welcome message always contains only `temporary_password` value. You can suppress sending the welcome message with the `message_action` argument. Amazon Cognito does not store the `password` value. Conflicts with `temporary_password`.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder preferredMfaSetting(@Nullable Output<String> preferredMfaSetting) {
            $.preferredMfaSetting = preferredMfaSetting;
            return this;
        }

        public Builder preferredMfaSetting(String preferredMfaSetting) {
            return preferredMfaSetting(Output.of(preferredMfaSetting));
        }

        /**
         * @param status current user status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status current user status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param sub unique user id that is never reassignable to another user.
         * 
         * @return builder
         * 
         */
        public Builder sub(@Nullable Output<String> sub) {
            $.sub = sub;
            return this;
        }

        /**
         * @param sub unique user id that is never reassignable to another user.
         * 
         * @return builder
         * 
         */
        public Builder sub(String sub) {
            return sub(Output.of(sub));
        }

        /**
         * @param temporaryPassword The user&#39;s temporary password. Conflicts with `password`.
         * 
         * @return builder
         * 
         */
        public Builder temporaryPassword(@Nullable Output<String> temporaryPassword) {
            $.temporaryPassword = temporaryPassword;
            return this;
        }

        /**
         * @param temporaryPassword The user&#39;s temporary password. Conflicts with `password`.
         * 
         * @return builder
         * 
         */
        public Builder temporaryPassword(String temporaryPassword) {
            return temporaryPassword(Output.of(temporaryPassword));
        }

        /**
         * @param userPoolId The user pool ID for the user pool where the user will be created.
         * 
         * @return builder
         * 
         */
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        /**
         * @param userPoolId The user pool ID for the user pool where the user will be created.
         * 
         * @return builder
         * 
         */
        public Builder userPoolId(String userPoolId) {
            return userPoolId(Output.of(userPoolId));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param validationData The user&#39;s validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. Amazon Cognito does not store the `validation_data` value. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
         * 
         * @return builder
         * 
         */
        public Builder validationData(@Nullable Output<Map<String,String>> validationData) {
            $.validationData = validationData;
            return this;
        }

        /**
         * @param validationData The user&#39;s validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. Amazon Cognito does not store the `validation_data` value. For more information, see [Customizing User Pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html).
         * 
         * @return builder
         * 
         */
        public Builder validationData(Map<String,String> validationData) {
            return validationData(Output.of(validationData));
        }

        public UserState build() {
            return $;
        }
    }

}
