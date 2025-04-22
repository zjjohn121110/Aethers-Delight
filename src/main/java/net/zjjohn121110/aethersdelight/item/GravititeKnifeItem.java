package net.zjjohn121110.aethersdelight.item;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.combat.abilities.weapon.GravititeWeapon;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class GravititeKnifeItem extends KnifeItem implements GravititeWeapon {

    public GravititeKnifeItem() {
        super(AetherItemTiers.GRAVITITE, new Properties().attributes(KnifeItem.createAttributes(AetherItemTiers.GRAVITITE, 0.5F, -2.0F)));
    }

    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        this.launchEntity(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }
}
