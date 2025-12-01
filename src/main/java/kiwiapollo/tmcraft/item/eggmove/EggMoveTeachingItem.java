package kiwiapollo.tmcraft.item.eggmove;

import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;

public class EggMoveTeachingItem extends MoveTeachingItem {
    public EggMoveTeachingItem(String move, ElementalType type) {
        super(move, type, "item.tmcraft.egg_move_item");
    }

    @Override
    protected boolean isPokemonAbleToLearnMove(Pokemon pokemon) {
        return isLearnedByLevelUp(pokemon) || isLearnedByBreeding(pokemon);
    }
}
