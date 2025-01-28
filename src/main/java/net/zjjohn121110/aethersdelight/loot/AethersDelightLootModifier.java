package net.zjjohn121110.aethersdelight.loot;

import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.zjjohn121110.aethersdelight.AethersDelight;

import java.util.function.Supplier;

public class AethersDelightLootModifier {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, AethersDelight.MODID);

    public static final Supplier<MapCodec<? extends IGlobalLootModifier>> SUGAR_FROM_SWETS =
            LOOT_MODIFIERS.register("sugar_from_swets", SugarFromSwetsModifier.CODEC);

}
