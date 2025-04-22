package net.zjjohn121110.aethersdelight.registry;

import com.aetherteam.aether.item.food.AetherFoods;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.item.*;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class AethersDelightItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AethersDelight.MODID);

    //Ores
    public static final DeferredItem<Item> RAW_ARKENIUM = ITEMS.register("raw_arkenium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARKENIUM_INGOT = ITEMS.register("arkenium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARKENIUM_NUGGET = ITEMS.register("arkenium_nugget",
            () -> new Item(new Item.Properties()));

    //Ginger Stuff
    public static final DeferredItem<Item> GINGER_SPICE = ITEMS.register("ginger_spice",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GINGERBREAD_DOUGH = ITEMS.register("gingerbread_dough",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.GINGERBREAD_DOUGH)));
    public static final DeferredItem<Item> GINGERBREAD = ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.GINGERBREAD)));
    public static final DeferredItem<Item> GINGERBREAD_MOA = ITEMS.register("gingerbread_moa",
            () -> new Item(new Item.Properties().food(AetherFoods.GINGERBREAD_MAN)));
    public static final DeferredItem<Item> GINGERBREAD_STAR = ITEMS.register("gingerbread_star",
            () -> new Item(new Item.Properties().food(AetherFoods.GINGERBREAD_MAN)));
    public static final DeferredItem<Item> GINGERBREAD_MAN_BASE = ITEMS.register("gingerbread_man_base",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.GINGERBREAD_COOKIE_BASE)));
    public static final DeferredItem<Item> GINGERBREAD_MOA_BASE = ITEMS.register("gingerbread_moa_base",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.GINGERBREAD_COOKIE_BASE)));
    public static final DeferredItem<Item> GINGERBREAD_STAR_BASE = ITEMS.register("gingerbread_star_base",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.GINGERBREAD_COOKIE_BASE)));

    //Confectionary
    public static final DeferredItem<Item> PEPPERMINT_CANDY_DOUGH = ITEMS.register("peppermint_candy_dough",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.CANDY_DOUGH)));
    public static final DeferredItem<Item> PEPPERMINT_CANDY = ITEMS.register("peppermint_candy",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.PEPPERMINT_CANDY)));
    public static final DeferredItem<Item> CANDIED_WHITE_APPLE = ITEMS.register("candied_white_apple",
            () -> new CandiedWhiteAppleItem(new Item.Properties()));

    //Peppermint
    public static final DeferredItem<Item> PEPPERMINT_LEAF = ITEMS.register("peppermint_leaf",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.PEPPERMINT_LEAF)));
    public static final DeferredItem<Item> PEPPERMINT_EXTRACT = ITEMS.register("peppermint_extract",
            () -> new Item(bottleItem()));

    //Crops
    public static final DeferredItem<Item> GINGER = ITEMS.register("ginger",
            () -> new ItemNameBlockItem(AethersDelightBlocks.GINGER_CROP.get(), new Item.Properties().food(AethersDelightFoods.GINGER)));
    public static final DeferredItem<Item> PARSNIP = ITEMS.register("parsnip",
            () -> new ItemNameBlockItem(AethersDelightBlocks.PARSNIP_CROP.get(), new Item.Properties().food(AethersDelightFoods.PARSNIP)));
    public static final DeferredItem<Item> LEEK = ITEMS.register("leek",
            () -> new ItemNameBlockItem(AethersDelightBlocks.LEEK_CROP.get(), new Item.Properties().food(AethersDelightFoods.LEEK)));

    //Wild Crops
    public static final DeferredItem<Item> WILD_GINGER = ITEMS.register("wild_ginger",
            () -> new BlockItem(AethersDelightBlocks.WILD_GINGER.get(), basicItem()));
    public static final DeferredItem<Item> WILD_PARSNIP = ITEMS.register("wild_parsnip",
            () -> new BlockItem(AethersDelightBlocks.WILD_PARSNIP.get(), basicItem()));
    public static final DeferredItem<Item> WILD_LEEK = ITEMS.register("wild_leek",
            () -> new BlockItem(AethersDelightBlocks.WILD_LEEK.get(), basicItem()));

    //Drinks and Jams
    public static final DeferredItem<Item> GINGER_ALE = ITEMS.register("ginger_ale",
            () -> new GingerAleItem(bottleItem().food(AethersDelightFoods.GINGER_ALE), true, false));
    public static final DeferredItem<Item> PEPPERMINT_TEA = ITEMS.register("peppermint_tea",
            () -> new AethersDelightDrinks(bottleItem().food(AethersDelightFoods.PEPPERMINT_TEA), true, false));
    public static final DeferredItem<Item> BLUE_BERRY_JAM = ITEMS.register("blue_berry_jam",
            () -> new JamItem(bottleItem().food(AethersDelightFoods.BLUE_BERRY_JAM)));
    public static final DeferredItem<Item> ENCHANTED_BERRY_JAM = ITEMS.register("enchanted_berry_jam",
            () -> new JamItem(bottleItem().food(AethersDelightFoods.ENCHANTED_BERRY_JAM)));
    public static final DeferredItem<Item> AECHOR_ICE_CREAM_BASE = ITEMS.register("aechor_ice_cream_base",
            () -> new Item(new Item.Properties()));

    //Finger Foods
    public static final DeferredItem<Item> BLUE_BERRY_MUFFIN = ITEMS.register("blue_berry_muffin",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.BLUE_BERRY_MUFFIN)));
    public static final DeferredItem<Item> ENCHANTED_BERRY_MUFFIN = ITEMS.register("enchanted_berry_muffin",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.ENCHANTED_BERRY_MUFFIN)));
    public static final DeferredItem<Item> FRIED_MOA_EGG = ITEMS.register("fried_moa_egg",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.FRIED_MOA_EGG)));
    public static final DeferredItem<Item> COOKED_PARSNIP = ITEMS.register("cooked_parsnip",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.COOKED_PARSNIP)));

    //Meats
    public static final DeferredItem<Item> RAW_MOA = ITEMS.register("raw_moa",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.RAW_MOA)));
    public static final DeferredItem<Item> COOKED_MOA = ITEMS.register("cooked_moa",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.COOKED_MOA)));
    public static final DeferredItem<Item> RAW_MOA_CUTS = ITEMS.register("raw_moa_cuts",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.RAW_MOA_CUTS)));
    public static final DeferredItem<Item> COOKED_MOA_CUTS = ITEMS.register("cooked_moa_cuts",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.COOKED_MOA_CUTS)));
    public static final DeferredItem<Item> WING = ITEMS.register("wing",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.WINGS)));
    public static final DeferredItem<Item> COOKED_WING = ITEMS.register("cooked_wing",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.COOKED_WINGS)));

    public static final DeferredItem<Item> WHITE_APPLE_PIE = ITEMS.register("white_apple_pie",
            () -> new BlockItem(AethersDelightBlocks.WHITE_APPLE_PIE.get(), basicItem()));
    public static final DeferredItem<Item> WHITE_APPLE_PIE_SLICE = ITEMS.register("white_apple_pie_slice",
            () -> new Item(new Item.Properties().food(AethersDelightFoods.WHITE_APPLE_PIE_SLICE)));

    //Meals
    public static final DeferredItem<Item> SWET_SOUP = ITEMS.register("swet_soup",
            () -> new AethersDelightDrinks(bowlFoodItem(AethersDelightFoods.SWET_SOUP), true, false));
    public static final DeferredItem<Item> GINGER_SOUP = ITEMS.register("ginger_soup",
            () -> new AethersDelightDrinks(bowlFoodItem(AethersDelightFoods.GINGER_SOUP), true, false));
    public static final DeferredItem<Item> MOA_STEW = ITEMS.register("moa_stew",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.MOA_STEW), true, false));
    public static final DeferredItem<Item> FLYING_BEEF_STEW = ITEMS.register("flying_beef_stew",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.FLYING_BEEF_STEW), true, false));
    public static final DeferredItem<Item> PARSNIP_PASTA = ITEMS.register("parsnip_pasta",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.PARSNIP_PASTA), true, false));
    public static final DeferredItem<Item> MOA_EGG_OMELETTE = ITEMS.register("moa_egg_omelette",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.MOA_EGG_OMELETTE), true, false));

    //Feasts
    public static final DeferredItem<Item> AECHOR_ICE_CREAM_BUCKET_BLOCK = ITEMS.register("aechor_ice_cream_bucket_block",
            () -> new BlockItem(AethersDelightBlocks.AECHOR_ICE_CREAM_BUCKET_BLOCK.get(), basicItem().stacksTo(1)));
    public static final DeferredItem<Item> AECHOR_ICE_CREAM = ITEMS.register("aechor_ice_cream",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.AECHOR_ICE_CREAM), true, false));
    public static final DeferredItem<Item> ROAST_MOA_BLOCK = ITEMS.register("roast_moa_block",
            () -> new BlockItem(AethersDelightBlocks.ROAST_MOA.get(), basicItem().stacksTo(1)));
    public static final DeferredItem<Item> ROAST_MOA = ITEMS.register("roast_moa",
            () -> new ConsumableItem(bowlFoodItem(AethersDelightFoods.ROAST_MOA), true, false));

    //Cutters
    public static final DeferredItem<Item> COOKIE_CUTTER_MAN = ITEMS.register("cookie_cutter_man",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COOKIE_CUTTER_MOA = ITEMS.register("cookie_cutter_moa",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COOKIE_CUTTER_STAR = ITEMS.register("cookie_cutter_star",
            () -> new Item(new Item.Properties()));

    //Knives
    public static final DeferredItem<Item> HOLYSTONE_KNIFE = ITEMS.register("holystone_knife",
            () -> new HolystoneKnifeItem());
    public static final DeferredItem<Item> ZANITE_KNIFE = ITEMS.register("zanite_knife",
            () -> new ZaniteKnifeItem());
    public static final DeferredItem<Item> GRAVITITE_KNIFE = ITEMS.register("gravitite_knife",
            () -> new GravititeKnifeItem());
    public static final DeferredItem<Item> ARKENIUM_KNIFE = ITEMS.register("arkenium_knife",
            () -> new KnifeItem(AethersDelightToolTiers.ARKENIUM, new Item.Properties().attributes(KnifeItem
                    .createAttributes(AethersDelightToolTiers.ARKENIUM, 0.5F, -2.0F))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static Item.Properties bottleItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }


}
