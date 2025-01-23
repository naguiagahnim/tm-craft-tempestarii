package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class MoveTutorTableRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getItem())
                .pattern("BBB")
                .pattern("GCG")
                .pattern("GGG")
                .input('B', Items.IRON_INGOT)
                .input('C', BlankDiscItems.COPPER_BLANK_DISC.getItem())
                .input('G', Items.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()))
                .offerTo(exporter, ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getIdentifier());
    }
}
