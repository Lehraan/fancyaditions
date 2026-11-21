package net.lehraan.fancyaditions.entity.client;

import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.entity.custom.AnimatronicEntity;
import net.lehraan.fancyaditions.entity.custom.CrateEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class CrateRenderer extends MobRenderer<CrateEntity, CrateRenderState, CrateModel> {
    public CrateRenderer(EntityRendererProvider.Context context) {
        super(context, new CrateModel(context.bakeLayer(ModModelLayerLocations.CRATE)), 0.45f);
    }



    @Override
    public Identifier getTextureLocation(CrateRenderState state) {
        return Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "textures/entity/crate/crate.png");
    }

    @Override
    public CrateRenderState createRenderState() {
        return new CrateRenderState();
    }

    @Override
    public void extractRenderState(CrateEntity entity, CrateRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleanimationstate.copyFrom(entity.idleAnimationState);
    }
}
