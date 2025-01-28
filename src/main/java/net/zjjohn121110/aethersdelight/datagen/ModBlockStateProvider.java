package net.zjjohn121110.aethersdelight.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AethersDelight.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
       blockWithItem(AethersDelightBlocks.ARKENIUM_BLOCK);
       blockWithItem(AethersDelightBlocks.RAW_ARKENIUM_BLOCK);
       blockWithItem(AethersDelightBlocks.ARKENIUM_ORE);


       this.wildCropBlock(AethersDelightBlocks.WILD_GINGER.get());
       this.wildCropBlock(AethersDelightBlocks.WILD_PARSNIP.get());
       this.wildCropBlock(AethersDelightBlocks.WILD_LEEK.get());

       this.cabinetBlock(AethersDelightBlocks.SKYROOT_CABINET.get(), "skyroot");
    }



    private String blockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "block/" + path);
    }

    public void cabinetBlock(Block block, String woodType) {
        this.horizontalBlock(block, state -> {
            String suffix = state.getValue(CabinetBlock.OPEN) ? "_open" : "";
            return models().orientable(blockName(block) + suffix,
                    resourceBlock(woodType + "_cabinet_side"),
                    resourceBlock(woodType + "_cabinet_front" + suffix),
                    resourceBlock(woodType + "_cabinet_top"));
        });
    }

    public void wildCropBlock(Block block) {
        this.wildCropBlock(block, false);
    }

    public void wildCropBlock(Block block, boolean isBushCrop) {
        if (isBushCrop) {
            this.simpleBlock(block, models().singleTexture(blockName(block), resourceBlock("bush_crop"), "crop", resourceBlock(blockName(block))).renderType("cutout"));
        } else {
            this.simpleBlock(block, models().cross(blockName(block), resourceBlock(blockName(block))).renderType("cutout"));
        }
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
