package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveTeachingItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
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
        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CRUNCH.getItem())
                .input(CobblemonItems.DEEP_SEA_TOOTH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICEPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HIDDENPOWER.getItem())
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_VOLTSWITCH.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_UTURN.getItem())
                .input(CobblemonItems.EJECT_BUTTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PLUCK.getItem())
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHADOWBALL.getItem())
                .input(Items.SNOWBALL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHADOWCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AIRSLASH.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AERIALACE.getItem())
                .input(CobblemonItems.SHARP_BEAK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_VENOSHOCK.getItem())
                .input(CobblemonItems.POISON_BARB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCALD.getItem())
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STEELWING.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICEFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BOUNCE.getItem())
                .input(Items.SLIME_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAPUNCH.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAINPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAZORSHELL.getItem())
                .input(Items.NAUTILUS_SHELL)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SMARTSTRIKE.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METRONOME.getItem())
                .input(Items.CLOCK)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRIATTACK.getItem())
                .input(ItemTags.FISHES)
                .input(Items.BLAZE_POWDER)
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRINE.getItem())
                .input(Items.GLOWSTONE_DUST)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AVALANCHE.getItem())
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKYDROP.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DAZZLINGGLEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DARKPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONPULSE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FROSTBREATH.getItem())
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_XSCISSOR.getItem())
                .input(Items.SHEARS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DIG.getItem())
                .input(Items.IRON_SHOVEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUBMISSION.getItem())
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GIGADRAIN.getItem())
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERFALL.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRILLRUN.getItem())
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEADBUTT.getItem())
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FACADE.getItem())
                .input(CobblemonItems.PARALYZE_HEAL)
                .input(CobblemonItems.BURN_HEAL)
                .input(CobblemonItems.ICE_HEAL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SILVERWIND.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NIGHTSHADE.getItem())
                .input(Items.EXPERIENCE_BOTTLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SWIFT.getItem())
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEX.getItem())
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ZENHEADBUTT.getItem())
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BODYSLAM.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THROATCHOP.getItem())
                .input(Items.TIPPED_ARROW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BREAKINGSWIPE.getItem())
                .input(Items.FERMENTED_SPIDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKITTERSMACK.getItem())
                .input(Items.SCULK_SENSOR)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCORCHINGSANDS.getItem())
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEATCRASH.getItem())
                .input(CobblemonItems.FOCUS_BAND)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BURNINGJEALOUSY.getItem())
                .input(CobblemonItems.DESTINY_KNOT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LASHOUT.getItem())
                .input(Items.EGG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SEEDBOMB.getItem())
                .input(CobblemonItemTags.SEEDS)
                .input(Items.GUNPOWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKTOMB.getItem())
                .input(Items.OBSIDIAN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLASHCANNON.getItem())
                .input(Items.GLOWSTONE_DUST)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LEECHLIFE.getItem())
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREPLEDGE.getItem())
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSPLEDGE.getItem())
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERPLEDGE.getItem())
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HARDPRESS.getItem())
                .input(Items.SMITHING_TABLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ALLURINGVOICE.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHICNOISE.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_UPPERHAND.getItem())
                .input(CobblemonItems.KINGS_ROCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EXPANDINGFORCE.getItem())
                .input(Items.PISTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_IRONHEAD.getItem())
                .input(Items.IRON_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TEMPERFLARE.getItem())
                .input(Items.SOUL_CAMPFIRE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ENDEAVOR.getItem())
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICESPINNER.getItem())
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REVERSAL.getItem())
                .input(CobblemonItems.HP_UP)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEAVYSLAM.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TERABLAST.getItem())
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.X_SP_ATK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLIPTURN.getItem())
                .input(CobblemonItems.EJECT_BUTTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_KNOCKOFF.getItem())
                .input(Items.BONE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BUGBITE.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUPERFANG.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LUNGE.getItem())
                .input(CobblemonItems.PROTEIN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BODYPRESS.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LIQUIDATION.getItem())
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AURASPHERE.getItem())
                .input(CobblemonItems.LIFE_ORB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSKNOT.getItem())
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ELECTROBALL.getItem())
                .input(CobblemonItemTags.POKE_BALLS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POISONJAB.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STOMPINGTANTRUM.getItem())
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKSLIDE.getItem())
                .input(Items.GRAVEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYSHOCK.getItem())
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRICKBREAK.getItem())
                .input(Items.BRICKS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHICFANGS.getItem())
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYBEAM.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THIEF.getItem())
                .input(CobblemonItems.RELIC_COIN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BULLDOZE.getItem())
                .input(Items.IRON_HOE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AIRCUTTER.getItem())
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONTAIL.getItem())
                .input(Items.WEEPING_VINES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DIVE.getItem())
                .input(Items.SCUTE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REVENGE.getItem())
                .input(Items.CACTUS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ASSURANCE.getItem())
                .input(CobblemonItems.RED_CARD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHOCUT.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BEATUP.getItem())
                .input(Items.ROTTEN_FLESH)
                .input(Items.BONE)
                .input(Items.GUNPOWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NATUREPOWER.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RETURN.getItem())
                .input(CobblemonItems.SOOTHE_BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FRUSTRATION.getItem())
                .input(CobblemonItems.ENERGY_ROOT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CROSSPOISON.getItem())
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROUND.getItem())
                .input(ItemTags.MUSIC_DISCS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHOCKWAVE.getItem())
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRUTALSWING.getItem())
                .input(CobblemonItems.MEDICINAL_LEEK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MYSTICALFIRE.getItem())
                .input(Items.SOUL_CAMPFIRE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RETALIATE.getItem())
                .input(Items.BLAZE_POWDER)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NATURALGIFT.getItem())
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SEISMICTOSS.getItem())
                .input(Items.CARTOGRAPHY_TABLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_INCINERATE.getItem())
                .input(Items.CAMPFIRE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SECRETPOWER.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STRENGTH.getItem())
                .input(Items.BLAZE_POWDER)
                .input(Items.NETHER_WART)
                .input(Items.POTION)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAZORWIND.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BUBBLEBEAM.getItem())
                .input(Items.MAGMA_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYWAVE.getItem())
                .input(Items.REPEATER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONBREATH.getItem())
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_COUNTER.getItem())
                .input(Items.SHIELD)
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BIDE.getItem())
                .input(Items.TURTLE_HELMET)
                .input(CobblemonItems.X_ATTACK, 2)
                .offerTo(exporter);
    }

    static class GoldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private GoldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static GoldTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (GoldTMRecipeJsonBuilder) new GoldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.GOLD_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC.getItem()));
        }
    }
}
