package kiwiapollo.tmcraft.item.eggmove;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.BlankEggItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EggMoveItemGroup {
    public static final Identifier ITEM_GROUP_ID = Identifier.of(TMCraft.MOD_ID, "egg_move_item_group");

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankEggItems.IRON_BLANK_EGG.getItem()))
            .displayName(Text.translatable("item_group.tmcraft.egg_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ITEM_GROUP_ID);
}
