package net.zjjohn121110.aethersdelight.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;
import vectorwing.farmersdelight.common.utility.TextUtils;

import javax.annotation.Nullable;

public class RoastMoaBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<RoastMoaBlock> CODEC = simpleCodec(RoastMoaBlock::new);

    public static final EnumProperty<BedPart> PART = BlockStateProperties.BED_PART;
    public static final IntegerProperty SERVINGS = IntegerProperty.create("servings", 0, 6);

    protected static final VoxelShape[] SHAPES_NORTH_HEAD = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 2.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 4.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 7.0D)),
    };

    protected static final VoxelShape[] SHAPES_NORTH_FOOT = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D,12.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 16.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 16.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 16.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 16.0D)),
    };

    protected static final VoxelShape[] SHAPES_SOUTH_HEAD = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 14.0D, 14.0D, 12.0D, 16.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 12.0D, 14.0D, 12.0D, 16.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 9.0D, 14.0D, 12.0D, 16.0D)),
   };

    protected static final VoxelShape[] SHAPES_SOUTH_FOOT = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 4.0D, 14.0D, 12.0D, 7.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 2.0D, 14.0D, 12.0D, 7.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 7.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 7.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 7.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 0.0D, 14.0D, 12.0D, 7.0D)),
   };

    protected static final VoxelShape[] SHAPES_WEST_HEAD = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 2.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 4.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
   };

    protected static final VoxelShape[] SHAPES_WEST_FOOT = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 12.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 14.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
    };

    protected static final VoxelShape[] SHAPES_EAST_HEAD = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 0.0D, 0.0D, 12.0D, 0.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(14.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(12.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(9.0D, 2.0D, 2.0D, 16.0D, 12.0D, 14.0D)),
   };

    protected static final VoxelShape[] SHAPES_EAST_FOOT = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(4.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(2.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
            Shapes.or(Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 2.0D, 2.0D, 7.0D, 12.0D, 14.0D)),
   };


    public RoastMoaBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(SERVINGS, 6).setValue(PART, BedPart.HEAD));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (state.getValue(PART) == BedPart.HEAD) {
            switch (state.getValue(FACING)) {
                case NORTH:
                    return SHAPES_NORTH_HEAD[state.getValue(SERVINGS)];
                case SOUTH:
                    return SHAPES_SOUTH_HEAD[state.getValue(SERVINGS)];
                case WEST:
                    return SHAPES_WEST_HEAD[state.getValue(SERVINGS)];
                case EAST:
                    return SHAPES_EAST_HEAD[state.getValue(SERVINGS)];
            }
        }

        if (state.getValue(PART) == BedPart.FOOT) {
            switch (state.getValue(FACING)) {
                case NORTH:
                    return SHAPES_NORTH_FOOT[state.getValue(SERVINGS)];
                case SOUTH:
                    return SHAPES_SOUTH_FOOT[state.getValue(SERVINGS)];
                case WEST:
                    return SHAPES_WEST_FOOT[state.getValue(SERVINGS)];
                case EAST:
                    return SHAPES_EAST_FOOT[state.getValue(SERVINGS)];
            }
        }

        return SHAPES_NORTH_HEAD[state.getValue(SERVINGS)];
    }

    private static Direction getDirectionToOther(BedPart part, Direction direction) {
        return part == BedPart.HEAD ? direction : direction.getOpposite();
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, SERVINGS, PART);
    }

    @Override
    @SuppressWarnings("deprecation")
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing != getDirectionToOther(stateIn.getValue(PART), stateIn.getValue(FACING))) {
            return !stateIn.canSurvive(worldIn, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
            return stateIn.canSurvive(worldIn, currentPos) && facingState.is(this) && facingState.getValue(PART) != stateIn.getValue(PART) ? stateIn : Blocks.AIR.defaultBlockState();
        }
    }

    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide && player.isCreative()) {
            BedPart bedpart = state.getValue(PART);

            if (bedpart == BedPart.FOOT) {
                BlockPos blockpos = pos.relative(getDirectionToOther(bedpart, state.getValue(FACING)));
                BlockState blockstate = level.getBlockState(blockpos);

                if (blockstate.is(this) && blockstate.getValue(PART) == BedPart.HEAD) {
                    level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 35);
                    level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
                }
            }
        }

        super.playerWillDestroy(level, pos, state, player);
        return state;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49479_) {
        Direction direction = p_49479_.getHorizontalDirection();
        BlockPos blockpos = p_49479_.getClickedPos();
        BlockPos blockpos1 = blockpos.relative(direction);
        Level level = p_49479_.getLevel();
        return level.getBlockState(blockpos1).canBeReplaced(p_49479_) && level.getWorldBorder().isWithinBounds(blockpos1) ? this.defaultBlockState().setValue(FACING, direction) : null;
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public void setPlacedBy(Level worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(worldIn, pos, state, placer, stack);
        if (!worldIn.isClientSide) {
            BlockPos facingPos = pos.relative(state.getValue(FACING));
            worldIn.setBlock(facingPos, state.setValue(PART, BedPart.FOOT), 3);
            worldIn.blockUpdated(pos, Blocks.AIR);
            state.updateNeighbourShapes(worldIn, pos, 3);
        }
    }

    public static DoubleBlockCombiner.BlockType getBlockType(BlockState state) {
        BedPart bedpart = state.getValue(PART);
        return bedpart == BedPart.FOOT ? DoubleBlockCombiner.BlockType.FIRST : DoubleBlockCombiner.BlockType.SECOND;
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack heldStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        int servings = state.getValue(SERVINGS);

        if (heldStack.is(Items.BOWL) && servings > 0) {
                    return takeServing(level, pos, state, player, hand, AethersDelightItems.ROAST_MOA.get());
        }
        if (servings == 0) {
            level.playSound(null, pos, SoundEvents.WOOD_BREAK, SoundSource.PLAYERS, 1.0F, 1.0F);
            level.destroyBlock(pos, true);
        }
        else {
            player.displayClientMessage(TextUtils.getTranslation("block.feast.use_container", new ItemStack(Items.BOWL).getHoverName()), true);
        }

        return ItemInteractionResult.SUCCESS;
    }

    protected ItemInteractionResult takeServing(Level level, BlockPos pos, BlockState state, Player player, InteractionHand handIn, Item serving) {
        int servings = state.getValue(SERVINGS);
        BedPart part = state.getValue(PART);
        BlockPos pairPos = pos.relative(getDirectionToOther(part, state.getValue(FACING)));
        BlockState pairState = level.getBlockState(pairPos);
        ItemStack heldItem = player.getItemInHand(handIn);

        level.setBlock(pairPos, pairState.setValue(SERVINGS, servings - 1), 3);
        level.setBlock(pos, state.setValue(SERVINGS, servings - 1), 3);

        if (!player.isCreative()) {
            heldItem.shrink(1);
        }
        if (!player.getInventory().add(new ItemStack(serving))) {
            player.drop(new ItemStack(serving), false);
        }
        level.playSound(null, pos, SoundEvents.ARMOR_EQUIP_GENERIC.value(), SoundSource.PLAYERS, 1.0F, 1.0F);
        return ItemInteractionResult.SUCCESS;
    }
}