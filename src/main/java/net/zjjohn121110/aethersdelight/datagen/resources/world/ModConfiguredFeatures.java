package net.zjjohn121110.aethersdelight.datagen.resources.world;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlockStateProperties;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.registry.AethersDelightBlocks;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_ARKENIUM_ORE_KEY = registerKey("arkenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_WILD_GINGER_KEY = registerKey("wild_ginger");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_WILD_PARSNIP_KEY = registerKey("wild_parsnip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_WILD_LEEK_KEY = registerKey("wild_leek");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_PEPPERMINT_BUSH_KEY = registerKey("peppermint_bush");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest holystonereplaceable = new TagMatchTest(AetherTags.Blocks.HOLYSTONE);

        register(context, AETHER_ARKENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(holystonereplaceable,
                AethersDelightBlocks.ARKENIUM_ORE.get().defaultBlockState(), 7));

        register(context, AETHER_WILD_GINGER_KEY, Feature.NO_BONEMEAL_FLOWER, new RandomPatchConfiguration(
                64, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, //24
                new SimpleBlockConfiguration(BlockStateProvider.simple(AethersDelightBlocks.WILD_GINGER.get().defaultBlockState())))));

        register(context, AETHER_WILD_PARSNIP_KEY, Feature.NO_BONEMEAL_FLOWER, new RandomPatchConfiguration(
                64, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, //24
                new SimpleBlockConfiguration(BlockStateProvider.simple(AethersDelightBlocks.WILD_PARSNIP.get().defaultBlockState())))));

        register(context, AETHER_WILD_LEEK_KEY, Feature.NO_BONEMEAL_FLOWER, new RandomPatchConfiguration(
                64, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, //24
                new SimpleBlockConfiguration(BlockStateProvider.simple(AethersDelightBlocks.WILD_LEEK.get().defaultBlockState())))));

        register(context, AETHER_PEPPERMINT_BUSH_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(
                72, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, //28
                new SimpleBlockConfiguration(BlockStateProvider.simple(AethersDelightBlocks.PEPPERMINT_BUSH.get().defaultBlockState()
                        .setValue(AetherBlockStateProperties.DOUBLE_DROPS, true))))));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}