package kiwiapollo.tmcraft.datagen;

import net.minecraft.data.server.recipe.RecipeExporter;

public class TMRecipeGenerator implements RecipeGenerator {
    public void generate(RecipeExporter exporter) {
        new CopperTMRecipeGenerator().generate(exporter);
        new IronTMRecipeGenerator().generate(exporter);
        new GoldTMRecipeGenerator().generate(exporter);
        new DiamondTMRecipeGenerator().generate(exporter);
        new EmeraldTMRecipeGenerator().generate(exporter);
        new NetheriteTMRecipeGenerator().generate(exporter);
    }
}
