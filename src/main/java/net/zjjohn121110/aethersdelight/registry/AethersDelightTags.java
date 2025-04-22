package net.zjjohn121110.aethersdelight.registry;

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

    public static class CommonTags {

        public static final TagKey<Block> STORAGE_BLOCKS_GINGER = commonBlockTag("storage_blocks/ginger");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_GINGER = commonItemTag("storage_blocks/ginger");

        public static final TagKey<Block> STORAGE_BLOCKS_PARSNIP = commonBlockTag("storage_blocks/parsnip");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_PARSNIP = commonItemTag("storage_blocks/parsnip");

        public static final TagKey<Block> STORAGE_BLOCKS_LEEK = commonBlockTag("storage_blocks/leek");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_LEEK = commonItemTag("storage_blocks/leek");

        public static final TagKey<Block> STORAGE_BLOCKS_PEPPERMINT_LEAF = commonBlockTag("storage_blocks/peppermint_leaf");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_PEPPERMINT_LEAF = commonItemTag("storage_blocks/peppermint_leaf");

        public static final TagKey<Block> STORAGE_BLOCKS_BLUE_BERRY = commonBlockTag("storage_blocks/blue_berry");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_BLUE_BERRY = commonItemTag("storage_blocks/blue_berry");

        public static final TagKey<Block> STORAGE_BLOCKS_ENCHANTED_BERRY = commonBlockTag("storage_blocks/enchanted_berry");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_ENCHANTED_BERRY = commonItemTag("storage_blocks/enchanted_berry");

        public static final TagKey<Block> STORAGE_BLOCKS_ARKENIUM = commonBlockTag("storage_blocks/arkenium");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_ARKENIUM = commonItemTag("storage_blocks/arkenium");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_ARKENIUM = commonBlockTag("storage_blocks/raw_arkenium");
        public static final TagKey<Item> STORAGE_BLOCKS_ITEM_RAW_ARKENIUM = commonItemTag("storage_blocks/raw_arkenium");
        public static final TagKey<Block> ORES_ARKENIUM = commonBlockTag("ores/arkenium");
        public static final TagKey<Item> ORES_ITEM_ARKENIUM = commonItemTag("ores/arkenium");

        public static final TagKey<Item> RAW_MATERIALS_ARKENIUM = commonItemTag("raw_materials/arkenium");
        public static final TagKey<Item> INGOTS_ARKENIUM = commonItemTag("ingots/arkenium");
        public static final TagKey<Item> NUGGETS_ARKENIUM = commonItemTag("nuggets/arkenium");

        public static final TagKey<Item> CROPS_GINGER = commonItemTag("crops/ginger");
        public static final TagKey<Item> CROPS_PARSNIP = commonItemTag("crops/parsnip");
        public static final TagKey<Item> CROPS_LEEK = commonItemTag("crops/leek");

        public static final TagKey<Item> FOODS_VEGETABLE_AETHER = commonItemTag("foods/vegetable/aether");

        public static final TagKey<Item> FOODS_RAW_MOA = commonItemTag("foods/raw_moa");
        public static final TagKey<Item> FOODS_COOKED_MOA = commonItemTag("foods/cooked_moa");

        public static final TagKey<Item> FOODS_GINGERBREAD_DOUGH = commonItemTag("foods/gingerbread_dough");
        public static final TagKey<Item> FOODS_GINGERBREAD = commonItemTag("foods/gingerbread");



        private static TagKey<Block> commonBlockTag(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
        private static TagKey<Item> commonItemTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
