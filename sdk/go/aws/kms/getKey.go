// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get detailed information about
// the specified KMS Key with flexible key id input.
// This can be useful to reference key alias
// without having to hard code the ARN as input.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/kms"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := kms.LookupKey(ctx, &kms.LookupKeyArgs{
// 			KeyId: "alias/my-key",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kms.LookupKey(ctx, &kms.LookupKeyArgs{
// 			KeyId: "1234abcd-12ab-34cd-56ef-1234567890ab",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kms.LookupKey(ctx, &kms.LookupKeyArgs{
// 			KeyId: "arn:aws:kms:us-east-1:111122223333:alias/my-key",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kms.LookupKey(ctx, &kms.LookupKeyArgs{
// 			KeyId: "arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupKey(ctx *pulumi.Context, args *LookupKeyArgs, opts ...pulumi.InvokeOption) (*LookupKeyResult, error) {
	var rv LookupKeyResult
	err := ctx.Invoke("aws:kms/getKey:getKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKey.
type LookupKeyArgs struct {
	// List of grant tokens
	GrantTokens []string `pulumi:"grantTokens"`
	// Key identifier which can be one of the following format:
	// * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
	// * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
	// * Alias name. E.g.: `alias/my-key`
	// * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
	KeyId string `pulumi:"keyId"`
}

// A collection of values returned by getKey.
type LookupKeyResult struct {
	Arn                   string   `pulumi:"arn"`
	AwsAccountId          string   `pulumi:"awsAccountId"`
	CreationDate          string   `pulumi:"creationDate"`
	CustomerMasterKeySpec string   `pulumi:"customerMasterKeySpec"`
	DeletionDate          string   `pulumi:"deletionDate"`
	Description           string   `pulumi:"description"`
	Enabled               bool     `pulumi:"enabled"`
	ExpirationModel       string   `pulumi:"expirationModel"`
	GrantTokens           []string `pulumi:"grantTokens"`
	// The provider-assigned unique ID for this managed resource.
	Id                        string                           `pulumi:"id"`
	KeyId                     string                           `pulumi:"keyId"`
	KeyManager                string                           `pulumi:"keyManager"`
	KeyState                  string                           `pulumi:"keyState"`
	KeyUsage                  string                           `pulumi:"keyUsage"`
	MultiRegion               bool                             `pulumi:"multiRegion"`
	MultiRegionConfigurations []GetKeyMultiRegionConfiguration `pulumi:"multiRegionConfigurations"`
	Origin                    string                           `pulumi:"origin"`
	ValidTo                   string                           `pulumi:"validTo"`
}

func LookupKeyOutput(ctx *pulumi.Context, args LookupKeyOutputArgs, opts ...pulumi.InvokeOption) LookupKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKeyResult, error) {
			args := v.(LookupKeyArgs)
			r, err := LookupKey(ctx, &args, opts...)
			var s LookupKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKeyResultOutput)
}

// A collection of arguments for invoking getKey.
type LookupKeyOutputArgs struct {
	// List of grant tokens
	GrantTokens pulumi.StringArrayInput `pulumi:"grantTokens"`
	// Key identifier which can be one of the following format:
	// * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
	// * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
	// * Alias name. E.g.: `alias/my-key`
	// * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
	KeyId pulumi.StringInput `pulumi:"keyId"`
}

func (LookupKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyArgs)(nil)).Elem()
}

// A collection of values returned by getKey.
type LookupKeyResultOutput struct{ *pulumi.OutputState }

func (LookupKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyResult)(nil)).Elem()
}

func (o LookupKeyResultOutput) ToLookupKeyResultOutput() LookupKeyResultOutput {
	return o
}

func (o LookupKeyResultOutput) ToLookupKeyResultOutputWithContext(ctx context.Context) LookupKeyResultOutput {
	return o
}

func (o LookupKeyResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.AwsAccountId }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.CreationDate }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) CustomerMasterKeySpec() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.CustomerMasterKeySpec }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) DeletionDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.DeletionDate }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupKeyResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o LookupKeyResultOutput) ExpirationModel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.ExpirationModel }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) GrantTokens() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKeyResult) []string { return v.GrantTokens }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) KeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.KeyId }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) KeyManager() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.KeyManager }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) KeyState() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.KeyState }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) KeyUsage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.KeyUsage }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) MultiRegion() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupKeyResult) bool { return v.MultiRegion }).(pulumi.BoolOutput)
}

func (o LookupKeyResultOutput) MultiRegionConfigurations() GetKeyMultiRegionConfigurationArrayOutput {
	return o.ApplyT(func(v LookupKeyResult) []GetKeyMultiRegionConfiguration { return v.MultiRegionConfigurations }).(GetKeyMultiRegionConfigurationArrayOutput)
}

func (o LookupKeyResultOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.Origin }).(pulumi.StringOutput)
}

func (o LookupKeyResultOutput) ValidTo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyResult) string { return v.ValidTo }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKeyResultOutput{})
}
