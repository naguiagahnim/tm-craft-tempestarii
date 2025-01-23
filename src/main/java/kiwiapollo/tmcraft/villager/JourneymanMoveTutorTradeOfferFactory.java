package kiwiapollo.tmcraft.villager;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JourneymanMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory {
    private static final int EMERALD_COUNT = 26;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<TutorMoveItems> MOVES = List.of(
            TutorMoveItems.TUTOR_AQUATAIL,
            TutorMoveItems.TUTOR_FLOATYFALL,
            TutorMoveItems.TUTOR_SPLISHYSPLASH,
            TutorMoveItems.TUTOR_BOUNCYBUBBLE,
            TutorMoveItems.TUTOR_BUZZYBUZZ,
            TutorMoveItems.TUTOR_SIZZLYSLIDE,
            TutorMoveItems.TUTOR_BADDYBAD,
            TutorMoveItems.TUTOR_SAPPYSEED,
            TutorMoveItems.TUTOR_FREEZYFROST,
            TutorMoveItems.TUTOR_SPARKLYSWIRL
    );

    @Override
    public @Nullable TradeOffer create(Entity entity, Random random) {
        List<TutorMoveItems> offers = new ArrayList<>(MOVES);
        Collections.shuffle(offers);
        TutorMoveItems move = offers.get(0);

        return new TradeOffer(
                getEmeraldBuyItem(EMERALD_COUNT),
                getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                getTutorMoveSellItem(move),
                10, 8, 0.05F
        );
    }
}
