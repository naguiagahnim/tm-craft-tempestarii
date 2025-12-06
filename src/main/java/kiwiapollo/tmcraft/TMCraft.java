package kiwiapollo.tmcraft;

import kiwiapollo.tmcraft.block.ModBlock;
import kiwiapollo.tmcraft.gamerule.ModGameRule;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItemGroup;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import kiwiapollo.tmcraft.item.misc.*;
import kiwiapollo.tmcraft.item.moverecorder.MoveRecorderItem;
import kiwiapollo.tmcraft.item.starmove.StarMoveItemGroup;
import kiwiapollo.tmcraft.item.starmove.StarMoveItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItemGroup;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItemGroup;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import kiwiapollo.tmcraft.villager.MoveTutorTradeOffer;
import kiwiapollo.tmcraft.villager.MoveTutorVillager;
import kiwiapollo.tmcraft.villager.PokemonBreederTradeOffer;
import kiwiapollo.tmcraft.villager.PokemonBreederVillager;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMCraft implements ModInitializer {
	public static final String MOD_ID = "tmcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("TMCraft");

	@Override
	public void onInitialize() {
		ModGameRule.initialize();

		MoveTutorVillager.initialize();
		MoveTutorTradeOffer.initialize();

		PokemonBreederVillager.initialize();
		PokemonBreederTradeOffer.initialize();

		ModBlock.initialize();
		ModSmithingTemplateItem.initialize();
		MoveRecorderItem.initialize();

		BlankDiscItem.initialize();
		BlankEggItem.initialize();
		BlankBookItem.initialize();
		BlankStarItem.initialize();

		TMMoveItem.initialize();
		EggMoveItem.initialize();
		TutorMoveItem.initialize();
		StarMoveItem.initialize();

		MiscItemGroup.initialize();
		TMMoveItemGroup.initialize();
		EggMoveItemGroup.initialize();
		TutorMoveItemGroup.initialize();
		StarMoveItemGroup.initialize();
	}
}