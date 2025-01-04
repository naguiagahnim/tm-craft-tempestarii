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
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class DiamondTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BLIZZARD.getItem())
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FIREBLAST.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDER.getItem())
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HYDROPUMP.getItem())
                .input(Items.WATER_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ICEBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLAMETHROWER.getItem())
                .input(Items.DISPENSER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERBOLT.getItem())
                .input(CobblemonItems.ELECTIRIZER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SURF.getItem())
                .input(ItemTags.BOATS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DREAMEATER.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_IRONTAIL.getItem())
                .input(Items.TWISTING_VINES)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WILDCHARGE.getItem())
                .input(Items.MINECART)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ENERGYBALL.getItem())
                .input(Items.SLIME_BALL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SLUDGEBOMB.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FOULPLAY.getItem())
                .input(Items.TRIPWIRE_HOOK)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PSYCHIC.getItem())
                .input(CobblemonItems.TWISTED_SPOON)
                .offerTo(exporter);
    }

    static class DiamondTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private DiamondTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static DiamondTMRecipeJsonBuilder create(TMMoveItem item) {
            return (DiamondTMRecipeJsonBuilder) new DiamondTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.DIAMOND_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()));
        }
    }
}
