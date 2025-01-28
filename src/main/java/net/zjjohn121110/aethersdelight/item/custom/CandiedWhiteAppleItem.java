package net.zjjohn121110.aethersdelight.item.custom;

import com.aetherteam.aether.effect.AetherEffects;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.zjjohn121110.aethersdelight.item.AethersDelightFoods;

public class CandiedWhiteAppleItem extends Item {
    public CandiedWhiteAppleItem(Properties pProperties) {
        super(new Properties().food(AethersDelightFoods.CANDIED_WHITE_APPLE));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        if (!level.isClientSide()) {
            user.addEffect(new MobEffectInstance(AetherEffects.REMEDY, 300, 0, false, false, true));
            user.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false, false, true));
        }
        if (user instanceof Player player) {
            if (player instanceof ServerPlayer serverPlayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
                serverPlayer.awardStat(Stats.ITEM_USED.get(this));
            }
        }
        return super.finishUsingItem(stack, level, user);
    }
}
