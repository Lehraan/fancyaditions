package net.lehraan.fancyaditions.entity.client;

import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.entity.custom.AnimatronicEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

import javax.swing.text.html.parser.Entity;

import static net.minecraft.resources.Identifier.fromNamespaceAndPath;

public class animatronicRenderer extends MobRenderer<AnimatronicEntity, animatronicRenderState, animatronicModel> {
    public animatronicRenderer(EntityRendererProvider.Context context) {
        super(context, new animatronicModel(context.bakeLayer(ModModelLayerLocations.ANIMATRONIC)), 0.45f);
    }

    @Override
    public Identifier getTextureLocation(animatronicRenderState state) {
        return Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "textures/entity/animatronic/animatronic.png");
    }

    @Override
    public animatronicRenderState createRenderState() {
        return new animatronicRenderState();
    }

    @Override
    public void extractRenderState(AnimatronicEntity entity, animatronicRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleanimationstate.copyFrom(entity.idleAnimationState);
    }
}
