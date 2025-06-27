package net.nishihara.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nishihara.AncientArsenal;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_TENEBRINE_TOOL = createTag("needs_tenebrine_tool");
        public static final TagKey<Block> INCORRECT_FOR_TENEBRINE_TOOL = createTag("incorrect_for_tenebrine_tool");

        public static final TagKey<Block> NEEDS_PIGSTEEL_TOOL = createTag("needs_pigsteel_tool");
        public static final TagKey<Block> INCORRECT_FOR_PIGSTEEL_TOOL = createTag("incorrect_for_pigsteel_tool");

        public static final TagKey<Block> NEEDS_NAUTILITE_TOOL = createTag("needs_nautilite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NAUTILITE_TOOL = createTag("incorrect_for_nautilite_tool");

        public static final TagKey<Block> NEEDS_SANDSPIRE_TOOL = createTag("needs_sandspire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SANDSPIRE_TOOL = createTag("incorrect_for_sandspire_tool");

        public static final TagKey<Block> NEEDS_HEXWOOD_TOOL = createTag("needs_hexwood_tool");
        public static final TagKey<Block> INCORRECT_FOR_HEXWOOD_TOOL = createTag("incorrect_for_hexwood_tool");

        public static final TagKey<Block> NEEDS_BLAZEBOUND_TOOL = createTag("needs_blazebound_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLAZEBOUND_TOOL = createTag("incorrect_for_blazebound_tool");

        public static final TagKey<Block> NEEDS_CHORUS_ALLOY_TOOL = createTag("needs_chorus_alloy_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHORUS_ALLOY_TOOL = createTag("incorrect_for_chorus_alloy_tool");

        public static final TagKey<Block> TENEBRINE_BLOCKS = createTag("tenebrine_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AncientArsenal.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> TENEBRINE_ITEMS = createTag("tenebrine_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(AncientArsenal.MOD_ID, name));
        }
    }
}
