package net.zjjohn121110.aethersdelight.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.zjjohn121110.aethersdelight.AethersDelight;

public class AethersDelightTags {

    public static class Items {

        public static final TagKey<Item> NOT_GOLDEN_AMBER_HARVESTERS = createTag("not_golden_amber_harvesters");



        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
        }
    }

    public static class Blocks {

        public static final TagKey<Block> NEED_ARKENIUM_TOOL = createTag("needs_arkenium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ARKENIUM_TOOL = createTag("incorrect_for_arkenium_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> WILD_GINGER_BIOMES = tag("wild_ginger_biomes");
        public static final TagKey<Biome> WILD_PARSNIP_BIOMES = tag("wild_parsnip_biomes");
        public static final TagKey<Biome> WILD_LEEK_BIOMES = tag("wild_leek_biomes");
        public static final TagKey<Biome> PEPPERMINT_BUSH_BIOMES = tag("peppermint_bush_biomes");



        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, name));
        }
    }

    public static class CommonItemTags {

        public static final TagKey<Item> VEGETABLES_GINGER = commonItemTag("vegetables/ginger");
        public static final TagKey<Item> VEGETABLES_PARSNIP = commonItemTag("vegetables/parsnip");
        public static final TagKey<Item> VEGETABLES_LEEK = commonItemTag("vegetables/leek");
        public static final TagKey<Item> VEGETABLES_AETHER = commonItemTag("vegetables/aether");

        public static final TagKey<Item> CROPS_GINGER = commonItemTag("crops/ginger");
        public static final TagKey<Item> CROPS_PARSNIP = commonItemTag("crops/parsnip");
        public static final TagKey<Item> CROPS_LEEK = commonItemTag("crops/leek");

        public static final TagKey<Item> RAW_MOA = commonItemTag("raw_moa");
        public static final TagKey<Item> COOKED_MOA = commonItemTag("cooked_moa");

        public static final TagKey<Item> BUCKETS_WATER = commonItemTag("buckets/water");
        public static final TagKey<Item> RODS_WOODEN = commonItemTag("rods/wooden");



        private static TagKey<Item> commonItemTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
