package kiwiapollo.tmcraft.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class MoveTutorTradeOffer {
    public void register() {
        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(Items.DIAMOND),
                        10, 8, 0.05F
                ))
        );
    }
}
