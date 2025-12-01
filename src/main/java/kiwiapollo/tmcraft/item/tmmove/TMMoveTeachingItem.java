package kiwiapollo.tmcraft.item.tmmove;

import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;

public class TMMoveTeachingItem extends MoveTeachingItem {
    public TMMoveTeachingItem(String move, ElementalType type) {
        super(move, type, "item.tmcraft.tm_move_item");
    }

    @Override
    protected boolean isPokemonAbleToLearnMove(Pokemon pokemon) {
        return isLearnedByLevelUp(pokemon) || isLearnedByTM(pokemon);
    }
}
