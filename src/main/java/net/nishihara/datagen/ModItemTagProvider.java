package net.nishihara.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.nishihara.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
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

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.TENEBRINE_SWORD);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.TENEBRINE_AXE)
                .add(ModItems.TENEBRINE_PICKAXE)
                .add(ModItems.TENEBRINE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.TENEBRINE_AXE)
                .add(ModItems.TENEBRINE_SWORD);


    }
}
