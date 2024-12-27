package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class EggMoveItem extends MoveTeachingItem {
    public EggMoveItem(String move, ElementalType type) {
        super(move, type);
    }

    protected boolean canPokemonLearnMove(PlayerEntity player, Pokemon pokemon) {
        if (!isMoveExist()) {
            return false;
        }

        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            return false;
        }

        if (!isPokemonLearnsetContainsMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.cannot_learn_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            return false;
        }

        if (isPokemonKnowsMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.pokemon_knows_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            return false;
        }
        
        return true;
    }

    private boolean isPokemonKnowsMove(Pokemon pokemon) {
        return pokemon.getAllAccessibleMoves().stream().map(MoveTemplate::getName).anyMatch(name -> name.equals(move));
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

    private boolean isPokemonLearnsetContainsMove(Pokemon pokemon) {
        boolean isLevelUpMove = pokemon.getForm().getMoves()
                .getLevelUpMoves().values().stream()
                .flatMap(List::stream)
                .map(MoveTemplate::getName).toList()
                .contains(move);

        boolean isEggMove = pokemon.getForm().getMoves()
                .getEggMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);

        return isLevelUpMove || isEggMove;
    }
}
