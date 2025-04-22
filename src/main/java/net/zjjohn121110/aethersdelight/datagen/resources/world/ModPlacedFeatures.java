package net.zjjohn121110.aethersdelight.datagen.resources.world;

import com.aetherteam.aether.world.placementmodifier.ImprovedLayerPlacementModifier;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.zjjohn121110.aethersdelight.AethersDelight;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ARKENIUM_ORE_PLACED_KEY = registerKey("arkenium_ore_placed");
    public static final ResourceKey<PlacedFeature> WILD_GINGER_PLACED_KEY = registerKey("wild_ginger_placed");
    public static final ResourceKey<PlacedFeature> WILD_PARSNIP_PLACED_KEY = registerKey("wild_parsnip_placed");
    public static final ResourceKey<PlacedFeature> WILD_LEEK_PLACED_KEY = registerKey("wild_leek_placed");
    public static final ResourceKey<PlacedFeature> PEPPERMINT_BUSH_PLACED_KEY = registerKey("peppermint_bush_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ARKENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AETHER_ARKENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(85))));

        register(context, WILD_GINGER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AETHER_WILD_GINGER_KEY),
                RarityFilter.onAverageOnceEvery(48), //9
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());

        register(context, WILD_PARSNIP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AETHER_WILD_PARSNIP_KEY),
                RarityFilter.onAverageOnceEvery(48), //9
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());

        register(context, WILD_LEEK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AETHER_WILD_LEEK_KEY),
                RarityFilter.onAverageOnceEvery(48), //9
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());

        register(context, PEPPERMINT_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AETHER_PEPPERMINT_BUSH_KEY),
                RarityFilter.onAverageOnceEvery(36), //7
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
