package net.lehraan.fancyaditions.entity.client;

import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.entity.custom.BigBeatleEntity;
import net.lehraan.fancyaditions.entity.custom.CrateEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class BigBeatleRenderer extends MobRenderer<BigBeatleEntity, BigBeatleRenderState, BigBeatleModel> {
    public BigBeatleRenderer(EntityRendererProvider.Context context) {
        super(context, new BigBeatleModel(context.bakeLayer(ModModelLayerLocations.BIGBEETLE)), 0.9f);
    }

    @Override
    public Identifier getTextureLocation(BigBeatleRenderState state) {
        return Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "textures/entity/bigbeetle/bigbeetle.png");
    }

    @Override
    public BigBeatleRenderState createRenderState() {
        return new BigBeatleRenderState();
    }

    @Override
    public void extractRenderState(BigBeatleEntity entity, BigBeatleRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleanimationstate.copyFrom(entity.idleAnimationState);
    }
}
