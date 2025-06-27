package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.nishihara.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.TENEBRINE_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.TENEBRINE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.TENEBRINE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.TENEBRINE_HOE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.TENEBRINE_AXE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TENEBRINE_HELMET)
                .add(ModItems.TENEBRINE_CHESTPLATE)
                .add(ModItems.TENEBRINE_LEGGINGS)
                .add(ModItems.TENEBRINE_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.TENEBRINE_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.TENEBRINE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.TENEBRINE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.TENEBRINE_BOOTS);

    }
}
