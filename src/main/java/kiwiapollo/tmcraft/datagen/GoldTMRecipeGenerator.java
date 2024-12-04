package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
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

public class GoldTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_AIRSLASH.getItem())
                .input(Items.FEATHER)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_CRUNCH.getItem())
                .input(Items.PRISMARINE_SHARD)
                .input(Items.GOLDEN_AXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DRAGONPULSE.getItem())
                .input(Items.DRAGON_BREATH)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ICEPUNCH.getItem())
                .input(Items.BLUE_ICE)
                .input(Items.RED_WOOL)
                .input(Items.YELLOW_WOOL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FIREPUNCH.getItem())
                .input(Items.MAGMA_BLOCK)
                .input(Items.RED_WOOL)
                .input(Items.YELLOW_WOOL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_THUNDERPUNCH.getItem())
                .input(Items.LIGHTNING_ROD)
                .input(Items.RED_WOOL)
                .input(Items.YELLOW_WOOL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_HIDDENPOWER.getItem())
                .input(Items.ENDER_EYE)
                .input(Items.TNT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_VOLTSWITCH.getItem())
                .input(Items.OBSERVER)
                .input(Items.CHORUS_FRUIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_PLUCK.getItem())
                .input(CobblemonItemTags.BERRIES)
                .input(CobblemonItems.SHARP_BEAK)
                .offerTo(exporter);
    }

    static class GoldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private GoldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static GoldTMRecipeJsonBuilder create(TMItem item) {
            return (GoldTMRecipeJsonBuilder) new GoldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.GOLD_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()));
        }
    }
}
