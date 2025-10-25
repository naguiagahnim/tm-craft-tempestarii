package kiwiapollo.tmcraft.item;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public enum MoveLearnStatus {
    ABLE("item.tmcraft.move_learn_status.able", Formatting.GREEN),
    UNABLE("item.tmcraft.move_learn_status.unable", Formatting.RED),
    LEARNED("item.tmcraft.move_learn_status.learned", Formatting.YELLOW);

    private final MutableText text;

    MoveLearnStatus(String key, Formatting formatting) {
        this.text = Text.translatable(key).formatted(formatting);
    }

    public MutableText getText() {
        return text;
    }
}
