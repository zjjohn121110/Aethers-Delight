package net.zjjohn121110.aethersdelight.datagen.generators.tag;

import java.util.concurrent.CompletableFuture;

import net.zjjohn121110.aethersdelight.registry.ADBlocks;
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
import net.zjjohn121110.aethersdelight.registry.ADItems;
import net.zjjohn121110.aethersdelight.registry.ADTags;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

public class ADItemTagGenerator extends ItemTagsProvider {
    public ADItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AethersDelight.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(CommonTags.Items.TOOLS_KNIFE)
                .add(ADItems.HOLYSTONE_KNIFE.get(),
                        ADItems.ZANITE_KNIFE.get(),
                        ADItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(ModTags.KNIVES)
                .add(ADItems.HOLYSTONE_KNIFE.get(),
                        ADItems.ZANITE_KNIFE.get(),
                        ADItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(AetherTags.Items.TREATED_AS_AETHER_ITEM)
                .add(ADItems.HOLYSTONE_KNIFE.get(),
                        ADItems.ZANITE_KNIFE.get(),
                        ADItems.GRAVITITE_KNIFE.get()
                );

        this.tag(ADTags.Items.NOT_GOLDEN_AMBER_HARVESTERS)
                .addTag(ItemTags.AXES)
                .remove(AetherTags.Items.GOLDEN_AMBER_HARVESTERS);

        this.tag(Tags.Items.FOODS_VEGETABLE)
                .add(ADItems.GINGER.get(),
                        ADItems.PARSNIP.get(),
                        ADItems.LEEK.get()
                );
                this.tag(ADTags.CommonTags.FOODS_VEGETABLE_AETHER)
                        .add(ADItems.GINGER.get(),
                                ADItems.PARSNIP.get(),
                                ADItems.LEEK.get()
                        );

        this.tag(Tags.Items.CROPS)
                .addTags(ADTags.CommonTags.CROPS_GINGER,
                        ADTags.CommonTags.CROPS_PARSNIP,
                        ADTags.CommonTags.CROPS_LEEK
                );
                this.tag(ADTags.CommonTags.CROPS_GINGER).add(ADItems.GINGER.get());
                this.tag(ADTags.CommonTags.CROPS_PARSNIP).add(ADItems.PARSNIP.get());
                this.tag(ADTags.CommonTags.CROPS_LEEK).add(ADItems.LEEK.get());

        this.tag(ItemTags.MEAT)
                .add(ADItems.RAW_MOA.get(),
                        ADItems.COOKED_MOA.get(),
                        ADItems.RAW_MOA_CUTS.get(),
                        ADItems.COOKED_MOA_CUTS.get()
                );

        this.tag(CompatibilityTags.ORIGINS_MEAT)
                .add(ADItems.FRIED_MOA_EGG.get(),
                        ADItems.MOA_EGG_OMELETTE.get()
                );

        this.tag(CompatibilityTags.CREATE_UPRIGHT_ON_BELT)
                .add(ADItems.WHITE_APPLE_PIE.get(),
                        ADItems.BLUE_BERRY_JAM.get(),
                        ADItems.ENCHANTED_BERRY_JAM.get(),
                        ADItems.GINGER_ALE.get(),
                        ADItems.PEPPERMINT_TEA.get(),
                        ADItems.SWET_SOUP.get(),
                        ADItems.GINGER_SOUP.get(),
                        ADItems.MOA_STEW.get(),
                        ADItems.FLYING_BEEF_STEW.get(),
                        ADItems.PEPPERMINT_EXTRACT.get()
                );
        
        this.tag(Tags.Items.FOODS)
                .addTags(ADTags.CommonTags.FOODS_GINGERBREAD_DOUGH,
                        ADTags.CommonTags.FOODS_GINGERBREAD
                );
                this.tag(ADTags.CommonTags.FOODS_GINGERBREAD_DOUGH).add(ADItems.GINGERBREAD_DOUGH.get());
                this.tag(ADTags.CommonTags.FOODS_GINGERBREAD).add(ADItems.GINGERBREAD.get());

        this.tag(Tags.Items.FOODS_RAW_MEAT)
                .add(ADItems.RAW_MOA.get(),
                        ADItems.RAW_MOA_CUTS.get()
        );

        this.tag(Tags.Items.FOODS_FOOD_POISONING)
                .add(ADItems.RAW_MOA.get(),
                        ADItems.RAW_MOA_CUTS.get(),
                        ADItems.GINGERBREAD_DOUGH.get(),
                        ADItems.GINGERBREAD_MAN_BASE.get(),
                        ADItems.GINGERBREAD_MOA_BASE.get(),
                        ADItems.GINGERBREAD_STAR_BASE.get()
        );

        this.tag(CommonTags.Items.FOODS_COOKED_EGG).add(ADItems.FRIED_MOA_EGG.get());

        this.tag(Tags.Items.FOODS_SOUP)
                .add(ADItems.SWET_SOUP.get(),
                        ADItems.GINGER_SOUP.get(),
                        ADItems.MOA_STEW.get(),
                        ADItems.FLYING_BEEF_STEW.get()
                );

        this.tag(Tags.Items.FOODS_COOKIE)
                .add(ADItems.GINGERBREAD_MOA.get(),
                        ADItems.GINGERBREAD_STAR.get()
                );

        this.tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED)
                .add(ADBlocks.WHITE_APPLE_PIE.asItem(),
                        ADBlocks.ROAST_MOA.asItem(),
                        ADBlocks.AECHOR_ICE_CREAM_BUCKET_BLOCK.asItem()
                );

        //this.tag(ModTags.Items.CABBAGE_ROLL_INGREDIENTS).addTag(ADTags.CommonTags.FOODS_RAW_MOA);

        this.tag(ADTags.CommonTags.FOODS_RAW_MOA)
                .add(ADItems.RAW_MOA.get(),
                        ADItems.RAW_MOA_CUTS.get()
        );

        this.tag(Tags.Items.FOODS_COOKED_MEAT)
                .add(ADItems.COOKED_MOA.get(),
                        ADItems.COOKED_MOA_CUTS.get()
        );

        this.tag(ADTags.CommonTags.FOODS_COOKED_MOA)
                .add(ADItems.COOKED_MOA.get(),
                        ADItems.COOKED_MOA_CUTS.get()
        );

        this.tag(Tags.Items.RAW_MATERIALS).addTag(ADTags.CommonTags.RAW_MATERIALS_ARKENIUM);
                this.tag(ADTags.CommonTags.RAW_MATERIALS_ARKENIUM).add(ADItems.RAW_ARKENIUM.get());

        this.tag(Tags.Items.INGOTS).addTag(ADTags.CommonTags.INGOTS_ARKENIUM);
                this.tag(ADTags.CommonTags.INGOTS_ARKENIUM).add(ADItems.ARKENIUM_INGOT.get());

        this.tag(Tags.Items.NUGGETS).addTag(ADTags.CommonTags.NUGGETS_ARKENIUM);
                this.tag(ADTags.CommonTags.NUGGETS_ARKENIUM).add(ADItems.ARKENIUM_NUGGET.get());

        //this.tag(ModTags.WOODEN_CABINETS).add(ADBlocks.SKYROOT_CABINET.asItem());

        this.tag(Tags.Items.STORAGE_BLOCKS)
                .addTags(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_GINGER,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_LEEK,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_PARSNIP,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_PEPPERMINT_LEAF,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_BLUE_BERRY,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_ENCHANTED_BERRY,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_ARKENIUM,
                        ADTags.CommonTags.STORAGE_BLOCKS_ITEM_RAW_ARKENIUM
                );
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_GINGER).add(ADBlocks.GINGER_CRATE.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_LEEK).add(ADBlocks.LEEK_CRATE.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_PARSNIP).add(ADBlocks.PARSNIP_CRATE.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_PEPPERMINT_LEAF).add(ADBlocks.PEPPERMINT_LEAF_BAG.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_BLUE_BERRY).add(ADBlocks.BLUE_BERRY_CRATE.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_ENCHANTED_BERRY).add(ADBlocks.ENCHANTED_BERRY_CRATE.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_ARKENIUM).add(ADBlocks.ARKENIUM_BLOCK.asItem());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ITEM_RAW_ARKENIUM).add(ADBlocks.RAW_ARKENIUM_BLOCK.asItem());

        this.tag(Tags.Items.ORES).addTag(ADTags.CommonTags.ORES_ITEM_ARKENIUM);
                this.tag(ADTags.CommonTags.ORES_ITEM_ARKENIUM).add(ADBlocks.ARKENIUM_ORE.asItem());

        this.tag(Tags.Items.CHAINS).add(ADBlocks.ARKENIUM_CHAIN.asItem());

        this.tag(ItemTags.SMALL_FLOWERS)
                .add(ADBlocks.WILD_GINGER.asItem(),
                        ADBlocks.WILD_LEEK.asItem(),
                        ADBlocks.WILD_PARSNIP.asItem()
                );

//        this.tag(ModTags.WILD_CROPS_ITEM)
//                .add(ADBlocks.WILD_GINGER.asItem(),
//                        ADBlocks.WILD_LEEK.asItem(),
//                        ADBlocks.WILD_PARSNIP.asItem()
//                );

        this.tag(Tags.Items.PLAYER_WORKSTATIONS_FURNACES).add(ADBlocks.HOLYSTONE_FURNACE.asItem());

        //Misc Tags
        this.tag(Tags.Items.DRINKS_MILK)
                .add(AetherItems.SKYROOT_MILK_BUCKET.get());

    }
}
