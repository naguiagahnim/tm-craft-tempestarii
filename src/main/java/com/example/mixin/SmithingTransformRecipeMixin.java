package com.example.mixin;

import com.example.MoveTutorItem;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.SmithingTransformRecipe;
import net.minecraft.registry.DynamicRegistryManager;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Debug(export = true)
@Mixin(SmithingTransformRecipe.class)
public class SmithingTransformRecipeMixin {
    private static final int POWER_UPGRADE = 10;
    private static final String POWER_KEY = "Power";

    @Inject(method = "craft", at = @At("HEAD"), cancellable = true)
    public void upgradeMoveTutorItem(Inventory inventory, DynamicRegistryManager registryManager, CallbackInfoReturnable<ItemStack> info) {
        ItemStack base = inventory.getStack(1);

        if (!(base.getItem() instanceof MoveTutorItem)) {
            return;
        }

        ItemStack upgrade = ((SmithingRecipe) this).getOutput(registryManager).copy();
        upgrade.setNbt(getPowerUpgradedNbt(base.getOrCreateNbt()));

        info.setReturnValue(upgrade);
        info.cancel();
    }

    private NbtCompound getPowerUpgradedNbt(NbtCompound base) {
        NbtCompound upgrade = base.copy();
        upgrade.putInt(POWER_KEY, base.getInt(POWER_KEY) + POWER_UPGRADE);

        return upgrade;
    }
}
