package kiwiapollo.tmcraft.item.eggmove;

import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class EggMoveTeachingItem extends MoveTeachingItem {
    public EggMoveTeachingItem(String move, ElementalType type) {
        super(move, type);
    }

    @Override
    protected boolean canPokemonLearnMove(ServerPlayerEntity player, Pokemon pokemon) {
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

    private boolean isPokemonOwnedByPlayer(PlayerEntity player, Pokemon pokemon) {
        return player.equals(pokemon.getOwnerPlayer());
    }

    private boolean isPokemonLearnsetContainsMove(Pokemon pokemon) {
        return isLearnedByLevelUp(pokemon) || isLearnedByBreeding(pokemon);
    }
}
