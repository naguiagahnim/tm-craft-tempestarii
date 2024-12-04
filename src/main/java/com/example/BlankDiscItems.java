package com.example;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum BlankDiscItems {
    COPPER_DISC(Identifier.of(TemplateMod.MOD_ID, "copper_disc"), new Item(new Item.Settings())),
    IRON_DISC(Identifier.of(TemplateMod.MOD_ID, "iron_disc"), new Item(new Item.Settings())),
    GOLD_DISC(Identifier.of(TemplateMod.MOD_ID, "gold_disc"), new Item(new Item.Settings())),
    DIAMOND_DISC(Identifier.of(TemplateMod.MOD_ID, "diamond_disc"), new Item(new Item.Settings())),
    EMERALD_DISC(Identifier.of(TemplateMod.MOD_ID, "emerald_disc"), new Item(new Item.Settings()));

    private final Item item;
    private final Identifier identifier;

    BlankDiscItems(Identifier identifier, Item item) {
        this.identifier = identifier;
        this.item = item;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Item getItem() {
        return item;
    }
}
