package net.zjjohn121110.aethersdelight.block.holystone_stove;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec2;
import net.zjjohn121110.aethersdelight.registry.ADBlockEntities;
import vectorwing.farmersdelight.common.block.AbstractStoveBlock;
import vectorwing.farmersdelight.common.block.entity.AbstractStoveBlockEntity;
import vectorwing.farmersdelight.common.block.entity.StoveBlockEntity;

public class HolystoneStoveBlockEntity extends AbstractStoveBlockEntity {
    public HolystoneStoveBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ADBlockEntities.HOLYSTONE_STOVE.get(), blockPos, blockState, RecipeType.CAMPFIRE_COOKING);
    }

    public static void particleTick(Level level, BlockPos pos, BlockState state, HolystoneStoveBlockEntity stoveEntity) {
        if (stoveEntity.isEmpty()) return;
        stoveEntity.addSmokeParticles();
    }

    public void addSmokeParticles() {
        assert this.level != null;

        var items = this.getItems();
        for (int i = 0; i < items.getSlots(); ++i) {
            if (items.getStackInSlot(i).isEmpty()) continue;
            if (level.random.nextFloat() >= 0.2F) continue;
            Vec2 itemOffset = this.getStoveItemOffset(i);
            Direction direction = this.getBlockState().getValue(AbstractStoveBlock.FACING);
            if (direction.get2DDataValue() % 2 != 0) {
                itemOffset = new Vec2(itemOffset.y, itemOffset.x);
            }

            double x = (worldPosition.getX() + 0.5D) - (direction.getStepX() * itemOffset.x) + (direction.getClockWise().getStepX() * itemOffset.x);
            double y = worldPosition.getY() + 1.0D;
            double z = (worldPosition.getZ() + 0.5D) - (direction.getStepZ() * itemOffset.y) + (direction.getClockWise().getStepZ() * itemOffset.y);

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
        final float xOffset = 0.3F;
        final float yOffset = 0.2F;
        final Vec2[] OFFSETS = {
                new Vec2(xOffset, yOffset),
                new Vec2(0.0F, yOffset),
                new Vec2(-xOffset, yOffset),
                new Vec2(xOffset, -yOffset),
                new Vec2(0.0F, -yOffset),
                new Vec2(-xOffset, -yOffset),
        };
        return OFFSETS[index];
    }
}
