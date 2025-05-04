package kiwiapollo.tmcraft.villager.movetutor;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpertMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory {
    private static final int EMERALD_COUNT = 16;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<TutorMoveItem> MOVES = List.of(
            TutorMoveItem.TUTOR_HYPNOSIS,
            TutorMoveItem.TUTOR_ROLEPLAY,
            TutorMoveItem.TUTOR_MAGNETRISE,
            TutorMoveItem.TUTOR_SYNTHESIS,
            TutorMoveItem.TUTOR_GASTROACID,
            TutorMoveItem.TUTOR_BLOCK,
            TutorMoveItem.TUTOR_HEALBELL,
            TutorMoveItem.TUTOR_MAGICCOAT,
            TutorMoveItem.TUTOR_STRINGSHOT,
            TutorMoveItem.TUTOR_WORRYSEED,
            TutorMoveItem.TUTOR_AFTERYOU,
            TutorMoveItem.TUTOR_LASERFOCUS,
            TutorMoveItem.TUTOR_CORROSIVEGAS
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
