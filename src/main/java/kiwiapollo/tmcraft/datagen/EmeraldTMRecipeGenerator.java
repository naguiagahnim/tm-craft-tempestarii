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

public class EmeraldTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AGILITY.getItem())
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_STEALTHROCK.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_RAINDANCE.getItem())
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUNNYDAY.getItem())
                .input(CobblemonItems.SUN_STONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SCARYFACE.getItem())
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BULKUP.getItem())
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HONECLAWS.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TOXIC.getItem())
                .input(CobblemonItems.BLACK_SLUDGE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TRICKROOM.getItem())
                .input(Items.ENDER_CHEST)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_LIGHTSCREEN.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.ENCHANTED_BOOK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_REFLECT.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PSYCHUP.getItem())
                .input(CobblemonItems.MIRROR_HERB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SWORDSDANCE.getItem())
                .input(Items.IRON_SWORD)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROCKPOLISH.getItem())
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FAKETEARS.getItem())
                .input(Items.GHAST_TEAR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ATTRACT.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SANDSTORM.getItem())
                .input(CobblemonItems.SOFT_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLASH.getItem())
                .input(Items.LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WILLOWISP.getItem())
                .input(Items.SOUL_LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CALMMIND.getItem())
                .input(Items.TARGET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_REST.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DOUBLETEAM.getItem())
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MIMIC.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.IRON_INGOT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SKILLSWAP.getItem())
                .input(CobblemonItems.ABILITY_CAPSULE)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GUARDSWAP.getItem())
                .input(CobblemonItems.X_DEFENSE)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POWERSWAP.getItem())
                .input(CobblemonItems.X_ATTACK)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SNATCH.getItem())
                .input(Items.DIAMOND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERWAVE.getItem())
                .input(Items.REPEATER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TORMENT.getItem())
                .input(CobblemonItemTags.MINTS)
                .input(Items.COCOA_BEANS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROOST.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SAFEGUARD.getItem())
                .input(Items.IRON_HELMET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUBSTITUTE.getItem())
                .input(Items.ARMOR_STAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_LOWSWEEP.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);
    }

    static class EmeraldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private EmeraldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static EmeraldTMRecipeJsonBuilder create(TMMoveItem item) {
            return (EmeraldTMRecipeJsonBuilder) new EmeraldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.EMERALD_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()));
        }
    }
}
