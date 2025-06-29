package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.nishihara.block.ModBlocks;
import net.nishihara.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TENEBRINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TENEBRINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLAZEBOUND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIGSTEEL_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.TENEBRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TENEBRINE_SCRAP, Models.GENERATED);

        itemModelGenerator.register(ModItems.PIGSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIGSTEEL_SCRAP, Models.GENERATED);

        itemModelGenerator.register(ModItems.TENEBRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIGSTEEL_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAUTILITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.NAUTILITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PIGSTEEL_AXE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.PIGSTEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PIGSTEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PIGSTEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PIGSTEEL_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.NAUTILITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NAUTILITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NAUTILITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NAUTILITE_BOOTS);

        itemModelGenerator.register(ModItems.NAUTILITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.UNREFINED_BLAZEBOUND_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZEBOUND_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLAZEBOUND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZEBOUND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZEBOUND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZEBOUND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZEBOUND_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_BOOTS);

        itemModelGenerator.register(ModItems.NAUTILITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_SHOVEL, Models.HANDHELD);
    }
}
