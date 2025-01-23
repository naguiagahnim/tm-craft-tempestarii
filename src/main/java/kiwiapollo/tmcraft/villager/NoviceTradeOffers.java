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

public enum NoviceTradeOffers {
    TUTOR_FAKEOUT(TutorMoveItems.TUTOR_FAKEOUT),
    TUTOR_TWISTER(TutorMoveItems.TUTOR_TWISTER),
    TUTOR_DUALCHOP(TutorMoveItems.TUTOR_DUALCHOP),
    TUTOR_BIND(TutorMoveItems.TUTOR_BIND),
    TUTOR_ZIPPYZAP(TutorMoveItems.TUTOR_ZIPPYZAP),
    TUTOR_TERRAINPULSE(TutorMoveItems.TUTOR_TERRAINPULSE);

    private static final int EMERALD = 12;
    private static final int TYPE_GEM = 1;

    private final TutorMoveItems move;

    NoviceTradeOffers(TutorMoveItems move) {
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
            List<NoviceTradeOffers> offers = Arrays.stream(NoviceTradeOffers.values()).collect(Collectors.toList());
            Collections.shuffle(offers);
            NoviceTradeOffers random = offers.get(0);

            return new TradeOffer(
                    random.getFirstBuyItem(),
                    random.getSecondBuyItem(),
                    random.getSellItem(),
                    10, 8, 0.05F
            );
        }
    }
}
