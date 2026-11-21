package net.lehraan.fancyaditions;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lehraan.fancyaditions.block.ModBlocks;
import net.lehraan.fancyaditions.creativemodetab.ModCreativeModeTabs;
import net.lehraan.fancyaditions.entity.ModEntities;
import net.lehraan.fancyaditions.entity.custom.AnimatronicEntity;
import net.lehraan.fancyaditions.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FancyAditions implements ModInitializer {
	public static final String MOD_ID = "fancyaditions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.ANIMATRONIC, AnimatronicEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.CRATE, AnimatronicEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BIG_BEETLE, AnimatronicEntity.createAttributes());


	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
