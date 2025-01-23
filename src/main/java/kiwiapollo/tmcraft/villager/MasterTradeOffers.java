package kiwiapollo.tmcraft.villager;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.MoveTeachingItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum MasterTradeOffers {
    TUTOR_LASTRESORT(TutorMoveItems.TUTOR_LASTRESORT),
    TUTOR_DRAGONASCENT(TutorMoveItems.TUTOR_DRAGONASCENT),
    TUTOR_VOLTTACKLE(TutorMoveItems.TUTOR_VOLTTACKLE),
    TUTOR_STEELROLLER(TutorMoveItems.TUTOR_STEELROLLER);

    private static final int EMERALD = 42;
    private static final int TYPE_GEM = 3;

    private final TutorMoveItems move;

    MasterTradeOffers(TutorMoveItems move) {
        this.move = move;
    }

    public ItemStack getFirstBuyItem() {
        return new ItemStack(Items.EMERALD, EMERALD);
    }

    public ItemStack getSecondBuyItem() {
        ElementalType type = ((MoveTeachingItem) move.getItem()).getMoveType();
        return new ItemStack(new TypeGemFactory().create(type), TYPE_GEM);
    }

    public ItemStack getSellItem() {
        return new ItemStack(move.getItem());
    }

    public static class Random {
        public TradeOffer create() {
            List<MasterTradeOffers> offers = Arrays.stream(MasterTradeOffers.values()).collect(Collectors.toList());
            Collections.shuffle(offers);
            MasterTradeOffers random = offers.get(0);

            return new TradeOffer(
                    random.getFirstBuyItem(),
                    random.getSecondBuyItem(),
                    random.getSellItem(),
                    10, 8, 0.05F
            );
        }
    }
}
