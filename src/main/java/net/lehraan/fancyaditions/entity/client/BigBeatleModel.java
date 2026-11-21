package net.lehraan.fancyaditions.entity.client;

import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class BigBeatleModel extends EntityModel<BigBeatleRenderState> {


    private final ModelPart bone8;
    private final ModelPart bone7;
    private final ModelPart bone11;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart body;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart head;
    private final ModelPart bone;
    private final ModelPart bone2;
    private final ModelPart bone5;
    private final ModelPart bone6;

    private final KeyframeAnimation walkingAnimation;
    private final KeyframeAnimation idlingAnimation;

    public BigBeatleModel(ModelPart root) {
        super(root);
        this.bone8 = root.getChild("bone8");
        this.bone7 = this.bone8.getChild("bone7");
        this.bone11 = this.bone8.getChild("bone11");
        this.bone9 = this.bone8.getChild("bone9");
        this.bone10 = this.bone8.getChild("bone10");
        this.body = this.bone8.getChild("body");
        this.bone3 = this.body.getChild("bone3");
        this.bone4 = this.body.getChild("bone4");
        this.head = this.body.getChild("head");
        this.bone = this.head.getChild("bone");
        this.bone2 = this.head.getChild("bone2");
        this.bone5 = this.bone8.getChild("bone5");
        this.bone6 = this.bone8.getChild("bone6");

        this.walkingAnimation = BigBeatleAnimations.WALK.bake(root);
        this.idlingAnimation = BigBeatleAnimations.IDLE.bake(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition bone7 = bone8.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(27, 74).addBox(-2.0F, 0.0F, -4.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, 11.5F));

        PartDefinition bone11 = bone8.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-8.0F, 0.0F, -4.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-9.0F, 0.0F, 11.5F));

        PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(27, 74).addBox(-2.0F, 0.0F, -5.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, 5.5F));

        PartDefinition bone10 = bone8.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-8.0F, 0.0F, -5.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-9.0F, 0.0F, 5.5F));

        PartDefinition body = bone8.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.1333F, -16.0333F, -10.4F, 16.0F, 14.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-8.1333F, -16.0333F, -10.4F, 16.0F, 14.0F, 22.0F, new CubeDeformation(0.3F))
                .texOffs(21, 97).addBox(-8.1333F, -16.0333F, -7.4F, 16.0F, 14.0F, 16.0F, new CubeDeformation(0.5F))
                .texOffs(106, 82).addBox(7.8667F, -15.0333F, 4.6F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(106, 82).addBox(7.8667F, -15.0333F, -10.4F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(111, 66).addBox(7.8667F, -12.0333F, -2.4F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(106, 82).addBox(-9.1333F, -15.0333F, -10.4F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(111, 66).addBox(-9.1333F, -12.0333F, -2.4F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(106, 82).addBox(-9.1333F, -15.0333F, 4.6F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.8667F, 2.028F, 4.4099F));

        PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.8667F, -16.0333F, -10.4F));

        PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 24).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0036F, 0.0F, 0.0F));

        PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.1333F, -16.0333F, -10.4F));

        PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 32).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0036F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 74).addBox(-4.6667F, -4.1667F, -4.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4667F, -4.8667F, -10.4F));

        PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(77, 16).addBox(-1.0F, -6.5F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.3333F, -4.6667F, -3.0F));

        PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(77, 8).addBox(-1.0F, -6.5F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.6667F, -4.6667F, -3.0F));

        PartDefinition bone5 = bone8.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(29, 74).addBox(1.5F, 3.0F, -5.75F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -3.0F, -2.25F));

        PartDefinition bone6 = bone8.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(-8.5F, 0.0F, -4.75F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.5F, 0.0F, -3.25F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(BigBeatleRenderState state) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(state.yRot, state.xRot);

        this.walkingAnimation.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 2f, 2.5f);
        this.idlingAnimation.apply(state.idleanimationstate, state.ageInTicks, 1f);


    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

}
