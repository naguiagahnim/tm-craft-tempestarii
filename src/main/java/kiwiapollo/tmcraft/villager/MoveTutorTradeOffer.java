package kiwiapollo.tmcraft.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class MoveTutorTradeOffer {
    public void register() {
        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add((entity, random) -> new NoviceTradeOffers.Random().create())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add((entity, random) -> new ApprenticeTradeOffers.Random().create())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add((entity, random) -> new JourneymanTradeOffers.Random().create())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add((entity, random) -> new ExpertTradeOffers.Random().create())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add((entity, random) -> new MasterTradeOffers.Random().create())
        );
    }
}
