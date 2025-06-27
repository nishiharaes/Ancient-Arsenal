package net.nishihara.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.nishihara.AncientArsenal;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> TENEBRINE_ARMOR_MATERIAL = registerArmorMaterial("tenebrine", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 4);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 10);
        map.put(ArmorItem.Type.HELMET, 4);
        map.put(ArmorItem.Type.BODY, 12);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TENEBRINE_INGOT),
            List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "tenebrine"))), 3.5f, 0.5f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AncientArsenal.MOD_ID, name), material.get());
    }
}
