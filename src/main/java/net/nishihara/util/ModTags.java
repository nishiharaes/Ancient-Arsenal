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
