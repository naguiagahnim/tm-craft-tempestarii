package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class NetheriteTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GIGAIMPACT.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HYPERBEAM.getItem())
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MEGAKICK.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SELFDESTRUCT.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SOLARBEAM.getItem())
                .input(CobblemonItems.SUN_STONE)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DOUBLEEDGE.getItem())
                .input(Items.IRON_SWORD)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MEGAHORN.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUPERPOWER.getItem())
                .input(CobblemonItems.POWER_BRACER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRACOMETEOR.getItem())
                .input(Items.FIREWORK_STAR)
                .offerTo(exporter);
    }

    static class NetheriteTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private NetheriteTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static NetheriteTMRecipeJsonBuilder create(TMMoveItem item) {
            return (NetheriteTMRecipeJsonBuilder) new NetheriteTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.NETHERITE_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.NETHERITE_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.NETHERITE_BLANK_DISC.getItem()));
        }
    }
}
