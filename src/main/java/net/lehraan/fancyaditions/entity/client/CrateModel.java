package net.lehraan.fancyaditions.entity.client;

import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class CrateModel extends EntityModel<CrateRenderState> {


    private final ModelPart bb_main;

    private final KeyframeAnimation idlinganimation;


    public CrateModel(ModelPart root) {
        super(root);
        this.bb_main = root.getChild("bb_main");

        this.idlinganimation=CrateAnimations.IDLE.bake(root);

    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }


    public void setupAnim(CrateRenderState state) {
        this.root().getAllParts().forEach(ModelPart::resetPose);



        this.idlinganimation.apply(state.idleanimationstate, state.ageInTicks, 1f);
    }

}
