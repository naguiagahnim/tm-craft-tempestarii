package kiwiapollo.tmcraft.item.tutormove;

import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;

public class TutorMoveTeachingItem extends MoveTeachingItem {
    public TutorMoveTeachingItem(String move, ElementalType type) {
        super(move, type);
    }

    @Override
    protected boolean isPokemonAbleToLearnMove(Pokemon pokemon) {
        return isLearnedByLevelUp(pokemon) || isLearnedByMoveTutor(pokemon);
    }
}
