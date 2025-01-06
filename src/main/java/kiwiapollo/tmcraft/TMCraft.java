package kiwiapollo.tmcraft;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItemGroup;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItems;
import kiwiapollo.tmcraft.item.misc.*;
import kiwiapollo.tmcraft.item.starmove.StarMoveItemGroup;
import kiwiapollo.tmcraft.item.starmove.StarMoveItems;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItemGroup;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItems;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItemGroup;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
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
		Arrays.stream(SmithingTemplateItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(MoveRecorderItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});


		Arrays.stream(BlankDiscItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(TMMoveItems.values()).forEach(item -> {
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

		Arrays.stream(TutorMoveItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});


		Arrays.stream(BlankStarItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(StarMoveItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});


		Registry.register(Registries.ITEM_GROUP, ModItemGroup.ITEM_GROUP_REGISTRY_KEY, ModItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(ModItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(SmithingTemplateItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(MoveRecorderItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(BlankDiscItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(BlankEggItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(BlankBookItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});

			Arrays.stream(BlankStarItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});


		Registry.register(Registries.ITEM_GROUP, TMMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, TMMoveItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(TMMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(TMMoveItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});


		Registry.register(Registries.ITEM_GROUP, EggMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, EggMoveItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(EggMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(EggMoveItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});


		Registry.register(Registries.ITEM_GROUP, TutorMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, TutorMoveItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(TutorMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(TutorMoveItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});


		Registry.register(Registries.ITEM_GROUP, StarMoveItemGroup.ITEM_GROUP_REGISTRY_KEY, StarMoveItemGroup.ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(StarMoveItemGroup.ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
			Arrays.stream(StarMoveItems.values()).forEach(item -> {
				itemGroup.add(item.getItem());
			});
		});
	}
}