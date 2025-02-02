package kiwiapollo.tmcraft.villager.movetutor;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;

public abstract class MoveTutorTradeOfferFactory implements TradeOffers.Factory {
    protected ItemStack getEmeraldBuyItem(int count) {
        return new ItemStack(Items.EMERALD, count);
    }

    protected ItemStack getTypeGemBuyItem(TutorMoveItems move, int count) {
        ElementalType type = ((TutorMoveItem) move.getItem()).getMoveType();
        return new ItemStack(new TypeGemFactory().create(type), count);
    }

    protected ItemStack getTutorMoveSellItem(TutorMoveItems move) {
        return new ItemStack(move.getItem());
    }
}
