package dev.meowlounge.mythicminerals.group;

import dev.meowlounge.mythicminerals.MythicMinerals;
import dev.meowlounge.mythicminerals.block.*;
import dev.meowlounge.mythicminerals.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {
	public static final RegistryKey<net.minecraft.item.ItemGroup> MM_GROUP_KEY = RegistryKey.of(
			Registries.ITEM_GROUP.getKey(),
			Identifier.of(MythicMinerals.MOD_ID, "mythicminerals_ores")
	);

	@SuppressWarnings("unused")
	public static final net.minecraft.item.ItemGroup MM_ITEM_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			MM_GROUP_KEY.getValue(),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(StellariumBlocks.STELLARIUM_ORE))
					.displayName(Text.translatable("mythicminerals"))
					.entries((displayContext, entries) -> {
						entries.add(FrostiumItems.FROSTIUM);
						entries.add(FrostiumItems.RAW_FROSTIUM);

						entries.add(FrostiumItems.FROSTIUM_HELMET);
						entries.add(FrostiumItems.FROSTIUM_CHESTPLATE);
						entries.add(FrostiumItems.FROSTIUM_LEGGINGS);
						entries.add(FrostiumItems.FROSTIUM_BOOTS);

						entries.add(FrostiumItems.FROSTIUM_SWORD);
						entries.add(FrostiumItems.FROSTIUM_PICKAXE);
						entries.add(FrostiumItems.FROSTIUM_AXE);
						entries.add(FrostiumItems.FROSTIUM_SHOVEL);
						entries.add(FrostiumItems.FROSTIUM_HOE);

						entries.add(FrostiumBlocks.FROSTIUM_ORE);
						entries.add(FrostiumBlocks.DEEPSLATE_FROSTIUM_ORE);
						entries.add(FrostiumBlocks.RAW_FROSTIUM_BLOCK);
						entries.add(FrostiumBlocks.FROSTIUM_BLOCK);

						//* ---------------------- //

						entries.add(PyrostoneItems.PYROSTONE);
						entries.add(PyrostoneItems.RAW_PYROSTONE);

						entries.add(PyrostoneItems.PYROSTONE_HELMET);
						entries.add(PyrostoneItems.PYROSTONE_CHESTPLATE);
						entries.add(PyrostoneItems.PYROSTONE_LEGGINGS);
						entries.add(PyrostoneItems.PYROSTONE_BOOTS);

						entries.add(PyrostoneItems.PYROSTONE_SWORD);
						entries.add(PyrostoneItems.PYROSTONE_PICKAXE);
						entries.add(PyrostoneItems.PYROSTONE_AXE);
						entries.add(PyrostoneItems.PYROSTONE_SHOVEL);
						entries.add(PyrostoneItems.PYROSTONE_HOE);

						entries.add(PyrostoneBlocks.PYROSTONE_ORE);
						entries.add(PyrostoneBlocks.RAW_PYROSTONE_BLOCK);
						entries.add(PyrostoneBlocks.PYROSTONE_BLOCK);

						//* ---------------------- //

						entries.add(MagmaritItems.MAGMARIT);
						entries.add(MagmaritItems.RAW_MAGMARIT);

						entries.add(MagmaritItems.MAGMARIT_HELMET);
						entries.add(MagmaritItems.MAGMARIT_CHESTPLATE);
						entries.add(MagmaritItems.MAGMARIT_LEGGINGS);
						entries.add(MagmaritItems.MAGMARIT_BOOTS);

						entries.add(MagmaritItems.MAGMARIT_SWORD);
						entries.add(MagmaritItems.MAGMARIT_PICKAXE);
						entries.add(MagmaritItems.MAGMARIT_AXE);
						entries.add(MagmaritItems.MAGMARIT_SHOVEL);
						entries.add(MagmaritItems.MAGMARIT_HOE);

						entries.add(MagmaritBlocks.MAGMARIT_ORE);
						entries.add(MagmaritBlocks.RAW_MAGMARIT_BLOCK);
						entries.add(MagmaritBlocks.MAGMARIT_BLOCK);

						//* ---------------------- //

						entries.add(VoidstoneItems.VOIDSTONE);
						entries.add(VoidstoneItems.RAW_VOIDSTONE);

						entries.add(VoidstoneItems.VOIDSTONE_HELMET);
						entries.add(VoidstoneItems.VOIDSTONE_CHESTPLATE);
						entries.add(VoidstoneItems.VOIDSTONE_LEGGINGS);
						entries.add(VoidstoneItems.VOIDSTONE_BOOTS);

						entries.add(VoidstoneItems.VOIDSTONE_SWORD);
						entries.add(VoidstoneItems.VOIDSTONE_PICKAXE);
						entries.add(VoidstoneItems.VOIDSTONE_AXE);
						entries.add(VoidstoneItems.VOIDSTONE_SHOVEL);
						entries.add(VoidstoneItems.VOIDSTONE_HOE);

						entries.add(VoidstoneBlocks.VOIDSTONE_ORE);
						entries.add(VoidstoneBlocks.RAW_VOIDSTONE_BLOCK);
						entries.add(VoidstoneBlocks.VOIDSTONE_BLOCK);

						//* ---------------------- //

						entries.add(StellariumItems.STELLARIUM);
						entries.add(StellariumItems.STELLARIUM_SCRAP);

						entries.add(StellariumItems.STELLARIUM_HELMET);
						entries.add(StellariumItems.STELLARIUM_CHESTPLATE);
						entries.add(StellariumItems.STELLARIUM_LEGGINGS);
						entries.add(StellariumItems.STELLARIUM_BOOTS);

						entries.add(StellariumItems.STELLARIUM_SWORD);
						entries.add(StellariumItems.STELLARIUM_PICKAXE);
						entries.add(StellariumItems.STELLARIUM_AXE);
						entries.add(StellariumItems.STELLARIUM_SHOVEL);
						entries.add(StellariumItems.STELLARIUM_HOE);

						entries.add(StellariumItems.STELLARIUM_UPGRADE_SMITHING_TEMPLATE);

						entries.add(StellariumBlocks.STELLARIUM_ORE);
						entries.add(StellariumBlocks.STELLARIUM_BLOCK);

						//* ---------------------- //

						entries.add(FogstoneItems.FOGSTONE);
						entries.add(FogstoneItems.RAW_FOGSTONE);

						entries.add(FogstoneItems.FOGSTONE_HELMET);
						entries.add(FogstoneItems.FOGSTONE_CHESTPLATE);
						entries.add(FogstoneItems.FOGSTONE_LEGGINGS);
						entries.add(FogstoneItems.FOGSTONE_BOOTS);

						entries.add(FogstoneItems.FOGSTONE_SWORD);
						entries.add(FogstoneItems.FOGSTONE_PICKAXE);
						entries.add(FogstoneItems.FOGSTONE_AXE);
						entries.add(FogstoneItems.FOGSTONE_SHOVEL);
						entries.add(FogstoneItems.FOGSTONE_HOE);

						entries.add(FogstoneBlocks.FOGSTONE_ORE);
						entries.add(FogstoneBlocks.DEEPSLATE_FOGSTONE_ORE);
						entries.add(FogstoneBlocks.RAW_FOGSTONE_BLOCK);
						entries.add(FogstoneBlocks.FOGSTONE_BLOCK);
					})
					.build()
	);

	@SuppressWarnings("EmptyMethod")
	public static void registerItemGroup() {
		//? registration triggered on class load
	}
}
