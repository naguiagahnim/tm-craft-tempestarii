package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getBlock(), drops(ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getItem()));
    }
}
