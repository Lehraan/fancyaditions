package net.lehraan.fancyaditions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.lehraan.fancyaditions.entity.ModEntities;
import net.lehraan.fancyaditions.entity.client.*;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class FancyAditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.ANIMATRONIC, animatronicModel::createBodyLayer);
        EntityRenderers.register(ModEntities.ANIMATRONIC, animatronicRenderer::new);

        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.CRATE, CrateModel::createBodyLayer);
        EntityRenderers.register(ModEntities.CRATE, CrateRenderer::new);

        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.BIGBEETLE, CrateModel::createBodyLayer);
        EntityRenderers.register(ModEntities.BIG_BEETLE, BigBeatleRenderer::new);
    }
}
