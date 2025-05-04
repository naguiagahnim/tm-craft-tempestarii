package kiwiapollo.tmcraft.item.moverecorder;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum MoveRecorderItem {
    TM_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "tm_move_recorder"), new TMMoveRecorder()),
    EGG_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "egg_move_recorder"), new EggMoveRecorder()),
    TUTOR_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "tutor_move_recorder"), new TutorMoveRecorder()),
    STAR_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "star_move_recorder"), new StarMoveRecorder());

    private final Item item;
    private final Identifier identifier;

    MoveRecorderItem(Identifier identifier, Item item) {
        this.identifier = identifier;
        this.item = item;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Item getItem() {
        return item;
    }
}
