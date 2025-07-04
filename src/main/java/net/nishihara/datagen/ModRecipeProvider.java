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

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HELMET),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.NAUTILITE_BOOTS
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_CHESTPLATE),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.NAUTILITE_CHESTPLATE
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_LEGGINGS),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.NAUTILITE_LEGGINGS
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_BOOTS),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.NAUTILITE_BOOTS
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_boots_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NAUTILITE_INGOT, 1)
                .input('S', Items.PRISMARINE_SHARD)
                .input('I', Items.IRON_INGOT)
                .input('N', Items.NAUTILUS_SHELL)
                .pattern("SIS")
                .pattern("INI")
                .pattern("SIS")
                .criterion(hasItem(Items.NAUTILUS_SHELL), conditionsFromItem(Items.NAUTILUS_SHELL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.SAND)
                .input('C', ModItems.NAUTILITE_INGOT)
                .input('S', ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.TENEBRINE_HELMET
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.TENEBRINE_CHESTPLATE
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.TENEBRINE_LEGGINGS
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_BOOTS),
                        Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.TENEBRINE_BOOTS
                ).criterion("has_tenebrine_ingot", conditionsFromItem(ModItems.TENEBRINE_INGOT))
                .offerTo(recipeExporter, "tenebrine_boots_from_smithing");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZEBOUND_INGOT)
                .criterion(hasItem(ModItems.UNREFINED_BLAZEBOUND_INGOT), conditionsFromItem(ModItems.UNREFINED_BLAZEBOUND_INGOT))
                .input(ModItems.UNREFINED_BLAZEBOUND_INGOT)
                .input(Items.BLAZE_ROD)
                .input(Items.BLAZE_ROD)
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.BLAZEBOUND_SWORD
                ).criterion("has_blazebound_ingot", conditionsFromItem(ModItems.BLAZEBOUND_INGOT))
                .offerTo(recipeExporter, "blazebound_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_PICKAXE),
                        Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.BLAZEBOUND_PICKAXE
                ).criterion("has_blazebound_ingot", conditionsFromItem(ModItems.BLAZEBOUND_INGOT))
                .offerTo(recipeExporter, "blazebound_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.BLAZEBOUND_AXE
                ).criterion("has_blazebound_ingot", conditionsFromItem(ModItems.BLAZEBOUND_INGOT))
                .offerTo(recipeExporter, "blazebound_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SHOVEL),
                        Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.BLAZEBOUND_SHOVEL
                ).criterion("has_blazebound_ingot", conditionsFromItem(ModItems.BLAZEBOUND_INGOT))
                .offerTo(recipeExporter, "blazebound_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HOE),
                        Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.BLAZEBOUND_HOE
                ).criterion("has_blazebound_ingot", conditionsFromItem(ModItems.BLAZEBOUND_INGOT))
                .offerTo(recipeExporter, "blazebound_hoe_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.NETHERRACK)
                .input('C', ModItems.BLAZEBOUND_INGOT)
                .input('S', ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.DARK_OAK_LOG)
                .input('C', ModItems.HEXWOOD_INGOT)
                .input('S', ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.NAUTILITE_SWORD
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_PICKAXE),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NAUTILITE_PICKAXE
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_AXE),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NAUTILITE_AXE
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_SHOVEL),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NAUTILITE_SHOVEL
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HOE),
                        Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NAUTILITE_HOE
                ).criterion("has_nautilite_ingot", conditionsFromItem(ModItems.NAUTILITE_INGOT))
                .offerTo(recipeExporter, "nautilite_hoe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HELMET),
                        Ingredient.ofItems(ModItems.HEXWOOD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.HEXWOOD_HELMET
                ).criterion("has_hexwood_ingot", conditionsFromItem(ModItems.HEXWOOD_INGOT))
                .offerTo(recipeExporter, "hexwood_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_CHESTPLATE),
                        Ingredient.ofItems(ModItems.HEXWOOD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.HEXWOOD_CHESTPLATE
                ).criterion("has_hexwood_ingot", conditionsFromItem(ModItems.HEXWOOD_INGOT))
                .offerTo(recipeExporter, "hexwood_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_LEGGINGS),
                        Ingredient.ofItems(ModItems.HEXWOOD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.HEXWOOD_LEGGINGS
                ).criterion("has_hexwood_ingot", conditionsFromItem(ModItems.HEXWOOD_INGOT))
                .offerTo(recipeExporter, "hexwood_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_BOOTS),
                        Ingredient.ofItems(ModItems.HEXWOOD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.HEXWOOD_BOOTS
                ).criterion("has_hexwood_ingot", conditionsFromItem(ModItems.HEXWOOD_INGOT))
                .offerTo(recipeExporter, "hexwood_boots_from_smithing");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HEXWOOD_INGOT)
                .criterion(hasItem(ModItems.INFUSED_WOOD), conditionsFromItem(ModItems.INFUSED_WOOD))
                .input(ModItems.INFUSED_WOOD)
                .input(Items.EMERALD)
                .input(Items.EMERALD)
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.PIGSTEEL_SWORD
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_PICKAXE),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.PIGSTEEL_PICKAXE
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_SHOVEL),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.PIGSTEEL_SHOVEL
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.DIAMOND_HOE),
                        Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.PIGSTEEL_HOE
                ).criterion("has_pigsteel_ingot", conditionsFromItem(ModItems.PIGSTEEL_INGOT))
                .offerTo(recipeExporter, "pigsteel_hoe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HELMET),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.SANDSPIRE_HELMET
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_CHESTPLATE),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.SANDSPIRE_CHESTPLATE
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_LEGGINGS),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.SANDSPIRE_LEGGINGS
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_BOOTS),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.SANDSPIRE_BOOTS
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_boots_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.SANDSPIRE_SWORD
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_PICKAXE),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.SANDSPIRE_PICKAXE
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.SANDSPIRE_AXE
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SHOVEL),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.SANDSPIRE_SHOVEL
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HOE),
                        Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.SANDSPIRE_HOE
                ).criterion("has_sandspire_ingot", conditionsFromItem(ModItems.SANDSPIRE_INGOT))
                .offerTo(recipeExporter, "sandspire_hoe_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.RED_TERRACOTTA)
                .input('C', ModItems.SANDSPIRE_INGOT)
                .input('S', ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SANDSPIRE_INGOT, 1)
                .input('C', ModItems.SANDSPIRE_SHARD)
                .input('#', Blocks.SAND)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('#', Blocks.END_STONE)
                .input('C', ModItems.CHORUS_ALLOY_INGOT)
                .input('S', ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .criterion(hasItem(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HELMET),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.CHORUS_ALLOY_HELMET
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_helmet_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_CHESTPLATE),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.CHORUS_ALLOY_CHESTPLATE
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_chestplate_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_LEGGINGS),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.CHORUS_ALLOY_LEGGINGS
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_leggings_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_BOOTS),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.CHORUS_ALLOY_BOOTS
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_boots_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.CHORUS_ALLOY_SWORD
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_PICKAXE),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.CHORUS_ALLOY_PICKAXE
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_pickaxe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.CHORUS_ALLOY_AXE
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SHOVEL),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.CHORUS_ALLOY_SHOVEL
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_shovel_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HOE),
                        Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.CHORUS_ALLOY_HOE
                ).criterion("has_chorus_alloy_ingot", conditionsFromItem(ModItems.CHORUS_ALLOY_INGOT))
                .offerTo(recipeExporter, "chorus_alloy_hoe_from_smithing");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHORUS_ALLOY_INGOT)
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                .input(Items.CHORUS_FRUIT)
                .input(Items.CHORUS_FRUIT)
                .input(Items.IRON_INGOT)
                .input(Items.IRON_INGOT)
                .offerTo(recipeExporter);
    }
}
