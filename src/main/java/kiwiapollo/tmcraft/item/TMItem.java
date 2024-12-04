package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.CobblemonSounds;
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
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TMItem extends Item implements ElementalTypeItem {
    protected final String move;
    private final String type;

    public TMItem(String move, String type) {
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

        if (!canPokemonLearnMove(player, pokemon)) {
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        teachPokemonMove(pokemon);

        if (!player.isCreative()) {
            stack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.tmcraft.success", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()));
        player.getWorld().playSound(null, player.getBlockPos(), CobblemonSounds.PC_CLICK, SoundCategory.PLAYERS, 1.0f, 1.0f);
        return ActionResult.SUCCESS;
    }

    private boolean canPokemonLearnMove(PlayerEntity player, Pokemon pokemon) {        
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

    private boolean isPokemonLearnsetContainsMove(Pokemon pokemon) {
        boolean isLevelUpMove = pokemon.getForm().getMoves()
                .getLevelUpMoves().values().stream()
                .flatMap(List::stream)
                .map(MoveTemplate::getName).toList()
                .contains(move);

        boolean isTmMove = pokemon.getForm().getMoves()
                .getTmMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);

        return isLevelUpMove || isTmMove;
    }

    public ElementalType getMoveType() {
        return ElementalTypes.INSTANCE.get(type);
    }
}
