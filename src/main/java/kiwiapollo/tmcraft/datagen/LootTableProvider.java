package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(ModBlock.MOVE_TUTOR_TABLE_BLOCK.getBlock(), drops(ModBlock.MOVE_TUTOR_TABLE_BLOCK.getItem()));
        addDrop(ModBlock.POKEMON_BREEDER_TABLE_BLOCK.getBlock(), drops(ModBlock.POKEMON_BREEDER_TABLE_BLOCK.getItem()));
    }
}
