package net.nishihara.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.nishihara.util.ModTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    TENEBRINE(ModTags.Blocks.INCORRECT_FOR_TENEBRINE_TOOL, 2600, 11.0F, 5.0F, 15, () -> Ingredient.ofItems(ModItems.TENEBRINE_INGOT)),
    SANDSPIRE(ModTags.Blocks.INCORRECT_FOR_SANDSPIRE_TOOL, 850, 6.5F, 2.5F, 12, () -> Ingredient.ofItems(ModItems.SANDSPIRE_INGOT)),
    NAUTILITE(ModTags.Blocks.INCORRECT_FOR_NAUTILITE_TOOL, 1900, 9.0F, 4.0F, 14, () -> Ingredient.ofItems(ModItems.NAUTILITE_INGOT)),
    HEXWOOD(ModTags.Blocks.INCORRECT_FOR_HEXWOOD_TOOL, 1600, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(ModItems.HEXWOOD_INGOT)),
    BLAZEBOUND(ModTags.Blocks.INCORRECT_FOR_BLAZEBOUND_TOOL, 1400, 7.5F, 3.5F, 13, () -> Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT)),
    PIGSTEEL(ModTags.Blocks.INCORRECT_FOR_PIGSTEEL_TOOL, 1800, 9.0F, 4.0F, 12, () -> Ingredient.ofItems(ModItems.PIGSTEEL_INGOT)),
    CHORUS_ALLOY(ModTags.Blocks.INCORRECT_FOR_CHORUS_ALLOY_TOOL, 850, 6.0F, 2.0F, 10, () -> Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT));



    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
