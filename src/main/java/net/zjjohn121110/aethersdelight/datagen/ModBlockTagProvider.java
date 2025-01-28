package net.zjjohn121110.aethersdelight.datagen;

import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
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
                .add(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get());
        
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
    }
}
