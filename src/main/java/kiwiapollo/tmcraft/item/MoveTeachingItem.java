package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.moves.BenchedMove;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public abstract class MoveTeachingItem extends Item implements ElementalTypeItem {
    protected final String move;
    private final ElementalType type;

    public MoveTeachingItem(String move, ElementalType type) {
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

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(type.getDisplayName().setStyle(Style.EMPTY.withColor(type.getHue())));
    }

    @Override
    public ElementalType getMoveType() {
        return type;
    }

    protected abstract boolean canPokemonLearnMove(PlayerEntity player, Pokemon pokemon);

    private void teachPokemonMove(Pokemon pokemon) {
        if (pokemon.getMoveSet().hasSpace()) {
            pokemon.getMoveSet().add(getMoveTemplate().create());
            
        } else {
            pokemon.getBenchedMoves().add(new BenchedMove(getMoveTemplate(), 0));
        }
    }

    @NotNull
    private MoveTemplate getMoveTemplate() {
        Objects.requireNonNull(move);
        return Objects.requireNonNull(Moves.INSTANCE.getByName(move));
    }
}
