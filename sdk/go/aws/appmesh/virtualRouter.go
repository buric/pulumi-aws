// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appmesh

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS App Mesh virtual router resource.
//
// ## Breaking Changes
//
// Because of backward incompatible API changes (read [here](https://github.com/awslabs/aws-app-mesh-examples/issues/92) and [here](https://github.com/awslabs/aws-app-mesh-examples/issues/94)), `appmesh.VirtualRouter` resource definitions created with provider versions earlier than v2.3.0 will need to be modified:
//
// * Remove service `serviceNames` from the `spec` argument.
// AWS has created a `appmesh.VirtualService` resource for each of service names.
// These resource can be imported using `import`.
//
// * Add a `listener` configuration block to the `spec` argument.
//
// The state associated with existing resources will automatically be migrated.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/appmesh"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := appmesh.NewVirtualRouter(ctx, "serviceb", &appmesh.VirtualRouterArgs{
// 			MeshName: pulumi.Any(aws_appmesh_mesh.Simple.Id),
// 			Spec: &appmesh.VirtualRouterSpecArgs{
// 				Listener: &appmesh.VirtualRouterSpecListenerArgs{
// 					PortMapping: &appmesh.VirtualRouterSpecListenerPortMappingArgs{
// 						Port:     pulumi.Int(8080),
// 						Protocol: pulumi.String("http"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// App Mesh virtual routers can be imported using `mesh_name` together with the virtual router's `name`, e.g.,
//
// ```sh
//  $ pulumi import aws:appmesh/virtualRouter:VirtualRouter serviceb simpleapp/serviceB
// ```
//
//  [1]/docs/providers/aws/index.html
type VirtualRouter struct {
	pulumi.CustomResourceState

	// The ARN of the virtual router.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The creation date of the virtual router.
	CreatedDate pulumi.StringOutput `pulumi:"createdDate"`
	// The last update date of the virtual router.
	LastUpdatedDate pulumi.StringOutput `pulumi:"lastUpdatedDate"`
	// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
	MeshName pulumi.StringOutput `pulumi:"meshName"`
	// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
	MeshOwner pulumi.StringOutput `pulumi:"meshOwner"`
	// The name to use for the virtual router. Must be between 1 and 255 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// The resource owner's AWS account ID.
	ResourceOwner pulumi.StringOutput `pulumi:"resourceOwner"`
	// The virtual router specification to apply.
	Spec VirtualRouterSpecOutput `pulumi:"spec"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewVirtualRouter registers a new resource with the given unique name, arguments, and options.
func NewVirtualRouter(ctx *pulumi.Context,
	name string, args *VirtualRouterArgs, opts ...pulumi.ResourceOption) (*VirtualRouter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MeshName == nil {
		return nil, errors.New("invalid value for required argument 'MeshName'")
	}
	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	var resource VirtualRouter
	err := ctx.RegisterResource("aws:appmesh/virtualRouter:VirtualRouter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualRouter gets an existing VirtualRouter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualRouter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualRouterState, opts ...pulumi.ResourceOption) (*VirtualRouter, error) {
	var resource VirtualRouter
	err := ctx.ReadResource("aws:appmesh/virtualRouter:VirtualRouter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualRouter resources.
type virtualRouterState struct {
	// The ARN of the virtual router.
	Arn *string `pulumi:"arn"`
	// The creation date of the virtual router.
	CreatedDate *string `pulumi:"createdDate"`
	// The last update date of the virtual router.
	LastUpdatedDate *string `pulumi:"lastUpdatedDate"`
	// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
	MeshName *string `pulumi:"meshName"`
	// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
	MeshOwner *string `pulumi:"meshOwner"`
	// The name to use for the virtual router. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// The resource owner's AWS account ID.
	ResourceOwner *string `pulumi:"resourceOwner"`
	// The virtual router specification to apply.
	Spec *VirtualRouterSpec `pulumi:"spec"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type VirtualRouterState struct {
	// The ARN of the virtual router.
	Arn pulumi.StringPtrInput
	// The creation date of the virtual router.
	CreatedDate pulumi.StringPtrInput
	// The last update date of the virtual router.
	LastUpdatedDate pulumi.StringPtrInput
	// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
	MeshName pulumi.StringPtrInput
	// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
	MeshOwner pulumi.StringPtrInput
	// The name to use for the virtual router. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// The resource owner's AWS account ID.
	ResourceOwner pulumi.StringPtrInput
	// The virtual router specification to apply.
	Spec VirtualRouterSpecPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapInput
}

func (VirtualRouterState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualRouterState)(nil)).Elem()
}

