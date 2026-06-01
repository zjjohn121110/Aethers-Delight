package net.zjjohn121110.aethersdelight.datagen.generators.tag;

import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.registry.ADBlocks;
import net.zjjohn121110.aethersdelight.registry.ADTags;

import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ADBlockTagGenerator extends BlockTagsProvider {
    public ADBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AethersDelight.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ADBlocks.ARKENIUM_BLOCK.get(),
                        ADBlocks.RAW_ARKENIUM_BLOCK.get(),
                        ADBlocks.ARKENIUM_ORE.get(),
                        ADBlocks.ARKENIUM_BLAST_FURNACE.get(),
                        ADBlocks.ARKENIUM_CHAIN.get(),
                        ADBlocks.ARKENIUM_LANTERN.get()
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ADBlocks.HOLYSTONE_FURNACE.get(),
                        ADBlocks.HOLYSTONE_SMOKER.get(),
                        ADBlocks.HOLYSTONE_STOVE.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ADBlocks.ARKENIUM_BLOCK.get(),
                        ADBlocks.ARKENIUM_CHAIN.get(),
                        ADBlocks.RAW_ARKENIUM_BLOCK.get(),
                        ADBlocks.ARKENIUM_ORE.get(),
                        ADBlocks.HOLYSTONE_FURNACE.get(),
                        ADBlocks.ARKENIUM_BLAST_FURNACE.get(),
                        ADBlocks.HOLYSTONE_SMOKER.get(),
                        ADBlocks.HOLYSTONE_STOVE.get(),
                        ADBlocks.ARKENIUM_LANTERN.get()
                );

        this.tag(ModTags.MINEABLE_WITH_KNIFE)
                .add(ADBlocks.PEPPERMINT_LEAF_BAG.get(),
                        ADBlocks.WHITE_APPLE_PIE.get(),
                        ADBlocks.ROAST_MOA.get()
                );
        
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ADBlocks.SKYROOT_CABINET.get(),
                        ADBlocks.GINGER_CRATE.get(),
                        ADBlocks.PARSNIP_CRATE.get(),
                        ADBlocks.LEEK_CRATE.get(),
                        ADBlocks.BLUE_BERRY_CRATE.get(),
                        ADBlocks.ENCHANTED_BERRY_CRATE.get()
                );

        this.tag(CompatibilityTags.CREATE_PASSIVE_BOILER_HEATERS)
                .add(ADBlocks.HOLYSTONE_STOVE.get());

        this.tag(ModTags.HEAT_SOURCES)
                .add(ADBlocks.HOLYSTONE_STOVE.get(),
                        AetherBlocks.LIGHT_HELLFIRE_STONE.get()
                );

        this.tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(ADTags.CommonTags.STORAGE_BLOCKS_GINGER,
                        ADTags.CommonTags.STORAGE_BLOCKS_LEEK,
                        ADTags.CommonTags.STORAGE_BLOCKS_PARSNIP,
                        ADTags.CommonTags.STORAGE_BLOCKS_PEPPERMINT_LEAF,
                        ADTags.CommonTags.STORAGE_BLOCKS_BLUE_BERRY,
                        ADTags.CommonTags.STORAGE_BLOCKS_ENCHANTED_BERRY,
                        ADTags.CommonTags.STORAGE_BLOCKS_ARKENIUM,
                        ADTags.CommonTags.STORAGE_BLOCKS_RAW_ARKENIUM
                );
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_GINGER).add(ADBlocks.GINGER_CRATE.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_LEEK).add(ADBlocks.LEEK_CRATE.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_PARSNIP).add(ADBlocks.PARSNIP_CRATE.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_PEPPERMINT_LEAF).add(ADBlocks.PEPPERMINT_LEAF_BAG.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_BLUE_BERRY).add(ADBlocks.BLUE_BERRY_CRATE.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ENCHANTED_BERRY).add(ADBlocks.ENCHANTED_BERRY_CRATE.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_ARKENIUM).add(ADBlocks.ARKENIUM_BLOCK.get());
                this.tag(ADTags.CommonTags.STORAGE_BLOCKS_RAW_ARKENIUM).add(ADBlocks.RAW_ARKENIUM_BLOCK.get());

        this.tag(Tags.Blocks.ORES).addTag(ADTags.CommonTags.ORES_ARKENIUM);
                this.tag(ADTags.CommonTags.ORES_ARKENIUM).add(ADBlocks.ARKENIUM_ORE.get());

        this.tag(Tags.Blocks.CHAINS).add(ADBlocks.ARKENIUM_CHAIN.get());

        this.tag(BlockTags.SMALL_FLOWERS)
                .add(ADBlocks.WILD_GINGER.get(),
                        ADBlocks.WILD_LEEK.get(),
                        ADBlocks.WILD_PARSNIP.get()
                );

        this.tag(ModTags.WILD_CROPS)
                .add(ADBlocks.WILD_GINGER.get(),
                        ADBlocks.WILD_LEEK.get(),
                        ADBlocks.WILD_PARSNIP.get()
                );

        this.tag(Tags.Blocks.PLAYER_WORKSTATIONS_FURNACES).add(ADBlocks.HOLYSTONE_FURNACE.get());
    }
}
