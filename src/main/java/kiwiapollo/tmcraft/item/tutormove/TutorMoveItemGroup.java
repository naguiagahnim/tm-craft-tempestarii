package kiwiapollo.tmcraft.item.tutormove;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.BlankBookItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TutorMoveItemGroup {
    public static final Identifier ITEM_GROUP_ID = Identifier.of(TMCraft.MOD_ID, "tutor_move_item_group");

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankBookItems.EMERALD_BLANK_BOOK.getItem()))
            .displayName(Text.translatable("item_group.tmcraft.tutor_move"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ITEM_GROUP_ID);
}
