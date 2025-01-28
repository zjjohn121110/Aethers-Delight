package net.zjjohn121110.aethersdelight.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.zjjohn121110.aethersdelight.AethersDelight;

public class HolystoneSmokerBlockEntity extends AbstractFurnaceBlockEntity {
    public HolystoneSmokerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(AethersDelightBlockEntity.HOLYSTONE_SMOKER.get(), pPos, pBlockState, RecipeType.SMOKING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("menu." + AethersDelight.MODID + ".holystone_smoker");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory playerInventory) {
        return new SmokerMenu(i, playerInventory, this, this.dataAccess);
    }
}
