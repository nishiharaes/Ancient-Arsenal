package net.nishihara.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nishihara.AncientArsenal;

public class ModItems {

    public static final Item TENEBRINE_INGOT = registerItem("tenebrine_ingot", new Item(new Item.Settings()));
    public static final Item TENEBRINE_SCRAP = registerItem("tenebrine_scrap", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AncientArsenal.MOD_ID, name), item);
    }

    public static void registerItems() {
        AncientArsenal.LOGGER.info("Initializing items for " + AncientArsenal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TENEBRINE_INGOT);
            entries.add(TENEBRINE_SCRAP);
        });
    }

}
