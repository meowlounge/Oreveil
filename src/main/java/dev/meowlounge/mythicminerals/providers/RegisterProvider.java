package dev.meowlounge.mythicminerals.providers;

import dev.meowlounge.mythicminerals.MythicMinerals;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class RegisterProvider {
	public static Item registerItem(String name, Function<Item.Settings, Item> function) {
		return Registry.register(Registries.ITEM,
				Identifier.of(MythicMinerals.MOD_ID, name),
				function.apply(new Item.Settings().registryKey(
						RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MythicMinerals.MOD_ID, name)))
				)
		);
	}

	public static RegistryKey<Item> createItemKey(String name) {
		return RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(MythicMinerals.MOD_ID, name));
	}

	//* ---------------------- //

	public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
		Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MythicMinerals.MOD_ID, name))));
		registerBlockItem(name, toRegister);
		return Registry.register(Registries.BLOCK, Identifier.of(MythicMinerals.MOD_ID, name), toRegister);
	}

	public static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(MythicMinerals.MOD_ID, name),
				new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
						.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MythicMinerals.MOD_ID, name)))));
	}
}
