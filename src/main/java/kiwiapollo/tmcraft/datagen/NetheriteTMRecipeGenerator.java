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
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_MEGAKICK.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SELFDESTRUCT.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SOLARBEAM.getItem())
                .input(CobblemonItems.SUN_STONE)
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
