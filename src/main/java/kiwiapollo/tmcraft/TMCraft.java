package kiwiapollo.tmcraft;

import kiwiapollo.tmcraft.item.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TMCraft implements ModInitializer {
	public static final String MOD_ID = "tmcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Arrays.stream(BlankDiscItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(TMItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(BlankEggItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(EggMoveItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(BlankBookItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(MoveTutorItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Registry.register(Registries.ITEM_GROUP, TMItemGroup.ITEM_GROUP_REGISTRY_KEY, TMItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(TMItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(BlankDiscItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(TMItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});

		Registry.register(Registries.ITEM_GROUP, EggMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, EggMoveItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(EggMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(BlankEggItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(EggMoveItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});

		Registry.register(Registries.ITEM_GROUP, MoveTutorItemGroup.ITEM_GROUP_REGISTRY_KEY, MoveTutorItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(MoveTutorItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(BlankBookItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(MoveTutorItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});
	}
}