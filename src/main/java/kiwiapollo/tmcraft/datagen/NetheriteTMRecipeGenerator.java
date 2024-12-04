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

public class NetheriteTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_GIGAIMPACT.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_HYPERBEAM.getItem())
                .input(Items.CALIBRATED_SCULK_SENSOR)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_MEGAKICK.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(Items.OBSIDIAN)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SELFDESTRUCT.getItem())
                .input(Items.TNT, 3)
                .offerTo(exporter);
    }

    static class NetheriteTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private NetheriteTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static NetheriteTMRecipeJsonBuilder create(TMItem item) {
            return (NetheriteTMRecipeJsonBuilder) new NetheriteTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.NETHERITE_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.NETHERITE_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.NETHERITE_BLANK_DISC.getItem()));
        }
    }
}
