package dev.meowlounge.mythicminerals.world;

import dev.meowlounge.mythicminerals.MythicMinerals;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class PlacedFeatures {
	public static final RegistryKey<PlacedFeature> FROSTIUM_PLACED_KEY = registerKey("frostium_ore_placed");
	public static final RegistryKey<PlacedFeature> VOIDSTONE_PLACED_KEY = registerKey("voidstone_ore_placed");
	public static final RegistryKey<PlacedFeature> STELLARIUM_PLACED_KEY = registerKey("stellarium_ore_placed");
	public static final RegistryKey<PlacedFeature> FOGSTONE_PLACED_KEY = registerKey("fogstone_ore_placed");
	public static final RegistryKey<PlacedFeature> PYROSTONE_PLACED_KEY = registerKey("pyrostone_ore_placed");

	public static void bootstrap(Registerable<PlacedFeature> context) {
		var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, FROSTIUM_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.FROSTIUM_ORE_KEY),
				OrePlacement.modifiersWithCount(4,
						HeightRangePlacementModifier.trapezoid(YOffset.fixed(-20), YOffset.fixed(30))));

		register(context, VOIDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.VOIDSTONE_ORE_KEY),
				OrePlacement.modifiersWithCount(7,
						HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(50))));

		register(context, STELLARIUM_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.STELLARIUM_ORE_KEY),
				OrePlacement.modifiersWithCount(2,
						HeightRangePlacementModifier.trapezoid(YOffset.fixed(-10), YOffset.fixed(20))));

		register(context, FOGSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.FOGSTONE_ORE_KEY),
				OrePlacement.modifiersWithCount(8,
						HeightRangePlacementModifier.trapezoid(YOffset.fixed(-40), YOffset.fixed(40))));

		register(context, PYROSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PYROSTONE_ORE_KEY),
				OrePlacement.modifiersWithCount(3,
						HeightRangePlacementModifier.trapezoid(YOffset.fixed(12), YOffset.fixed(80))));
	}


	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MythicMinerals.MOD_ID, name));
	}

	private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
								 List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	@SuppressWarnings("unused")
	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
																				   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
																				   PlacementModifier... modifiers) {
		register(context, key, configuration, List.of(modifiers));
	}
}