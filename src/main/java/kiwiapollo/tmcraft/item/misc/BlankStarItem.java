package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class BlankStarItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item COPPER_BLANK_STAR = register("copper_blank_star", new Item(new Item.Settings()));
    public static final Item IRON_BLANK_STAR = register("iron_blank_star", new Item(new Item.Settings()));
    public static final Item GOLD_BLANK_STAR = register("gold_blank_star", new Item(new Item.Settings()));
    public static final Item DIAMOND_BLANK_STAR = register("diamond_blank_star", new Item(new Item.Settings()));
    public static final Item EMERALD_BLANK_STAR = register("emerald_blank_star", new Item(new Item.Settings()));
    public static final Item NETHERITE_BLANK_STAR = register("netherite_blank_star", new Item(new Item.Settings()));

    public static void initialize() {

    }

    private static Item register(String name, Item item) {
        Identifier identifier = Identifier.of(TMCraft.MOD_ID, name);
        Registry.register(Registries.ITEM, identifier, item);
        all.add(item);

        return item;
    }

    public static List<Item> getAll() {
        return new ArrayList<>(all);
    }
}
