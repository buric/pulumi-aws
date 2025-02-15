// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package globalaccelerator

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Global Accelerator accelerator.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/globalaccelerator"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		acceleratorArn := ""
// 		if param := cfg.Get("acceleratorArn"); param != "" {
// 			acceleratorArn = param
// 		}
// 		acceleratorName := ""
// 		if param := cfg.Get("acceleratorName"); param != "" {
// 			acceleratorName = param
// 		}
// 		_, err := globalaccelerator.LookupAccelerator(ctx, &globalaccelerator.LookupAcceleratorArgs{
// 			Arn:  pulumi.StringRef(acceleratorArn),
// 			Name: pulumi.StringRef(acceleratorName),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupAccelerator(ctx *pulumi.Context, args *LookupAcceleratorArgs, opts ...pulumi.InvokeOption) (*LookupAcceleratorResult, error) {
	var rv LookupAcceleratorResult
	err := ctx.Invoke("aws:globalaccelerator/getAccelerator:getAccelerator", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccelerator.
type LookupAcceleratorArgs struct {
	// The full ARN of the Global Accelerator.
	Arn *string `pulumi:"arn"`
	// The unique name of the Global Accelerator.
	Name *string           `pulumi:"name"`
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getAccelerator.
type LookupAcceleratorResult struct {
	Arn          string                    `pulumi:"arn"`
	Attributes   []GetAcceleratorAttribute `pulumi:"attributes"`
	DnsName      string                    `pulumi:"dnsName"`
	Enabled      bool                      `pulumi:"enabled"`
	HostedZoneId string                    `pulumi:"hostedZoneId"`
	// The provider-assigned unique ID for this managed resource.
	Id            string                `pulumi:"id"`
	IpAddressType string                `pulumi:"ipAddressType"`
	IpSets        []GetAcceleratorIpSet `pulumi:"ipSets"`
	Name          string                `pulumi:"name"`
	Tags          map[string]string     `pulumi:"tags"`
}

func LookupAcceleratorOutput(ctx *pulumi.Context, args LookupAcceleratorOutputArgs, opts ...pulumi.InvokeOption) LookupAcceleratorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAcceleratorResult, error) {
			args := v.(LookupAcceleratorArgs)
			r, err := LookupAccelerator(ctx, &args, opts...)
			var s LookupAcceleratorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAcceleratorResultOutput)
}

// A collection of arguments for invoking getAccelerator.
type LookupAcceleratorOutputArgs struct {
	// The full ARN of the Global Accelerator.
	Arn pulumi.StringPtrInput `pulumi:"arn"`
	// The unique name of the Global Accelerator.
	Name pulumi.StringPtrInput `pulumi:"name"`
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupAcceleratorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAcceleratorArgs)(nil)).Elem()
}

// A collection of values returned by getAccelerator.
type LookupAcceleratorResultOutput struct{ *pulumi.OutputState }

func (LookupAcceleratorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAcceleratorResult)(nil)).Elem()
}

func (o LookupAcceleratorResultOutput) ToLookupAcceleratorResultOutput() LookupAcceleratorResultOutput {
	return o
}

func (o LookupAcceleratorResultOutput) ToLookupAcceleratorResultOutputWithContext(ctx context.Context) LookupAcceleratorResultOutput {
	return o
}

func (o LookupAcceleratorResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupAcceleratorResultOutput) Attributes() GetAcceleratorAttributeArrayOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) []GetAcceleratorAttribute { return v.Attributes }).(GetAcceleratorAttributeArrayOutput)
}

func (o LookupAcceleratorResultOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.DnsName }).(pulumi.StringOutput)
}

func (o LookupAcceleratorResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o LookupAcceleratorResultOutput) HostedZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.HostedZoneId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAcceleratorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAcceleratorResultOutput) IpAddressType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.IpAddressType }).(pulumi.StringOutput)
}

func (o LookupAcceleratorResultOutput) IpSets() GetAcceleratorIpSetArrayOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) []GetAcceleratorIpSet { return v.IpSets }).(GetAcceleratorIpSetArrayOutput)
}

func (o LookupAcceleratorResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAcceleratorResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAcceleratorResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAcceleratorResultOutput{})
}
