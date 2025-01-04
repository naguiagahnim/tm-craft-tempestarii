package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItems;
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
        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CRUNCH.getItem())
                .input(CobblemonItems.DEEP_SEA_TOOTH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAGONCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ICEPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FIREPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HIDDENPOWER.getItem())
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_VOLTSWITCH.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_UTURN.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PLUCK.getItem())
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SHADOWBALL.getItem())
                .input(Items.SNOWBALL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SHADOWCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AIRSLASH.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AERIALACE.getItem())
                .input(CobblemonItems.SHARP_BEAK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_VENOSHOCK.getItem())
                .input(CobblemonItems.POISON_BARB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SCALD.getItem())
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_STEELWING.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ICEFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FIREFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BOUNCE.getItem())
                .input(Items.SLIME_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MEGAPUNCH.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAINPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_RAZORSHELL.getItem())
                .input(Items.NAUTILUS_SHELL)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SMARTSTRIKE.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_METRONOME.getItem())
                .input(Items.CLOCK)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TRIATTACK.getItem())
                .input(ItemTags.FISHES)
                .input(Items.BLAZE_POWDER)
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BRINE.getItem())
                .input(Items.GLOWSTONE_DUST)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AVALANCHE.getItem())
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SKYDROP.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DAZZLINGGLEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POISONJAB.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WATERPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DARKPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAGONPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FROSTBREATH.getItem())
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_XSCISSOR.getItem())
                .input(Items.SHEARS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EGGBOMB.getItem())
                .input(Items.EGG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DIG.getItem())
                .input(Items.IRON_SHOVEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUBMISSION.getItem())
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GIGADRAIN.getItem())
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WATERFALL.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRILLRUN.getItem())
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HEADBUTT.getItem())
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FACADE.getItem())
                .input(CobblemonItems.PARALYZE_HEAL)
                .input(CobblemonItems.BURN_HEAL)
                .input(CobblemonItems.ICE_HEAL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SILVERWIND.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);
    }

    static class GoldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private GoldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static GoldTMRecipeJsonBuilder create(TMMoveItem item) {
            return (GoldTMRecipeJsonBuilder) new GoldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.GOLD_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.GOLD_BLANK_DISC.getItem()));
        }
    }
}
