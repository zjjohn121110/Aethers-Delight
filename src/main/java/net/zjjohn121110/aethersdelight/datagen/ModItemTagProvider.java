package net.zjjohn121110.aethersdelight.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.item.AetherItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;
import net.zjjohn121110.aethersdelight.util.AethersDelightTags;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AethersDelight.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(CommonTags.TOOLS_KNIFE)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(ModTags.KNIVES)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(AetherTags.Items.TREATED_AS_AETHER_ITEM)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get()
                );

        this.tag(AethersDelightTags.Items.NOT_GOLDEN_AMBER_HARVESTERS)
                .addTag(ItemTags.AXES)
                .remove(AetherTags.Items.GOLDEN_AMBER_HARVESTERS);

        this.tag(Tags.Items.FOODS_VEGETABLE)
                .add(AethersDelightItems.GINGER.get(),
                        AethersDelightItems.PARSNIP.get(),
                        AethersDelightItems.LEEK.get()
                );
                this.tag(AethersDelightTags.CommonTags.FOODS_VEGETABLE_AETHER)
                        .add(AethersDelightItems.GINGER.get(),
                                AethersDelightItems.PARSNIP.get(),
                                AethersDelightItems.LEEK.get()
                        );

        this.tag(Tags.Items.CROPS)
                .addTags(AethersDelightTags.CommonTags.CROPS_GINGER,
                        AethersDelightTags.CommonTags.CROPS_PARSNIP,
                        AethersDelightTags.CommonTags.CROPS_LEEK
                );
                this.tag(AethersDelightTags.CommonTags.CROPS_GINGER).add(AethersDelightItems.GINGER.get());
                this.tag(AethersDelightTags.CommonTags.CROPS_PARSNIP).add(AethersDelightItems.PARSNIP.get());
                this.tag(AethersDelightTags.CommonTags.CROPS_LEEK).add(AethersDelightItems.LEEK.get());

        this.tag(ItemTags.MEAT)
                .add(AethersDelightItems.RAW_MOA.get(),
                        AethersDelightItems.COOKED_MOA.get(),
                        AethersDelightItems.RAW_MOA_CUTS.get(),
                        AethersDelightItems.COOKED_MOA_CUTS.get()
                );

        this.tag(CompatibilityTags.ORIGINS_MEAT)
                .add(AethersDelightItems.FRIED_MOA_EGG.get(),
                        AethersDelightItems.MOA_EGG_OMELETTE.get()
                );

        this.tag(CompatibilityTags.CREATE_UPRIGHT_ON_BELT)
                .add(AethersDelightItems.WHITE_APPLE_PIE.get(),
                        AethersDelightItems.BLUE_BERRY_JAM.get(),
                        AethersDelightItems.ENCHANTED_BERRY_JAM.get(),
                        AethersDelightItems.GINGER_ALE.get(),
                        AethersDelightItems.PEPPERMINT_TEA.get(),
                        AethersDelightItems.SWET_SOUP.get(),
                        AethersDelightItems.GINGER_SOUP.get(),
                        AethersDelightItems.MOA_STEW.get(),
                        AethersDelightItems.FLYING_BEEF_STEW.get(),
                        AethersDelightItems.PEPPERMINT_EXTRACT.get()
                );
        
        this.tag(Tags.Items.FOODS)
                .addTags(AethersDelightTags.CommonTags.FOODS_GINGERBREAD_DOUGH,
                        AethersDelightTags.CommonTags.FOODS_GINGERBREAD
                );
                this.tag(AethersDelightTags.CommonTags.FOODS_GINGERBREAD_DOUGH).add(AethersDelightItems.GINGERBREAD_DOUGH.get());
                this.tag(AethersDelightTags.CommonTags.FOODS_GINGERBREAD).add(AethersDelightItems.GINGERBREAD.get());

        this.tag(Tags.Items.FOODS_RAW_MEAT)
                .add(AethersDelightItems.RAW_MOA.get(),
                        AethersDelightItems.RAW_MOA_CUTS.get()
        );

        this.tag(Tags.Items.FOODS_FOOD_POISONING)
                .add(AethersDelightItems.RAW_MOA.get(),
                        AethersDelightItems.RAW_MOA_CUTS.get(),
                        AethersDelightItems.GINGERBREAD_DOUGH.get(),
                        AethersDelightItems.GINGERBREAD_MAN_BASE.get(),
                        AethersDelightItems.GINGERBREAD_MOA_BASE.get(),
                        AethersDelightItems.GINGERBREAD_STAR_BASE.get()
        );

        this.tag(CommonTags.FOODS_COOKED_EGG).add(AethersDelightItems.FRIED_MOA_EGG.get());

        this.tag(Tags.Items.FOODS_SOUP)
                .add(AethersDelightItems.SWET_SOUP.get(),
                        AethersDelightItems.GINGER_SOUP.get(),
                        AethersDelightItems.MOA_STEW.get(),
                        AethersDelightItems.FLYING_BEEF_STEW.get()
                );

        this.tag(Tags.Items.FOODS_COOKIE)
                .add(AethersDelightItems.GINGERBREAD_MOA.get(),
                        AethersDelightItems.GINGERBREAD_STAR.get()
                );

        this.tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED)
                .add(AethersDelightBlocks.WHITE_APPLE_PIE.asItem(),
                        AethersDelightBlocks.ROAST_MOA.asItem(),
                        AethersDelightBlocks.AECHOR_ICE_CREAM_BUCKET_BLOCK.asItem()
                );

        this.tag(ModTags.CABBAGE_ROLL_INGREDIENTS).addTag(AethersDelightTags.CommonTags.FOODS_RAW_MOA);

        this.tag(AethersDelightTags.CommonTags.FOODS_RAW_MOA)
                .add(AethersDelightItems.RAW_MOA.get(),
                        AethersDelightItems.RAW_MOA_CUTS.get()
        );

        this.tag(Tags.Items.FOODS_COOKED_MEAT)
                .add(AethersDelightItems.COOKED_MOA.get(),
                        AethersDelightItems.COOKED_MOA_CUTS.get()
        );

        this.tag(AethersDelightTags.CommonTags.FOODS_COOKED_MOA)
                .add(AethersDelightItems.COOKED_MOA.get(),
                        AethersDelightItems.COOKED_MOA_CUTS.get()
        );

        this.tag(Tags.Items.RAW_MATERIALS).addTag(AethersDelightTags.CommonTags.RAW_MATERIALS_ARKENIUM);
                this.tag(AethersDelightTags.CommonTags.RAW_MATERIALS_ARKENIUM).add(AethersDelightItems.RAW_ARKENIUM.get());

        this.tag(Tags.Items.INGOTS).addTag(AethersDelightTags.CommonTags.INGOTS_ARKENIUM);
                this.tag(AethersDelightTags.CommonTags.INGOTS_ARKENIUM).add(AethersDelightItems.ARKENIUM_INGOT.get());

        this.tag(Tags.Items.NUGGETS).addTag(AethersDelightTags.CommonTags.NUGGETS_ARKENIUM);
                this.tag(AethersDelightTags.CommonTags.NUGGETS_ARKENIUM).add(AethersDelightItems.ARKENIUM_NUGGET.get());

        this.tag(ModTags.WOODEN_CABINETS).add(AethersDelightBlocks.SKYROOT_CABINET.asItem());

        this.tag(Tags.Items.STORAGE_BLOCKS)
                .addTags(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_GINGER,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_LEEK,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_PARSNIP,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_PEPPERMINT_LEAF,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_BLUE_BERRY,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_ENCHANTED_BERRY,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_ARKENIUM,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_RAW_ARKENIUM
                );
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_GINGER).add(AethersDelightBlocks.GINGER_CRATE.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_LEEK).add(AethersDelightBlocks.LEEK_CRATE.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_PARSNIP).add(AethersDelightBlocks.PARSNIP_CRATE.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_PEPPERMINT_LEAF).add(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_BLUE_BERRY).add(AethersDelightBlocks.BLUE_BERRY_CRATE.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_ENCHANTED_BERRY).add(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_ARKENIUM).add(AethersDelightBlocks.ARKENIUM_BLOCK.asItem());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ITEM_RAW_ARKENIUM).add(AethersDelightBlocks.RAW_ARKENIUM_BLOCK.asItem());

        this.tag(Tags.Items.ORES).addTag(AethersDelightTags.CommonTags.ORES_ITEM_ARKENIUM);
                this.tag(AethersDelightTags.CommonTags.ORES_ITEM_ARKENIUM).add(AethersDelightBlocks.ARKENIUM_ORE.asItem());

        this.tag(Tags.Items.CHAINS).add(AethersDelightBlocks.ARKENIUM_CHAIN.asItem());

        this.tag(ItemTags.SMALL_FLOWERS)
                .add(AethersDelightBlocks.WILD_GINGER.asItem(),
                        AethersDelightBlocks.WILD_LEEK.asItem(),
                        AethersDelightBlocks.WILD_PARSNIP.asItem()
                );

        this.tag(ModTags.WILD_CROPS_ITEM)
                .add(AethersDelightBlocks.WILD_GINGER.asItem(),
                        AethersDelightBlocks.WILD_LEEK.asItem(),
                        AethersDelightBlocks.WILD_PARSNIP.asItem()
                );

        this.tag(Tags.Items.PLAYER_WORKSTATIONS_FURNACES).add(AethersDelightBlocks.HOLYSTONE_FURNACE.asItem());

        //Misc Tags
        this.tag(CommonTags.FOODS_MILK)
                .add(AetherItems.SKYROOT_MILK_BUCKET.get());

    }
}
