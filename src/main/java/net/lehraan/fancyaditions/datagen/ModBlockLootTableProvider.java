package net.lehraan.fancyaditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.lehraan.fancyaditions.block.ModBlocks;
import net.lehraan.fancyaditions.item.ModItems;
import net.lehraan.fancyaditions.block.ModBlocks;
import net.lehraan.fancyaditions.item.ModItems;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        add(ModBlocks.Glass_jar, createOreDrop(ModBlocks.Glass_jar, net.lehraan.fancyaditions.item.ModItems.Jar));


    }
}
