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

        itemModelGenerator.register(ModItems.BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BLAZEBOUND_BOOTS);

        itemModelGenerator.register(ModItems.NAUTILITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NAUTILITE_SHOVEL, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.HEXWOOD_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.HEXWOOD_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.HEXWOOD_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.HEXWOOD_BOOTS);
        itemModelGenerator.register(ModItems.HEXWOOD_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.HEXWOOD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFUSED_WOOD, Models.GENERATED);

        itemModelGenerator.register(ModItems.HEXWOOD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HEXWOOD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HEXWOOD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HEXWOOD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HEXWOOD_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PIGSTEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGSTEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGSTEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGSTEEL_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.SANDSPIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SANDSPIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SANDSPIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SANDSPIRE_BOOTS);

        itemModelGenerator.register(ModItems.SANDSPIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDSPIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDSPIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDSPIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDSPIRE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SANDSPIRE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDSPIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDSPIRE_SHARD, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.CHORUS_ALLOY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CHORUS_ALLOY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CHORUS_ALLOY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CHORUS_ALLOY_BOOTS);

        itemModelGenerator.register(ModItems.CHORUS_ALLOY_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHORUS_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUS_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUS_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUS_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUS_ALLOY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
    }
}
