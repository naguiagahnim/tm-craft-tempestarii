package kiwiapollo.tmcraft.villager;

import kiwiapollo.tmcraft.item.misc.SmithingTemplateItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import org.jetbrains.annotations.Nullable;

public class MoveUpgradeSmithingTemplateTradeOfferFactory implements TradeOffers.Factory {
    private static final int EMERALD_COUNT = 22;

    @Override
    public @Nullable TradeOffer create(Entity entity, Random random) {
        return new TradeOffer(
                new TradedItem(Items.EMERALD, EMERALD_COUNT),
                SmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem().getDefaultStack(),
                10, 8, 0.05F
        );
    }
}
