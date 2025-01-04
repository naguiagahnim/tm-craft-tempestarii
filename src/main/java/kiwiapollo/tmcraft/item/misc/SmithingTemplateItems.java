package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.util.Identifier;

public enum SmithingTemplateItems {
    MOVE_UPGRADE_SMITHING_TEMPLATE("move_upgrade_smithing_template", new SmithingTemplateItem());

    private final Identifier identifier;
    private final SmithingTemplateItem item;

    SmithingTemplateItems(String path, SmithingTemplateItem item) {
        this.identifier = Identifier.of(TMCraft.MOD_ID, path);
        this.item = item;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public SmithingTemplateItem getItem() {
        return item;
    }
}
