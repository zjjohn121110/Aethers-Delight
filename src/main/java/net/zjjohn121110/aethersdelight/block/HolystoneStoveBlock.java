package net.zjjohn121110.aethersdelight.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.zjjohn121110.aethersdelight.block.entity.AethersDelightBlockEntity;
import net.zjjohn121110.aethersdelight.block.entity.HolystoneStoveBlockEntity;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.block.AbstractStoveBlock;
import vectorwing.farmersdelight.common.registry.ModSounds;

public class HolystoneStoveBlock extends AbstractStoveBlock {
    public static final MapCodec<HolystoneStoveBlock> CODEC = simpleCodec(HolystoneStoveBlock::new);

    private static final VoxelShape GRILLING_AREA = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 1.0F, 13.0F);

    public HolystoneStoveBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new HolystoneStoveBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide && state.getValue(LIT)) {
            return createTickerHelper(blockEntityType, AethersDelightBlockEntity.HOLYSTONE_STOVE.get(), HolystoneStoveBlockEntity::animationTick);
        }

        return AbstractStoveBlock.createStoveTicker(level, blockEntityType, AethersDelightBlockEntity.HOLYSTONE_STOVE.get());
    }

    @Override
    protected ItemInteractionResult tryToPlaceFoodItem(ItemStack heldStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (isHolystoneStoveTopCovered(level, pos)) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (!(level.getBlockEntity(pos) instanceof HolystoneStoveBlockEntity stoveEntity)) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        var maybeRecipe = stoveEntity.getCookingRecipe(heldStack);
        if (maybeRecipe.isEmpty()) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (level.isClientSide) {
            return ItemInteractionResult.CONSUME;
        }

        boolean placeFoodSuccess = stoveEntity.placeFood(player, player.getAbilities().instabuild ? heldStack.copy() : heldStack, maybeRecipe.get());
        if (!placeFoodSuccess) {
            return ItemInteractionResult.CONSUME;
        }

        level.playSound(null, pos, SoundEvents.LANTERN_PLACE, SoundSource.BLOCKS, 0.5F, 1.0F);
        return ItemInteractionResult.SUCCESS;
    }

    public static boolean isHolystoneStoveTopCovered(Level level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        return Shapes.joinIsNotEmpty(GRILLING_AREA, aboveState.getShape(level, abovePos), BooleanOp.AND);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!state.getValue(LIT)) {
            return;
        }

        double x = (double) pos.getX() + 0.5D;
        double y = pos.getY();
        double z = (double) pos.getZ() + 0.5D;
        if (random.nextInt(10) == 0) {
            level.playLocalSound(x, y, z, ModSounds.BLOCK_STOVE_CRACKLE.get(), SoundSource.BLOCKS, 1.0F, 1.0F, false);
        }

        Direction direction = state.getValue(HorizontalDirectionalBlock.FACING);
        Direction.Axis axis = direction.getAxis();
        double horizontalOffset = random.nextDouble() * 0.6D - 0.3D;
        double xOffset = axis == Direction.Axis.X ? (double) direction.getStepX() * 0.52D : horizontalOffset;
        double yOffset = random.nextDouble() * 6.0D / 16.0D;
        double zOffset = axis == Direction.Axis.Z ? (double) direction.getStepZ() * 0.52D : horizontalOffset;
        level.addParticle(ParticleTypes.SMOKE, x + xOffset, y + yOffset, z + zOffset, 0.0D, 0.0D, 0.0D);
        level.addParticle(ParticleTypes.FLAME, x + xOffset, y + yOffset, z + zOffset, 0.0D, 0.0D, 0.0D);
    }
}
