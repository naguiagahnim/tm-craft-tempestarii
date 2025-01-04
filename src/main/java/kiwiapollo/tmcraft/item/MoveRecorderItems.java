package kiwiapollo.tmcraft.item;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum MoveRecorderItems {
    TM_RECORDER(Identifier.of(TMCraft.MOD_ID, "tm_recorder"), new TMRecorderItem()),
    EGG_MOVE_RECORDER(Identifier.of(TMCraft.MOD_ID, "egg_move_recorder"), new EggMoveRecorderItem()),
    MOVE_TUTOR_RECORDER(Identifier.of(TMCraft.MOD_ID, "move_tutor_recorder"), new MoveTutorRecorderItem());

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
