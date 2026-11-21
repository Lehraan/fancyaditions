package net.lehraan.fancyaditions.datagen;

import io.netty.util.ConstantPool;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricEntityLootSubProvider;
import net.lehraan.fancyaditions.entity.ModEntities;
import net.lehraan.fancyaditions.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.floats.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.floats.UniformGenerator;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.concurrent.CompletableFuture;

public class ModEntityLootTableProvider extends FabricEntityLootSubProvider {
    public ModEntityLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate() {
        this.add(ModEntities.CRATE,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                // Common "Fish" tier (Weight 85)
                                .add(LootItem.lootTableItem(Items.COD)
                                        .setWeight(60)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 3))))
                                .add(LootItem.lootTableItem(Items.SALMON)
                                        .setWeight(60)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 3))))
                                .add(LootItem.lootTableItem(Items.TROPICAL_FISH)
                                        .setWeight(60)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(0, 6))))
                                .add(LootItem.lootTableItem(Items.PUFFERFISH)
                                        .setWeight(60)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2))))
                                .add(LootItem.lootTableItem(Items.KELP)
                                        .setWeight(60)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2))))



                                //uncommon OceanLoot
                                .add(LootItem.lootTableItem(Items.NAUTILUS_SHELL)
                                        .setWeight(30)
                                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 3))))


                                // "Junk" tier (Weight 10, negative quality = less likely with Luck)
                                .add(LootItem.lootTableItem(Items.NAME_TAG)
                                        .setWeight(10)
                                        .setQuality(2))


                                // Rare "Treasure" tier (Weight 5, positive quality = more likely with Luck)
                                .add(LootItem.lootTableItem(Items.SADDLE)
                                        .setWeight(5)
                                        .setQuality(2))
                                .add(LootItem.lootTableItem(Items.IRON_INGOT)
                                        .setWeight(5)
                                        .setQuality(2))
                                .add(LootItem.lootTableItem(Items.DIAMOND)
                                        .setWeight(5)
                                        .setQuality(2))


                        ));


    }
}
