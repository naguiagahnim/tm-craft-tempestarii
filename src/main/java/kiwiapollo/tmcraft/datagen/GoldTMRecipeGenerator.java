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
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class GoldTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_CRUNCH.getItem())
                .input(CobblemonItems.DEEP_SEA_TOOTH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DRAGONPULSE.getItem())
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DRAGONCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ICEPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FIREPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_THUNDERPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_HIDDENPOWER.getItem())
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_VOLTSWITCH.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_PLUCK.getItem())
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SHADOWBALL.getItem())
                .input(Items.SNOWBALL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_AIRSLASH.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_AERIALACE.getItem())
                .input(CobblemonItems.SHARP_BEAK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_VENOSHOCK.getItem())
                .input(CobblemonItems.POISON_BARB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SCALD.getItem())
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_STEELWING.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ICEFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FIREFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_THUNDERFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_BOUNCE.getItem())
                .input(Items.SLIME_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_MEGAPUNCH.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DRAINPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_RAZORSHELL.getItem())
                .input(Items.NAUTILUS_SHELL)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SMARTSTRIKE.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_METRONOME.getItem())
                .input(Items.CLOCK)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMItem) TMItems.TM_TRIATTACK.getItem())
                .input(ItemTags.FISHES)
                .input(Items.BLAZE_POWDER)
                .input(Items.LIGHTNING_ROD)
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
