package kiwiapollo.tmcraft.datagen;

import net.minecraft.data.server.recipe.RecipeJsonProvider;

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
