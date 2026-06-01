package net.zjjohn121110.aethersdelight.datagen.generators.model;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.registry.ADBlocks;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class ADBlockStateGenerator extends BlockStateProvider {
    public ADBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AethersDelight.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
       blockWithItem(ADBlocks.ARKENIUM_BLOCK);
       blockWithItem(ADBlocks.RAW_ARKENIUM_BLOCK);
       blockWithItem(ADBlocks.ARKENIUM_ORE);


       this.wildCropBlock(ADBlocks.WILD_GINGER.get());
       this.wildCropBlock(ADBlocks.WILD_PARSNIP.get());
       this.wildCropBlock(ADBlocks.WILD_LEEK.get());

       this.cabinetBlock(ADBlocks.SKYROOT_CABINET.get(), "skyroot");
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
