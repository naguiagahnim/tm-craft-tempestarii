package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum BlankBookItems {
    COPPER_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "copper_blank_book"), new Item(new Item.Settings())),
    IRON_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "iron_blank_book"), new Item(new Item.Settings())),
    GOLD_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "gold_blank_book"), new Item(new Item.Settings())),
    DIAMOND_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "diamond_blank_book"), new Item(new Item.Settings())),
    EMERALD_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "emerald_blank_book"), new Item(new Item.Settings())),
    NETHERITE_BLANK_BOOK(Identifier.of(TMCraft.MOD_ID, "netherite_blank_book"), new Item(new Item.Settings()));

    private final Item item;
    private final Identifier identifier;

    BlankBookItems(Identifier identifier, Item item) {
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
