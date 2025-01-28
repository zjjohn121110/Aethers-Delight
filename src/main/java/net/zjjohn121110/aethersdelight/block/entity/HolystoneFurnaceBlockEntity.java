package net.zjjohn121110.aethersdelight.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.zjjohn121110.aethersdelight.AethersDelight;

public class HolystoneFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public HolystoneFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(AethersDelightBlockEntity.HOLYSTONE_FURNACE.get(), pPos, pBlockState, RecipeType.SMELTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("menu." + AethersDelight.MODID + ".holystone_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory playerInventory) {
        return new FurnaceMenu(i, playerInventory, this, this.dataAccess);
    }
}
