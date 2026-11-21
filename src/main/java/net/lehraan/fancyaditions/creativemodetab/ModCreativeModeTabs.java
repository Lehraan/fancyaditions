package net.lehraan.fancyaditions.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.block.ModBlocks;
import net.lehraan.fancyaditions.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab HALLOWEEN_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "halloween_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDEN_SHEARS))
                    .title(Component.translatable("creativemodetab.fancyaditions.halloween_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GOLDEN_SHEARS);
                        output.accept(ModBlocks.WITHERED_PUMPKIN);
                        output.accept(ModBlocks.CARVED_WITHERED_PUMPKIN);
                        output.accept(ModBlocks.CARVED_PUMPKIN_CREEPER);



                    }).build());


    public static final CreativeModeTab FANCY_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "fancy_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DRIPSTONE_BRICKS))
                    .title(Component.translatable("creativemodetab.fancyaditions.fancy_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.DRIPSTONE_BRICKS);
                        output.accept(ModBlocks.CHISELED_DRIPSTONE);
                        output.accept(ModItems.Jar);
                        output.accept(ModItems.staff);
                        output.accept(ModBlocks.BLUESTONE_BLOCK);
                        output.accept(ModItems.CRATE_SPAWN_EGG);






                    }).build());

    public static final CreativeModeTab SIRCUS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "sircus"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANIMATRONIC_SPAWN_EGG))
                    .title(Component.translatable("creativemodetab.fancyaditions.sircus"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ANIMATRONIC_SPAWN_EGG);



                    }).build());


    public static void registerModCreativeModeTabs() {
        FancyAditions.LOGGER.info("Registering Creative Mode Tabs for " + FancyAditions.MOD_ID);
    }
}
