package net.zjjohn121110.aethersdelight.datagen.generators.loot;


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
import net.zjjohn121110.aethersdelight.registry.ADBlocks;
import net.zjjohn121110.aethersdelight.block.GingerCropBlock;
import net.zjjohn121110.aethersdelight.block.LeekCropBlock;
import net.zjjohn121110.aethersdelight.block.ParsnipCropBlock;
import net.zjjohn121110.aethersdelight.registry.ADItems;

import java.util.HashSet;
import java.util.Set;

public class ADBlockLoot extends BlockLootSubProvider {
    public ADBlockLoot(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ADBlocks.ARKENIUM_BLOCK.get());
        this.dropSelf(ADBlocks.ARKENIUM_CHAIN.get());
        this.dropSelf(ADBlocks.ARKENIUM_LANTERN.get());
        this.dropSelf(ADBlocks.RAW_ARKENIUM_BLOCK.get());
        this.add(ADBlocks.ARKENIUM_ORE.get(), (block) -> this.createOreDrop(block, ADItems.RAW_ARKENIUM.get()));

        this.dropSelf(ADBlocks.HOLYSTONE_FURNACE.get());
        this.dropSelf(ADBlocks.ARKENIUM_BLAST_FURNACE.get());
        this.dropSelf(ADBlocks.HOLYSTONE_SMOKER.get());
        this.dropSelf(ADBlocks.HOLYSTONE_STOVE.get());

        this.dropSelf(ADBlocks.SKYROOT_CABINET.get());

        this.dropSelf(ADBlocks.GINGER_CRATE.get());
        this.dropSelf(ADBlocks.PARSNIP_CRATE.get());
        this.dropSelf(ADBlocks.LEEK_CRATE.get());
        this.dropSelf(ADBlocks.PEPPERMINT_LEAF_BAG.get());
        this.dropSelf(ADBlocks.BLUE_BERRY_CRATE.get());
        this.dropSelf(ADBlocks.ENCHANTED_BERRY_CRATE.get());

        LootItemCondition.Builder gingercroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ADBlocks.GINGER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GingerCropBlock.AGE, 4));
        this.add(ADBlocks.GINGER_CROP.get(), createCropDrops(ADBlocks.GINGER_CROP.get(), ADItems.GINGER.get(),
                ADItems.GINGER.get(), gingercroplootbuilder));

        LootItemCondition.Builder parsnipcroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ADBlocks.PARSNIP_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ParsnipCropBlock.AGE, 4));
        this.add(ADBlocks.PARSNIP_CROP.get(), createCropDrops(ADBlocks.PARSNIP_CROP.get(), ADItems.PARSNIP.get(),
                ADItems.PARSNIP.get(), parsnipcroplootbuilder));

        LootItemCondition.Builder leekcroplootbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ADBlocks.LEEK_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LeekCropBlock.AGE, 4));
        this.add(ADBlocks.LEEK_CROP.get(), createCropDrops(ADBlocks.LEEK_CROP.get(), ADItems.LEEK.get(),
                ADItems.LEEK.get(), leekcroplootbuilder));

        this.dropOther(ADBlocks.WILD_GINGER.get(), ADItems.GINGER.get());
        this.dropOther(ADBlocks.WILD_PARSNIP.get(), ADItems.PARSNIP.get());
        this.dropOther(ADBlocks.WILD_LEEK.get(), ADItems.LEEK.get());

        this.add(ADBlocks.PEPPERMINT_BUSH.get(), (bush) -> droppingBerryBush(bush,
                ADBlocks.PEPPERMINT_BUSH_STEM.get(), ADItems.PEPPERMINT_LEAF.get()));
        this.dropSelfDouble(ADBlocks.PEPPERMINT_BUSH_STEM.get());
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
