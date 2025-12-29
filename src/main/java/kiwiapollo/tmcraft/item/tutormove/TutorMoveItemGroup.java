package kiwiapollo.tmcraft.item.tutormove;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.BlankBookItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TutorMoveItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankBookItem.EMERALD_BLANK_BOOK))
            .displayName(Text.translatable("item_group.tmcraft.tutor_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMCraft.MOD_ID, "tutor_move_item_group"));


    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.ITEM_GROUP, TutorMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, TutorMoveItemGroup.ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(TutorMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
            TutorMoveItem.getAll().forEach(itemGroup::add);
        });
    }
}
