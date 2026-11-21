package net.lehraan.fancyaditions.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.entity.ModEntities;
import net.lehraan.fancyaditions.item.custom.GlassJarItem;
import net.lehraan.fancyaditions.item.custom.GoldenShears;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {

    public static final Item Jar = registerItem("jar", GlassJarItem::new);
    public static final Item BLUESTONE = registerItem("bluestone", Item::new);
    public static final Item GREENSTONE = registerItem("greenstone", Item::new);


    public static final Item GOLDEN_SHEARS = registerItem("golden_shears",
            properties -> new GoldenShears(
                    properties.durability(100)
                            .component(DataComponents.TOOL, ShearsItem.createToolProperties())
            )
    );

    public static final Item staff = registerItem("staff",
            properties -> new Item(properties.spear(ToolMaterial.WOOD, 0.95F, 0.95F, 0.6F,
                    2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F)));

    public static final Item ANIMATRONIC_SPAWN_EGG = registerItem("animatronic_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(ModEntities.ANIMATRONIC)));
    public static final Item CRATE_SPAWN_EGG = registerItem("crate_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(ModEntities.CRATE)));
    public static final Item BIGBEETLE_SPAWN_EGG = registerItem("bigbeetle_spawn_egg",
            properties -> new SpawnEggItem(properties.spawnEgg(ModEntities.BIG_BEETLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, name)))));
    }



    public static void registerModItems() {
        FancyAditions.LOGGER.info("Registering Mod Items for " + FancyAditions.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {


        });
    }
}
