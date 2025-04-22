package net.zjjohn121110.aethersdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GingerAleItem extends AethersDelightDrinks {
    public GingerAleItem(Properties properties) {
        super(properties);
    }
    public GingerAleItem(Properties properties, boolean hasFoodEffectTooltip) {
        super(properties, hasFoodEffectTooltip);
    }
    public GingerAleItem(Properties properties, boolean hasPotionEffectTooltip, boolean hasCustomTooltip) {
        super(properties, hasPotionEffectTooltip, hasCustomTooltip);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide) {
            pEntityLiving.removeEffect(MobEffects.CONFUSION);
            pEntityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300));
        }

        return pStack;
    }
}
