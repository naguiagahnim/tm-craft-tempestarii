package kiwiapollo.tmcraft.datagen;

import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public interface RecipeGenerator {
    void generate(Consumer<RecipeJsonProvider> exporter);
}
