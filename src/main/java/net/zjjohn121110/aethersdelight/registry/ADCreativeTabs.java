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
            event.insertAfter(new ItemStack(AetherItems.ZANITE_GEMSTONE.get()), new ItemStack(ADItems.RAW_ARKENIUM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.RAW_ARKENIUM.get()), new ItemStack(ADItems.ARKENIUM_INGOT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ARKENIUM_INGOT.get()), new ItemStack(ADItems.ARKENIUM_NUGGET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_STICK.get()), new ItemStack(ADItems.COOKIE_CUTTER_MAN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKIE_CUTTER_MAN.get()), new ItemStack(ADItems.COOKIE_CUTTER_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKIE_CUTTER_MOA.get()), new ItemStack(ADItems.COOKIE_CUTTER_STAR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(ADItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.AECHOR_ICE_CREAM_BASE.get()), new ItemStack(ADItems.PEPPERMINT_EXTRACT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.ZANITE_ORE.get()), new ItemStack(ADBlocks.ARKENIUM_ORE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherBlocks.SKYROOT_LOG.get()), new ItemStack(ADBlocks.RAW_ARKENIUM_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.WHITE_FLOWER.get()), new ItemStack(ADBlocks.WILD_GINGER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.WILD_GINGER.get()), new ItemStack(ADBlocks.WILD_PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.WILD_PARSNIP.get()), new ItemStack(ADBlocks.WILD_LEEK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.BERRY_BUSH.get()), new ItemStack(ADBlocks.PEPPERMINT_BUSH_STEM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.PEPPERMINT_BUSH_STEM.get()), new ItemStack(ADBlocks.PEPPERMINT_BUSH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FOOD_AND_DRINKS.get()) {
            event.insertAfter(new ItemStack(AetherItems.WHITE_APPLE.get()), new ItemStack(ADItems.GINGER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGER.get()), new ItemStack(ADItems.GINGER_SPICE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGER_SPICE.get()), new ItemStack(ADItems.PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.PARSNIP.get()), new ItemStack(ADItems.COOKED_PARSNIP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKED_PARSNIP.get()), new ItemStack(ADItems.LEEK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.LEEK.get()), new ItemStack(ADItems.RAW_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.RAW_MOA.get()), new ItemStack(ADItems.RAW_MOA_CUTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.RAW_MOA_CUTS.get()), new ItemStack(ADItems.COOKED_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKED_MOA.get()), new ItemStack(ADItems.COOKED_MOA_CUTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKED_MOA_CUTS.get()), new ItemStack(ADItems.WING.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.WING.get()), new ItemStack(ADItems.COOKED_WING.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.COOKED_WING.get()), new ItemStack(ADItems.WHITE_APPLE_PIE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.WHITE_APPLE_PIE.get()), new ItemStack(ADItems.WHITE_APPLE_PIE_SLICE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GOLDEN_GUMMY_SWET.get()), new ItemStack(ADItems.GINGERBREAD_DOUGH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherItems.GINGERBREAD_MAN.get()), new ItemStack(ADItems.GINGERBREAD_MAN_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GINGERBREAD_MAN.get()), new ItemStack(ADItems.GINGERBREAD_MOA_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGERBREAD_MOA_BASE.get()), new ItemStack(ADItems.GINGERBREAD_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGERBREAD_MOA.get()), new ItemStack(ADItems.GINGERBREAD_STAR_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGERBREAD_STAR_BASE.get()), new ItemStack(ADItems.GINGERBREAD_STAR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGERBREAD_STAR.get()), new ItemStack(ADItems.PEPPERMINT_CANDY_DOUGH.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.ENCHANTED_BERRY.get()), new ItemStack(ADItems.PEPPERMINT_LEAF.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(ADItems.PEPPERMINT_EXTRACT.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGERBREAD_DOUGH.get()), new ItemStack(ADItems.GINGERBREAD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherItems.CANDY_CANE.get()), new ItemStack(ADItems.PEPPERMINT_CANDY.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.CANDY_CANE.get()), new ItemStack(ADItems.CANDIED_WHITE_APPLE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.CANDIED_WHITE_APPLE.get()), new ItemStack(ADItems.BLUE_BERRY_JAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.BLUE_BERRY_JAM.get()), new ItemStack(ADItems.ENCHANTED_BERRY_JAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ENCHANTED_BERRY_JAM.get()), new ItemStack(ADItems.BLUE_BERRY_MUFFIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.BLUE_BERRY_MUFFIN.get()), new ItemStack(ADItems.ENCHANTED_BERRY_MUFFIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ENCHANTED_BERRY_JAM.get()), new ItemStack(ADItems.GINGER_ALE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGER_ALE.get()), new ItemStack(ADItems.PEPPERMINT_TEA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ENCHANTED_BERRY_MUFFIN.get()), new ItemStack(ADItems.FRIED_MOA_EGG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.FRIED_MOA_EGG.get()), new ItemStack(ADItems.SWET_SOUP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.SWET_SOUP.get()), new ItemStack(ADItems.GINGER_SOUP.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.GINGER_SOUP.get()), new ItemStack(ADItems.MOA_STEW.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.MOA_STEW.get()), new ItemStack(ADItems.FLYING_BEEF_STEW.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.FLYING_BEEF_STEW.get()), new ItemStack(ADItems.MOA_EGG_OMELETTE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.MOA_EGG_OMELETTE.get()), new ItemStack(ADItems.PARSNIP_PASTA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.PARSNIP_PASTA.get()), new ItemStack(ADItems.ROAST_MOA_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ROAST_MOA_BLOCK.get()), new ItemStack(ADItems.ROAST_MOA.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.ROAST_MOA.get()), new ItemStack(ADItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADItems.AECHOR_ICE_CREAM_BUCKET_BLOCK.get()), new ItemStack(ADItems.AECHOR_ICE_CREAM.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_MILK_BUCKET.get()), new ItemStack(ADItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.ZANITE_BLOCK.get()), new ItemStack(ADBlocks.ARKENIUM_BLOCK.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.ARKENIUM_BLOCK.get()), new ItemStack(ADBlocks.ARKENIUM_CHAIN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.AEROGEL_WALL.get()), new ItemStack(ADBlocks.GINGER_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.GINGER_CRATE.get()), new ItemStack(ADBlocks.PARSNIP_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.PARSNIP_CRATE.get()), new ItemStack(ADBlocks.LEEK_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.LEEK_CRATE.get()), new ItemStack(ADBlocks.PEPPERMINT_LEAF_BAG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.PEPPERMINT_LEAF_BAG.get()), new ItemStack(ADBlocks.BLUE_BERRY_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ADBlocks.BLUE_BERRY_CRATE.get()), new ItemStack(ADBlocks.ENCHANTED_BERRY_CRATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FUNCTIONAL_BLOCKS.get()) {
            event.insertAfter(new ItemStack(AetherBlocks.AMBROSIUM_TORCH.get()), new ItemStack(ADBlocks.ARKENIUM_LANTERN.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(AetherBlocks.ALTAR.get()), new ItemStack(ADBlocks.HOLYSTONE_STOVE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(ADBlocks.HOLYSTONE_STOVE.get()), new ItemStack(ADBlocks.HOLYSTONE_SMOKER.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(ADBlocks.HOLYSTONE_SMOKER.get()), new ItemStack(ADBlocks.ARKENIUM_BLAST_FURNACE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(new ItemStack(ADBlocks.ARKENIUM_BLAST_FURNACE.get()), new ItemStack(ADBlocks.HOLYSTONE_FURNACE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherBlocks.SKYROOT_HANGING_SIGN.get()), new ItemStack(ADBlocks.SKYROOT_CABINET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.get()) {
            event.insertAfter(new ItemStack(AetherItems.HOLYSTONE_SWORD.get()), new ItemStack(ADItems.HOLYSTONE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.ZANITE_SWORD.get()), new ItemStack(ADItems.ZANITE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.GRAVITITE_SWORD.get()), new ItemStack(ADItems.GRAVITITE_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(AetherItems.SKYROOT_MILK_BUCKET.get()), new ItemStack(ADItems.AECHOR_ICE_CREAM_BASE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
