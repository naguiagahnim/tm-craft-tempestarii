package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
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

public class NetheriteTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GIGAIMPACT.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYPERBEAM.getItem())
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAKICK.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SELFDESTRUCT.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SOLARBEAM.getItem())
                .input(CobblemonItems.SUN_STONE)
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DOUBLEEDGE.getItem())
                .input(Items.IRON_SWORD)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAHORN.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUPERPOWER.getItem())
                .input(CobblemonItems.POWER_BRACER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRACOMETEOR.getItem())
                .input(Items.FIREWORK_STAR)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLAREBLITZ.getItem())
                .input(Items.ELYTRA)
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SOLARBLADE.getItem())
                .input(CobblemonItems.SUN_STONE)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BLASTBURN.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYDROCANNON.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FRENZYPLANT.getItem())
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_OUTRAGE.getItem())
                .input(CobblemonItems.DRAGON_SCALE)
                .input(CobblemonItems.DRAGON_FANG)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_OVERHEAT.getItem())
                .input(Items.LAVA_BUCKET)
                .input(Items.LAVA_BUCKET)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FOCUSBLAST.getItem())
                .input(Items.BOW)
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LEAFSTORM.getItem())
                .input(ItemTags.LEAVES)
                .input(Items.FEATHER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METEORBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FUTURESIGHT.getItem())
                .input(Items.SPYGLASS)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRAVEBIRD.getItem())
                .input(CobblemonItems.SHARP_BEAK)
                .input(Items.FEATHER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CLOSECOMBAT.getItem())
                .input(CobblemonItems.FOCUS_BAND)
                .input(CobblemonItems.FOCUS_SASH)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STEELBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FOCUSPUNCH.getItem())
                .input(CobblemonItems.CELL_BATTERY)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GUNKSHOT.getItem())
                .input(Items.DISPENSER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EXPLOSION.getItem())
                .input(Items.END_CRYSTAL, 3)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HORNDRILL.getItem())
                .input(Items.NETHERITE_PICKAXE)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FISSURE.getItem())
                .input(Items.NETHERITE_SHOVEL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKULLBASH.getItem())
                .input(Items.WITHER_SKELETON_SKULL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ZAPCANNON.getItem())
                .input(Items.LIGHTNING_ROD)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKYATTACK.getItem())
                .input(Items.ELYTRA)
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);
    }

    static class NetheriteTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private NetheriteTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static NetheriteTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (NetheriteTMRecipeJsonBuilder) new NetheriteTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.NETHERITE_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.NETHERITE_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.NETHERITE_BLANK_DISC.getItem()));
        }
    }
}
