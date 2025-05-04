package kiwiapollo.tmcraft.item.starmove;

import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class StarMoveTeachingItem extends MoveTeachingItem {
    public StarMoveTeachingItem(String move, ElementalType type) {
        super(move, type);
    }

    protected boolean canPokemonLearnMove(PlayerEntity player, Pokemon pokemon) {
        if (!isMoveExist()) {
            return false;
        }

        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            return false;
        }

        if (isPokemonKnowsMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.pokemon_knows_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            return false;
        }
        
        return true;
    }

    private boolean isPokemonKnowsMove(Pokemon pokemon) {
        boolean isMoveSetMove = pokemon.getMoveSet().getMoves().stream().map(Move::getName).anyMatch(name -> name.equals(move));
        boolean isAccessibleMove = pokemon.getAllAccessibleMoves().stream().map(MoveTemplate::getName).anyMatch(name -> name.equals(move));
        return isMoveSetMove || isAccessibleMove;
    }

    private boolean isPokemonOwnedByPlayer(PlayerEntity player, Pokemon pokemon) {
        return player.equals(pokemon.getOwnerPlayer());
    }

    private boolean isMoveExist() {
        try {
            getMoveTemplate();
            return true;

        } catch (NullPointerException e) {
            return false;
        }
    }

    @NotNull
    private MoveTemplate getMoveTemplate() {
        Objects.requireNonNull(move);
        return Objects.requireNonNull(Moves.INSTANCE.getByName(move));
    }
}
