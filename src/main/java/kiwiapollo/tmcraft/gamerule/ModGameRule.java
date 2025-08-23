package kiwiapollo.tmcraft.gamerule;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRule {
    public static GameRules.Key<GameRules.BooleanRule> CONSUME_MOVE_ITEM_ON_USE;

    public static void register() {
        CONSUME_MOVE_ITEM_ON_USE = GameRuleRegistry.register("consumeMoveItemOnUse", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(true));
    }
}
