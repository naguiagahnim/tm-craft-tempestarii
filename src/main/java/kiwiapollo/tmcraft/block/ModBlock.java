package kiwiapollo.tmcraft.block;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum ModBlock {
    MOVE_TUTOR_TABLE_BLOCK(new MoveTutorTable(), "move_tutor_table"),
    POKEMON_BREEDER_TABLE_BLOCK(new PokemonBreederTable(), "pokemon_breeder_table");

    private final Block block;
    private final Identifier identifier;
    private final BlockItem item;

    ModBlock(Block block, String id) {
        this.block = block;
        this.item = new BlockItem(block, new Item.Settings());
        this.identifier = Identifier.of(TMCraft.MOD_ID, id);
    }

    public Block getBlock() {
        return block;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public BlockItem getItem() {
        return item;
    }
}
