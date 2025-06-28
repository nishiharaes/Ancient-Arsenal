package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.nishihara.AncientArsenal;
import net.nishihara.item.ModItems;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TENEBRINE_INGOT)
                .criterion(hasItem(ModItems.TENEBRINE_SCRAP), conditionsFromItem(ModItems.TENEBRINE_SCRAP))
                .input(ModItems.TENEBRINE_SCRAP)
                .input(ModItems.TENEBRINE_SCRAP)
                .input(ModItems.TENEBRINE_SCRAP)
                .input(ModItems.TENEBRINE_SCRAP)
                .input(Items.IRON_INGOT)
                .input(Items.IRON_INGOT)
                .input(Items.IRON_INGOT)
                .input(Items.IRON_INGOT)
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PIGSTEEL_INGOT)
                .criterion(hasItem(ModItems.PIGSTEEL_SCRAP), conditionsFromItem(ModItems.PIGSTEEL_SCRAP))
                .input(ModItems.PIGSTEEL_SCRAP)
                .input(ModItems.PIGSTEEL_SCRAP)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(ModItems.TENEBRINE_INGOT), RecipeCategory.COMBAT, ModItems.TENEBRINE_SWORD)
                .criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.TENEBRINE_PICKAXE
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.TENEBRINE_AXE
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.TENEBRINE_SHOVEL
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.TENEBRINE_HOE
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_hoe_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.DEEPSLATE)
                .input('C', ModItems.TENEBRINE_INGOT)
                .input('S', ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_AXE),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.PIGSTEEL_AXE
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_axe_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.BLACKSTONE)
                .input('C', ModItems.PIGSTEEL_INGOT)
                .input('S', ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HELMET),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.PIGSTEEL_HELMET
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_CHESTPLATE),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.PIGSTEEL_CHESTPLATE
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_LEGGINGS),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.PIGSTEEL_LEGGINGS
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_BOOTS),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.PIGSTEEL_BOOTS
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_boots_from_smithing");


    }
}
