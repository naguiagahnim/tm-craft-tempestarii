package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class PokemonBreederTableRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POKEMON_BREEDER_TABLE_BLOCK.getItem())
                .pattern("EE")
                .pattern("BB")
                .pattern("GG")
                .input('E', Items.EGG)
                .input('B', Items.BLACK_STAINED_GLASS)
                .input('G', Items.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Items.EGG), FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .offerTo(exporter, ModBlocks.POKEMON_BREEDER_TABLE_BLOCK.getIdentifier());
    }
}
