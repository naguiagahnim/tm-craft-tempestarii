package kiwiapollo.tmcraft.item;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTagRegistry {
    public static final TagKey<Item> TMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "tms"));
    public static final TagKey<Item> EGG_MOVES = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "egg_moves"));
    public static final TagKey<Item> MOVE_TUTORS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "move_tutors"));

    public static final TagKey<Item> BLANK_DISCS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "blank_discs"));
    public static final TagKey<Item> BLANK_EGGS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "blank_eggs"));
    public static final TagKey<Item> BLANK_BOOKS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TMCraft.MOD_ID, "blank_books"));
}
