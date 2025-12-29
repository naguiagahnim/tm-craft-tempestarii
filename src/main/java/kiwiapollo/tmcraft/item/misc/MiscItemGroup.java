package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.block.ModBlock;
import kiwiapollo.tmcraft.item.moverecorder.MoveRecorderItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MiscItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE))
            .displayName(Text.translatable("item_group.tmcraft.tmcraft"))
            .build();

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMCraft.MOD_ID, "tmcraft_item_group"));

    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.ITEM_GROUP, MiscItemGroup.ITEM_GROUP_REGISTRY_KEY, MiscItemGroup.ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(MiscItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
            itemGroup.add(ModBlock.MOVE_TUTOR_TABLE_BLOCK);
            itemGroup.add(ModBlock.POKEMON_BREEDER_TABLE_BLOCK);

            itemGroup.add(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE);

            itemGroup.add(MoveRecorderItem.TM_MOVE_RECORDER);
            itemGroup.add(MoveRecorderItem.EGG_MOVE_RECORDER);
            itemGroup.add(MoveRecorderItem.TUTOR_MOVE_RECORDER);
            itemGroup.add(MoveRecorderItem.STAR_MOVE_RECORDER);
            
            itemGroup.add(BlankDiscItem.COPPER_BLANK_DISC);
            itemGroup.add(BlankDiscItem.IRON_BLANK_DISC);
            itemGroup.add(BlankDiscItem.GOLD_BLANK_DISC);
            itemGroup.add(BlankDiscItem.EMERALD_BLANK_DISC);
            itemGroup.add(BlankDiscItem.DIAMOND_BLANK_DISC);
            itemGroup.add(BlankDiscItem.NETHERITE_BLANK_DISC);

            itemGroup.add(BlankEggItem.COPPER_BLANK_EGG);
            itemGroup.add(BlankEggItem.IRON_BLANK_EGG);
            itemGroup.add(BlankEggItem.GOLD_BLANK_EGG);
            itemGroup.add(BlankEggItem.EMERALD_BLANK_EGG);
            itemGroup.add(BlankEggItem.DIAMOND_BLANK_EGG);
            itemGroup.add(BlankEggItem.NETHERITE_BLANK_EGG);

            itemGroup.add(BlankBookItem.COPPER_BLANK_BOOK);
            itemGroup.add(BlankBookItem.IRON_BLANK_BOOK);
            itemGroup.add(BlankBookItem.GOLD_BLANK_BOOK);
            itemGroup.add(BlankBookItem.EMERALD_BLANK_BOOK);
            itemGroup.add(BlankBookItem.DIAMOND_BLANK_BOOK);
            itemGroup.add(BlankBookItem.NETHERITE_BLANK_BOOK);

            itemGroup.add(BlankStarItem.COPPER_BLANK_STAR);
            itemGroup.add(BlankStarItem.IRON_BLANK_STAR);
            itemGroup.add(BlankStarItem.GOLD_BLANK_STAR);
            itemGroup.add(BlankStarItem.EMERALD_BLANK_STAR);
            itemGroup.add(BlankStarItem.DIAMOND_BLANK_STAR);
            itemGroup.add(BlankStarItem.NETHERITE_BLANK_STAR);
        });
    }
}
