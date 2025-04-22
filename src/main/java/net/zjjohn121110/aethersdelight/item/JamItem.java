package net.zjjohn121110.aethersdelight.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class JamItem extends AethersDelightDrinks {
    public JamItem(Properties properties) {
        super(properties);
    }
    public JamItem(Properties properties, boolean hasFoodEffectTooltip) {
        super(properties, hasFoodEffectTooltip);
    }
    public JamItem(Properties properties, boolean hasPotionEffectTooltip, boolean hasCustomTooltip) {
        super(properties, hasPotionEffectTooltip, hasCustomTooltip);
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }
}
