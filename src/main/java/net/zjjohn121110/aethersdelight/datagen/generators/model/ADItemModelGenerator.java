package net.zjjohn121110.aethersdelight.datagen.generators.model;

import com.google.common.collect.Sets;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.registry.ADItems;

import java.util.Set;
import java.util.stream.Collectors;

import static vectorwing.farmersdelight.data.ItemModels.takeAll;

public class ADItemModelGenerator extends ItemModelProvider {
    public ADItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AethersDelight.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = BuiltInRegistries.ITEM.stream().filter(i -> AethersDelight.MODID.equals(BuiltInRegistries.ITEM.getKey(i).getNamespace()))
                .collect(Collectors.toSet());

        basicItem(ADItems.RAW_ARKENIUM.get());
        basicItem(ADItems.ARKENIUM_INGOT.get());
        basicItem(ADItems.ARKENIUM_NUGGET.get());
        basicItem(ADItems.GINGER.get());
        basicItem(ADItems.GINGER_SPICE.get());
        basicItem(ADItems.GINGERBREAD_DOUGH.get());
        basicItem(ADItems.GINGERBREAD.get());
        basicItem(ADItems.GINGERBREAD_MOA.get());
        basicItem(ADItems.GINGERBREAD_STAR.get());
        basicItem(ADItems.GINGERBREAD_MAN_BASE.get());
        basicItem(ADItems.GINGERBREAD_MOA_BASE.get());
        basicItem(ADItems.GINGERBREAD_STAR_BASE.get());
        basicItem(ADItems.PEPPERMINT_LEAF.get());
        basicItem(ADItems.PEPPERMINT_EXTRACT.get());
        basicItem(ADItems.PARSNIP.get());
        basicItem(ADItems.COOKED_PARSNIP.get());
        basicItem(ADItems.LEEK.get());

        basicItem(ADItems.BLUE_BERRY_JAM.get());
        basicItem(ADItems.ENCHANTED_BERRY_JAM.get());
        basicItem(ADItems.BLUE_BERRY_MUFFIN.get());
        basicItem(ADItems.ENCHANTED_BERRY_MUFFIN.get());
        basicItem(ADItems.FRIED_MOA_EGG.get());

        basicItem(ADItems.RAW_MOA.get());
        basicItem(ADItems.COOKED_MOA.get());
        basicItem(ADItems.RAW_MOA_CUTS.get());
        basicItem(ADItems.COOKED_MOA_CUTS.get());
        basicItem(ADItems.WING.get());
        basicItem(ADItems.COOKED_WING.get());

        basicItem(ADItems.WHITE_APPLE_PIE.get());
        basicItem(ADItems.WHITE_APPLE_PIE_SLICE.get());

        basicItem(ADItems.SWET_SOUP.get());
        basicItem(ADItems.GINGER_SOUP.get());
        basicItem(ADItems.MOA_STEW.get());
        basicItem(ADItems.FLYING_BEEF_STEW.get());
        basicItem(ADItems.PARSNIP_PASTA.get());
        basicItem(ADItems.MOA_EGG_OMELETTE.get());

        basicItem(ADItems.PEPPERMINT_CANDY_DOUGH.get());
        basicItem(ADItems.PEPPERMINT_CANDY.get());
        basicItem(ADItems.CANDIED_WHITE_APPLE.get());

        basicItem(ADItems.COOKIE_CUTTER_MAN.get());
        basicItem(ADItems.COOKIE_CUTTER_MOA.get());
        basicItem(ADItems.COOKIE_CUTTER_STAR.get());

        
        Set<Item> flatBlockItems = Sets.newHashSet(
            ADItems.WILD_GINGER.get(),
            ADItems.WILD_LEEK.get(),
            ADItems.WILD_PARSNIP.get()
		);
		takeAll(items, flatBlockItems.toArray(new Item[0])).forEach(item -> itemGeneratedModel(item, resourceBlock(itemName(item))));

        Set<Item> handheldItems = Sets.newHashSet(
                ADItems.HOLYSTONE_KNIFE.get(),
                ADItems.ZANITE_KNIFE.get(),
                ADItems.ARKENIUM_KNIFE.get(),
                ADItems.GRAVITITE_KNIFE.get()
        );
        takeAll(items, handheldItems.toArray(new Item[0])).forEach(item -> itemHandheldModel(item, resourceItem(itemName(item))));

        basicItem(ADItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get());
        basicItem(ADItems.AECHOR_ICE_CREAM.get());
        basicItem(ADItems.AECHOR_ICE_CREAM_BASE.get());
        basicItem(ADItems.ROAST_MOA_BLOCK.get());
        basicItem(ADItems.ROAST_MOA.get());

        Set<Item> mugItems = Sets.newHashSet(
                ADItems.GINGER_ALE.get(),
                ADItems.PEPPERMINT_TEA.get());
        takeAll(items, mugItems.toArray(new Item[0])).forEach(item -> itemMugModel(item, resourceItem(itemName(item))));

    }

    public static final ResourceLocation MUG = ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "item/mug");
    public static final String GENERATED = "item/generated";
    public static final String HANDHELD = "item/handheld";



    public void itemHandheldModel(Item item, ResourceLocation texture) {
        withExistingParent(itemName(item), HANDHELD).texture("layer0", texture);
    }

    public void itemGeneratedModel(Item item, ResourceLocation texture) {
        withExistingParent(itemName(item), GENERATED).texture("layer0", texture);
    }

    public void itemMugModel(Item item, ResourceLocation texture) {
        withExistingParent(itemName(item), MUG).texture("layer0", texture);
    }
    private String itemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    public ResourceLocation resourceItem(String path) {
        return ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "item/" + path);
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "block/" + path);
    }
}
