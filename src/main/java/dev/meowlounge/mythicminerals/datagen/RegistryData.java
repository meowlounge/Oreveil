package dev.meowlounge.mythicminerals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RegistryData extends FabricDynamicRegistryProvider {
	public RegistryData(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
		entries.addAll(registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE));
		entries.addAll(registries.getOrThrow(RegistryKeys.PLACED_FEATURE));
		entries.addAll(registries.getOrThrow(RegistryKeys.BIOME));
		entries.addAll(registries.getOrThrow(RegistryKeys.ENCHANTMENT));
	}

	@Override
	public String getName() {
		return "⛏️ [MythicMinerals]: Registering Data";
	}
}