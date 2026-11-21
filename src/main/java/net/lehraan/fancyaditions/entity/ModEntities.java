package net.lehraan.fancyaditions.entity;

import net.lehraan.fancyaditions.FancyAditions;
import net.lehraan.fancyaditions.entity.custom.AnimatronicEntity;
import net.lehraan.fancyaditions.entity.custom.BigBeatleEntity;
import net.lehraan.fancyaditions.entity.custom.CrateEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {

    public static final ResourceKey<EntityType<?>> ANIMATRONIC_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "animatronic"));
    public static final ResourceKey<EntityType<?>> CRATE_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "crate"));
    public static final ResourceKey<EntityType<?>> BIG_BEATLE_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "bigbeetle"));

    public static final EntityType<AnimatronicEntity> ANIMATRONIC = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "animatronic"),
            EntityType.Builder.of(AnimatronicEntity::new, MobCategory.CREATURE).sized(0.75f, 0.5f).build(ANIMATRONIC_KEY));

    public static final EntityType<CrateEntity> CRATE =
            Registry.register(BuiltInRegistries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "crate"),
                    EntityType.Builder.of(CrateEntity::new, MobCategory.CREATURE)
                            .sized(0.75f, 0.5f).build(CRATE_KEY));

    public static final EntityType<BigBeatleEntity> BIG_BEETLE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID, "bigbeetle"),
            EntityType.Builder.of(BigBeatleEntity::new, MobCategory.CREATURE).sized(2.25f, 1.5f).build(BIG_BEATLE_KEY));




    public static void registerModEntities() {
        FancyAditions.LOGGER.info("Registering Mod Entities for " + FancyAditions.MOD_ID);
    }
}
