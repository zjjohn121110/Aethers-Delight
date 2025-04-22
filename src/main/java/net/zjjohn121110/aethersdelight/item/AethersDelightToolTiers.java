package net.zjjohn121110.aethersdelight.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.zjjohn121110.aethersdelight.registry.AethersDelightItems;
import net.zjjohn121110.aethersdelight.registry.AethersDelightTags;

public class AethersDelightToolTiers {
    public static final Tier ARKENIUM = new SimpleTier(AethersDelightTags.Blocks.INCORRECT_FOR_ARKENIUM_TOOL,
            750, 5.0f, 2.5f, 11, () -> Ingredient.of(AethersDelightItems.ARKENIUM_INGOT));
}
