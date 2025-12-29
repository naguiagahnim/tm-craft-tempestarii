package kiwiapollo.tmcraft.item.starmove;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.BlankStarItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class StarMoveItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankStarItem.GOLD_BLANK_STAR))
            .displayName(Text.translatable("item_group.tmcraft.star_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMCraft.MOD_ID, "star_move_item_group"));

    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.ITEM_GROUP, StarMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, StarMoveItemGroup.ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(StarMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
            StarMoveItem.getAll().forEach(itemGroup::add);
        });
    }
}
