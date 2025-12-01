package kiwiapollo.tmcraft.item.starmove;

import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;

public class StarMoveTeachingItem extends MoveTeachingItem {
    public StarMoveTeachingItem(String move, ElementalType type) {
        super(move, type, "item.tmcraft.star_move_item");
    }

    @Override
    protected boolean isPokemonAbleToLearnMove(Pokemon pokemon) {
        return true;
    }
}
