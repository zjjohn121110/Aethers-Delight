package net.zjjohn121110.aethersdelight.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.zjjohn121110.aethersdelight.AethersDelight;

public class ArkeniumBlastFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public ArkeniumBlastFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(AethersDelightBlockEntity.ARKENIUM_BLAST_FURNACE.get(), pPos, pBlockState, RecipeType.BLASTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("menu." + AethersDelight.MODID + ".arkenium_blast_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory playerInventory) {
        return new BlastFurnaceMenu(i, playerInventory, this, this.dataAccess);
    }
}
