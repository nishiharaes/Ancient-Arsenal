package net.nishihara.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nishihara.AncientArsenal;

import java.util.List;

public class ModItems {

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.ofVanilla("item/empty_slot_ingot");

    public static final Item TENEBRINE_INGOT = registerItem("tenebrine_ingot", new Item(new Item.Settings()));
    public static final Item TENEBRINE_SCRAP = registerItem("tenebrine_scrap", new Item(new Item.Settings()));

    public static final Item TENEBRINE_SWORD = registerItem("tenebrine_sword", new SwordItem(ModToolMaterials.TENEBRINE, new Item.Settings()
            .fireproof()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TENEBRINE, 3, -2.4f))));
    public static final Item TENEBRINE_PICKAXE = registerItem("tenebrine_pickaxe", new PickaxeItem(ModToolMaterials.TENEBRINE, new Item.Settings()
            .fireproof()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TENEBRINE, 1, -2.8f))));
    public static final Item TENEBRINE_SHOVEL = registerItem("tenebrine_shovel", new ShovelItem(ModToolMaterials.TENEBRINE, new Item.Settings()
            .fireproof()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TENEBRINE, 1.5f, -3.0f))));
    public static final Item TENEBRINE_AXE = registerItem("tenebrine_axe", new AxeItem(ModToolMaterials.TENEBRINE, new Item.Settings()
            .fireproof()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TENEBRINE, 6, -3.2f))));
    public static final Item TENEBRINE_HOE = registerItem("tenebrine_hoe", new HoeItem(ModToolMaterials.TENEBRINE, new Item.Settings()
            .fireproof()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TENEBRINE, 0, -3.0f))));

    public static final Item TENEBRINE_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "tenebrine_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.applies_to"),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.ingredients"),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.title"),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item TENEBRINE_HELMET = registerItem("tenebrine_helmet", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item TENEBRINE_CHESTPLATE = registerItem("tenebrine_chestplate", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item TENEBRINE_LEGGINGS = registerItem("tenebrine_leggings", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item TENEBRINE_BOOTS = registerItem("tenebrine_boots", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AncientArsenal.MOD_ID, name), item);
    }

    public static void registerItems() {
        AncientArsenal.LOGGER.info("Initializing items for " + AncientArsenal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TENEBRINE_INGOT);
            entries.add(TENEBRINE_SCRAP);
            entries.add(TENEBRINE_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TENEBRINE_SWORD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(TENEBRINE_PICKAXE);
            entries.add(TENEBRINE_AXE);
            entries.add(TENEBRINE_SHOVEL);
            entries.add(TENEBRINE_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TENEBRINE_HELMET);
            entries.add(TENEBRINE_CHESTPLATE);
            entries.add(TENEBRINE_LEGGINGS);
            entries.add(TENEBRINE_BOOTS);
        });

    }

}
