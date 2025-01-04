package kiwiapollo.tmcraft.item.misc;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public abstract class MoveRecorderItem extends Item {
    public MoveRecorderItem() {
        super(new Item.Settings());
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

        if (!canRecordMove(player, pokemon)) {
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        Move move = getFirstMove(pokemon);
        giveMoveTeachingItem(move, player);

        if (!player.isCreative()) {
            stack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.tmcraft.success.recorded_move", move.getDisplayName()));
        player.getWorld().playSound(null, player.getBlockPos(), CobblemonSounds.PC_CLICK, SoundCategory.PLAYERS, 1.0f, 1.0f);
        return ActionResult.SUCCESS;
    }

    private void giveMoveTeachingItem(Move move, PlayerEntity player) {
        ItemStack stack = toMoveTeachingItem(move).getDefaultStack();
        if (player.giveItemStack(stack)) {
            player.dropStack(stack);
        }
    }

    protected abstract Item toMoveTeachingItem(Move move);

    protected boolean canRecordMove(PlayerEntity player, Pokemon pokemon) {
        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            return false;
        }

        if (isMoveSetEmpty(pokemon)) {
            return false;
        }

        Move move = getFirstMove(pokemon);
        if (!isMoveTeachingItemExist(move)) {
            return false;
        }

        return true;
    }

    private boolean isPokemonOwnedByPlayer(PlayerEntity player, Pokemon pokemon) {
        return player.equals(pokemon.getOwnerPlayer());
    }

    private boolean isMoveSetEmpty(Pokemon pokemon) {
        return pokemon.getMoveSet().getMoves().isEmpty();
    }

    private Move getFirstMove(Pokemon pokemon) {
        return pokemon.getMoveSet().getMoves().get(0);
    }

    private boolean isMoveTeachingItemExist(Move move) {
        return !toMoveTeachingItem(move).equals(Items.AIR);
    }
}
