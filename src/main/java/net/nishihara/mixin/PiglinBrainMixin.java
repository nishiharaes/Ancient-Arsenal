package net.nishihara.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.nishihara.item.ModItems;
import net.minecraft.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {

    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void injectWearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        for (ItemStack stack : entity.getArmorItems()) {
            Item item = stack.getItem();

            if (isPiglinSafeArmor(item)) {
                cir.setReturnValue(true);
                return;
            }
        }
    }

    private static boolean isPiglinSafeArmor(Item item) {
        return item == ModItems.PIGSTEEL_HELMET
                || item == ModItems.PIGSTEEL_CHESTPLATE
                || item == ModItems.PIGSTEEL_LEGGINGS
                || item == ModItems.PIGSTEEL_BOOTS;
    }
}
