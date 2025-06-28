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
            List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "tenebrine"))), 3.0f, 0.2f));

    public static final RegistryEntry<ArmorMaterial> NAUTILITE_ARMOR_MATERIAL = registerArmorMaterial("nautilite", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 11);
            }),
                    16,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.NAUTILITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "nautilite"))),
                    2.5f,
                    0.0f
            ));

    public static final RegistryEntry<ArmorMaterial> PIGSTEEL_ARMOR_MATERIAL = registerArmorMaterial("pigsteel", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 10);
            }),
                    16,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.PIGSTEEL_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "pigsteel"))),
                    2.5f,
                    0.0f
            ));

    public static final RegistryEntry<ArmorMaterial> HEXWOOD_ARMOR_MATERIAL = registerArmorMaterial("hexwood", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 10);
            }),
                    18,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.HEXWOOD_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "hexwood"))),
                    2.0f,
                    0.0f
            ));

    public static final RegistryEntry<ArmorMaterial> BLAZEBOUND_ARMOR_MATERIAL = registerArmorMaterial("blazebound", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }),
                    14,
                    SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                    () -> Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "blazebound"))),
                    1.5f,
                    0.0f
            ));

    public static final RegistryEntry<ArmorMaterial> SANDSPIRE_ARMOR_MATERIAL = registerArmorMaterial("sandspire", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }),
                    12,
                    SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                    () -> Ingredient.ofItems(ModItems.SANDSPIRE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "sandspire"))),
                    1.5f,
                    0.0f
            ));

    public static final RegistryEntry<ArmorMaterial> CHORUS_ALLOY_ARMOR_MATERIAL = registerArmorMaterial("chorus_alloy", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 10);
            }),
                    10,
                    SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                    () -> Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AncientArsenal.MOD_ID, "chorus_aloy"))),
                    1.0f,
                    0.0f
            ));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AncientArsenal.MOD_ID, name), material.get());
    }
}
