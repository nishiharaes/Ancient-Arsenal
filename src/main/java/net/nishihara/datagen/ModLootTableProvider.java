package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.nishihara.block.ModBlocks;
import net.nishihara.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.DEEPSLATE_TENEBRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_TENEBRINE_ORE, ModItems.TENEBRINE_SCRAP));
        addDrop(ModBlocks.TENEBRINE_ORE, oreDrops(ModBlocks.TENEBRINE_ORE, ModItems.TENEBRINE_SCRAP));
        addDrop(ModBlocks.PIGSTEEL_ORE, oreDrops(ModBlocks.PIGSTEEL_ORE, ModItems.PIGSTEEL_SCRAP));
        addDrop(ModBlocks.BLAZEBOUND_ORE, oreDrops(ModBlocks.BLAZEBOUND_ORE, ModItems.UNREFINED_BLAZEBOUND_INGOT));

    }
}
