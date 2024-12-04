package kiwiapollo.tmcraft;

import kiwiapollo.tmcraft.item.BlankDiscItems;
import kiwiapollo.tmcraft.item.TMItemGroup;
import kiwiapollo.tmcraft.item.TMItems;
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

		Registry.register(Registries.ITEM_GROUP, TMItemGroup.TM_ITEM_GROUP_REGISTRY_KEY, TMItemGroup.TM_ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(TMItemGroup.TM_ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(BlankDiscItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(TMItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});
	}
}