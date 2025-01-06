package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum MoveRecorderItems {
    TM_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "tm_move_recorder"), new TMMoveRecorderItem()),
    EGG_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "egg_move_recorder"), new EggMoveRecorderItem()),
    TUTOR_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "tutor_move_recorder"), new TutorMoveRecorderItem()),
    STAR_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "star_move_recorder"), new StarMoveRecorderItem());

    private final Item item;
    private final Identifier identifier;

    MoveRecorderItems(Identifier identifier, Item item) {
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
