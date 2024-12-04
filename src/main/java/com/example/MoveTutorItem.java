package com.example;

import com.cobblemon.mod.common.api.moves.BenchedMove;
import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

import java.util.Objects;
import java.util.stream.StreamSupport;

public abstract class MoveTutorItem extends Item {
    public MoveTutorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (user.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        if (!isExistMove(stack)) {
            return ActionResult.PASS;
        }

        if (!(entity instanceof PokemonEntity)) {
            return ActionResult.PASS;
        }

        Pokemon pokemon = ((PokemonEntity) entity).getPokemon();
        MoveTemplate move = getMoveTemplate(stack);

        if (!user.equals(pokemon.getOwnerPlayer())) {
            return ActionResult.PASS;
        }

        if (isPokemonKnowsMove(pokemon, move)) {
            user.sendMessage(Text.translatable("item.move_tutor_item.error.pokemon_knows_move", pokemon.getDisplayName(), move.getDisplayName()).formatted(Formatting.RED));
            return ActionResult.PASS;
        }

        pokemon.getBenchedMoves().add(new BenchedMove(move, 0));

        if (isSingleUseItem() && !user.isCreative()) {
            stack.decrement(1);
        }

        user.sendMessage(Text.translatable("item.move_tutor_item.success", pokemon.getDisplayName(), move.getDisplayName()));

        return ActionResult.SUCCESS;
    }

    private boolean isExistMove(ItemStack stack) {
        try {
            return getMoveTemplate(stack) != null;

        } catch (NullPointerException e) {
            return false;
        }
    }

    private boolean isPokemonKnowsMove(Pokemon pokemon, MoveTemplate move) {
        return isExistInMoveSet(pokemon, move) || isExistInBenchedMoves(pokemon, move);
    }

    private boolean isExistInMoveSet(Pokemon pokemon, MoveTemplate move) {
        return pokemon.getMoveSet().getMoves().stream().map(Move::getTemplate).toList().contains(move);
    }

    private boolean isExistInBenchedMoves(Pokemon pokemon, MoveTemplate move) {
        return StreamSupport.stream(pokemon.getBenchedMoves().spliterator(), false).map(BenchedMove::getMoveTemplate).toList().contains(move);
    }

    private MoveTemplate getMoveTemplate(ItemStack stack) {
        String name = stack.getNbt().getCompound("Move").getString("name");
        return Objects.requireNonNull(Moves.INSTANCE.getByName(name));
    }

    protected abstract boolean isSingleUseItem();
}
