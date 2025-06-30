package net.nishihara.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.nishihara.AncientArsenal;
import net.nishihara.item.custom.ModArmorItem;

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
    // Ingot + ingot material register

    public static final Item TENEBRINE_INGOT = registerItem("tenebrine_ingot", new Item(new Item.Settings()));
    public static final Item TENEBRINE_SCRAP = registerItem("tenebrine_scrap", new Item(new Item.Settings()));

    public static final Item PIGSTEEL_INGOT = registerItem("pigsteel_ingot", new Item(new Item.Settings()));
    public static final Item PIGSTEEL_SCRAP = registerItem("pigsteel_scrap", new Item(new Item.Settings()));

    public static final Item NAUTILITE_INGOT = registerItem("nautilite_ingot", new Item(new Item.Settings()));

    public static final Item SANDSPIRE_INGOT = registerItem("sandspire_ingot", new Item(new Item.Settings()));
    public static final Item SANDSPIRE_SHARD = registerItem("sandspire_shard", new Item(new Item.Settings()));

    public static final Item HEXWOOD_INGOT = registerItem("hexwood_ingot", new Item(new Item.Settings()));
    public static final Item INFUSED_WOOD = registerItem("infused_wood", new Item(new Item.Settings()));

    public static final Item BLAZEBOUND_INGOT = registerItem("blazebound_ingot", new Item(new Item.Settings()));
    public static final Item UNREFINED_BLAZEBOUND_INGOT = registerItem("unrefined_blazebound_ingot", new Item(new Item.Settings()));

    public static final Item CHORUS_ALLOY_INGOT = registerItem("chorus_alloy_ingot", new Item(new Item.Settings()));

    // Tenebrine toolset

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

    // Nautilite toolset
    public static final Item NAUTILITE_SWORD = registerItem("nautilite_sword", new SwordItem(ModToolMaterials.NAUTILITE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NAUTILITE, 3, -2.4f))));

    public static final Item NAUTILITE_PICKAXE = registerItem("nautilite_pickaxe", new PickaxeItem(ModToolMaterials.NAUTILITE, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NAUTILITE, 1, -2.8f))));

    public static final Item NAUTILITE_SHOVEL = registerItem("nautilite_shovel", new ShovelItem(ModToolMaterials.NAUTILITE, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NAUTILITE, 1.5f, -3.0f))));

    public static final Item NAUTILITE_AXE = registerItem("nautilite_axe", new AxeItem(ModToolMaterials.NAUTILITE, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NAUTILITE, 6, -3.2f))));

    public static final Item NAUTILITE_HOE = registerItem("nautilite_hoe", new HoeItem(ModToolMaterials.NAUTILITE, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.NAUTILITE, 0, -3.0f))));

    // Pigsteel toolset

    public static final Item PIGSTEEL_AXE = registerItem("pigsteel_axe", new AxeItem(ModToolMaterials.PIGSTEEL, new Item.Settings()
            .fireproof()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PIGSTEEL, 6, -3.2f))));

    public static final Item PIGSTEEL_SWORD = registerItem("pigsteel_sword", new SwordItem(ModToolMaterials.PIGSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PIGSTEEL, 3, -2.4f))));

    public static final Item PIGSTEEL_PICKAXE = registerItem("pigsteel_pickaxe", new PickaxeItem(ModToolMaterials.PIGSTEEL, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PIGSTEEL, 1, -2.8f))));

    public static final Item PIGSTEEL_SHOVEL = registerItem("pigsteel_shovel", new ShovelItem(ModToolMaterials.PIGSTEEL, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PIGSTEEL, 1.5f, -3.0f))));

    public static final Item PIGSTEEL_HOE = registerItem("pigsteel_hoe", new HoeItem(ModToolMaterials.PIGSTEEL, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PIGSTEEL, 0, -3.0f))));

    // Hexwood toolset

    public static final Item HEXWOOD_SWORD = registerItem("hexwood_sword", new SwordItem(ModToolMaterials.HEXWOOD, new Item.Settings()
            .fireproof()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.HEXWOOD, 3, -2.4f))));

    public static final Item HEXWOOD_PICKAXE = registerItem("hexwood_pickaxe", new PickaxeItem(ModToolMaterials.HEXWOOD, new Item.Settings()
            .fireproof()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.HEXWOOD, 1, -2.8f))));

    public static final Item HEXWOOD_AXE = registerItem("hexwood_axe", new AxeItem(ModToolMaterials.HEXWOOD, new Item.Settings()
            .fireproof()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.HEXWOOD, 6, -3.2f))));

    public static final Item HEXWOOD_SHOVEL = registerItem("hexwood_shovel", new ShovelItem(ModToolMaterials.HEXWOOD, new Item.Settings()
            .fireproof()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.HEXWOOD, 1.5f, -3.0f))));

    public static final Item HEXWOOD_HOE = registerItem("hexwood_hoe", new HoeItem(ModToolMaterials.HEXWOOD, new Item.Settings()
            .fireproof()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.HEXWOOD, 0, -3.0f))));

    // Blazebound toolset

    public static final Item BLAZEBOUND_BOW = registerItem("blazebound_bow", new BowItem(new Item.Settings()
            .fireproof()));

    public static final Item BLAZEBOUND_SWORD = registerItem("blazebound_sword", new SwordItem(ModToolMaterials.BLAZEBOUND, new Item.Settings()
            .fireproof()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLAZEBOUND, 3, -2.4f))));

    public static final Item BLAZEBOUND_PICKAXE = registerItem("blazebound_pickaxe", new PickaxeItem(ModToolMaterials.BLAZEBOUND, new Item.Settings()
            .fireproof()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLAZEBOUND, 1, -2.8f))));

    public static final Item BLAZEBOUND_AXE = registerItem("blazebound_axe", new AxeItem(ModToolMaterials.BLAZEBOUND, new Item.Settings()
            .fireproof()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLAZEBOUND, 6, -3.2f))));

    public static final Item BLAZEBOUND_SHOVEL = registerItem("blazebound_shovel", new ShovelItem(ModToolMaterials.BLAZEBOUND, new Item.Settings()
            .fireproof()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLAZEBOUND, 1.5f, -3.0f))));

    public static final Item BLAZEBOUND_HOE = registerItem("blazebound_hoe", new HoeItem(ModToolMaterials.BLAZEBOUND, new Item.Settings()
            .fireproof()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLAZEBOUND, 0, -3.0f))));

    // Sandspire toolset

    public static final Item SANDSPIRE_SWORD = registerItem("sandspire_sword", new SwordItem(ModToolMaterials.SANDSPIRE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SANDSPIRE, 3, -2.4f))));

    public static final Item SANDSPIRE_PICKAXE = registerItem("sandspire_pickaxe", new PickaxeItem(ModToolMaterials.SANDSPIRE, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SANDSPIRE, 1, -2.8f))));

    public static final Item SANDSPIRE_AXE = registerItem("sandspire_axe", new AxeItem(ModToolMaterials.SANDSPIRE, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SANDSPIRE, 6, -3.2f))));

    public static final Item SANDSPIRE_SHOVEL = registerItem("sandspire_shovel", new ShovelItem(ModToolMaterials.SANDSPIRE, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SANDSPIRE, 1.5f, -3.0f))));

    public static final Item SANDSPIRE_HOE = registerItem("sandspire_hoe", new HoeItem(ModToolMaterials.SANDSPIRE, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SANDSPIRE, 0, -3.0f))));

    // Chorus alloy toolset

    public static final Item CHORUS_ALLOY_SWORD = registerItem("chorus_alloy_sword", new SwordItem(ModToolMaterials.CHORUS_ALLOY, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHORUS_ALLOY, 3, -2.4f))));

    public static final Item CHORUS_ALLOY_PICKAXE = registerItem("chorus_alloy_pickaxe", new PickaxeItem(ModToolMaterials.CHORUS_ALLOY, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CHORUS_ALLOY, 1, -2.8f))));

    public static final Item CHORUS_ALLOY_AXE = registerItem("chorus_alloy_axe", new AxeItem(ModToolMaterials.CHORUS_ALLOY, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CHORUS_ALLOY, 6, -3.2f))));

    public static final Item CHORUS_ALLOY_SHOVEL = registerItem("chorus_alloy_shovel", new ShovelItem(ModToolMaterials.CHORUS_ALLOY, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CHORUS_ALLOY, 1.5f, -3.0f))));

    public static final Item CHORUS_ALLOY_HOE = registerItem("chorus_alloy_hoe", new HoeItem(ModToolMaterials.CHORUS_ALLOY, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CHORUS_ALLOY, 0, -3.0f))));

    // Smithing templates

    public static final Item TENEBRINE_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "tenebrine_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.tenebrine_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item PIGSTEEL_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "pigsteel_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.pigsteel_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.pigsteel_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.pigsteel_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.pigsteel_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.pigsteel_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item NAUTILITE_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "nautilite_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.nautilite_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.nautilite_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.nautilite_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.nautilite_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.nautilite_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "blazebound_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.blazebound_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.blazebound_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.blazebound_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.blazebound_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.blazebound_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item HEXWOOD_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "hexwood_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.hexwood_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.hexwood_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.hexwood_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.hexwood_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.hexwood_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item SANDSPIRE_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "sandspire_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.sandspire_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.sandspire_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.sandspire_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.sandspire_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.sandspire_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    public static final Item CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "chorus_alloy_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.minecraft.smithing_template.chorus_alloy_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.chorus_alloy_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.minecraft.smithing_template.chorus_alloy_upgrade.title").formatted(Formatting.GRAY),
                    Text.translatable("item.minecraft.smithing_template.chorus_alloy_upgrade.base_slot_description"),
                    Text.translatable("item.minecraft.smithing_template.chorus_alloy_upgrade.additions_slot_description"),
                    List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE,
                            EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE),
                    List.of(EMPTY_SLOT_INGOT_TEXTURE),
                    new FeatureFlag[]{}
            )
    );

    // Armor register
    // Tenebrine Armor
    public static final Item TENEBRINE_HELMET = registerItem("tenebrine_helmet", new ModArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item TENEBRINE_CHESTPLATE = registerItem("tenebrine_chestplate", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item TENEBRINE_LEGGINGS = registerItem("tenebrine_leggings", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item TENEBRINE_BOOTS = registerItem("tenebrine_boots", new ArmorItem(ModArmorMaterials.TENEBRINE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    // Nautilite Armor
    public static final Item NAUTILITE_HELMET = registerItem("nautilite_helmet", new ModArmorItem(ModArmorMaterials.NAUTILITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(36))));
    public static final Item NAUTILITE_CHESTPLATE = registerItem("nautilite_chestplate", new ArmorItem(ModArmorMaterials.NAUTILITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(36))));
    public static final Item NAUTILITE_LEGGINGS = registerItem("nautilite_leggings", new ArmorItem(ModArmorMaterials.NAUTILITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(36))));
    public static final Item NAUTILITE_BOOTS = registerItem("nautilite_boots", new ArmorItem(ModArmorMaterials.NAUTILITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(36))));

    // Pigsteel Armor
    public static final Item PIGSTEEL_HELMET = registerItem("pigsteel_helmet", new ModArmorItem(ModArmorMaterials.PIGSTEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PIGSTEEL_CHESTPLATE = registerItem("pigsteel_chestplate", new ArmorItem(ModArmorMaterials.PIGSTEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PIGSTEEL_LEGGINGS = registerItem("pigsteel_leggings", new ArmorItem(ModArmorMaterials.PIGSTEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PIGSTEEL_BOOTS = registerItem("pigsteel_boots", new ArmorItem(ModArmorMaterials.PIGSTEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

    // Hexwood Armor
    public static final Item HEXWOOD_HELMET = registerItem("hexwood_helmet", new ModArmorItem(ModArmorMaterials.HEXWOOD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
    public static final Item HEXWOOD_CHESTPLATE = registerItem("hexwood_chestplate", new ArmorItem(ModArmorMaterials.HEXWOOD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
    public static final Item HEXWOOD_LEGGINGS = registerItem("hexwood_leggings", new ArmorItem(ModArmorMaterials.HEXWOOD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
    public static final Item HEXWOOD_BOOTS = registerItem("hexwood_boots", new ArmorItem(ModArmorMaterials.HEXWOOD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));

    // Blazebound Armor
    public static final Item BLAZEBOUND_HELMET = registerItem("blazebound_helmet", new ModArmorItem(ModArmorMaterials.BLAZEBOUND_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(27))));
    public static final Item BLAZEBOUND_CHESTPLATE = registerItem("blazebound_chestplate", new ArmorItem(ModArmorMaterials.BLAZEBOUND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(27))));
    public static final Item BLAZEBOUND_LEGGINGS = registerItem("blazebound_leggings", new ArmorItem(ModArmorMaterials.BLAZEBOUND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(27))));
    public static final Item BLAZEBOUND_BOOTS = registerItem("blazebound_boots", new ArmorItem(ModArmorMaterials.BLAZEBOUND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(27))));

    // Sandspire Armor
    public static final Item SANDSPIRE_HELMET = registerItem("sandspire_helmet", new ModArmorItem(ModArmorMaterials.SANDSPIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(27))));
    public static final Item SANDSPIRE_CHESTPLATE = registerItem("sandspire_chestplate", new ArmorItem(ModArmorMaterials.SANDSPIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(27))));
    public static final Item SANDSPIRE_LEGGINGS = registerItem("sandspire_leggings", new ArmorItem(ModArmorMaterials.SANDSPIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(27))));
    public static final Item SANDSPIRE_BOOTS = registerItem("sandspire_boots", new ArmorItem(ModArmorMaterials.SANDSPIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(27))));

    // Chorus Alloy Armor
    public static final Item CHORUS_ALLOY_HELMET = registerItem("chorus_alloy_helmet", new ModArmorItem(ModArmorMaterials.CHORUS_ALLOY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item CHORUS_ALLOY_CHESTPLATE = registerItem("chorus_alloy_chestplate", new ArmorItem(ModArmorMaterials.CHORUS_ALLOY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item CHORUS_ALLOY_LEGGINGS = registerItem("chorus_alloy_leggings", new ArmorItem(ModArmorMaterials.CHORUS_ALLOY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item CHORUS_ALLOY_BOOTS = registerItem("chorus_alloy_boots", new ArmorItem(ModArmorMaterials.CHORUS_ALLOY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AncientArsenal.MOD_ID, name), item);
    }



    public static void registerItems() {

        AncientArsenal.LOGGER.info("Initializing items for " + AncientArsenal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TENEBRINE_INGOT);
            entries.add(TENEBRINE_SCRAP);
            entries.add(NAUTILITE_INGOT);
            entries.add(PIGSTEEL_INGOT);
            entries.add(PIGSTEEL_SCRAP);
            entries.add(SANDSPIRE_SHARD);
            entries.add(UNREFINED_BLAZEBOUND_INGOT);
            entries.add(BLAZEBOUND_INGOT);
            entries.add(INFUSED_WOOD);
            entries.add(HEXWOOD_INGOT);
            entries.add(SANDSPIRE_INGOT);
            entries.add(PIGSTEEL_UPGRADE_SMITHING_TEMPLATE);
            entries.add(NAUTILITE_UPGRADE_SMITHING_TEMPLATE);
            entries.add(TENEBRINE_UPGRADE_SMITHING_TEMPLATE);
            entries.add(HEXWOOD_UPGRADE_SMITHING_TEMPLATE);
            entries.add(BLAZEBOUND_UPGRADE_SMITHING_TEMPLATE);
            entries.add(SANDSPIRE_UPGRADE_SMITHING_TEMPLATE);
            entries.add(CHORUS_ALLOY_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(TENEBRINE_PICKAXE);
            entries.add(TENEBRINE_AXE);
            entries.add(TENEBRINE_SHOVEL);
            entries.add(TENEBRINE_HOE);
            entries.add(NAUTILITE_PICKAXE);
            entries.add(NAUTILITE_AXE);
            entries.add(NAUTILITE_SHOVEL);
            entries.add(NAUTILITE_HOE);
            entries.add(PIGSTEEL_PICKAXE);
            entries.add(PIGSTEEL_AXE);
            entries.add(PIGSTEEL_SHOVEL);
            entries.add(PIGSTEEL_HOE);
            entries.add(HEXWOOD_PICKAXE);
            entries.add(HEXWOOD_AXE);
            entries.add(HEXWOOD_SHOVEL);
            entries.add(HEXWOOD_HOE);
            entries.add(BLAZEBOUND_PICKAXE);
            entries.add(BLAZEBOUND_AXE);
            entries.add(BLAZEBOUND_SHOVEL);
            entries.add(BLAZEBOUND_HOE);
            entries.add(SANDSPIRE_PICKAXE);
            entries.add(SANDSPIRE_AXE);
            entries.add(SANDSPIRE_SHOVEL);
            entries.add(SANDSPIRE_HOE);
            entries.add(CHORUS_ALLOY_PICKAXE);
            entries.add(CHORUS_ALLOY_AXE);
            entries.add(CHORUS_ALLOY_SHOVEL);
            entries.add(CHORUS_ALLOY_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TENEBRINE_SWORD);
            entries.add(TENEBRINE_HELMET);
            entries.add(TENEBRINE_CHESTPLATE);
            entries.add(TENEBRINE_LEGGINGS);
            entries.add(TENEBRINE_BOOTS);
            entries.add(NAUTILITE_SWORD);
            entries.add(NAUTILITE_HELMET);
            entries.add(NAUTILITE_CHESTPLATE);
            entries.add(NAUTILITE_LEGGINGS);
            entries.add(NAUTILITE_BOOTS);
            entries.add(PIGSTEEL_SWORD);
            entries.add(PIGSTEEL_HELMET);
            entries.add(PIGSTEEL_CHESTPLATE);
            entries.add(PIGSTEEL_LEGGINGS);
            entries.add(PIGSTEEL_BOOTS);
            entries.add(HEXWOOD_SWORD);
            entries.add(HEXWOOD_HELMET);
            entries.add(HEXWOOD_CHESTPLATE);
            entries.add(HEXWOOD_LEGGINGS);
            entries.add(HEXWOOD_BOOTS);
            entries.add(BLAZEBOUND_SWORD);
            entries.add(BLAZEBOUND_BOW);
            entries.add(BLAZEBOUND_HELMET);
            entries.add(BLAZEBOUND_CHESTPLATE);
            entries.add(BLAZEBOUND_LEGGINGS);
            entries.add(BLAZEBOUND_BOOTS);
            entries.add(SANDSPIRE_SWORD);
            entries.add(SANDSPIRE_HELMET);
            entries.add(SANDSPIRE_CHESTPLATE);
            entries.add(SANDSPIRE_LEGGINGS);
            entries.add(SANDSPIRE_BOOTS);
            entries.add(CHORUS_ALLOY_SWORD);
            entries.add(CHORUS_ALLOY_HELMET);
            entries.add(CHORUS_ALLOY_CHESTPLATE);
            entries.add(CHORUS_ALLOY_LEGGINGS);
            entries.add(CHORUS_ALLOY_BOOTS);
        });

    }

}
