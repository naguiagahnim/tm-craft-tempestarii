package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.BlankDiscItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class BlankDiscRecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlankDiscItems.COPPER_BLANK_DISC.getItem())
                .input(Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItems.COPPER_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.IRON_BLOCK),
                        RecipeCategory.MISC,
                        BlankDiscItems.IRON_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItems.IRON_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItems.IRON_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.GOLD_BLOCK),
                        RecipeCategory.MISC,
                        BlankDiscItems.GOLD_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.IRON_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.IRON_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItems.GOLD_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItems.GOLD_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.DIAMOND_BLOCK),
                        RecipeCategory.MISC,
                        BlankDiscItems.DIAMOND_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItems.DIAMOND_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItems.GOLD_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.EMERALD_BLOCK),
                        RecipeCategory.MISC,
                        BlankDiscItems.EMERALD_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItems.EMERALD_BLANK_DISC.getIdentifier());
    }
}
