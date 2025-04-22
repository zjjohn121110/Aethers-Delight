package net.zjjohn121110.aethersdelight.datagen.providers.loot;


import com.aetherteam.aether.loot.functions.DoubleDrops;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.zjjohn121110.aethersdelight.registry.AethersDelightBlocks;
import net.zjjohn121110.aethersdelight.block.GingerCropBlock;
import net.zjjohn121110.aethersdelight.block.LeekCropBlock;
import net.zjjohn121110.aethersdelight.block.ParsnipCropBlock;
import net.zjjohn121110.aethersdelight.registry.AethersDelightItems;

import java.util.HashSet;
import java.util.Set;

public class ADBlockLoot extends BlockLootSubProvider {
    public ADBlockLoot(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(AethersDelightBlocks.ARKENIUM_BLOCK.get());
        this.dropSelf(AethersDelightBlocks.ARKENIUM_CHAIN.get());
        this.dropSelf(AethersDelightBlocks.ARKENIUM_LANTERN.get());
        this.dropSelf(AethersDelightBlocks.RAW_ARKENIUM_BLOCK.get());
        this.add(AethersDelightBlocks.ARKENIUM_ORE.get(), (block) -> this.createOreDrop(block, AethersDelightItems.RAW_ARKENIUM.get()));

        this.dropSelf(AethersDelightBlocks.HOLYSTONE_FURNACE.get());
        this.dropSelf(AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get());
        this.dropSelf(AethersDelightBlocks.HOLYSTONE_SMOKER.get());
        this.dropSelf(AethersDelightBlocks.HOLYSTONE_STOVE.get());

        this.dropSelf(AethersDelightBlocks.SKYROOT_CABINET.get());

        this.dropSelf(AethersDelightBlocks.GINGER_CRATE.get());
        this.dropSelf(AethersDelightBlocks.PARSNIP_CRATE.get());
        this.dropSelf(AethersDelightBlocks.LEEK_CRATE.get());
        this.dropSelf(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get());
        this.dropSelf(AethersDelightBlocks.BLUE_BERRY_CRATE.get());
        this.dropSelf(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get());

        LootItemCondition.Builder gingercroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(AethersDelightBlocks.GINGER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GingerCropBlock.AGE, 4));
        this.add(AethersDelightBlocks.GINGER_CROP.get(), createCropDrops(AethersDelightBlocks.GINGER_CROP.get(), AethersDelightItems.GINGER.get(),
                AethersDelightItems.GINGER.get(), gingercroplootbuilder));

        LootItemCondition.Builder parsnipcroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(AethersDelightBlocks.PARSNIP_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ParsnipCropBlock.AGE, 4));
        this.add(AethersDelightBlocks.PARSNIP_CROP.get(), createCropDrops(AethersDelightBlocks.PARSNIP_CROP.get(), AethersDelightItems.PARSNIP.get(),
                AethersDelightItems.PARSNIP.get(), parsnipcroplootbuilder));

        LootItemCondition.Builder leekcroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(AethersDelightBlocks.LEEK_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LeekCropBlock.AGE, 4));
        this.add(AethersDelightBlocks.LEEK_CROP.get(), createCropDrops(AethersDelightBlocks.LEEK_CROP.get(), AethersDelightItems.LEEK.get(),
                AethersDelightItems.LEEK.get(), leekcroplootbuilder));

        this.dropOther(AethersDelightBlocks.WILD_GINGER.get(), AethersDelightItems.GINGER.get());
        this.dropOther(AethersDelightBlocks.WILD_PARSNIP.get(), AethersDelightItems.PARSNIP.get());
        this.dropOther(AethersDelightBlocks.WILD_LEEK.get(), AethersDelightItems.LEEK.get());

        this.add(AethersDelightBlocks.PEPPERMINT_BUSH.get(), (bush) -> droppingBerryBush(bush,
                AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get(), AethersDelightItems.PEPPERMINT_LEAF.get()));
        this.dropSelfDouble(AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get());
    }

    private final Set<Block> generatedLootTables = new HashSet<>();

    @Override
    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }

    public void dropSelfDouble(Block pBlock) {
        this.dropOther(pBlock, pBlock);
    }

    public LootTable.Builder droppingBerryBush(Block block, Block stem, Item drop) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(this.applyExplosionDecay(block, LootItem.lootTableItem(drop)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                        .apply(ApplyBonusCount.addUniformBonusCount(this.registries.holderOrThrow(Enchantments.FORTUNE))))
                .when(this.hasSilkTouch().invert())
                .apply(DoubleDrops.builder())
        ).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(block))
                .when(this.hasSilkTouch())
        ).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(stem)
                        .when(LootItemEntityPropertyCondition.entityPresent(LootContext.EntityTarget.THIS).invert()))
        );
    }
}
