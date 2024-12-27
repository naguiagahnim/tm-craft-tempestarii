package kiwiapollo.tmcraft.item;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum BlankEggItems {
    COPPER_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "copper_blank_egg"), new Item(new Item.Settings())),
    IRON_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "iron_blank_egg"), new Item(new Item.Settings())),
    GOLD_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "gold_blank_egg"), new Item(new Item.Settings())),
    DIAMOND_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "diamond_blank_egg"), new Item(new Item.Settings())),
    EMERALD_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "emerald_blank_egg"), new Item(new Item.Settings())),
    NETHERITE_BLANK_EGG(Identifier.of(TMCraft.MOD_ID, "netherite_blank_egg"), new Item(new Item.Settings()));

    private final Item item;
    private final Identifier identifier;

    BlankEggItems(Identifier identifier, Item item) {
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
