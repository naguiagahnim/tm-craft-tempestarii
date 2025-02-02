package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.villager.MoveUpgradeSmithingTemplateTradeOfferFactory;
import kiwiapollo.tmcraft.villager.TradeLevel;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class PokemonBreederTradeOffer {
    public void register() {
        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add(new NovicePokemonBreederTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add(new ApprenticePokemonBreederTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new JourneymanPokemonBreederTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new MoveUpgradeSmithingTemplateTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add(new ExpertPokemonBreederTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add(new MasterPokemonBreederTradeOfferFactory())
        );
    }
}
