package net.zjjohn121110.aethersdelight.block;

import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.custom.*;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import java.util.function.Supplier;

public class AethersDelightBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AethersDelight.MODID);

    public static final DeferredBlock<Block> ARKENIUM_BLOCK = registerBlock("arkenium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RAW_ARKENIUM_BLOCK = registerBlock("raw_arkenium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredBlock<Block> ARKENIUM_ORE = registerBlock("arkenium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ARKENIUM_CHAIN = registerBlock("arkenium_chain",
            () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<LanternBlock> ARKENIUM_LANTERN = registerBlock("arkenium_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN).lightLevel(s -> 15)));

    public static final DeferredBlock<Block> GINGER_CRATE = registerBlock("ginger_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.POTATO_CRATE.get())));
    public static final DeferredBlock<Block> PARSNIP_CRATE = registerBlock("parsnip_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.CARROT_CRATE.get())));
    public static final DeferredBlock<Block> LEEK_CRATE = registerBlock("leek_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.ONION_CRATE.get())));
    public static final DeferredBlock<Block> PEPPERMINT_LEAF_BAG = registerBlock("peppermint_leaf_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.RICE_BAG.get())));
    public static final DeferredBlock<Block> BLUE_BERRY_CRATE = registerBlock("blue_berry_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.ONION_CRATE.get())));
    public static final DeferredBlock<Block> ENCHANTED_BERRY_CRATE = registerBlock("enchanted_berry_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.ONION_CRATE.get())));

    public static final DeferredBlock<Block> PEPPERMINT_BUSH = registerBlock("peppermint_bush",
            () -> new PeppermintBushBlock(BlockBehaviour.Properties.ofFullCopy(AetherBlocks.BERRY_BUSH.get()).pushReaction(PushReaction.DESTROY)
                    .strength(0.2F).sound(SoundType.GRASS).noOcclusion()));
    public static final DeferredBlock<Block> PEPPERMINT_BUSH_STEM = registerBlock("peppermint_bush_stem",
            () -> new PeppermintBushStemBlock(Block.Properties.ofFullCopy(AetherBlocks.BERRY_BUSH_STEM.get()).pushReaction(PushReaction.DESTROY)
                    .strength(0.2F).sound(SoundType.GRASS).noCollission()));
    
    public static final DeferredBlock<Block> HOLYSTONE_FURNACE = registerBlock("holystone_furnace",
            () -> new HolystoneFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).noOcclusion()));
    public static final DeferredBlock<Block> ARKENIUM_BLAST_FURNACE = registerBlock("arkenium_blast_furnace",
            () -> new ArkeniumBlastFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).noOcclusion()));
    public static final DeferredBlock<Block> HOLYSTONE_SMOKER = registerBlock("holystone_smoker",
            () -> new HolystoneSmokerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOKER).noOcclusion()));
    public static final DeferredBlock<Block> HOLYSTONE_STOVE = registerBlock("holystone_stove",
            () -> new HolystoneStoveBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).noOcclusion()));

    public static final DeferredBlock<Block> GINGER_CROP = BLOCKS.register("ginger_crop",
            () -> new GingerCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> PARSNIP_CROP = BLOCKS.register("parsnip_crop",
            () -> new ParsnipCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> LEEK_CROP = BLOCKS.register("leek_crop",
            () -> new LeekCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).noOcclusion().noCollission()));

    public static final DeferredBlock<Block> SKYROOT_CABINET = registerBlock("skyroot_cabinet",
            () -> new AetherCabinetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));

    public static final DeferredBlock<Block> WILD_GINGER = registerBlock("wild_ginger",
            () -> new FlowerBlock(MobEffects.CONFUSION, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> WILD_PARSNIP = registerBlock("wild_parsnip",
            () -> new FlowerBlock(MobEffects.CONFUSION, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> WILD_LEEK = registerBlock("wild_leek",
            () -> new FlowerBlock(MobEffects.CONFUSION, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).noOcclusion().noCollission()));

    public static final DeferredBlock<Block> WHITE_APPLE_PIE = BLOCKS.register("white_apple_pie",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), AethersDelightItems.WHITE_APPLE_PIE_SLICE));

    public static final DeferredBlock<Block> AECHOR_ICE_CREAM_BUCKET_BLOCK = BLOCKS.register("aechor_ice_cream_bucket_block",
            () -> new AechorIceCreamBucketBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), AethersDelightItems.AECHOR_ICE_CREAM, true));
    public static final DeferredBlock<Block> ROAST_MOA = BLOCKS.register("roast_moa_block",
            () -> new RoastMoaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        AethersDelightItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
