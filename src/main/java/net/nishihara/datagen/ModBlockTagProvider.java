package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.nishihara.block.ModBlocks;
import net.nishihara.item.ModItems;
import net.nishihara.item.ModToolMaterials;
import net.nishihara.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_TENEBRINE_ORE)
                .add(ModBlocks.TENEBRINE_ORE)
                .add(ModBlocks.BLAZEBOUND_ORE)
                .add(ModBlocks.PIGSTEEL_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PIGSTEEL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_TENEBRINE_ORE)
                .add(ModBlocks.TENEBRINE_ORE)
                .add(ModBlocks.PIGSTEEL_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_TENEBRINE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PIGSTEEL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLAZEBOUND_ORE);
    }
}
