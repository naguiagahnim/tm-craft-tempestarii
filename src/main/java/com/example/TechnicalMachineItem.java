package com.example;

import com.cobblemon.mod.common.api.moves.BenchedMove;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class TechnicalMachineItem extends Item implements Vanishable {
    protected final String move;
    private final String type;

    public TechnicalMachineItem() {
        this(null, null);
    }

    public TechnicalMachineItem(String move, String type) {
        super(new FabricItemSettings());

        this.move = move;
        this.type = type;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (player.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        if (!(entity instanceof PokemonEntity)) {
            return ActionResult.PASS;
        }

        Pokemon pokemon = ((PokemonEntity) entity).getPokemon();

        if (canPokemonLearnMove(player, pokemon)) {
            return ActionResult.PASS;
        }

        teachPokemonMove(pokemon);

        if (!player.isCreative()) {
            stack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.move_teaching_item.success", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()));
        return ActionResult.SUCCESS;
    }

    private boolean canPokemonLearnMove(PlayerEntity player, Pokemon pokemon) {        
        if (!isMoveExist()) {
            return false;
        }

        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            return false;
        }

        if (!isLearnsetContainsMove(pokemon)) {
            player.sendMessage(Text.translatable("item.move_teaching_item.error.learnset_not_contains_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            return false;
        }

        if (isPokemonKnowsMove(pokemon)) {
            player.sendMessage(Text.translatable("item.move_teaching_item.error.pokemon_knows_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
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

    private void teachPokemonMove(Pokemon pokemon) {
        if (pokemon.getMoveSet().hasSpace()) {
            pokemon.getMoveSet().add(getMoveTemplate().create());
            
        } else {
            pokemon.getBenchedMoves().add(new BenchedMove(getMoveTemplate(), 0));
        }
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

    private boolean isLearnsetContainsMove(Pokemon pokemon) {
        return pokemon.getForm().getMoves().getTmMoves().stream().map(MoveTemplate::getName).toList().contains(move);
    }

    public ElementalType getMoveType() {
        return ElementalTypes.INSTANCE.get(type);
    }
}
