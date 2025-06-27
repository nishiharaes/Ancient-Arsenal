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

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.TENEBRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TENEBRINE_SCRAP, Models.GENERATED);

        itemModelGenerator.register(ModItems.TENEBRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TENEBRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TENEBRINE_BOOTS);

    }
}
