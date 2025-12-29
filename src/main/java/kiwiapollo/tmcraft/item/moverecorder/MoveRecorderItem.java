package kiwiapollo.tmcraft.item.moverecorder;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoveRecorderItem {
    public static final Item TM_MOVE_RECORDER = register("tm_move_recorder", new TMMoveRecorder());
    public static final Item EGG_MOVE_RECORDER = register("egg_move_recorder", new EggMoveRecorder());
    public static final Item TUTOR_MOVE_RECORDER = register("tutor_move_recorder", new TutorMoveRecorder());
    public static final Item STAR_MOVE_RECORDER = register("star_move_recorder", new StarMoveRecorder());

    public static void initialize() {

    }

    public static Item register(String name, Item item) {
        Identifier identifier = Identifier.of(TMCraft.MOD_ID, name);
        return Registry.register(Registries.ITEM, identifier, item);
    }
}
