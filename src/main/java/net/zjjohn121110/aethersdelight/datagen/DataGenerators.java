package net.zjjohn121110.aethersdelight.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.datagen.generators.ADBlockTagGenerator;
import net.zjjohn121110.aethersdelight.datagen.generators.ADDatapackGenerator;
import net.zjjohn121110.aethersdelight.datagen.generators.ADItemTagGenerator;
import net.zjjohn121110.aethersdelight.datagen.generators.ADRecipeGenerator;
import net.zjjohn121110.aethersdelight.datagen.providers.ADBlockStateProvider;
import net.zjjohn121110.aethersdelight.datagen.providers.ADItemModelProvider;
import net.zjjohn121110.aethersdelight.datagen.providers.loot.ADBlockLoot;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AethersDelight.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ADRecipeGenerator(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ADBlockLoot::new, LootContextParamSets.BLOCK)), lookupProvider));

        generator.addProvider(event.includeClient(), new ADBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ADItemModelProvider(packOutput, existingFileHelper));

        BlockTagsProvider blockTagsProvider = new ADBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ADItemTagGenerator(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));


        generator.addProvider(event.includeServer(), new ADDatapackGenerator(packOutput, lookupProvider));

    }
}
