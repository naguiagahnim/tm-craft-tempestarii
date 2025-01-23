package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

import java.util.Map;
import java.util.function.Consumer;

public class TMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        new CopperTMRecipeGenerator().generate(exporter);
        new IronTMRecipeGenerator().generate(exporter);
        new GoldTMRecipeGenerator().generate(exporter);
        new DiamondTMRecipeGenerator().generate(exporter);
        new EmeraldTMRecipeGenerator().generate(exporter);
        new NetheriteTMRecipeGenerator().generate(exporter);
    }
}
