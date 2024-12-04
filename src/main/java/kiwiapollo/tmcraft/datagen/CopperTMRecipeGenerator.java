package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import kiwiapollo.tmcraft.item.BlankDiscItems;
import kiwiapollo.tmcraft.item.TMItem;
import kiwiapollo.tmcraft.item.TMItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class CopperTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        CopperTMRecipeJsonBuilder.create((TMItem) TMItems.TM_PINMISSILE.getItem())
                .input(Items.CACTUS, 3)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMItem) TMItems.TM_BULLETSEED.getItem())
                .input(Items.WHEAT_SEEDS)
                .input(Items.BEETROOT_SEEDS)
                .input(Items.MELON_SEEDS)
                .input(Items.PUMPKIN_SEEDS)
                .offerTo(exporter);
    }

    static class CopperTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private CopperTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static CopperTMRecipeJsonBuilder create(TMItem item) {
            return (CopperTMRecipeJsonBuilder) new CopperTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.COPPER_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()));
        }
    }
}
