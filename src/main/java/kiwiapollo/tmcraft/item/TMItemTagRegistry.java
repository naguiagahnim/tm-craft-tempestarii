package kiwiapollo.tmcraft.item;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TMItemTagRegistry {
    public static final TagKey<Item> TMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "tms"));
    public static final TagKey<Item> BLANK_DISCS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "blank_discs"));;
}
