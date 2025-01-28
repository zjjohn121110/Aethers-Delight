package net.zjjohn121110.aethersdelight.item.custom;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.combat.abilities.weapon.HolystoneWeapon;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class HolystoneKnifeItem extends KnifeItem implements HolystoneWeapon {
    public HolystoneKnifeItem() {
        super(AetherItemTiers.HOLYSTONE, new Properties().attributes(KnifeItem.createAttributes(AetherItemTiers.HOLYSTONE, 0.5F, -2.0F)));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        this.dropAmbrosium(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }
}
