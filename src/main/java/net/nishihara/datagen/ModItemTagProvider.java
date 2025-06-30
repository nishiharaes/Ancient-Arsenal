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
                .add(ModItems.TENEBRINE_SWORD)
                .add(ModItems.BLAZEBOUND_SWORD)
                .add(ModItems.NAUTILITE_SWORD)
                .add(ModItems.HEXWOOD_SWORD)
                .add(ModItems.PIGSTEEL_SWORD)
                .add(ModItems.SANDSPIRE_SWORD)
                .add(ModItems.CHORUS_ALLOY_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.TENEBRINE_PICKAXE)
                .add(ModItems.BLAZEBOUND_PICKAXE)
                .add(ModItems.NAUTILITE_PICKAXE)
                .add(ModItems.HEXWOOD_PICKAXE)
                .add(ModItems.PIGSTEEL_PICKAXE)
                .add(ModItems.SANDSPIRE_PICKAXE)
                .add(ModItems.CHORUS_ALLOY_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.TENEBRINE_SHOVEL)
                .add(ModItems.BLAZEBOUND_SHOVEL)
                .add(ModItems.NAUTILITE_SHOVEL)
                .add(ModItems.HEXWOOD_SHOVEL)
                .add(ModItems.PIGSTEEL_SHOVEL)
                .add(ModItems.SANDSPIRE_SHOVEL)
                .add(ModItems.CHORUS_ALLOY_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.TENEBRINE_HOE)
                .add(ModItems.BLAZEBOUND_HOE)
                .add(ModItems.NAUTILITE_HOE)
                .add(ModItems.HEXWOOD_HOE)
                .add(ModItems.PIGSTEEL_HOE)
                .add(ModItems.SANDSPIRE_HOE)
                .add(ModItems.CHORUS_ALLOY_HOE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.TENEBRINE_AXE)
                .add(ModItems.BLAZEBOUND_AXE)
                .add(ModItems.PIGSTEEL_AXE)
                .add(ModItems.NAUTILITE_AXE)
                .add(ModItems.HEXWOOD_AXE)
                .add(ModItems.SANDSPIRE_AXE)
                .add(ModItems.CHORUS_ALLOY_AXE);

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
