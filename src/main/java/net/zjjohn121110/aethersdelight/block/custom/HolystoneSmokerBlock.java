package net.zjjohn121110.aethersdelight.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.zjjohn121110.aethersdelight.block.entity.AethersDelightBlockEntity;
import net.zjjohn121110.aethersdelight.block.entity.HolystoneSmokerBlockEntity;
import org.jetbrains.annotations.Nullable;

public class HolystoneSmokerBlock extends AbstractFurnaceBlock {
    public static final MapCodec<HolystoneSmokerBlock> CODEC = simpleCodec(HolystoneSmokerBlock::new);

    public HolystoneSmokerBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected MapCodec<? extends AbstractFurnaceBlock> codec() {
        return CODEC;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return level.isClientSide() ? null : createTickerHelper(blockEntityType, AethersDelightBlockEntity.HOLYSTONE_SMOKER.get(), AbstractFurnaceBlockEntity::serverTick);
    }

    @Override
    protected void openContainer(Level level, BlockPos blockPos, Player player) {
        if (!level.isClientSide()) {
            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof HolystoneSmokerBlockEntity smokerBlockEntity) {
                player.openMenu(smokerBlockEntity);
            }
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new HolystoneSmokerBlockEntity(blockPos, blockState);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY();
            double d2 = (double)pos.getZ() + 0.5D;
            if (random.nextDouble() < 0.1D) {
                level.playLocalSound(d0, d1, d2, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            level.addParticle(ParticleTypes.SMOKE, d0, d1 + 1.1D, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}
