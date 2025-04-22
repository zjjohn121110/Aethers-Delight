package net.zjjohn121110.aethersdelight.datagen;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.recipe.AetherRecipeSerializers;
import com.aetherteam.aether.recipe.builder.AetherCookingRecipeBuilder;
import com.aetherteam.aether.recipe.builder.AltarRepairBuilder;
import com.aetherteam.aether.recipe.recipes.item.EnchantingRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.AethersDelightBlocks;
import net.zjjohn121110.aethersdelight.item.AethersDelightItems;
import net.zjjohn121110.aethersdelight.util.AethersDelightTags;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.concurrent.CompletableFuture;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {



        //Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AethersDelightBlocks.ARKENIUM_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.ARKENIUM_INGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_NUGGET.get()), has(AethersDelightItems.ARKENIUM_NUGGET.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "arkenium_nugget_compression"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.GINGER_CRATE.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', AethersDelightItems.GINGER.get())
                .unlockedBy(getHasName(AethersDelightItems.GINGER.get()), has(AethersDelightItems.GINGER.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.PARSNIP_CRATE.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', AethersDelightItems.PARSNIP.get())
                .unlockedBy(getHasName(AethersDelightItems.PARSNIP.get()), has(AethersDelightItems.PARSNIP.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.LEEK_CRATE.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', AethersDelightItems.LEEK.get())
                .unlockedBy(getHasName(AethersDelightItems.LEEK.get()), has(AethersDelightItems.LEEK.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', AethersDelightItems.PEPPERMINT_LEAF.get())
                .unlockedBy(getHasName(AethersDelightItems.PEPPERMINT_LEAF.get()), has(AethersDelightItems.PEPPERMINT_LEAF.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.BLUE_BERRY_CRATE.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', AetherItems.BLUE_BERRY.get())
                .unlockedBy(getHasName(AetherItems.BLUE_BERRY.get()), has(AetherItems.BLUE_BERRY.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', AetherItems.ENCHANTED_BERRY.get())
                .unlockedBy(getHasName(AetherItems.ENCHANTED_BERRY.get()), has(AetherItems.ENCHANTED_BERRY.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.ARKENIUM_LANTERN.get())
                .pattern("NNN")
                .pattern("NTN")
                .pattern("NNN")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .define('T', AetherBlocks.AMBROSIUM_TORCH.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.ARKENIUM_CHAIN.get())
                .pattern(" N ")
                .pattern(" A ")
                .pattern(" N ")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.COOKIE_CUTTER_MAN.get())
                .pattern("NNN")
                .pattern(" N ")
                .pattern("N N")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.COOKIE_CUTTER_MOA.get())
                .pattern("NN ")
                .pattern(" NN")
                .pattern(" N ")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.COOKIE_CUTTER_STAR.get())
                .pattern(" N ")
                .pattern("N N")
                .pattern("N N")
                .define('N', AethersDelightItems.ARKENIUM_NUGGET.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.HOLYSTONE_FURNACE.get())
                .pattern("HHH")
                .pattern("H H")
                .pattern("HHH")
                .define('H', AetherBlocks.HOLYSTONE.get())
                .unlockedBy(getHasName(AetherBlocks.HOLYSTONE.get()), has(AetherBlocks.HOLYSTONE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.ARKENIUM_BLAST_FURNACE.get())
                .pattern("AAA")
                .pattern("AFA")
                .pattern("BBB")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('B', AetherBlocks.HOLYSTONE_BRICKS.get())
                .define('F', AethersDelightBlocks.HOLYSTONE_FURNACE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.HOLYSTONE_FURNACE.get()), has(AethersDelightBlocks.HOLYSTONE_FURNACE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.HOLYSTONE_SMOKER.get())
                .pattern(" L ")
                .pattern("LFL")
                .pattern(" L ")
                .define('L', ItemTags.LOGS)
                .define('F', AethersDelightBlocks.HOLYSTONE_FURNACE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.HOLYSTONE_FURNACE.get()), has(AethersDelightBlocks.HOLYSTONE_FURNACE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.HOLYSTONE_STOVE.get())
                .pattern("AAA")
                .pattern("B B")
                .pattern("BCB")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('B', AetherBlocks.HOLYSTONE_BRICKS.get())
                .define('C', Blocks.CAMPFIRE)
                .unlockedBy(getHasName(AetherBlocks.HOLYSTONE.get()), has(AetherBlocks.HOLYSTONE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.HOLYSTONE_KNIFE.get())
                .pattern("H")
                .pattern("S")
                .define('H', AetherBlocks.HOLYSTONE.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .unlockedBy(getHasName(AetherBlocks.HOLYSTONE.get()), has(AetherBlocks.HOLYSTONE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.ZANITE_KNIFE.get())
                .pattern("Z")
                .pattern("S")
                .define('Z', AetherItems.ZANITE_GEMSTONE.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .unlockedBy(getHasName(AetherItems.ZANITE_GEMSTONE.get()), has(AetherItems.ZANITE_GEMSTONE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightItems.GRAVITITE_KNIFE.get())
                .pattern("G")
                .pattern("S")
                .define('G', AetherBlocks.ENCHANTED_GRAVITITE.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .unlockedBy(getHasName(AetherBlocks.ENCHANTED_GRAVITITE.get()), has(AetherBlocks.ENCHANTED_GRAVITITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AethersDelightBlocks.SKYROOT_CABINET.get())
                .pattern("SSS")
                .pattern("T T")
                .pattern("SSS")
                .define('S', AetherBlocks.SKYROOT_SLAB.get())
                .define('T', AetherBlocks.SKYROOT_TRAPDOOR.get())
                .unlockedBy(getHasName(AetherBlocks.SKYROOT_SLAB.get()), has(AetherBlocks.SKYROOT_SLAB.get()))
                .save(recipeOutput);

        //Recipe Alternatives
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.STONECUTTER)
                .pattern(" A ")
                .pattern("HHH")
                .define('H', AetherBlocks.HOLYSTONE.get())
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "stonecutter_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.ANVIL)
                .pattern("BBB")
                .pattern(" A ")
                .pattern("AAA")
                .define('B', AethersDelightBlocks.ARKENIUM_BLOCK.get())
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "anvil_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.SHIELD)
                .pattern("WAW")
                .pattern("WWW")
                .pattern(" W ")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('W', AetherTags.Items.PLANKS_CRAFTING)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "arkenium_skyroot_vanilla_shield"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.SHIELD)
                .pattern("WAW")
                .pattern("WWW")
                .pattern(" W ")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('W', ItemTags.PLANKS)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "arkenium_vanilla_shield"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SMITHING_TABLE)
                .pattern("II")
                .pattern("SS")
                .pattern("SS")
                .define('S', AetherTags.Items.PLANKS_CRAFTING)
                .define('I', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "skyroot_smithing_table_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SMITHING_TABLE)
                .pattern("II")
                .pattern("SS")
                .pattern("SS")
                .define('S', ItemTags.PLANKS)
                .define('I', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "smithing_table_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.HOPPER)
                .pattern("A A")
                .pattern("ACA")
                .pattern(" A ")
                .define('C', Blocks.CHEST)
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "hopper_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SHEARS)
                .pattern(" A")
                .pattern("A ")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "shears_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.TRIPWIRE_HOOK, 2)
                .pattern("A")
                .pattern("S")
                .pattern("W")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('S', Items.STICK)
                .define('W', ItemTags.PLANKS)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "tripwire_hook_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.TRIPWIRE_HOOK, 2)
                .pattern("A")
                .pattern("S")
                .pattern("W")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .define('W', AetherTags.Items.PLANKS_CRAFTING)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "skyroot_tripwire_hook_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CROSSBOW)
                .pattern("#A#")
                .pattern("SHS")
                .pattern(" # ")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('S', Items.STICK)
                .define('#', Items.STRING)
                .define('H', Items.TRIPWIRE_HOOK)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "crossbow_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CROSSBOW)
                .pattern("#A#")
                .pattern("SHS")
                .pattern(" # ")
                .define('A', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .define('#', Items.STRING)
                .define('H', Items.TRIPWIRE_HOOK)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "skyroot_crossbow_from_arkenium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COOKING_POT.get())
                .pattern("bSb")
                .pattern("iWi")
                .pattern("iii")
                .define('b', AetherItems.SKYROOT_STICK.get())
                .define('S', AetherItems.SKYROOT_SHOVEL.get())
                .define('i', AethersDelightItems.ARKENIUM_INGOT.get())
                .define('W', Tags.Items.BUCKETS_WATER)
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooking_pot_from_arkenium_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SKILLET.get())
                .pattern(" ##")
                .pattern(" ##")
                .pattern("/  ")
                .define('/', AetherItems.SKYROOT_STICK.get())
                .define('#', AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "skillet_from_arkenium_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GLASS_BOTTLE, 3)
                .pattern("Q Q")
                .pattern(" Q ")
                .define('Q', AetherBlocks.QUICKSOIL_GLASS.get())
                .unlockedBy(getHasName(AetherBlocks.QUICKSOIL_GLASS.get()), has(AetherBlocks.QUICKSOIL_GLASS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "glass_bottles_from_quicksoil_glass"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUTTING_BOARD.get())
                .pattern("SPP")
                .pattern("SPP")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('P', AetherTags.Items.PLANKS_CRAFTING)
                .unlockedBy(getHasName(AetherBlocks.SKYROOT_PLANKS.get()), has(AetherBlocks.SKYROOT_PLANKS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cutting_board_from_skyroot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BASKET.get())
                .pattern("S S")
                .pattern("# #")
                .pattern("S#S")
                .define('S', AetherItems.SKYROOT_STICK.get())
                .define('#', ModItems.CANVAS.get())
                .unlockedBy(getHasName(ModItems.CANVAS.get()), has(ModItems.CANVAS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "basket_from_skyroot_sticks"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CANVAS_SIGN.get(), 3)
                .pattern("W#W")
                .pattern("W#W")
                .pattern(" S ")
                .define('W', AetherTags.Items.PLANKS_CRAFTING)
                .define('#', ModItems.CANVAS.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModItems.CANVAS.get()), has(ModItems.CANVAS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "canvas_sign_from_skyroot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HANGING_CANVAS_SIGN.get())
                .pattern("C C")
                .pattern("W#W")
                .pattern("W#W")
                .define('W', ItemTags.LOGS)
                .define('#', ModItems.CANVAS.get())
                .define('C', Items.CHAIN)
                .unlockedBy(getHasName(ModItems.CANVAS.get()), has(ModItems.CANVAS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "hanging_canvas_sign_from_skyroot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BOWL, 4)
                .pattern("WSW")
                .pattern(" W ")
                .define('W', AetherTags.Items.PLANKS_CRAFTING)
                .define('S', AetherItems.SKYROOT_STICK.get())
                .unlockedBy(getHasName(AetherBlocks.SKYROOT_PLANKS.get()), has(AetherBlocks.SKYROOT_PLANKS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "bowl_from_skyroot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PAPER, 3)
                .pattern("PPP")
                .define('P', AetherItems.AECHOR_PETAL.get())
                .unlockedBy(getHasName(AetherItems.AECHOR_PETAL.get()), has(AetherItems.AECHOR_PETAL.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "paper_from_aechor_petals"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AetherItems.CANDY_CANE_SWORD.get())
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .define('C', AetherItems.CANDY_CANE.get())
                .define('S', AetherItems.SKYROOT_STICK.get())
                .unlockedBy(getHasName(AetherItems.CANDY_CANE.get()), has(AetherItems.CANDY_CANE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AethersDelightItems.BLUE_BERRY_MUFFIN.get(), 2)
                .pattern("BSB")
                .pattern("WMW")
                .define('B', AetherItems.BLUE_BERRY.get())
                .define('S', Items.SUGAR)
                .define('W', Items.WHEAT)
                .define('M', CommonTags.FOODS_MILK)
                .unlockedBy(getHasName(AetherItems.BLUE_BERRY.get()), has(AetherItems.BLUE_BERRY.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AethersDelightItems.ENCHANTED_BERRY_MUFFIN.get(), 2)
                .pattern("BSB")
                .pattern("WMW")
                .define('B', AetherItems.ENCHANTED_BERRY.get())
                .define('S', Items.SUGAR)
                .define('W', Items.WHEAT)
                .define('M', CommonTags.FOODS_MILK)
                .unlockedBy(getHasName(AetherItems.ENCHANTED_BERRY.get()), has(AetherItems.ENCHANTED_BERRY.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AethersDelightItems.WHITE_APPLE_PIE.get())
                .pattern("WWW")
                .pattern("AAA")
                .pattern("SPS")
                .define('W', Items.WHEAT)
                .define('A', AetherItems.WHITE_APPLE.get())
                .define('S', Items.SUGAR)
                .define('P', ModItems.PIE_CRUST.get())
                .unlockedBy(getHasName(AetherItems.WHITE_APPLE.get()), has(AetherItems.WHITE_APPLE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AethersDelightItems.WHITE_APPLE_PIE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', AethersDelightItems.WHITE_APPLE_PIE_SLICE.get())
                .unlockedBy(getHasName(AetherItems.WHITE_APPLE.get()), has(AetherItems.WHITE_APPLE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "white_apple_pie_from_slices"));



        //Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.ARKENIUM_INGOT.get(), 9)
                .requires(AethersDelightBlocks.ARKENIUM_BLOCK.get())
                .unlockedBy(getHasName(AethersDelightBlocks.ARKENIUM_BLOCK.get()), has(AethersDelightBlocks.ARKENIUM_BLOCK.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.ARKENIUM_NUGGET.get(), 9)
                .requires(AethersDelightItems.ARKENIUM_INGOT.get())
                .unlockedBy(getHasName(AethersDelightItems.ARKENIUM_INGOT.get()), has(AethersDelightItems.ARKENIUM_INGOT.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.GINGER.get(), 9)
                .requires(AethersDelightBlocks.GINGER_CRATE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.GINGER_CRATE.get()), has(AethersDelightBlocks.GINGER_CRATE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.PARSNIP.get(), 9)
                .requires(AethersDelightBlocks.PARSNIP_CRATE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.PARSNIP_CRATE.get()), has(AethersDelightBlocks.PARSNIP_CRATE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.LEEK.get(), 9)
                .requires(AethersDelightBlocks.LEEK_CRATE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.LEEK_CRATE.get()), has(AethersDelightBlocks.LEEK_CRATE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.PEPPERMINT_LEAF.get(), 9)
                .requires(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get())
                .unlockedBy(getHasName(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get()), has(AethersDelightBlocks.PEPPERMINT_LEAF_BAG.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AetherItems.BLUE_BERRY.get(), 9)
                .requires(AethersDelightBlocks.BLUE_BERRY_CRATE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.BLUE_BERRY_CRATE.get()), has(AethersDelightBlocks.BLUE_BERRY_CRATE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AetherItems.ENCHANTED_BERRY.get(), 9)
                .requires(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get())
                .unlockedBy(getHasName(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get()), has(AethersDelightBlocks.ENCHANTED_BERRY_CRATE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MILK_BOTTLE.get(), 4)
                .requires(AetherItems.SKYROOT_MILK_BUCKET.get())
                .requires(Items.GLASS_BOTTLE, 4)
                .unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "milk_bottles_from_skyroot_bucket"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AethersDelightItems.PEPPERMINT_EXTRACT.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(AethersDelightItems.PEPPERMINT_LEAF.get(),2)
                .unlockedBy(getHasName(AethersDelightItems.PEPPERMINT_LEAF.get()), has(AethersDelightItems.PEPPERMINT_LEAF.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORGANIC_COMPOST.get())
                .requires(AetherBlocks.AETHER_DIRT.get())
                .requires(ModItems.TREE_BARK.get(), 2)
                .requires(ModItems.STRAW.get(), 4)
                .requires(Items.BONE_MEAL, 2)
                .unlockedBy(getHasName(ModItems.STRAW.get()), has(ModItems.STRAW.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "aether_compost_from_bone_meal"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORGANIC_COMPOST.get())
                .requires(AetherBlocks.AETHER_DIRT.get())
                .requires(Items.BONE_MEAL, 4)
                .requires(ModItems.STRAW.get(), 2)
                .requires(Items.ROTTEN_FLESH, 2)
                .unlockedBy(getHasName(ModItems.STRAW.get()), has(ModItems.STRAW.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "aether_compost_from_rotten_flesh"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.WHEAT_DOUGH.get(), 3)
                .requires(AetherItems.SKYROOT_WATER_BUCKET.get())
                .requires(Items.WHEAT, 3)
                .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "wheat_dough_from_skyroot_bucket"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.GINGERBREAD_DOUGH.get(), 3)
                .requires(Tags.Items.EGGS)
                .requires(AethersDelightItems.GINGER_SPICE.get())
                .requires(Items.WHEAT)
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(AethersDelightItems.GINGER_SPICE.get()), has(AethersDelightItems.GINGER_SPICE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.PEPPERMINT_CANDY.get(), 4)
                .requires(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get())
                .unlockedBy(getHasName(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get()), has(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.MOA_EGG_OMELETTE.get())
                .requires(AethersDelightItems.FRIED_MOA_EGG.get())
                .requires(AethersDelightItems.LEEK.get())
                .requires(AethersDelightTags.CommonTags.FOODS_VEGETABLE_AETHER)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(AetherItems.BLUE_MOA_EGG.get()), has(AetherTags.Items.MOA_EGGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.CANDIED_WHITE_APPLE.get())
                .requires(AetherItems.WHITE_APPLE.get())
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(AetherItems.WHITE_APPLE.get()), has(AetherItems.WHITE_APPLE.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.AECHOR_ICE_CREAM_BASE.get())
                .requires(AetherItems.AECHOR_PETAL.get())
                .requires(Items.SUGAR)
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .requires(CommonTags.FOODS_MILK)
                .requires(AetherItems.SKYROOT_BUCKET.get())
                .unlockedBy(getHasName(AetherItems.AECHOR_PETAL.get()), has(AetherItems.AECHOR_PETAL.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AethersDelightItems.ROAST_MOA_BLOCK.get())
                .requires(AethersDelightItems.COOKED_PARSNIP.get())
                .requires(AethersDelightItems.PEPPERMINT_LEAF.get())
                .requires(AethersDelightItems.LEEK.get())
                .requires(AethersDelightItems.COOKED_PARSNIP.get())
                .requires(AethersDelightItems.COOKED_MOA.get())
                .requires(Items.BREAD)
                .requires(AetherItems.BLUE_BERRY.get())
                .requires(Items.BOWL)
                .requires(AetherItems.BLUE_BERRY.get())
                .unlockedBy(getHasName(AethersDelightItems.COOKED_MOA.get()), has(AethersDelightItems.COOKED_MOA.get()))
                .save(recipeOutput);




        //Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.GINGERBREAD_MAN_BASE.get()), RecipeCategory.FOOD,
                        AetherItems.GINGERBREAD_MAN.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_MAN_BASE.get()), has(AethersDelightItems.GINGERBREAD_MAN_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_man_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.GINGERBREAD_MAN_BASE.get()), RecipeCategory.FOOD,
                        AetherItems.GINGERBREAD_MAN.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_MAN_BASE.get()), has(AethersDelightItems.GINGERBREAD_MAN_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_man_from_smoking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.GINGERBREAD_MOA_BASE.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD_MOA.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_MOA_BASE.get()), has(AethersDelightItems.GINGERBREAD_MOA_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_moa_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.GINGERBREAD_MOA_BASE.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD_MOA.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_MOA_BASE.get()), has(AethersDelightItems.GINGERBREAD_MOA_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_moa_from_smoking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.GINGERBREAD_STAR_BASE.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD_STAR.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_STAR_BASE.get()), has(AethersDelightItems.GINGERBREAD_STAR_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_star_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.GINGERBREAD_STAR_BASE.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD_STAR.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_STAR_BASE.get()), has(AethersDelightItems.GINGERBREAD_STAR_BASE.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_star_from_smoking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.GINGERBREAD_DOUGH.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_DOUGH.get()), has(AethersDelightItems.GINGERBREAD_DOUGH.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.GINGERBREAD_DOUGH.get()), RecipeCategory.FOOD,
                        AethersDelightItems.GINGERBREAD.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.GINGERBREAD_DOUGH.get()), has(AethersDelightItems.GINGERBREAD_DOUGH.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "gingerbread_from_smoking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AetherTags.Items.MOA_EGGS), RecipeCategory.FOOD,
                        AethersDelightItems.FRIED_MOA_EGG.get(), 0.5F, 200)
                .unlockedBy(getHasName(AetherItems.BLUE_MOA_EGG.get()), has(AetherTags.Items.MOA_EGGS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "fried_moa_egg_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AetherTags.Items.MOA_EGGS), RecipeCategory.FOOD,
                        AethersDelightItems.FRIED_MOA_EGG.get(), 0.5F, 100)
                .unlockedBy(getHasName(AetherItems.BLUE_MOA_EGG.get()), has(AetherTags.Items.MOA_EGGS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "fried_moa_egg_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(AetherTags.Items.MOA_EGGS), RecipeCategory.FOOD,
                        AethersDelightItems.FRIED_MOA_EGG.get(), 0, 600)
                .unlockedBy(getHasName(AetherItems.BLUE_MOA_EGG.get()), has(AetherTags.Items.MOA_EGGS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "fried_moa_egg_from_campfire_cooking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.RAW_MOA.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA.get()), has(AethersDelightItems.RAW_MOA.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.RAW_MOA.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA.get()), has(AethersDelightItems.RAW_MOA.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(AethersDelightItems.RAW_MOA.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA.get(), 0, 600)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA.get()), has(AethersDelightItems.RAW_MOA.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_from_campfire_cooking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.RAW_MOA_CUTS.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA_CUTS.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA_CUTS.get()), has(AethersDelightItems.RAW_MOA_CUTS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_cuts_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.RAW_MOA_CUTS.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA_CUTS.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA_CUTS.get()), has(AethersDelightItems.RAW_MOA_CUTS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_cuts_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(AethersDelightItems.RAW_MOA_CUTS.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_MOA_CUTS.get(), 0, 600)
                .unlockedBy(getHasName(AethersDelightItems.RAW_MOA_CUTS.get()), has(AethersDelightItems.RAW_MOA_CUTS.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_moa_cuts_from_campfire_cooking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.WING.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_WING.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.WING.get()), has(AethersDelightItems.WING.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_wings_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(AethersDelightItems.WING.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_WING.get(), 0.35F, 100)
                .unlockedBy(getHasName(AethersDelightItems.WING.get()), has(AethersDelightItems.WING.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_wings_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(AethersDelightItems.WING.get()), RecipeCategory.FOOD,
                        AethersDelightItems.COOKED_WING.get(), 0, 600)
                .unlockedBy(getHasName(AethersDelightItems.WING.get()), has(AethersDelightItems.WING.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cooked_wings_from_campfire_cooking"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(AethersDelightItems.RAW_ARKENIUM.get()), RecipeCategory.MISC,
                        AethersDelightItems.ARKENIUM_INGOT.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.RAW_ARKENIUM.get()), has(AethersDelightItems.RAW_ARKENIUM.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "arkenium_from_blasting"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(AethersDelightItems.RAW_ARKENIUM.get()), RecipeCategory.FOOD,
                        AethersDelightItems.ARKENIUM_INGOT.get(), 0.35F, 200)
                .unlockedBy(getHasName(AethersDelightItems.RAW_ARKENIUM.get()), has(AethersDelightItems.RAW_ARKENIUM.get()))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "arkenium_from_smelting"));




        //Cutting Board Recipes
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.GINGER.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), AethersDelightItems.GINGER_SPICE.get(), 2)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get()),
                        Ingredient.of(Items.SHEARS), AetherItems.CANDY_CANE.get(), 4)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.GINGERBREAD_DOUGH.get()),
                        Ingredient.of(AethersDelightItems.COOKIE_CUTTER_MAN.get()), AethersDelightItems.GINGERBREAD_MAN_BASE.get(), 2)
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cutting/gingerbread_man_base"));

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.GINGERBREAD_DOUGH.get()),
                        Ingredient.of(AethersDelightItems.COOKIE_CUTTER_MOA.get()), AethersDelightItems.GINGERBREAD_MOA_BASE.get(), 2)
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cutting/gingerbread_moa_base"));

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.GINGERBREAD_DOUGH.get()),
                        Ingredient.of(AethersDelightItems.COOKIE_CUTTER_STAR.get()), AethersDelightItems.GINGERBREAD_STAR_BASE.get(), 2)
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(AethersDelight.MODID, "cutting/gingerbread_star_base"));

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.RAW_MOA.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), AethersDelightItems.RAW_MOA_CUTS.get(), 2)
                .addResult(Items.BONE)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.COOKED_MOA.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), AethersDelightItems.COOKED_MOA_CUTS.get(), 2)
                .addResult(Items.BONE)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.SKYROOT_LOG.get()),
                        Ingredient.of(ItemTags.AXES), AetherBlocks.STRIPPED_SKYROOT_LOG.get())
                .addResult(ModItems.TREE_BARK.get())
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.SKYROOT_WOOD.get()),
                        Ingredient.of(ItemTags.AXES), AetherBlocks.STRIPPED_SKYROOT_WOOD.get())
                .addResult(ModItems.TREE_BARK.get())
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.GOLDEN_OAK_LOG.get()),
                        Ingredient.of(AetherTags.Items.GOLDEN_AMBER_HARVESTERS), AetherBlocks.STRIPPED_SKYROOT_LOG.get())
                .addResult(ModItems.TREE_BARK.get())
                .addResult(AetherItems.GOLDEN_AMBER.get(), 4)
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "amber_from_log"));
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.GOLDEN_OAK_WOOD.get()),
                        Ingredient.of(AetherTags.Items.GOLDEN_AMBER_HARVESTERS), AetherBlocks.STRIPPED_SKYROOT_WOOD.get())
                .addResult(ModItems.TREE_BARK.get())
                .addResult(AetherItems.GOLDEN_AMBER.get(), 4)
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "amber_from_wood"));

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.GOLDEN_OAK_LOG.get()),
                        Ingredient.of(AethersDelightTags.Items.NOT_GOLDEN_AMBER_HARVESTERS), AetherBlocks.STRIPPED_SKYROOT_LOG.get())
                .addResult(ModItems.TREE_BARK.get())
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "no_amber_from_log"));
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.GOLDEN_OAK_WOOD.get()),
                        Ingredient.of(AethersDelightTags.Items.NOT_GOLDEN_AMBER_HARVESTERS), AetherBlocks.STRIPPED_SKYROOT_WOOD.get())
                .addResult(ModItems.TREE_BARK.get())
                .build(recipeOutput, ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "no_amber_from_wood"));

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.SKYROOT_DOOR.get()),
                        Ingredient.of(ItemTags.AXES), AetherBlocks.SKYROOT_PLANKS.get())
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.SKYROOT_TRAPDOOR.get()),
                        Ingredient.of(ItemTags.AXES), AetherBlocks.SKYROOT_PLANKS.get())
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.WHITE_FLOWER.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), Items.WHITE_DYE, 2)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherBlocks.PURPLE_FLOWER.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PURPLE_DYE, 2)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherItems.BLUE_BERRY.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), Items.BLUE_DYE)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AetherItems.ENCHANTED_BERRY.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), Items.YELLOW_DYE)
                .build(recipeOutput);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(AethersDelightItems.PEPPERMINT_LEAF.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), Items.GREEN_DYE)
                .build(recipeOutput);



        //Cooking Pot Recipes
        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.PEPPERMINT_CANDY_DOUGH.get(), 1, NORMAL_COOKING, SMALL_EXP)
                .addIngredient(Items.SUGAR, 2)
                .addIngredient(AethersDelightItems.PEPPERMINT_EXTRACT.get())
                .unlockedByAnyIngredient(Items.SUGAR)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.COOKED_PARSNIP.get(), 1, NORMAL_COOKING, SMALL_EXP)
                .addIngredient(AethersDelightItems.PARSNIP.get())
                .addIngredient(AethersDelightItems.GINGER_SPICE.get())
                .unlockedByAnyIngredient(AethersDelightItems.GINGER_SPICE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.BLUE_BERRY_JAM.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(AetherItems.BLUE_BERRY.get(), 2)
                .addIngredient(Items.SUGAR)
                .unlockedByAnyIngredient(AetherItems.BLUE_BERRY.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.ENCHANTED_BERRY_JAM.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(AetherItems.ENCHANTED_BERRY.get(), 2)
                .addIngredient(Items.SUGAR)
                .unlockedByAnyIngredient(AetherItems.ENCHANTED_BERRY.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.GINGER_ALE.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(AethersDelightItems.GINGER_SPICE.get(), 2)
                .addIngredient(Items.SUGAR)
                .unlockedByAnyIngredient(AethersDelightItems.GINGER_SPICE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.PEPPERMINT_TEA.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(AethersDelightItems.PEPPERMINT_LEAF.get(), 3)
                .unlockedByAnyIngredient(AethersDelightItems.PEPPERMINT_LEAF.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.SWET_SOUP.get(), 1, FAST_COOKING, SMALL_EXP, Items.BOWL)
                .addIngredient(AetherItems.SWET_BALL.get())
                .addIngredient(AetherItems.BLUE_BERRY.get())
                .unlockedByAnyIngredient(AetherItems.SWET_BALL.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.GINGER_SOUP.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.BOWL)
                .addIngredient(AethersDelightItems.GINGER.get(), 2)
                .addIngredient(AethersDelightItems.PARSNIP.get())
                .unlockedByAnyIngredient(AethersDelightItems.GINGER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.MOA_STEW.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.BOWL)
                .addIngredient(AethersDelightTags.CommonTags.FOODS_RAW_MOA)
                .addIngredient(AethersDelightItems.PARSNIP.get())
                .addIngredient(AethersDelightItems.PEPPERMINT_LEAF.get())
                .unlockedByAnyIngredient(AethersDelightItems.RAW_MOA.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.FLYING_BEEF_STEW.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.BOWL)
                .addIngredient(AethersDelightItems.GINGER.get())
                .addIngredient(AethersDelightItems.WING.get())
                .addIngredient(AethersDelightItems.WING.get())
                .addIngredient(Items.BEEF)
                .addIngredient(Items.WHEAT)
                .unlockedByAnyIngredient(AethersDelightItems.WING.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(recipeOutput);

        CookingPotRecipeBuilder.cookingPotRecipe(AethersDelightItems.PARSNIP_PASTA.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.BOWL)
                .addIngredient(AethersDelightItems.PARSNIP.get())
                .addIngredient(ModItems.RAW_PASTA.get())
                .addIngredient(AethersDelightItems.LEEK.get())
                .unlockedByAnyIngredient(AethersDelightItems.PARSNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(recipeOutput);



        //Enchanting Recipes
        enchantingRecipe(RecipeCategory.MISC, AethersDelightItems.ENCHANTED_BERRY_MUFFIN.get(), AethersDelightItems.BLUE_BERRY_MUFFIN.get(), 0.35F, 150).save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "enchanted_jam_from_enchanting"));
        enchantingRecipe(RecipeCategory.MISC, AethersDelightItems.ENCHANTED_BERRY_JAM.get(), AethersDelightItems.BLUE_BERRY_JAM.get(), 0.35F, 150).save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "enchanted_muffin_from_enchanting"));
        enchantingRecipe(RecipeCategory.MISC, Items.SUGAR, AetherItems.SWET_BALL.get(), 0, 125).save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "sugar_from_enchanting_blue"));

        repairingRecipe(RecipeCategory.COMBAT, AethersDelightItems.HOLYSTONE_KNIFE.get(), 250).group("altar_knife_repair").save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "holystone_knife_repairing"));
        repairingRecipe(RecipeCategory.COMBAT, AethersDelightItems.ZANITE_KNIFE.get(), 250).group("altar_knife_repair").save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "zanite_knife_repairing"));
        repairingRecipe(RecipeCategory.COMBAT, AethersDelightItems.GRAVITITE_KNIFE.get(), 250).group("altar_knife_repair").save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Aether.MODID, "gravitite_knife_repairing"));
    }

    protected AetherCookingRecipeBuilder enchantingRecipe(RecipeCategory category, ItemLike result, ItemLike ingredient, float experience, int duration) {
        return AetherCookingRecipeBuilder.generic(Ingredient.of(new ItemStack(ingredient, 1)), category, result, experience, duration, AetherRecipeSerializers.ENCHANTING.get(), EnchantingRecipe::new)
                .unlockedBy(getHasName(ingredient), has(ingredient));
    }
    protected AltarRepairBuilder repairingRecipe(RecipeCategory category, ItemLike item, int duration) {
        return AltarRepairBuilder.repair(Ingredient.of(new ItemStack(item, 1)), category, duration)
                .unlockedBy(getHasName(item), has(item));
    }
}
