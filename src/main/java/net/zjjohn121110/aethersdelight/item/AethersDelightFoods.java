package net.zjjohn121110.aethersdelight.item;

import com.aetherteam.aether.effect.AetherEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class AethersDelightFoods {
    //Vegetables
    public static final FoodProperties GINGER = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.2f).build();
    public static final FoodProperties PEPPERMINT_LEAF = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties PARSNIP = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.3f).build();
    public static final FoodProperties LEEK = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties CUT_PARSNIP = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.15f).build();

    //Meats
    public static final FoodProperties RAW_MOA = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties COOKED_MOA = new FoodProperties.Builder()
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_MOA_CUTS = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties COOKED_MOA_CUTS = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.7f).build();
    public static final FoodProperties WINGS = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.2f).build();
    public static final FoodProperties COOKED_WINGS = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.7f).build();

    //Confectionary
    public static final FoodProperties GINGERBREAD_DOUGH = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties GINGERBREAD = new  FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.4f).build();
    public static final FoodProperties GINGERBREAD_COOKIE_BASE = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.3f).fast()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties CANDY_DOUGH = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.2f).build();
    public static final FoodProperties PEPPERMINT_CANDY = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.1f).fast().build();
    public static final FoodProperties CANDIED_WHITE_APPLE = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.1f).fast().alwaysEdible().build();

    //Drinks and Jam
    public static final FoodProperties BLUE_BERRY_JAM = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.3f).build();
    public static final FoodProperties ENCHANTED_BERRY_JAM = new FoodProperties.Builder()
            .nutrition(10).saturationModifier(0.4f).build();
    public static final FoodProperties GINGER_ALE = new FoodProperties.Builder()
            .alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300), 1.0f).build();
    public static final FoodProperties PEPPERMINT_TEA = new FoodProperties.Builder()
            .alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f).build();

    //Finger Foods
    public static final FoodProperties BLUE_BERRY_MUFFIN = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.6f).build();
    public static final FoodProperties ENCHANTED_BERRY_MUFFIN = new FoodProperties.Builder()
            .nutrition(10).saturationModifier(0.8f).build();
    public static final FoodProperties FRIED_MOA_EGG = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.5f).build();
    public static final FoodProperties PARSNIP_FRIES = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.5f).build();
    public static final FoodProperties COOKED_PARSNIP = new FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.7f).build();

    //Meals and Feast Portions
    public static final FoodProperties SWET_SOUP = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, 900), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100), 1.0f).build();
    public static final FoodProperties GINGER_SOUP = new FoodProperties.Builder()
            .nutrition(8).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, 1800), 1.0f).build();
    public static final FoodProperties MOA_STEW = new FoodProperties.Builder()
            .nutrition(10).saturationModifier(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, 3600), 1.0f).build();
    public static final FoodProperties FLYING_BEEF_STEW = new FoodProperties.Builder()
            .nutrition(14).saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, 4800), 1.0f).build();
    public static final FoodProperties MOA_EGG_OMELETTE = new FoodProperties.Builder()
            .nutrition(12).saturationModifier(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 1800), 1.0f).build();
    public static final FoodProperties PARSNIP_PASTA = new FoodProperties.Builder()
            .nutrition(12).saturationModifier(1.1f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 4200), 1.0f).build();
    public static final FoodProperties ROAST_MOA = new FoodProperties.Builder()
            .nutrition(13).saturationModifier(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 6000), 1.0f).build();

    //Misc
    public static final FoodProperties AECHOR_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.4f).build();
    public static final FoodProperties WHITE_APPLE_PIE_SLICE = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.4f).fast()
            .effect(() -> new MobEffectInstance(AetherEffects.REMEDY, 240, 0), 1.0f).build();

}
