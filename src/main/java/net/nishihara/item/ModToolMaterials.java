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
    CHORUS_ALLOY(ModTags.Blocks.INCORRECT_FOR_CHORUS_ALLOY_TOOL, 600, 7.0F, 3.0F, 14, () -> Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT)),
    SANDSPIRE(ModTags.Blocks.INCORRECT_FOR_SANDSPIRE_TOOL, 325, 6.5F, 2.5F, 15, () -> Ingredient.ofItems(ModItems.CHORUS_ALLOY_INGOT)),
    BLAZEBOUND(ModTags.Blocks.INCORRECT_FOR_BLAZEBOUND_TOOL, 400, 6.5F, 2.5F, 15, () -> Ingredient.ofItems(ModItems.BLAZEBOUND_INGOT)),
    HEXWOOD(ModTags.Blocks.INCORRECT_FOR_HEXWOOD_TOOL, 1700, 7.0F, 3.0F, 16, () -> Ingredient.ofItems(ModItems.HEXWOOD_INGOT)),
    PIGSTEEL(ModTags.Blocks.INCORRECT_FOR_PIGSTEEL_TOOL, 1750, 8.0F, 3.0F, 12, () -> Ingredient.ofItems(ModItems.PIGSTEEL_INGOT)),
    NAUTILITE(ModTags.Blocks.INCORRECT_FOR_NAUTILITE_TOOL, 1900, 8.5F, 3.5F, 14, () -> Ingredient.ofItems(ModItems.NAUTILITE_INGOT)),
    TENEBRINE(ModTags.Blocks.INCORRECT_FOR_TENEBRINE_TOOL, 2300, 10.0F, 5.0F, 15, () -> Ingredient.ofItems(ModItems.TENEBRINE_INGOT));



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
