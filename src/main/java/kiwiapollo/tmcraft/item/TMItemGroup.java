package kiwiapollo.tmcraft.item;

import kiwiapollo.tmcraft.TMCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TMItemGroup {
    public static final Identifier ITEM_GROUP_ID = Identifier.of(TMCraft.MOD_ID, "tm_item_group");

    public static final ItemGroup TM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()))
            .displayName(Text.translatable("item_group.tmcraft.tm_item_group"))
            .build();

    public static final RegistryKey<ItemGroup> TM_ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), ITEM_GROUP_ID);
}
