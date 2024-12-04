package com.example.datagen;

import com.example.TemplateMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ItemTagRegistry {
    public static final TagKey<Item> TECHNICAL_MACHINES = TagKey.of(RegistryKeys.ITEM, Identifier.of(TemplateMod.MOD_ID, "technical_machines"));
    public static final TagKey<Item> BLANK_DISCS = TagKey.of(RegistryKeys.ITEM, Identifier.of(TemplateMod.MOD_ID, "blank_discs"));;
}
