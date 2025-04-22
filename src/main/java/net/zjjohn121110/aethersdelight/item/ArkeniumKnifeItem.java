package net.zjjohn121110.aethersdelight.item;

import net.minecraft.world.item.Tier;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ArkeniumKnifeItem extends KnifeItem {
    public ArkeniumKnifeItem(Tier tier, Properties properties) {
        super(AethersDelightToolTiers.ARKENIUM, new Properties().attributes(KnifeItem.createAttributes(AethersDelightToolTiers.ARKENIUM, 0.5F, -2.0F)));
    }
}
