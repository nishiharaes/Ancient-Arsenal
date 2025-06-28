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

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PIGSTEEL_AXE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TENEBRINE_HELMET)
                .add(ModItems.TENEBRINE_CHESTPLATE)
                .add(ModItems.TENEBRINE_LEGGINGS)
                .add(ModItems.TENEBRINE_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.TENEBRINE_HELMET)
                .add(ModItems.PIGSTEEL_HELMET)
                .add(ModItems.NAUTILITE_HELMET)
                .add(ModItems.HEXWOOD_HELMET)
                .add(ModItems.BLAZEBOUND_HELMET)
                .add(ModItems.SANDSPIRE_HELMET)
                .add(ModItems.CHORUS_ALLOY_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.TENEBRINE_CHESTPLATE)
                .add(ModItems.PIGSTEEL_CHESTPLATE)
                .add(ModItems.NAUTILITE_CHESTPLATE)
                .add(ModItems.HEXWOOD_CHESTPLATE)
                .add(ModItems.BLAZEBOUND_CHESTPLATE)
                .add(ModItems.SANDSPIRE_CHESTPLATE)
                .add(ModItems.CHORUS_ALLOY_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.TENEBRINE_LEGGINGS)
                .add(ModItems.PIGSTEEL_LEGGINGS)
                .add(ModItems.NAUTILITE_LEGGINGS)
                .add(ModItems.HEXWOOD_LEGGINGS)
                .add(ModItems.BLAZEBOUND_LEGGINGS)
                .add(ModItems.SANDSPIRE_LEGGINGS)
                .add(ModItems.CHORUS_ALLOY_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.TENEBRINE_BOOTS)
                .add(ModItems.PIGSTEEL_BOOTS)
                .add(ModItems.NAUTILITE_BOOTS)
                .add(ModItems.HEXWOOD_BOOTS)
                .add(ModItems.BLAZEBOUND_BOOTS)
                .add(ModItems.SANDSPIRE_BOOTS)
                .add(ModItems.CHORUS_ALLOY_BOOTS);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.PIGSTEEL_HELMET)
                .add(ModItems.PIGSTEEL_CHESTPLATE)
                .add(ModItems.PIGSTEEL_LEGGINGS)
                .add(ModItems.PIGSTEEL_BOOTS);

    }
}