type virtualRouterArgs struct {
	// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
	MeshName string `pulumi:"meshName"`
	// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
	MeshOwner *string `pulumi:"meshOwner"`
	// The name to use for the virtual router. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// The virtual router specification to apply.
	Spec VirtualRouterSpec `pulumi:"spec"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a VirtualRouter resource.
type VirtualRouterArgs struct {
	// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
	MeshName pulumi.StringInput
	// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
	MeshOwner pulumi.StringPtrInput
	// The name to use for the virtual router. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// The virtual router specification to apply.
	Spec VirtualRouterSpecInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (VirtualRouterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualRouterArgs)(nil)).Elem()
}

type VirtualRouterInput interface {
	pulumi.Input

	ToVirtualRouterOutput() VirtualRouterOutput
	ToVirtualRouterOutputWithContext(ctx context.Context) VirtualRouterOutput
}

func (*VirtualRouter) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualRouter)(nil)).Elem()
}

func (i *VirtualRouter) ToVirtualRouterOutput() VirtualRouterOutput {
	return i.ToVirtualRouterOutputWithContext(context.Background())
}

func (i *VirtualRouter) ToVirtualRouterOutputWithContext(ctx context.Context) VirtualRouterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualRouterOutput)
}

// VirtualRouterArrayInput is an input type that accepts VirtualRouterArray and VirtualRouterArrayOutput values.
// You can construct a concrete instance of `VirtualRouterArrayInput` via:
//
//          VirtualRouterArray{ VirtualRouterArgs{...} }
type VirtualRouterArrayInput interface {
	pulumi.Input

	ToVirtualRouterArrayOutput() VirtualRouterArrayOutput
	ToVirtualRouterArrayOutputWithContext(context.Context) VirtualRouterArrayOutput
}

type VirtualRouterArray []VirtualRouterInput

func (VirtualRouterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualRouter)(nil)).Elem()
}

func (i VirtualRouterArray) ToVirtualRouterArrayOutput() VirtualRouterArrayOutput {
	return i.ToVirtualRouterArrayOutputWithContext(context.Background())
}

func (i VirtualRouterArray) ToVirtualRouterArrayOutputWithContext(ctx context.Context) VirtualRouterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualRouterArrayOutput)
}

// VirtualRouterMapInput is an input type that accepts VirtualRouterMap and VirtualRouterMapOutput values.
// You can construct a concrete instance of `VirtualRouterMapInput` via:
//
//          VirtualRouterMap{ "key": VirtualRouterArgs{...} }
type VirtualRouterMapInput interface {
	pulumi.Input

	ToVirtualRouterMapOutput() VirtualRouterMapOutput
	ToVirtualRouterMapOutputWithContext(context.Context) VirtualRouterMapOutput
}

type VirtualRouterMap map[string]VirtualRouterInput

func (VirtualRouterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualRouter)(nil)).Elem()
}

func (i VirtualRouterMap) ToVirtualRouterMapOutput() VirtualRouterMapOutput {
	return i.ToVirtualRouterMapOutputWithContext(context.Background())
}

func (i VirtualRouterMap) ToVirtualRouterMapOutputWithContext(ctx context.Context) VirtualRouterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualRouterMapOutput)
}

type VirtualRouterOutput struct{ *pulumi.OutputState }

func (VirtualRouterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualRouter)(nil)).Elem()
}

func (o VirtualRouterOutput) ToVirtualRouterOutput() VirtualRouterOutput {
	return o
}

func (o VirtualRouterOutput) ToVirtualRouterOutputWithContext(ctx context.Context) VirtualRouterOutput {
	return o
}

// The ARN of the virtual router.
func (o VirtualRouterOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The creation date of the virtual router.
func (o VirtualRouterOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.CreatedDate }).(pulumi.StringOutput)
}

// The last update date of the virtual router.
func (o VirtualRouterOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

// The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
func (o VirtualRouterOutput) MeshName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.MeshName }).(pulumi.StringOutput)
}

// The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
func (o VirtualRouterOutput) MeshOwner() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.MeshOwner }).(pulumi.StringOutput)
}

// The name to use for the virtual router. Must be between 1 and 255 characters in length.
func (o VirtualRouterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The resource owner's AWS account ID.
func (o VirtualRouterOutput) ResourceOwner() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringOutput { return v.ResourceOwner }).(pulumi.StringOutput)
}

// The virtual router specification to apply.
func (o VirtualRouterOutput) Spec() VirtualRouterSpecOutput {
	return o.ApplyT(func(v *VirtualRouter) VirtualRouterSpecOutput { return v.Spec }).(VirtualRouterSpecOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o VirtualRouterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider .
func (o VirtualRouterOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VirtualRouter) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type VirtualRouterArrayOutput struct{ *pulumi.OutputState }

func (VirtualRouterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualRouter)(nil)).Elem()
}

func (o VirtualRouterArrayOutput) ToVirtualRouterArrayOutput() VirtualRouterArrayOutput {
	return o
}

func (o VirtualRouterArrayOutput) ToVirtualRouterArrayOutputWithContext(ctx context.Context) VirtualRouterArrayOutput {
	return o
}

func (o VirtualRouterArrayOutput) Index(i pulumi.IntInput) VirtualRouterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualRouter {
		return vs[0].([]*VirtualRouter)[vs[1].(int)]
	}).(VirtualRouterOutput)
}

type VirtualRouterMapOutput struct{ *pulumi.OutputState }

func (VirtualRouterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualRouter)(nil)).Elem()
}

func (o VirtualRouterMapOutput) ToVirtualRouterMapOutput() VirtualRouterMapOutput {
	return o
}

func (o VirtualRouterMapOutput) ToVirtualRouterMapOutputWithContext(ctx context.Context) VirtualRouterMapOutput {
	return o
}

func (o VirtualRouterMapOutput) MapIndex(k pulumi.StringInput) VirtualRouterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualRouter {
		return vs[0].(map[string]*VirtualRouter)[vs[1].(string)]
	}).(VirtualRouterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualRouterInput)(nil)).Elem(), &VirtualRouter{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualRouterArrayInput)(nil)).Elem(), VirtualRouterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualRouterMapInput)(nil)).Elem(), VirtualRouterMap{})
	pulumi.RegisterOutputType(VirtualRouterOutput{})
	pulumi.RegisterOutputType(VirtualRouterArrayOutput{})
	pulumi.RegisterOutputType(VirtualRouterMapOutput{})
}
