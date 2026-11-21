package net.lehraan.fancyaditions.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.lehraan.fancyaditions.block.ModBlocks;
import net.lehraan.fancyaditions.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.world.level.block.state.BlockState;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.DRIPSTONE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_DRIPSTONE);
        blockModelGenerators.createTrivialCube(ModBlocks.WITHERED_PUMPKIN);

        blockModelGenerators.createTrivialCube(ModBlocks.BLUESTONE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.GREENSTONE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.CORRUPTED_GRASS);
        blockModelGenerators.createTrivialCube(ModBlocks.LARVIKITE);




        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.Glass_jar);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.GOLDEN_SHEARS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.Jar, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLUESTONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GREENSTONE, ModelTemplates.FLAT_ITEM);


        itemModelGenerators.generateSpear(ModItems.staff);
        itemModelGenerators.generateFlatItem(ModItems.ANIMATRONIC_SPAWN_EGG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BIGBEETLE_SPAWN_EGG, ModelTemplates.FLAT_ITEM);

    }
}
