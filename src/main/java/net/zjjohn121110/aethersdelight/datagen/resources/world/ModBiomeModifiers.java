package net.zjjohn121110.aethersdelight.datagen.resources.world;

import com.aetherteam.aether.AetherTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.registry.AethersDelightTags;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ARKENIUM_ORE = registerKey("add_arkenium_ore");
    public static final ResourceKey<BiomeModifier> ADD_WILD_GINGER = registerKey("add_wild_ginger");
    public static final ResourceKey<BiomeModifier> ADD_WILD_PARSNIP = registerKey("add_wild_parsnip");
    public static final ResourceKey<BiomeModifier> ADD_WILD_LEEK = registerKey("add_wild_leek");
    public static final ResourceKey<BiomeModifier> ADD_PEPPERMINT_BUSH = registerKey("add_peppermint_bush");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ARKENIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(AetherTags.Biomes.IS_AETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ARKENIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_WILD_GINGER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(AethersDelightTags.Biomes.WILD_GINGER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WILD_GINGER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_WILD_PARSNIP, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(AethersDelightTags.Biomes.WILD_PARSNIP_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WILD_PARSNIP_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_WILD_LEEK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(AethersDelightTags.Biomes.WILD_LEEK_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WILD_LEEK_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_PEPPERMINT_BUSH, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(AethersDelightTags.Biomes.PEPPERMINT_BUSH_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PEPPERMINT_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
    }
}
