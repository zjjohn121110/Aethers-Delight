package net.zjjohn121110.aethersdelight.datagen;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.item.AetherItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;
import net.zjjohn121110.aethersdelight.util.AethersDelightTags;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AethersDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(CommonTags.TOOLS_KNIFE)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(ModTags.KNIVES)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get(),
                        AetherItems.PIG_SLAYER.get()
                );

        this.tag(AetherTags.Items.TREATED_AS_AETHER_ITEM)
                .add(AethersDelightItems.HOLYSTONE_KNIFE.get(),
                        AethersDelightItems.ZANITE_KNIFE.get(),
                        AethersDelightItems.GRAVITITE_KNIFE.get()
                );

        this.tag(AethersDelightTags.Items.GOLDEN_AMBER_HARVESTABLE)
                .add(AetherItems.ZANITE_AXE.get(),
                        AetherItems.GRAVITITE_AXE.get()
                );

        this.tag(AethersDelightTags.Items.NOT_GOLDEN_AMBER_HARVESTABLE)
                .add(Items.WOODEN_AXE,
                        Items.STONE_AXE,
                        Items.IRON_AXE,
                        Items.DIAMOND_AXE,
                        Items.NETHERITE_AXE,
                        AetherItems.SKYROOT_AXE.get(),
                        AetherItems.HOLYSTONE_AXE.get()
                );

        this.tag(Tags.Items.FOODS_VEGETABLE)
                .add(AethersDelightItems.GINGER.get(),
                        AethersDelightItems.PARSNIP.get(),
                        AethersDelightItems.LEEK.get()
                );

        this.tag(AethersDelightTags.CommonItemTags.VEGETABLES_AETHER)
                .add(AethersDelightItems.GINGER.get(),
                        AethersDelightItems.PARSNIP.get(),
                        AethersDelightItems.LEEK.get()
                );

        this.tag(AethersDelightTags.CommonItemTags.VEGETABLES_GINGER).add(AethersDelightItems.GINGER.get());
        this.tag(AethersDelightTags.CommonItemTags.VEGETABLES_PARSNIP).add(AethersDelightItems.PARSNIP.get());
        this.tag(AethersDelightTags.CommonItemTags.VEGETABLES_LEEK).add(AethersDelightItems.LEEK.get());

        this.tag(AethersDelightTags.CommonItemTags.CROPS_GINGER).add(AethersDelightItems.GINGER.get());
        this.tag(AethersDelightTags.CommonItemTags.CROPS_PARSNIP).add(AethersDelightItems.PARSNIP.get());
        this.tag(AethersDelightTags.CommonItemTags.CROPS_LEEK).add(AethersDelightItems.LEEK.get());

        this.tag(AethersDelightTags.CommonItemTags.RAW_MOA).add(AethersDelightItems.RAW_MOA.get(),
                AethersDelightItems.RAW_MOA_CUTS.get()
        );

        this.tag(AethersDelightTags.CommonItemTags.COOKED_MOA).add(AethersDelightItems.COOKED_MOA.get(),
                AethersDelightItems.COOKED_MOA_CUTS.get()
        );

        //Misc Tags
        this.tag(AethersDelightTags.Items.BUCKET)
                .add(Items.WATER_BUCKET,
                        AetherItems.SKYROOT_WATER_BUCKET.get()
                );

        this.tag(AethersDelightTags.Items.STICK)
                .add(Items.STICK,
                        AetherItems.SKYROOT_STICK.get()
                );

        this.tag(CommonTags.FOODS_MILK)
                .add(AetherItems.SKYROOT_MILK_BUCKET.get());

    }
}
