package net.zjjohn121110.aethersdelight.block.custom;

import com.aetherteam.aether.AetherConfig;
import com.aetherteam.aether.block.AetherBlockStateProperties;
import com.aetherteam.aether.block.natural.AetherBushBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;

import javax.annotation.Nullable;

public class PeppermintBushBlock extends AetherBushBlock {

    public PeppermintBushBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AetherBlockStateProperties.DOUBLE_DROPS);
    }

    @SuppressWarnings("deprecation")
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (AetherConfig.SERVER.berry_bush_consistency.get()) {
            if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
                entity.makeStuckInBlock(state, new Vec3(0.8F, 0.75D, 0.8F));
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (AetherConfig.SERVER.berry_bush_consistency.get()) {
            Block.dropResources(state, level, pos, null, player, ItemStack.EMPTY);
            level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + level.getRandom().nextFloat() * 0.4F);
            level.setBlock(pos, AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, state.getValue(AetherBlockStateProperties.DOUBLE_DROPS)), 1 | 2);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, state));
            return InteractionResult.sidedSuccess(level.isClientSide());
        } else {
            return super.useWithoutItem(state, level, pos, player, hit);
        }
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
        if (tool.getEnchantmentLevel(level.holderOrThrow(Enchantments.SILK_TOUCH)) <= 0) {
            level.setBlock(pos, AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, state.getValue(AetherBlockStateProperties.DOUBLE_DROPS)), 1 | 2);
            if (AetherConfig.SERVER.berry_bush_consistency.get()) { // Destroy stem too if config is enabled.
                level.destroyBlock(pos, true, player);
            }
        }
    }

    @Override
    public void onBlockExploded(BlockState state, Level level, BlockPos pos, Explosion explosion) {
        super.onBlockExploded(state, level, pos, explosion);
        level.setBlock(pos, AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, state.getValue(AetherBlockStateProperties.DOUBLE_DROPS)), 1 | 2);
        if (AetherConfig.SERVER.berry_bush_consistency.get()) { // Destroy stem too if config is enabled.
            level.destroyBlock(pos, true);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        try {
            return AetherConfig.SERVER.berry_bush_consistency.get() ? Shapes.empty() : state.getShape(level, pos);
        } catch (IllegalStateException ignored) { }
        return state.getShape(level, pos);
    }
}
