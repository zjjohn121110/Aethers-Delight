package net.zjjohn121110.aethersdelight.block.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
import vectorwing.farmersdelight.common.block.entity.CabinetBlockEntity;

import java.util.function.Supplier;

public class AethersDelightBlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, AethersDelight.MODID);

    public static final Supplier<BlockEntityType<HolystoneFurnaceBlockEntity>> HOLYSTONE_FURNACE = TILES.register("holystone_furnace", () ->
            BlockEntityType.Builder.of(HolystoneFurnaceBlockEntity::new,
                    new Block[]{AethersDelightBlocks.HOLYSTONE_FURNACE.get()}).build(null)
    );
    public static final Supplier<BlockEntityType<ArkeniumBlastFurnaceBlockEntity>> ARKENIUM_BLAST_FURNACE = TILES.register("arkenium_blast_furnace", () ->
            BlockEntityType.Builder.of(ArkeniumBlastFurnaceBlockEntity::new,
                    new Block[]{AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get()}).build(null)
    );
    public static final Supplier<BlockEntityType<HolystoneSmokerBlockEntity>> HOLYSTONE_SMOKER = TILES.register("holystone_smoker", () ->
            BlockEntityType.Builder.of(HolystoneSmokerBlockEntity::new,
                    new Block[]{AethersDelightBlocks.HOLYSTONE_SMOKER.get()}).build(null)
    );
    public static final Supplier<BlockEntityType<HolystoneStoveBlockEntity>> HOLYSTONE_STOVE = TILES.register("holystone_stove", () ->
            BlockEntityType.Builder.of(HolystoneStoveBlockEntity::new,
                    new Block[]{AethersDelightBlocks.HOLYSTONE_STOVE.get()}).build(null)
    );
    public static final Supplier<BlockEntityType<AetherCabinetBlockEntity>> CABINET = TILES.register("aether_cabinet", () ->
            BlockEntityType.Builder.of(AetherCabinetBlockEntity::new,
                    new Block[]{AethersDelightBlocks.SKYROOT_CABINET.get()}).build(null)
    );
}
