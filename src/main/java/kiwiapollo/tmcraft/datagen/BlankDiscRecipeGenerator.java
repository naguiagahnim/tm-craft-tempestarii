package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.misc.SmithingTemplateItem;
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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlankDiscItem.COPPER_BLANK_DISC.getItem())
                .input(Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem()),
                        Ingredient.ofItems(BlankDiscItem.COPPER_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.IRON_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.COPPER_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItem.IRON_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem()),
                        Ingredient.ofItems(BlankDiscItem.IRON_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.GOLD_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.GOLD_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.IRON_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.IRON_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItem.GOLD_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem()),
                        Ingredient.ofItems(BlankDiscItem.GOLD_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        BlankDiscItem.DIAMOND_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItem.DIAMOND_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem()),
                        Ingredient.ofItems(BlankDiscItem.GOLD_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.EMERALD),
                        RecipeCategory.MISC,
                        BlankDiscItem.EMERALD_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItem.EMERALD_BLANK_DISC.getIdentifier());

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem()),
                        Ingredient.ofItems(BlankDiscItem.DIAMOND_BLANK_DISC.getItem()),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.NETHERITE_BLANK_DISC.getItem()
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.DIAMOND_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.DIAMOND_BLANK_DISC.getItem()))
                .offerTo(exporter, BlankDiscItem.NETHERITE_BLANK_DISC.getIdentifier());
    }
}
