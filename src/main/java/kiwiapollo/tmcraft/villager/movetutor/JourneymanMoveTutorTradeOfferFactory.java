package kiwiapollo.tmcraft.villager.movetutor;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JourneymanMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory {
    private static final int EMERALD_COUNT = 16;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<TutorMoveItem> MOVES = List.of(
            TutorMoveItem.TUTOR_AQUATAIL,
            TutorMoveItem.TUTOR_FLOATYFALL,
            TutorMoveItem.TUTOR_SPLISHYSPLASH,
            TutorMoveItem.TUTOR_BOUNCYBUBBLE,
            TutorMoveItem.TUTOR_BUZZYBUZZ,
            TutorMoveItem.TUTOR_SIZZLYSLIDE,
            TutorMoveItem.TUTOR_BADDYBAD,
            TutorMoveItem.TUTOR_SAPPYSEED,
            TutorMoveItem.TUTOR_FREEZYFROST,
            TutorMoveItem.TUTOR_SPARKLYSWIRL
    );

    @Override
    public @Nullable TradeOffer create(Entity entity, Random random) {
        List<TutorMoveItem> offers = new ArrayList<>(MOVES);
        Collections.shuffle(offers);
        TutorMoveItem move = offers.get(0);

        return new TradeOffer(
                getEmeraldBuyItem(EMERALD_COUNT),
                getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                getTutorMoveSellItem(move),
                10, 8, 0.05F
        );
    }
}
