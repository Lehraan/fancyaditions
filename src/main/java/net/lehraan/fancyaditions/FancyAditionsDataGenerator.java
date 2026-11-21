package net.lehraan.fancyaditions;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.lehraan.fancyaditions.datagen.ModBlockLootTableProvider;
import net.lehraan.fancyaditions.datagen.ModEntityLootTableProvider;
import net.lehraan.fancyaditions.datagen.ModModelProvider;

public class FancyAditionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModEntityLootTableProvider::new);

	}
}
