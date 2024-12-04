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
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class IronTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FIRESPIN.getItem())
                .input(Items.IRON_BARS)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_MUDSHOT.getItem())
                .input(Items.MUD)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_MAGICALLEAF.getItem())
                .input(ItemTags.LEAVES)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_METALCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_POWERGEM.getItem())
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ROCKSMASH.getItem())
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_STRUGGLEBUG.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_GYROBALL.getItem())
                .input(CobblemonItems.IRON_BALL)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_POWERUPPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(CobblemonItems.PROTEIN)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DRAININGKISS.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .input(Items.SPONGE)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_CHARGEBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_ECHOEDVOICE.getItem())
                .input(Items.SCULK_SENSOR)
                .offerTo(exporter);

        IronTMRecipeGenerator.IronTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FLING.getItem())
                .input(Items.CROSSBOW)
                .offerTo(exporter);
    }

    static class IronTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private IronTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static IronTMRecipeJsonBuilder create(TMItem item) {
            return (IronTMRecipeJsonBuilder) new IronTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.IRON_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.IRON_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.IRON_BLANK_DISC.getItem()));
        }
    }
}
