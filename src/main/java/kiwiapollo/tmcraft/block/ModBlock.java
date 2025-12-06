package kiwiapollo.tmcraft.block;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block MOVE_TUTOR_TABLE_BLOCK = register("move_tutor_table", new MoveTutorTable());
    public static final Block POKEMON_BREEDER_TABLE_BLOCK = register("pokemon_breeder_table", new PokemonBreederTable());

    public static void initialize() {

    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(TMCraft.MOD_ID, name);
        Item item = new BlockItem(block, new Item.Settings());

        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, item);

        return block;
    }
}
