package kiwiapollo.tmcraft.item.moverecorder;

import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.MoveRecordingItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class EggMoveRecorder extends MoveRecordingItem {
    @Override
    protected Item toMoveTeachingItem(Move move) {
        return Registries.ITEM.get(Identifier.of(TMCraft.MOD_ID, String.format("egg_%s", move.getName())));
    }
}
