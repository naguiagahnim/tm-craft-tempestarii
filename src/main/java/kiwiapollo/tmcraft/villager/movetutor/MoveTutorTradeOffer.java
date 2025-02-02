package kiwiapollo.tmcraft.villager.movetutor;

import kiwiapollo.tmcraft.villager.MoveUpgradeSmithingTemplateTradeOfferFactory;
import kiwiapollo.tmcraft.villager.TradeLevel;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class MoveTutorTradeOffer {
    public void register() {
        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add(new NoviceMoveTutorTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add(new ApprenticeMoveTutorTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new JourneymanMoveTutorTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new MoveUpgradeSmithingTemplateTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add(new ExpertMoveTutorTradeOfferFactory())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add(new MasterMoveTutorTradeOfferFactory())
        );
    }
}
