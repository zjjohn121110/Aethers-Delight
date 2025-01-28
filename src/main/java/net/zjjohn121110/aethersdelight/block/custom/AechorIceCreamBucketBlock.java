package net.zjjohn121110.aethersdelight.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.function.Supplier;

public class AechorIceCreamBucketBlock extends FeastBlock {
    protected static final VoxelShape PLATE_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 11.0D, 13.0D);
    protected static final VoxelShape ROAST_SHAPE = Shapes.joinUnoptimized(PLATE_SHAPE, Block.box(4.0D, 1.0D, 4.0D, 12.0D, 11.0D, 12.0D), BooleanOp.OR);

    public AechorIceCreamBucketBlock(Properties properties, Supplier<Item> servingItem, boolean hasLeftovers) {
        super(properties, servingItem, hasLeftovers);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(SERVINGS) == 0 ? PLATE_SHAPE : ROAST_SHAPE;
    }
}
