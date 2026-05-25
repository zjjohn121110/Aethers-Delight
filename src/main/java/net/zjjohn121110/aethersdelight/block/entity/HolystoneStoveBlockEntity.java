package net.zjjohn121110.aethersdelight.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec2;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.zjjohn121110.aethersdelight.block.HolystoneStoveBlock;
import vectorwing.farmersdelight.common.block.entity.AbstractStoveBlockEntity;

public class HolystoneStoveBlockEntity extends AbstractStoveBlockEntity {

    public HolystoneStoveBlockEntity(BlockPos pos, BlockState state) {
        super(AethersDelightBlockEntity.HOLYSTONE_STOVE.get(), pos, state, RecipeType.CAMPFIRE_COOKING);
    }

    public static void animationTick(Level level, BlockPos pos, BlockState state, HolystoneStoveBlockEntity stove) {
        if (stove.isEmpty()) {
            return;
        }

        stove.addSmokeParticles();
    }

    public void addSmokeParticles() {
        if (this.level == null) {
            return;
        }

        ItemStackHandler inventory = this.getItems();
        for (int i = 0; i < inventory.getSlots(); ++i) {
            if (inventory.getStackInSlot(i).isEmpty()) {
                continue;
            }
            if (level.random.nextFloat() >= 0.2F) {
                continue;
            }

            Vec2 itemOffset = this.getStoveItemOffset(i);
            Direction direction = this.getBlockState().getValue(HolystoneStoveBlock.FACING);
            if (direction.get2DDataValue() % 2 != 0) {
                itemOffset = new Vec2(itemOffset.y, itemOffset.x);
            }

            double x = (worldPosition.getX() + 0.5D)
                    - (direction.getStepX() * itemOffset.x)
                    + (direction.getClockWise().getStepX() * itemOffset.x);
            double y = worldPosition.getY() + 1.0D;
            double z = (worldPosition.getZ() + 0.5D)
                    - (direction.getStepZ() * itemOffset.y)
                    + (direction.getClockWise().getStepZ() * itemOffset.y);

            for (int k = 0; k < 3; ++k) {
                level.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0D, 5.0E-4D, 0.0D);
            }
        }
    }

    @Override
    protected int getInventorySlotCount() {
        return 6;
    }

    @Override
    public Vec2 getStoveItemOffset(int index) {
        final float X_OFFSET = 0.3F;
        final float Y_OFFSET = 0.2F;
        final Vec2[] OFFSETS = {
                new Vec2(X_OFFSET, Y_OFFSET),
                new Vec2(0.0F, Y_OFFSET),
                new Vec2(-X_OFFSET, Y_OFFSET),
                new Vec2(X_OFFSET, -Y_OFFSET),
                new Vec2(0.0F, -Y_OFFSET),
                new Vec2(-X_OFFSET, -Y_OFFSET),
        };
        return OFFSETS[index];
    }

    /**
     * Legacy accessor kept for Aether's Delight's existing renderer.
     */
    public ItemStackHandler getInventory() {
        return this.getItems();
    }

    @Override
    public boolean shouldDropItems() {
        if (this.level == null) {
            return false;
        }

        return HolystoneStoveBlock.isHolystoneStoveTopCovered(this.level, this.worldPosition);
    }
}
