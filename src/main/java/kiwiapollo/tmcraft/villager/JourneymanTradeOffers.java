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

public enum JourneymanTradeOffers {
    TUTOR_AQUATAIL(TutorMoveItems.TUTOR_AQUATAIL),
    TUTOR_FLOATYFALL(TutorMoveItems.TUTOR_FLOATYFALL),
    TUTOR_SPLISHYSPLASH(TutorMoveItems.TUTOR_SPLISHYSPLASH),
    TUTOR_BOUNCYBUBBLE(TutorMoveItems.TUTOR_BOUNCYBUBBLE),
    TUTOR_BUZZYBUZZ(TutorMoveItems.TUTOR_BUZZYBUZZ),
    TUTOR_SIZZLYSLIDE(TutorMoveItems.TUTOR_SIZZLYSLIDE),
    TUTOR_BADDYBAD(TutorMoveItems.TUTOR_BADDYBAD),
    TUTOR_SAPPYSEED(TutorMoveItems.TUTOR_SAPPYSEED),
    TUTOR_FREEZYFROST(TutorMoveItems.TUTOR_FREEZYFROST),
    TUTOR_SPARKLYSWIRL(TutorMoveItems.TUTOR_SPARKLYSWIRL);

    private static final int EMERALD = 26;
    private static final int TYPE_GEM = 1;

    private final TutorMoveItems move;

    JourneymanTradeOffers(TutorMoveItems move) {
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
            List<JourneymanTradeOffers> offers = Arrays.stream(JourneymanTradeOffers.values()).collect(Collectors.toList());
            Collections.shuffle(offers);
            JourneymanTradeOffers random = offers.get(0);

            return new TradeOffer(
                    random.getFirstBuyItem(),
                    random.getSecondBuyItem(),
                    random.getSellItem(),
                    10, 8, 0.05F
            );
        }
    }
}
