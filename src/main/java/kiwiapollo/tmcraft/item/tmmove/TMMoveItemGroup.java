package kiwiapollo.tmcraft.item.tmmove;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.block.ModBlock;
import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.misc.MiscItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Arrays;

public class TMMoveItemGroup {
    public static final Identifier ITEM_GROUP_ID = Identifier.of(TMCraft.MOD_ID, "tm_move_item_group");

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankDiscItem.DIAMOND_BLANK_DISC))
            .displayName(Text.translatable("item_group.tmcraft.tm_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ITEM_GROUP_ID);

    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.ITEM_GROUP, TMMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, TMMoveItemGroup.ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(TMMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
            TMMoveItem.getAll().forEach(itemGroup::add);
        });
    }
}
