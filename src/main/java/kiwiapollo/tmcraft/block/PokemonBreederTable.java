package kiwiapollo.tmcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class PokemonBreederTable extends Block {
    public PokemonBreederTable() {
        super(AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    }
}
