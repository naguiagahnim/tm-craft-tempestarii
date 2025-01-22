package kiwiapollo.tmcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class MoveTutorTableBlock extends Block {
    public MoveTutorTableBlock() {
        super(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS));
    }
}
