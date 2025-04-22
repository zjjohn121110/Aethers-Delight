package net.zjjohn121110.aethersdelight.datagen;

import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
import net.zjjohn121110.aethersdelight.util.AethersDelightTags;

import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AethersDelight.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(AethersDelightBlocks.ARKENIUM_BLOCK.get(),
                        AethersDelightBlocks.RAW_ARKENIUM_BLOCK.get(),
                        AethersDelightBlocks.ARKENIUM_ORE.get(),
                        AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get(),
                        AethersDelightBlocks.ARKENIUM_CHAIN.get(),
                        AethersDelightBlocks.ARKENIUM_LANTERN.get()
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(AethersDelightBlocks.HOLYSTONE_FURNACE.get(),
                        AethersDelightBlocks.HOLYSTONE_SMOKER.get(),
                        AethersDelightBlocks.HOLYSTONE_STOVE.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(AethersDelightBlocks.ARKENIUM_BLOCK.get(),
                        AethersDelightBlocks.ARKENIUM_CHAIN.get(),
                        AethersDelightBlocks.RAW_ARKENIUM_BLOCK.get(),
                        AethersDelightBlocks.ARKENIUM_ORE.get(),
                        AethersDelightBlocks.HOLYSTONE_FURNACE.get(),
                        AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get(),
                        AethersDelightBlocks.HOLYSTONE_SMOKER.get(),
                        AethersDelightBlocks.HOLYSTONE_STOVE.get(),
                        AethersDelightBlocks.ARKENIUM_LANTERN.get()
                );

        this.tag(ModTags.MINEABLE_WITH_KNIFE)
                .add(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get(),
                        AethersDelightBlocks.WHITE_APPLE_PIE.get(),
                        AethersDelightBlocks.ROAST_MOA.get()
                );
        
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(AethersDelightBlocks.SKYROOT_CABINET.get(),
                        AethersDelightBlocks.GINGER_CRATE.get(),
                        AethersDelightBlocks.PARSNIP_CRATE.get(),
                        AethersDelightBlocks.LEEK_CRATE.get(),
                        AethersDelightBlocks.BLUE_BERRY_CRATE.get(),
                        AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get()
                );

        this.tag(CompatibilityTags.CREATE_PASSIVE_BOILER_HEATERS)
                .add(AethersDelightBlocks.HOLYSTONE_STOVE.get());

        this.tag(ModTags.HEAT_SOURCES)
                .add(AethersDelightBlocks.HOLYSTONE_STOVE.get(),
                        AetherBlocks.LIGHT_HELLFIRE_STONE.get()
                );

        this.tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(AethersDelightTags.CommonTags.STORAGE_BLOCKS_GINGER,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_LEEK,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_PARSNIP,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_PEPPERMINT_LEAF,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_BLUE_BERRY,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ENCHANTED_BERRY,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_ARKENIUM,
                        AethersDelightTags.CommonTags.STORAGE_BLOCKS_RAW_ARKENIUM
                );
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_GINGER).add(AethersDelightBlocks.GINGER_CRATE.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_LEEK).add(AethersDelightBlocks.LEEK_CRATE.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_PARSNIP).add(AethersDelightBlocks.PARSNIP_CRATE.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_PEPPERMINT_LEAF).add(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_BLUE_BERRY).add(AethersDelightBlocks.BLUE_BERRY_CRATE.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ENCHANTED_BERRY).add(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_ARKENIUM).add(AethersDelightBlocks.ARKENIUM_BLOCK.get());
                this.tag(AethersDelightTags.CommonTags.STORAGE_BLOCKS_RAW_ARKENIUM).add(AethersDelightBlocks.RAW_ARKENIUM_BLOCK.get());

        this.tag(Tags.Blocks.ORES).addTag(AethersDelightTags.CommonTags.ORES_ARKENIUM);
                this.tag(AethersDelightTags.CommonTags.ORES_ARKENIUM).add(AethersDelightBlocks.ARKENIUM_ORE.get());

        this.tag(Tags.Blocks.CHAINS).add(AethersDelightBlocks.ARKENIUM_CHAIN.get());

        this.tag(BlockTags.SMALL_FLOWERS)
                .add(AethersDelightBlocks.WILD_GINGER.get(),
                        AethersDelightBlocks.WILD_LEEK.get(),
                        AethersDelightBlocks.WILD_PARSNIP.get()
                );

        this.tag(ModTags.WILD_CROPS)
                .add(AethersDelightBlocks.WILD_GINGER.get(),
                        AethersDelightBlocks.WILD_LEEK.get(),
                        AethersDelightBlocks.WILD_PARSNIP.get()
                );

        this.tag(Tags.Blocks.PLAYER_WORKSTATIONS_FURNACES).add(AethersDelightBlocks.HOLYSTONE_FURNACE.get());
    }
}
