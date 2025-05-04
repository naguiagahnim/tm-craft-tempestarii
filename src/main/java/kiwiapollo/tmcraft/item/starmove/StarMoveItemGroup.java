package kiwiapollo.tmcraft.item.starmove;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.BlankStarItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class StarMoveItemGroup {
    public static final Identifier ITEM_GROUP_ID = Identifier.of(TMCraft.MOD_ID, "star_move_item_group");

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankStarItem.GOLD_BLANK_STAR.getItem()))
            .displayName(Text.translatable("item_group.tmcraft.star_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ITEM_GROUP_ID);
}
