package net.lehraan.fancyaditions.block;

import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.block.custom.BluestoneBlock;
import net.lehraan.fancyaditions.block.custom.GlassJarBlock;
import net.lehraan.fancyaditions.block.custom.GreenstoneBlock;
import net.lehraan.fancyaditions.block.custom.HorisontalFacingBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Function;

public class ModBlocks {
    public static final Block Glass_jar = registerBlock("glass_jar",
            properties -> new GlassJarBlock(properties.strength(0.01f)
                    .sound(SoundType.GLASS).noOcclusion()));

    public static final Block BLUESTONE_BLOCK = registerBlock("bluestone_block",
            properties -> new BluestoneBlock(properties.strength(2f)
                    .sound(SoundType.METAL)));
    public static final Block GREENSTONE_BLOCK = registerBlock("greenstone_block",
            properties -> new GreenstoneBlock(properties.strength(2f)
                    .sound(SoundType.METAL)));
    public static final Block CORRUPTED_GRASS = registerBlock("corrupted_grass",
            properties -> new HorisontalFacingBlock(properties.strength(2f)
                    .sound(SoundType.GRASS)));
    public static final Block LARVIKITE = registerBlock("larvikite",
            properties -> new Block(properties.strength(2f)
                    .sound(SoundType.STONE)));

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            properties -> new Block(properties.strength(2f)
                    .sound(SoundType.DRIPSTONE_BLOCK)));
    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            properties -> new Block(properties.strength(2f)
                    .sound(SoundType.DRIPSTONE_BLOCK)));

    public static final Block WITHERED_PUMPKIN = registerBlock("withered_pumpkin",
            properties -> new Block(properties.strength(2f)
                    .sound(SoundType.WOOD)));

    public static final Block CARVED_WITHERED_PUMPKIN = registerBlock("carved_withered_pumpkin",
            properties -> new HorisontalFacingBlock(properties.strength(2f)
                    .sound(SoundType.WOOD)));
    public static final Block CARVED_PUMPKIN_CREEPER = registerBlock("carved_pumpkin_creeper",
            properties -> new HorisontalFacingBlock(properties.strength(2f)
                    .sound(SoundType.WOOD)));




    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        FancyAditions.LOGGER.info("Registering Mod Blocks for " + FancyAditions.MOD_ID);
    }

}
