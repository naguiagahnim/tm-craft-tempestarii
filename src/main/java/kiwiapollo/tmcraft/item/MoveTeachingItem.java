package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.moves.BenchedMove;
import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.moves.categories.DamageCategories;
import com.cobblemon.mod.common.api.moves.categories.DamageCategory;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.common.DamageCategoryTextColorFactory;
import kiwiapollo.tmcraft.gamerule.ModGameRule;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public abstract class MoveTeachingItem extends Item implements ElementalTypeItem {
    private final String move;
    private final ElementalType type;

    public MoveTeachingItem(String move, ElementalType type) {
        super(new FabricItemSettings());

        this.move = move;
        this.type = type;
    }

    @Override
    public ElementalType getMoveType() {
        return type;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (getMoveTemplate().getDamageCategory() == DamageCategories.INSTANCE.getSTATUS()) {
            tooltip.add(getMoveTypeTooltipText());
            tooltip.add(getMoveDamageCategoryTooltipText());

        } else {
            tooltip.add(getMoveTypeTooltipText());
            tooltip.add(getMoveDamageCategoryTooltipText());
            tooltip.add(getMovePowerTooltipText());
        }
    }

    protected Text getMoveTypeTooltipText() {
        return type.getDisplayName().setStyle(Style.EMPTY.withColor(type.getHue()));
    }

    protected Text getMoveDamageCategoryTooltipText() {
        DamageCategory category = getMoveTemplate().getDamageCategory();
        Style style = Style.EMPTY.withColor(new DamageCategoryTextColorFactory().create(category));
        return category.getDisplayName().copy().setStyle(style);
    }

    protected Text getMovePowerTooltipText() {
        Style style = Style.EMPTY.withColor(Formatting.YELLOW);
        return Text.literal(String.valueOf(getMoveTemplate().getPower())).setStyle(style);
    }

    @NotNull
    protected MoveTemplate getMoveTemplate() {
        return Objects.requireNonNull(Moves.INSTANCE.getByName(move));
    }

    protected void playTeachMoveErrorSound(ServerPlayerEntity player) {
        player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    protected void playTeachMoveSuccessSound(ServerPlayerEntity player) {
        player.getWorld().playSound(null, player.getBlockPos(), CobblemonSounds.PC_CLICK, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    protected void teachMoveToPokemon(Pokemon pokemon) {
        if (pokemon.getMoveSet().hasSpace()) {
            pokemon.getMoveSet().add(getMoveTemplate().create());

        } else {
            pokemon.getBenchedMoves().add(new BenchedMove(getMoveTemplate(), 0));
        }
    }

    protected boolean isMoveExist() {
        try {
            getMoveTemplate();
            return true;

        } catch (NullPointerException e) {
            return false;
        }
    }

    protected Text getMoveLearnStatus(Pokemon pokemon) {
        if (Objects.isNull(pokemon)) {
            return Text.translatable("item.tmcraft.move_learn_status.empty").formatted(Formatting.GRAY);

        } else if (isPokemonAlreadyLearnedMove(pokemon)) {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.learned").formatted(Formatting.YELLOW));

        } else if (isPokemonAbleToLearnMove(pokemon)) {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.able").formatted(Formatting.GREEN));

        } else {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.unable").formatted(Formatting.RED));
        }
    }

    protected boolean isPokemonAlreadyLearnedMove(Pokemon pokemon) {
        return isMoveSetMove(pokemon) || isAccessibleMove(pokemon);
    }

    private boolean isMoveSetMove(Pokemon pokemon) {
        return pokemon.getMoveSet().getMoves().stream()
                .map(Move::getName)
                .anyMatch(name -> name.equals(move));
    }

    private boolean isAccessibleMove(Pokemon pokemon) {
        return pokemon.getAllAccessibleMoves().stream()
                .map(MoveTemplate::getName)
                .anyMatch(name -> name.equals(move));
    }

    protected boolean isLearnedByLevelUp(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getLevelUpMoves().values().stream()
                .flatMap(List::stream)
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByTM(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getTmMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByMoveTutor(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getTutorMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByBreeding(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getEggMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isPokemonOwnedByPlayer(PlayerEntity player, Pokemon pokemon) {
        return player.equals(pokemon.getOwnerPlayer());
    }

    protected abstract boolean isPokemonAbleToLearnMove(Pokemon pokemon);

    protected boolean shouldConsumeItemByGameRule(ServerWorld world) {
        try {
            return world.getGameRules().get(ModGameRule.CONSUME_MOVE_ITEM_ON_USE).get();

        } catch (NullPointerException e) {
            return true;
        }
    }
}
