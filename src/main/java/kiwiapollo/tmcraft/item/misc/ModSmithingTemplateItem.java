package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModSmithingTemplateItem {
    public static final Item MOVE_UPGRADE_SMITHING_TEMPLATE = register("move_upgrade_smithing_template", new SmithingTemplateItem(
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.applies_to").formatted(Formatting.BLUE),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.ingredients").formatted(Formatting.BLUE),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.title").formatted(Formatting.GRAY),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.base_slot_description"),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.additions_slot_description"),
            List.of(
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_disc"),
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_egg"),
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_book"),
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_star")
            ),
            List.of(
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_ingot"),
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_emerald"),
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_diamond")
            )
    ));

    public static void initialize() {

    }

    public static Item register(String name, Item item) {
        Identifier identifier = Identifier.of(TMCraft.MOD_ID, name);
        return Registry.register(Registries.ITEM, identifier, item);
    }
}
