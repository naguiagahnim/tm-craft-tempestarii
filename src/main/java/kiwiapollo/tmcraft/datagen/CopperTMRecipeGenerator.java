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

import java.util.function.Consumer;

public class CopperTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PINMISSILE.getItem())
                .input(Items.CACTUS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BULLETSEED.getItem())
                .input(CobblemonItemTags.SEEDS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ABSORB.getItem())
                .input(Items.SPONGE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICICLESPEAR.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCALESHOT.getItem())
                .input(CobblemonItems.DRAGON_SCALE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKBLAST.getItem())
                .input(Items.DISPENSER)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MUDSLAP.getItem())
                .input(Items.MUD)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRIPLEAXEL.getItem())
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STOREDPOWER.getItem())
                .input(Items.BARREL)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_INFESTATION.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAGE.getItem())
                .input(Items.EMERALD)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TAILSLAP.getItem())
                .input(Items.STICK)
                .input(Items.PAPER)
                .offerTo(exporter);
    }

    static class CopperTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private CopperTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static CopperTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (CopperTMRecipeJsonBuilder) new CopperTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.COPPER_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.COPPER_BLANK_DISC.getItem()));
        }
    }
}
