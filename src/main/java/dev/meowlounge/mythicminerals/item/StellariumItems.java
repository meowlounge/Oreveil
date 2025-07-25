package dev.meowlounge.mythicminerals.item;

import dev.meowlounge.mythicminerals.MythicMinerals;
import dev.meowlounge.mythicminerals.logic.armor.stellarium.StellariumLogic;
import dev.meowlounge.mythicminerals.providers.TagsProvider;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

import static dev.meowlounge.mythicminerals.providers.RegisterProvider.createItemKey;
import static dev.meowlounge.mythicminerals.providers.RegisterProvider.registerItem;

public class StellariumItems {
	public static final ToolMaterial STELLARIUM_TOOL_MATERIAL = new ToolMaterial(
			BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 25.0F, 3.0F, 15, TagsProvider.Items.STELLARIUM_REPAIR
	);

	public static final Item STELLARIUM_SCRAP = registerItem("stellarium_scrap",
			settings -> new Item(settings.component(DataComponentTypes.RARITY, Rarity.RARE)));

	public static final Item STELLARIUM = registerItem("stellarium",
			settings -> new Item(settings.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_SWORD = registerItem("stellarium_sword",
			settings -> new Item(settings.sword(STELLARIUM_TOOL_MATERIAL, 7, -2.2F)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_SHOVEL = registerItem("stellarium_shovel",
			settings -> new ShovelItem(STELLARIUM_TOOL_MATERIAL, -0.5F, -3,
					settings.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_PICKAXE = registerItem("stellarium_pickaxe",
			settings -> new Item(settings.pickaxe(STELLARIUM_TOOL_MATERIAL, -0.5F, -3)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_AXE = registerItem("stellarium_axe",
			settings -> new AxeItem(STELLARIUM_TOOL_MATERIAL, 8, -2.8F,
					settings.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_HOE = registerItem("stellarium_hoe",
			settings -> new HoeItem(STELLARIUM_TOOL_MATERIAL, -0.5F, -3,
					settings.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	// ---------------------- //

	public static final Item STELLARIUM_HELMET = registerItem("stellarium_helmet",
			settings -> new StellariumLogic(settings.armor(Armor.STELLARIUM_ARMOR_MATERIAL, EquipmentType.HELMET)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_CHESTPLATE = registerItem("stellarium_chestplate",
			settings -> new Item(settings.armor(Armor.STELLARIUM_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_LEGGINGS = registerItem("stellarium_leggings",
			settings -> new Item(settings.armor(Armor.STELLARIUM_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	public static final Item STELLARIUM_BOOTS = registerItem("stellarium_boots",
			settings -> new Item(settings.armor(Armor.STELLARIUM_ARMOR_MATERIAL, EquipmentType.BOOTS)
					.component(DataComponentTypes.RARITY, Rarity.EPIC)));

	// ---------------------- //

	public static final Item STELLARIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("stellarium_upgrade_smithing_template",
			settings -> new SmithingTemplateItem(
					Text.translatable("item.minecraft.smithing_template.applies_to.netherite").fillStyle(Style.EMPTY.withColor(Formatting.BLUE)),
					Text.literal("Stellarium").fillStyle(Style.EMPTY.withColor(Formatting.BLUE)),
					Text.translatable("item.minecraft.smithing_template.base_slot_description").fillStyle(Style.EMPTY.withColor(Formatting.BLUE)),
					Text.translatable("item.mythicminerals.stellarium_upgrade_smithing_template.additions_slot_description").fillStyle(Style.EMPTY.withColor(Formatting.BLUE)),
					List.of(
							Identifier.ofVanilla("container/slot/sword"),
							Identifier.ofVanilla("container/slot/pickaxe"),
							Identifier.ofVanilla("container/slot/axe"),
							Identifier.ofVanilla("container/slot/hoe"),
							Identifier.ofVanilla("container/slot/shovel"),
							Identifier.ofVanilla("container/slot/armor")
					),
					List.of(
							Identifier.ofVanilla("container/slot/ingot")
					),
					new Item.Settings()
							.registryKey(createItemKey("stellarium_upgrade_smithing_template"))
							.rarity(Rarity.EPIC)
			));

	public static void registerStellariumItems() {
		MythicMinerals.LOGGER.info("⛏️ [MythicMinerals]: Registering Stellarium Items");
	}
}
