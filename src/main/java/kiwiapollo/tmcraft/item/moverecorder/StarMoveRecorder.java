package kiwiapollo.tmcraft.item.moverecorder;

import com.cobblemon.mod.common.api.moves.Move;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.MoveRecordingItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class StarMoveRecorder extends MoveRecordingItem {
    @Override
    protected Item toMoveTeachingItem(Move move) {
        return Registries.ITEM.get(Identifier.of(TMCraft.MOD_ID, String.format("star_%s", move.getName())));
    }
}
