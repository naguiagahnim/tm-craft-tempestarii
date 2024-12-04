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
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class EmeraldTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_AGILITY.getItem())
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_STEALTHROCK.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_RAINDANCE.getItem())
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SUNNYDAY.getItem())
                .input(CobblemonItems.SUN_STONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SCARYFACE.getItem())
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_BULKUP.getItem())
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_HONECLAWS.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_TOXIC.getItem())
                .input(CobblemonItems.BLACK_SLUDGE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_TRICKROOM.getItem())
                .input(Items.ENDER_CHEST)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_LIGHTSCREEN.getItem())
                .input(Items.GLASS_PANE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_PSYCHUP.getItem())
                .input(CobblemonItems.MIRROR_HERB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SWORDSDANCE.getItem())
                .input(Items.IRON_SWORD)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ROCKPOLISH.getItem())
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FAKETEARS.getItem())
                .input(Items.GHAST_TEAR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ATTRACT.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);
    }

    static class EmeraldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private EmeraldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static EmeraldTMRecipeJsonBuilder create(TMItem item) {
            return (EmeraldTMRecipeJsonBuilder) new EmeraldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.EMERALD_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()));
        }
    }
}
