package kiwiapollo.tmcraft.villager.movetutor;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveTeachingItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;

import java.util.Optional;

public abstract class MoveTutorTradeOfferFactory implements TradeOffers.Factory {
    protected TradedItem getEmeraldBuyItem(int count) {
        return new TradedItem(Items.EMERALD, count);
    }

    protected Optional<TradedItem> getTypeGemBuyItem(TutorMoveItem move, int count) {
        ElementalType type = ((TutorMoveTeachingItem) move.getItem()).getMoveType();
        return Optional.of(new TradedItem(new TypeGemFactory().create(type), count));
    }

    protected ItemStack getTutorMoveSellItem(TutorMoveItem move) {
        return new ItemStack(move.getItem());
    }
}
