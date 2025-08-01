package dev.meowlounge.mythicminerals.datagen.loot_table;

import dev.meowlounge.mythicminerals.block.*;
import dev.meowlounge.mythicminerals.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class OreLoot extends FabricBlockLootTableProvider {
	public OreLoot(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {
		addDrop(FrostiumBlocks.FROSTIUM_BLOCK);
		addDrop(FrostiumBlocks.RAW_FROSTIUM_BLOCK);
		addDrop(FrostiumBlocks.FROSTIUM_ORE, oreDrops(FrostiumBlocks.FROSTIUM_ORE, FrostiumItems.RAW_FROSTIUM));
		addDrop(FrostiumBlocks.DEEPSLATE_FROSTIUM_ORE, multipleOreDrops(FrostiumBlocks.DEEPSLATE_FROSTIUM_ORE, FrostiumItems.RAW_FROSTIUM, 1, 1));

		//* ---------------------- //

		addDrop(VoidstoneBlocks.VOIDSTONE_BLOCK);
		addDrop(VoidstoneBlocks.RAW_VOIDSTONE_BLOCK);
		addDrop(VoidstoneBlocks.VOIDSTONE_ORE, oreDrops(VoidstoneBlocks.VOIDSTONE_ORE, VoidstoneItems.RAW_VOIDSTONE));

		//* ---------------------- //

		addDrop(PyrostoneBlocks.PYROSTONE_BLOCK);
		addDrop(PyrostoneBlocks.RAW_PYROSTONE_BLOCK);
		addDrop(PyrostoneBlocks.PYROSTONE_ORE, oreDrops(PyrostoneBlocks.PYROSTONE_ORE, PyrostoneItems.RAW_PYROSTONE));

		//* ---------------------- //

		addDrop(MagmaritBlocks.MAGMARIT_BLOCK);
		addDrop(MagmaritBlocks.RAW_MAGMARIT_BLOCK);
		addDrop(MagmaritBlocks.MAGMARIT_ORE, oreDrops(MagmaritBlocks.MAGMARIT_ORE, MagmaritItems.RAW_MAGMARIT));

		//* ---------------------- //

		addDrop(FogstoneBlocks.FOGSTONE_BLOCK);
		addDrop(FogstoneBlocks.RAW_FOGSTONE_BLOCK);
		addDrop(FogstoneBlocks.FOGSTONE_ORE, oreDrops(FogstoneBlocks.FOGSTONE_ORE, FogstoneItems.RAW_FOGSTONE));

		//* ---------------------- //

		addDrop(StellariumBlocks.STELLARIUM_BLOCK);
		addDrop(StellariumBlocks.STELLARIUM_ORE, oreDrops(StellariumBlocks.STELLARIUM_ORE, StellariumItems.STELLARIUM_SCRAP));
	}

	public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
		RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
		return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
				ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
				.apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
	}
}