package net.nishihara.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nishihara.AncientArsenal;

public class ModItems {

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AncientArsenal.MOD_ID, name), item);
    }

    public static void registerItems() {
        AncientArsenal.LOGGER.info("Initializing items for " + AncientArsenal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TENEBRINE_INGOT);
            entries.add(TENEBRINE_SCRAP);
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
    }

}
