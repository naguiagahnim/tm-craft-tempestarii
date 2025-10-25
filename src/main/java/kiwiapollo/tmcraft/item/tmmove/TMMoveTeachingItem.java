package kiwiapollo.tmcraft.item.tmmove;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.item.MoveTeachingItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

public class TMMoveTeachingItem extends MoveTeachingItem {
    private final String move;

    public TMMoveTeachingItem(String move, ElementalType type) {
        super(move, type);

        this.move = move;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!(context.getPlayer() instanceof ServerPlayerEntity player)) {
            return ActionResult.PASS;
        }

        if (player.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        player.sendMessage(getMoveLearnStatusTitle());

        PlayerPartyStore party = Cobblemon.INSTANCE.getStorage().getParty(player);

        for (int i = 0; i < party.size(); i++) {
            Pokemon pokemon = party.get(i);
            player.sendMessage(Text.literal(String.format("[%d] ", i + 1)).append(getMoveLearnStatus(pokemon)));
        }

        return ActionResult.SUCCESS;
    }

    private Text getMoveLearnStatusTitle() {
        return Text.translatable(String.format("item.tmcraft.tm_%s", move)).formatted(Formatting.YELLOW);
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (user.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        if (!(user instanceof ServerPlayerEntity player)) {
            return ActionResult.PASS;
        }

        if (!(entity instanceof PokemonEntity)) {
            return ActionResult.PASS;
        }

        Pokemon pokemon = ((PokemonEntity) entity).getPokemon();

        if (!isMoveExist()) {
            playTeachMoveErrorSound(player);
            return ActionResult.PASS;
        }

        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            playTeachMoveErrorSound(player);
            return ActionResult.PASS;
        }

        if (isPokemonAlreadyLearnedMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.already_learned_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            playTeachMoveErrorSound(player);
            return ActionResult.PASS;
        }

        if (!isPokemonAbleToLearnMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.cannot_learn_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            playTeachMoveErrorSound(player);
            return ActionResult.PASS;
        }

        teachMoveToPokemon(pokemon);

        if (shouldConsumeItemByGameRule(player.getServerWorld()) && !player.isCreative()) {
            itemStack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.tmcraft.success.pokemon_learned_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()));
        playTeachMoveSuccessSound(player);

        return ActionResult.SUCCESS;
    }

    @Override
    protected boolean isPokemonAbleToLearnMove(Pokemon pokemon) {
        return isLearnedByLevelUp(pokemon) || isLearnedByTM(pokemon);
    }
}
