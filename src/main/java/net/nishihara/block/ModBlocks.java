package net.nishihara.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.nishihara.AncientArsenal;

public class ModBlocks {

    public static final Block PIGSTEEL_ORE = registerBlock("pigsteel_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.create()
            .strength(4f)
            .mapColor(MapColor.DARK_RED)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()));

    public static final Block BLAZEBOUND_ORE = registerBlock("blazebound_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.create()
            .strength(3f)
            .mapColor(MapColor.DARK_RED)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()));

    public static final Block TENEBRINE_ORE = registerBlock("tenebrine_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .mapColor(MapColor.STONE_GRAY)));

    public static final Block DEEPSLATE_TENEBRINE_ORE = registerBlock("deepslate_tenebrine_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.create()
            .strength(5f)
            .requiresTool()
            .sounds(BlockSoundGroup.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE_GRAY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AncientArsenal.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AncientArsenal.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        AncientArsenal.LOGGER.info("Registering blocks for " + AncientArsenal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(TENEBRINE_ORE);
            entries.add(DEEPSLATE_TENEBRINE_ORE);
            entries.add(PIGSTEEL_ORE);
        });
    }


}
