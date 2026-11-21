package net.lehraan.fancyaditions.entity.client;

import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class animatronicModel extends EntityModel<animatronicRenderState> {



    private final ModelPart model;
    private final ModelPart body;
    private final ModelPart right_arm;
    private final ModelPart bone;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart bone8;
    private final ModelPart bone7;
    private final ModelPart bone9;
    private final ModelPart bone11;
    private final ModelPart bone10;
    private final ModelPart left_arm;
    private final ModelPart bone12;
    private final ModelPart bone13;
    private final ModelPart bone14;
    private final ModelPart bone15;
    private final ModelPart bone16;
    private final ModelPart bone17;
    private final ModelPart bone18;
    private final ModelPart bone19;
    private final ModelPart bone20;
    private final ModelPart bone21;
    private final ModelPart bone22;
    private final ModelPart bow_tie;
    private final ModelPart head;
    private final ModelPart upper_jaw;
    private final ModelPart bone23;
    private final ModelPart bone28;
    private final ModelPart lower_body;
    private final ModelPart left_leg;
    private final ModelPart bone24;
    private final ModelPart bone25;
    private final ModelPart right_leg;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart model2;
    private final ModelPart body2;
    private final ModelPart bone29;
    private final ModelPart right_wing;
    private final ModelPart left_wing;
    private final ModelPart tail;
    private final ModelPart head2;
    private final ModelPart bone30;
    private final ModelPart bone31;

    private final KeyframeAnimation idlinganimation;

    public animatronicModel(ModelPart root) {
        super(root);
        this.model = root.getChild("model");
        this.body = this.model.getChild("body");
        this.right_arm = this.body.getChild("right_arm");
        this.bone = this.right_arm.getChild("bone");
        this.bone2 = this.bone.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.bone4 = this.bone3.getChild("bone4");
        this.bone5 = this.bone4.getChild("bone5");
        this.bone6 = this.bone5.getChild("bone6");
        this.bone8 = this.bone6.getChild("bone8");
        this.bone7 = this.bone8.getChild("bone7");
        this.bone9 = this.bone7.getChild("bone9");
        this.bone11 = this.bone9.getChild("bone11");
        this.bone10 = this.bone11.getChild("bone10");
        this.left_arm = this.body.getChild("left_arm");
        this.bone12 = this.left_arm.getChild("bone12");
        this.bone13 = this.bone12.getChild("bone13");
        this.bone14 = this.bone13.getChild("bone14");
        this.bone15 = this.bone14.getChild("bone15");
        this.bone16 = this.bone15.getChild("bone16");
        this.bone17 = this.bone16.getChild("bone17");
        this.bone18 = this.bone17.getChild("bone18");
        this.bone19 = this.bone18.getChild("bone19");
        this.bone20 = this.bone19.getChild("bone20");
        this.bone21 = this.bone20.getChild("bone21");
        this.bone22 = this.bone21.getChild("bone22");
        this.bow_tie = this.body.getChild("bow_tie");
        this.head = this.body.getChild("head");
        this.upper_jaw = this.head.getChild("upper_jaw");
        this.bone23 = this.head.getChild("bone23");
        this.bone28 = this.bone23.getChild("bone28");
        this.lower_body = this.model.getChild("lower_body");
        this.left_leg = this.lower_body.getChild("left_leg");
        this.bone24 = this.left_leg.getChild("bone24");
        this.bone25 = this.bone24.getChild("bone25");
        this.right_leg = this.model.getChild("right_leg");
        this.bone26 = this.right_leg.getChild("bone26");
        this.bone27 = this.bone26.getChild("bone27");
        this.model2 = root.getChild("model2");
        this.body2 = this.model2.getChild("body2");
        this.bone29 = this.body2.getChild("bone29");
        this.right_wing = this.body2.getChild("right_wing");
        this.left_wing = this.body2.getChild("left_wing");
        this.tail = this.body2.getChild("tail");
        this.head2 = this.body2.getChild("head2");
        this.bone30 = this.model2.getChild("bone30");
        this.bone31 = this.model2.getChild("bone31");

        this.idlinganimation=animatronicAnimations.IDLE.bake(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition model = partdefinition.addOrReplaceChild("model", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = model.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 15).addBox(-5.0F, -13.75F, -2.0F, 10.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.25F, 0.0F));

        PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(41, 78).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -8.75F, 1.0F));

        PartDefinition cube_r1 = right_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 45).addBox(-10.3192F, -10.6796F, 1.0F, 12.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.2329F, 9.2294F, -2.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone = right_arm.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(38, 60).addBox(-13.7329F, -20.7294F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(15.2329F, 18.7294F, -1.0F));

        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 76).addBox(-4.3037F, -12.0241F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -10.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(55, 60).addBox(-9.8037F, -23.0241F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 10.0F, 0.0F));

        PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(50, 79).addBox(0.2046F, -12.6406F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -10.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 58).addBox(-5.2954F, -23.6406F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 10.0F, 0.0F));

        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(59, 79).addBox(0.7074F, -12.594F, 0.0589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -10.0F, 0.0F, 0.005F, 0.0008F, -0.0433F));

        PartDefinition bone8 = bone6.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(17, 64).addBox(-4.7926F, -23.594F, -0.9411F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 10.0F, 0.0F));

        PartDefinition bone7 = bone8.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(68, 79).addBox(-1.3242F, -12.6275F, 0.0589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -10.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

        PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(66, 12).addBox(-6.8242F, -23.6275F, -0.9411F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 10.0F, 0.0F));

        PartDefinition cube_r2 = bone9.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 0).addBox(-6.0F, -1.5F, 0.0F, 12.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.4574F, -17.606F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition bone11 = bone9.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(17, 73).addBox(-8.8242F, -24.6275F, 3.0589F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -2.0F));

        PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 42).addBox(-4.3242F, -9.8574F, 8.6361F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -13.0F, 2.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition bone10 = bone11.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(51, 69).addBox(-1.308F, -16.1275F, -0.2995F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -10.5F, 2.0F, 0.0F, 1.1345F, 0.0F));

        PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(77, 79).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.5F, -8.75F, 0.0F));

        PartDefinition bone12 = left_arm.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(66, 21).addBox(9.7329F, -20.7294F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.2329F, 18.7294F, 0.0F));

        PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(32, 78).addBox(2.3037F, -12.0241F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(0, 67).addBox(5.8037F, -23.0241F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 10.0F, 0.0F));

        PartDefinition cube_r4 = bone14.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 8).addBox(-6.0F, -1.5F, 0.0F, 12.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -18.5F, 0.0F, 0.0F, 0.0F, -0.0436F));

        PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 81).addBox(-2.2046F, -12.6406F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(58, 33).addBox(1.2954F, -23.6406F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 10.0F, 0.0F));

        PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(9, 81).addBox(-2.7074F, -12.594F, 0.0589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.0F, 0.0F, 0.005F, -0.0008F, 0.0433F));

        PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(67, 49).addBox(0.7926F, -23.594F, -0.9411F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 10.0F, 0.0F));

        PartDefinition bone19 = bone18.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(18, 81).addBox(-0.6758F, -12.6275F, 0.0589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

        PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(34, 69).addBox(2.8242F, -23.6275F, -0.9411F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 10.0F, 0.0F));

        PartDefinition cube_r5 = bone20.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 4).addBox(-6.0F, -1.5F, 0.0F, 12.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.4574F, -17.606F, 0.0F, 0.0F, 0.0F, 0.3054F));

        PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(74, 0).addBox(1.8242F, -24.6275F, 3.0589F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, -2.0F));

        PartDefinition cube_r6 = bone21.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 30).addBox(-2.6758F, -9.8574F, 8.6361F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -13.0F, 2.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(66, 69).addBox(-5.692F, -16.1275F, -0.2995F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -10.5F, 2.0F, 0.0F, -1.1345F, 0.0F));

        PartDefinition bow_tie = body.addOrReplaceChild("bow_tie", CubeListBuilder.create().texOffs(72, 65).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.75F, -2.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 12).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.75F, 1.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 13).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.9163F, 0.0F, 0.0F));

        PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(102, 68).addBox(0.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.0F, -5.0F, 0.0F, -1.0908F, 0.0F));

        PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 30).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, -5.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(72, 58).addBox(-7.0F, -8.0F, -1.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, -4.0F));

        PartDefinition cube_r10 = upper_jaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 58).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -8.0F, -1.0F, -1.1345F, 0.0F, 0.0F));

        PartDefinition bone23 = head.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -2.0F, -5.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(33, 15).addBox(-4.0F, -11.0F, -3.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, -1.0F));

        PartDefinition bone28 = bone23.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(0, 46).addBox(-4.0F, -11.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -2.0F, 0.0F));

        PartDefinition cube_r11 = bone28.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(75, 39).addBox(-4.0F, -5.0F, -1.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 0.0F, -1.0F, 0.0F, 1.5708F, -0.2182F));

        PartDefinition lower_body = model.addOrReplaceChild("lower_body", CubeListBuilder.create().texOffs(25, 45).addBox(6.0F, -9.0F, -1.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -6.0F, 0.0F));

        PartDefinition left_leg = lower_body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(75, 33).addBox(12.0F, -6.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone24 = left_leg.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(50, 49).addBox(11.0F, -3.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(0, 34).addBox(11.0F, 3.0F, -4.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_leg = model.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(38, 53).addBox(6.0F, -6.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -6.0F, 0.0F));

        PartDefinition bone26 = right_leg.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(21, 53).addBox(5.0F, -3.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(33, 33).addBox(5.0F, 3.0F, -4.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition model2 = partdefinition.addOrReplaceChild("model2", CubeListBuilder.create(), PartPose.offset(-10.0F, -2.0F, -1.0F));

        PartDefinition body2 = model2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 2.0F));

        PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 90).addBox(-4.0F, -4.0F, -1.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone29 = body2.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 0.0F));

        PartDefinition cube_r13 = bone29.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(110, 107).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3927F));

        PartDefinition right_wing = body2.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.0F, -2.0F));

        PartDefinition cube_r14 = right_wing.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 99).addBox(-4.0F, -4.0F, -2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition left_wing = body2.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offset(2.0F, -2.0F, -2.0F));

        PartDefinition cube_r15 = left_wing.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(97, 104).addBox(-4.0F, -4.0F, -2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 2.0F));

        PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 99).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.8727F, 1.5708F));

        PartDefinition head2 = body2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(108, 91).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -3.0F));

        PartDefinition cube_r17 = head2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 115).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 115).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(88, 104).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r18 = head2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(113, 111).addBox(0.0F, -7.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone30 = model2.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(100, 109).addBox(-0.5F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 2.0F));

        PartDefinition cube_r19 = bone30.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(107, 94).addBox(-3.0F, -4.0F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.0F, -3.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone31 = model2.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(105, 109).addBox(-0.5F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 2.0F));

        PartDefinition cube_r20 = bone31.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 109).addBox(-3.0F, -4.0F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.0F, -3.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(animatronicRenderState state) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(state.yRot, state.xRot);


        this.idlinganimation.apply(state.idleanimationstate, state.ageInTicks, 1f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }

}
