package net.zjjohn121110.aethersdelight.item.custom;

import net.minecraft.world.item.Tier;
import net.zjjohn121110.aethersdelight.item.AethersDelightToolTiers;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ArkeniumKnifeItem extends KnifeItem {
    public ArkeniumKnifeItem(Tier tier, Properties properties) {
        super(AethersDelightToolTiers.ARKENIUM, new Properties().attributes(KnifeItem.createAttributes(AethersDelightToolTiers.ARKENIUM, 0.5F, -2.0F)));
    }
}
