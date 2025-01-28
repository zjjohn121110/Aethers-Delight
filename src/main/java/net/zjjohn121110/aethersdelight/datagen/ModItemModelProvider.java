package net.zjjohn121110.aethersdelight.datagen;

import com.google.common.collect.Sets;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;

import java.util.Set;
import java.util.stream.Collectors;

import static vectorwing.farmersdelight.data.ItemModels.takeAll;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AethersDelight.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = BuiltInRegistries.ITEM.stream().filter(i -> AethersDelight.MODID.equals(BuiltInRegistries.ITEM.getKey(i).getNamespace()))
                .collect(Collectors.toSet());

        basicItem(AethersDelightItems.RAW_ARKENIUM.get());
        basicItem(AethersDelightItems.ARKENIUM_INGOT.get());
        basicItem(AethersDelightItems.ARKENIUM_NUGGET.get());
        basicItem(AethersDelightItems.GINGER.get());
        basicItem(AethersDelightItems.GINGER_SPICE.get());
        basicItem(AethersDelightItems.GINGERBREAD_DOUGH.get());
        basicItem(AethersDelightItems.GINGERBREAD.get());
        basicItem(AethersDelightItems.GINGERBREAD_MOA.get());
        basicItem(AethersDelightItems.GINGERBREAD_STAR.get());
        basicItem(AethersDelightItems.GINGERBREAD_MAN_BASE.get());
        basicItem(AethersDelightItems.GINGERBREAD_MOA_BASE.get());
        basicItem(AethersDelightItems.GINGERBREAD_STAR_BASE.get());
        basicItem(AethersDelightItems.PEPPERMINT_LEAF.get());
        basicItem(AethersDelightItems.PEPPERMINT_EXTRACT.get());
        basicItem(AethersDelightItems.PARSNIP.get());
        basicItem(AethersDelightItems.COOKED_PARSNIP.get());
        basicItem(AethersDelightItems.LEEK.get());

        basicItem(AethersDelightItems.BLUE_BERRY_JAM.get());
        basicItem(AethersDelightItems.ENCHANTED_BERRY_JAM.get());
        basicItem(AethersDelightItems.BLUE_BERRY_MUFFIN.get());
        basicItem(AethersDelightItems.ENCHANTED_BERRY_MUFFIN.get());
        basicItem(AethersDelightItems.FRIED_MOA_EGG.get());

        basicItem(AethersDelightItems.RAW_MOA.get());
        basicItem(AethersDelightItems.COOKED_MOA.get());
        basicItem(AethersDelightItems.RAW_MOA_CUTS.get());
        basicItem(AethersDelightItems.COOKED_MOA_CUTS.get());
        basicItem(AethersDelightItems.WING.get());
        basicItem(AethersDelightItems.COOKED_WING.get());

        basicItem(AethersDelightItems.WHITE_APPLE_PIE.get());
        basicItem(AethersDelightItems.WHITE_APPLE_PIE_SLICE.get());

        basicItem(AethersDelightItems.SWET_SOUP.get());
        basicItem(AethersDelightItems.GINGER_SOUP.get());
        basicItem(AethersDelightItems.MOA_STEW.get());
        basicItem(AethersDelightItems.FLYING_BEEF_STEW.get());
        basicItem(AethersDelightItems.PARSNIP_PASTA.get());
        basicItem(AethersDelightItems.MOA_EGG_OMELETTE.get());

        basicItem(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get());
        basicItem(AethersDelightItems.PEPPERMINT_CANDY.get());
        basicItem(AethersDelightItems.CANDIED_WHITE_APPLE.get());

        basicItem(AethersDelightItems.COOKIE_CUTTER_MAN.get());
        basicItem(AethersDelightItems.COOKIE_CUTTER_MOA.get());
        basicItem(AethersDelightItems.COOKIE_CUTTER_STAR.get());

        Set<Item> handheldItems = Sets.newHashSet(
                AethersDelightItems.HOLYSTONE_KNIFE.get(),
                AethersDelightItems.ZANITE_KNIFE.get(),
                AethersDelightItems.ARKENIUM_KNIFE.get(),
                AethersDelightItems.GRAVITITE_KNIFE.get()
        );
        takeAll(items, handheldItems.toArray(new Item[0])).forEach(item -> itemHandheldModel(item, resourceItem(itemName(item))));

        basicItem(AethersDelightItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get());
        basicItem(AethersDelightItems.AECHOR_ICE_CREAM.get());
        basicItem(AethersDelightItems.AECHOR_ICE_CREAM_BASE.get());
        basicItem(AethersDelightItems.ROAST_MOA_BLOCK.get());
        basicItem(AethersDelightItems.ROAST_MOA.get());

        Set<Item> mugItems = Sets.newHashSet(
                AethersDelightItems.GINGER_ALE.get(),
                AethersDelightItems.PEPPERMINT_TEA.get());
        takeAll(items, mugItems.toArray(new Item[0])).forEach(item -> itemMugModel(item, resourceItem(itemName(item))));

    }

    public static final ResourceLocation MUG = ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "item/mug");
    public static final String HANDHELD = "item/handheld";



    public void itemHandheldModel(Item item, ResourceLocation texture) {
        withExistingParent(itemName(item), HANDHELD).texture("layer0", texture);
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
}
