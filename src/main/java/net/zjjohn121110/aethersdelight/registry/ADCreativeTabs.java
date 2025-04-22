package net.zjjohn121110.aethersdelight.registry;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.aether.item.AetherItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.zjjohn121110.aethersdelight.AethersDelight;

import static com.aetherteam.aether.item.AetherCreativeTabs.AETHER_INGREDIENTS;

@EventBusSubscriber(modid = AethersDelight.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ADCreativeTabs {
    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab tab = event.getTab();

        if (tab == AETHER_INGREDIENTS.get()) {
            event.insertAfter(new ItemStack(AetherItems.ZANITE_GEMSTONE.get()), new ItemStack(AethersDelightItems.RAW_ARKENIUM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.RAW_ARKENIUM.get()), new ItemStack(AethersDelightItems.ARKENIUM_INGOT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ARKENIUM_INGOT.get()), new ItemStack(AethersDelightItems.ARKENIUM_NUGGET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_STICK.get()), new ItemStack(AethersDelightItems.COOKIE_CUTTER_MAN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKIE_CUTTER_MAN.get()), new ItemStack(AethersDelightItems.COOKIE_CUTTER_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKIE_CUTTER_MOA.get()), new ItemStack(AethersDelightItems.COOKIE_CUTTER_STAR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BASE.get()), new ItemStack(AethersDelightItems.PEPPERMINT_EXTRACT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.ZANITE_ORE.get()), new ItemStack(AethersDelightBlocks.ARKENIUM_ORE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherBlocks.SKYROOT_LOG.get()), new ItemStack(AethersDelightBlocks.RAW_ARKENIUM_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.WHITE_FLOWER.get()), new ItemStack(AethersDelightBlocks.WILD_GINGER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.WILD_GINGER.get()), new ItemStack(AethersDelightBlocks.WILD_PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.WILD_PARSNIP.get()), new ItemStack(AethersDelightBlocks.WILD_LEEK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.BERRY_BUSH.get()), new ItemStack(AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.PEPPERMINT_BUSH_STEM.get()), new ItemStack(AethersDelightBlocks.PEPPERMINT_BUSH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FOOD_AND_DRINKS.get()) {
            event.insertAfter(new ItemStack(AetherItems.WHITE_APPLE.get()), new ItemStack(AethersDelightItems.GINGER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGER.get()), new ItemStack(AethersDelightItems.GINGER_SPICE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGER_SPICE.get()), new ItemStack(AethersDelightItems.PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.PARSNIP.get()), new ItemStack(AethersDelightItems.COOKED_PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKED_PARSNIP.get()), new ItemStack(AethersDelightItems.LEEK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.LEEK.get()), new ItemStack(AethersDelightItems.RAW_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.RAW_MOA.get()), new ItemStack(AethersDelightItems.RAW_MOA_CUTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.RAW_MOA_CUTS.get()), new ItemStack(AethersDelightItems.COOKED_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKED_MOA.get()), new ItemStack(AethersDelightItems.COOKED_MOA_CUTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKED_MOA_CUTS.get()), new ItemStack(AethersDelightItems.WING.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.WING.get()), new ItemStack(AethersDelightItems.COOKED_WING.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.COOKED_WING.get()), new ItemStack(AethersDelightItems.WHITE_APPLE_PIE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.WHITE_APPLE_PIE.get()), new ItemStack(AethersDelightItems.WHITE_APPLE_PIE_SLICE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GOLDEN_GUMMY_SWET.get()), new ItemStack(AethersDelightItems.GINGERBREAD_DOUGH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherItems.GINGERBREAD_MAN.get()), new ItemStack(AethersDelightItems.GINGERBREAD_MAN_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GINGERBREAD_MAN.get()), new ItemStack(AethersDelightItems.GINGERBREAD_MOA_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGERBREAD_MOA_BASE.get()), new ItemStack(AethersDelightItems.GINGERBREAD_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGERBREAD_MOA.get()), new ItemStack(AethersDelightItems.GINGERBREAD_STAR_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGERBREAD_STAR_BASE.get()), new ItemStack(AethersDelightItems.GINGERBREAD_STAR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGERBREAD_STAR.get()), new ItemStack(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.ENCHANTED_BERRY.get()), new ItemStack(AethersDelightItems.PEPPERMINT_LEAF.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(AethersDelightItems.PEPPERMINT_EXTRACT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGERBREAD_DOUGH.get()), new ItemStack(AethersDelightItems.GINGERBREAD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherItems.CANDY_CANE.get()), new ItemStack(AethersDelightItems.PEPPERMINT_CANDY.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.CANDY_CANE.get()), new ItemStack(AethersDelightItems.CANDIED_WHITE_APPLE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.CANDIED_WHITE_APPLE.get()), new ItemStack(AethersDelightItems.BLUE_BERRY_JAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.BLUE_BERRY_JAM.get()), new ItemStack(AethersDelightItems.ENCHANTED_BERRY_JAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ENCHANTED_BERRY_JAM.get()), new ItemStack(AethersDelightItems.BLUE_BERRY_MUFFIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.BLUE_BERRY_MUFFIN.get()), new ItemStack(AethersDelightItems.ENCHANTED_BERRY_MUFFIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ENCHANTED_BERRY_JAM.get()), new ItemStack(AethersDelightItems.GINGER_ALE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGER_ALE.get()), new ItemStack(AethersDelightItems.PEPPERMINT_TEA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ENCHANTED_BERRY_MUFFIN.get()), new ItemStack(AethersDelightItems.FRIED_MOA_EGG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.FRIED_MOA_EGG.get()), new ItemStack(AethersDelightItems.SWET_SOUP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.SWET_SOUP.get()), new ItemStack(AethersDelightItems.GINGER_SOUP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.GINGER_SOUP.get()), new ItemStack(AethersDelightItems.MOA_STEW.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.MOA_STEW.get()), new ItemStack(AethersDelightItems.FLYING_BEEF_STEW.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.FLYING_BEEF_STEW.get()), new ItemStack(AethersDelightItems.MOA_EGG_OMELETTE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.MOA_EGG_OMELETTE.get()), new ItemStack(AethersDelightItems.PARSNIP_PASTA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.PARSNIP_PASTA.get()), new ItemStack(AethersDelightItems.ROAST_MOA_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ROAST_MOA_BLOCK.get()), new ItemStack(AethersDelightItems.ROAST_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.ROAST_MOA.get()), new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get()), new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_MILK_BUCKET.get()), new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.ZANITE_BLOCK.get()), new ItemStack(AethersDelightBlocks.ARKENIUM_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.ARKENIUM_BLOCK.get()), new ItemStack(AethersDelightBlocks.ARKENIUM_CHAIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.AEROGEL_WALL.get()), new ItemStack(AethersDelightBlocks.GINGER_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.GINGER_CRATE.get()), new ItemStack(AethersDelightBlocks.PARSNIP_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.PARSNIP_CRATE.get()), new ItemStack(AethersDelightBlocks.LEEK_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.LEEK_CRATE.get()), new ItemStack(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get()), new ItemStack(AethersDelightBlocks.BLUE_BERRY_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AethersDelightBlocks.BLUE_BERRY_CRATE.get()), new ItemStack(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FUNCTIONAL_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.AMBROSIUM_TORCH.get()), new ItemStack(AethersDelightBlocks.ARKENIUM_LANTERN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherBlocks.ALTAR.get()), new ItemStack(AethersDelightBlocks.HOLYSTONE_STOVE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AethersDelightBlocks.HOLYSTONE_STOVE.get()), new ItemStack(AethersDelightBlocks.HOLYSTONE_SMOKER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AethersDelightBlocks.HOLYSTONE_SMOKER.get()), new ItemStack(AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get()), new ItemStack(AethersDelightBlocks.HOLYSTONE_FURNACE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.SKYROOT_HANGING_SIGN.get()), new ItemStack(AethersDelightBlocks.SKYROOT_CABINET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.get()) {
            event.insertAfter(new ItemStack(AetherItems.HOLYSTONE_SWORD.get()), new ItemStack(AethersDelightItems.HOLYSTONE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.ZANITE_SWORD.get()), new ItemStack(AethersDelightItems.ZANITE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GRAVITITE_SWORD.get()), new ItemStack(AethersDelightItems.GRAVITITE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_MILK_BUCKET.get()), new ItemStack(AethersDelightItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
