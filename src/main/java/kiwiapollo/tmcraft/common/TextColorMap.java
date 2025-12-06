package kiwiapollo.tmcraft.common;

import com.cobblemon.mod.common.api.moves.categories.DamageCategories;
import com.cobblemon.mod.common.api.moves.categories.DamageCategory;
import net.minecraft.util.Formatting;

import java.util.Map;

public class TextColorMap {
    private static final Map<DamageCategory, Formatting> COLORS = Map.ofEntries(
            Map.entry(DamageCategories.INSTANCE.getPHYSICAL(), Formatting.RED),
            Map.entry(DamageCategories.INSTANCE.getSPECIAL(), Formatting.BLUE),
            Map.entry(DamageCategories.INSTANCE.getSTATUS(), Formatting.GRAY)
    );

    public Formatting get(DamageCategory category) {
        return COLORS.get(category);
    }
}
