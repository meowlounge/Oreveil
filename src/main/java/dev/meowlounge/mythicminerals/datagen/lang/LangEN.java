package dev.meowlounge.mythicminerals.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LangEN extends FabricLanguageProvider {
	public LangEN(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, "en_us", registryLookup);
	}

	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
		translationBuilder.add("mythicminerals", "MythicMinerals");

		//* ---------------------- //

		translationBuilder.add("block.mythicminerals.frostium_ore", "Frostium Ore");
		translationBuilder.add("block.mythicminerals.deepslate_frostium_ore", "Deepslate Frostium Ore");
		translationBuilder.add("block.mythicminerals.raw_frostium_block", "Raw Frostium Block");
		translationBuilder.add("block.mythicminerals.frostium_block", "Frostium Block");

		translationBuilder.add("item.mythicminerals.frostium", "Frostium");
		translationBuilder.add("item.mythicminerals.raw_frostium", "Raw Frostium");
		translationBuilder.add("item.mythicminerals.frostium_sword", "Frostium Sword");
		translationBuilder.add("item.mythicminerals.frostium_shovel", "Frostium Shovel");
		translationBuilder.add("item.mythicminerals.frostium_pickaxe", "Frostium Pickaxe");
		translationBuilder.add("item.mythicminerals.frostium_axe", "Frostium Axe");
		translationBuilder.add("item.mythicminerals.frostium_hoe", "Frostium Hoe");
		translationBuilder.add("item.mythicminerals.frostium_helmet", "Frostium Helmet");
		translationBuilder.add("item.mythicminerals.frostium_chestplate", "Frostium Chestplate");
		translationBuilder.add("item.mythicminerals.frostium_leggings", "Frostium Leggings");
		translationBuilder.add("item.mythicminerals.frostium_boots", "Frostium Boots");

		//* ---------------------- //

		translationBuilder.add("block.mythicminerals.voidstone_ore", "Voidstone Ore");
		translationBuilder.add("block.mythicminerals.raw_voidstone_block", "Raw Voidstone Block");
		translationBuilder.add("block.mythicminerals.voidstone_block", "Voidstone Block");

		translationBuilder.add("item.mythicminerals.voidstone", "Voidstone");
		translationBuilder.add("item.mythicminerals.raw_voidstone", "Raw Voidstone");
		translationBuilder.add("item.mythicminerals.voidstone_sword", "Voidstone Sword");
		translationBuilder.add("item.mythicminerals.voidstone_shovel", "Voidstone Shovel");
		translationBuilder.add("item.mythicminerals.voidstone_pickaxe", "Voidstone Pickaxe");
		translationBuilder.add("item.mythicminerals.voidstone_axe", "Voidstone Axe");
		translationBuilder.add("item.mythicminerals.voidstone_hoe", "Voidstone Hoe");
		translationBuilder.add("item.mythicminerals.voidstone_helmet", "Voidstone Helmet");
		translationBuilder.add("item.mythicminerals.voidstone_chestplate", "Voidstone Chestplate");
		translationBuilder.add("item.mythicminerals.voidstone_leggings", "Voidstone Leggings");
		translationBuilder.add("item.mythicminerals.voidstone_boots", "Voidstone Boots");

		//* ---------------------- //

		translationBuilder.add("block.mythicminerals.stellarium_ore", "Stellarium Ore");
		translationBuilder.add("block.mythicminerals.stellarium_block", "Stellarium Block");

		translationBuilder.add("item.mythicminerals.stellarium", "Stellarium");
		translationBuilder.add("item.mythicminerals.stellarium_upgrade_smithing_template", "Stellarium Smithing Template");
		translationBuilder.add("item.mythicminerals.stellarium_scrap", "Stellarium Scrap");
		translationBuilder.add("item.mythicminerals.stellarium_sword", "Stellarium Sword");
		translationBuilder.add("item.mythicminerals.stellarium_shovel", "Stellarium Shovel");
		translationBuilder.add("item.mythicminerals.stellarium_pickaxe", "Stellarium Pickaxe");
		translationBuilder.add("item.mythicminerals.stellarium_axe", "Stellarium Axe");
		translationBuilder.add("item.mythicminerals.stellarium_hoe", "Stellarium Hoe");
		translationBuilder.add("item.mythicminerals.stellarium_helmet", "Stellarium Helmet");
		translationBuilder.add("item.mythicminerals.stellarium_chestplate", "Stellarium Chestplate");
		translationBuilder.add("item.mythicminerals.stellarium_leggings", "Stellarium Leggings");
		translationBuilder.add("item.mythicminerals.stellarium_boots", "Stellarium Boots");

		//* ---------------------- //

		translationBuilder.add("block.mythicminerals.fogstone_ore", "Fogstone Ore");
		translationBuilder.add("block.mythicminerals.deepslate_fogstone_ore", "Deepslate Fogstone Ore");
		translationBuilder.add("block.mythicminerals.raw_fogstone_block", "Raw Fogstone Block");
		translationBuilder.add("block.mythicminerals.fogstone_block", "Fogstone Block");

		translationBuilder.add("item.mythicminerals.fogstone", "Fogstone");
		translationBuilder.add("item.mythicminerals.raw_fogstone", "Raw Fogstone");
		translationBuilder.add("item.mythicminerals.fogstone_sword", "Fogstone Sword");
		translationBuilder.add("item.mythicminerals.fogstone_shovel", "Fogstone Shovel");
		translationBuilder.add("item.mythicminerals.fogstone_pickaxe", "Fogstone Pickaxe");
		translationBuilder.add("item.mythicminerals.fogstone_axe", "Fogstone Axe");
		translationBuilder.add("item.mythicminerals.fogstone_hoe", "Fogstone Hoe");
		translationBuilder.add("item.mythicminerals.fogstone_helmet", "Fogstone Helmet");
		translationBuilder.add("item.mythicminerals.fogstone_chestplate", "Fogstone Chestplate");
		translationBuilder.add("item.mythicminerals.fogstone_leggings", "Fogstone Leggings");
		translationBuilder.add("item.mythicminerals.fogstone_boots", "Fogstone Boots");

		//* ---------------------- //

		translationBuilder.add("block.mythicminerals.pyrostone_ore", "Pyrostone Ore");
		translationBuilder.add("block.mythicminerals.raw_pyrostone_block", "Raw Pyrostone Block");
		translationBuilder.add("block.mythicminerals.pyrostone_block", "Pyrostone Block");

		translationBuilder.add("item.mythicminerals.pyrostone", "Pyrostone");
		translationBuilder.add("item.mythicminerals.raw_pyrostone", "Raw Pyrostone");
		translationBuilder.add("item.mythicminerals.pyrostone_sword", "Pyrostone Sword");
		translationBuilder.add("item.mythicminerals.pyrostone_shovel", "Pyrostone Shovel");
		translationBuilder.add("item.mythicminerals.pyrostone_pickaxe", "Pyrostone Pickaxe");
		translationBuilder.add("item.mythicminerals.pyrostone_axe", "Pyrostone Axe");
		translationBuilder.add("item.mythicminerals.pyrostone_hoe", "Pyrostone Hoe");
		translationBuilder.add("item.mythicminerals.pyrostone_helmet", "Pyrostone Helmet");
		translationBuilder.add("item.mythicminerals.pyrostone_chestplate", "Pyrostone Chestplate");
		translationBuilder.add("item.mythicminerals.pyrostone_leggings", "Pyrostone Leggings");
		translationBuilder.add("item.mythicminerals.pyrostone_boots", "Pyrostone Boots");

		//* ---------------------- //

		translationBuilder.add("mythicminerals.item_group_ore", "MythicMinerals");

		//* ---------------------- //

		translationBuilder.add("item.minecraft.smithing_template.applies_to.netherite", "Netherite Equipment");
		translationBuilder.add("item.minecraft.smithing_template.base_slot_description", "Add Netherite armor, weapon or tool");
		translationBuilder.add("item.mythicminerals.stellarium_upgrade_smithing_template.additions_slot_description", "Add Stellarium");

		//* ---------------------- //

		translationBuilder.add("item.mythicminerals.frostium_ore_locator", "Frostium Locator");
		translationBuilder.add("item.mythicminerals.fogstone_ore_locator", "Fogstone Locator");
		translationBuilder.add("item.mythicminerals.voidstone_ore_locator", "Voidstone Locator");
		translationBuilder.add("item.mythicminerals.stellarium_ore_locator", "Stellarium Locator");
		translationBuilder.add("item.mythicminerals.pyrostone_ore_locator", "Pyrostone Locator");

		//* ---------------------- //

		translationBuilder.add("key.mythicminerals.boost", "Stellarium Armor Boost");

		//* ---------------------- //

		translationBuilder.add("enchantment.mythicminerals.lava_walker", "Lava Walker");
	}

	@Override
	public String getName() {
		return "⛏️ [MythicMinerals]: English Lang Generator";
	}
}
