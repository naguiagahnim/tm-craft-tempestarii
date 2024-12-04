package com.example;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "wantedfeatures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(CUSTOM_ITEM))
			.displayName(Text.translatable("itemGroup.tutorial.test_group"))
			.build();

	@Override
	public void onInitialize() {
		Arrays.stream(BlankDiscItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Arrays.stream(TechnicalMachineItems.values()).forEach(item -> {
			Registry.register(Registries.ITEM, item.getIdentifier(), item.getItem());
		});

		Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
		Registry.register(Registries.ITEM_GROUP, new Identifier("tutorial", "test_group"), ITEM_GROUP);

		var groupRegistryKey = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier("tutorial", "test_group"));
		ItemGroupEvents.modifyEntriesEvent(groupRegistryKey).register(itemGroup -> {
			itemGroup.add(CUSTOM_ITEM);
		});
	}
}