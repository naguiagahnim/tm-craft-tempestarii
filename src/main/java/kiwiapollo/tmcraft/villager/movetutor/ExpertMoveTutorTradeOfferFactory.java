package kiwiapollo.tmcraft.villager.movetutor;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
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

    private static final List<TutorMoveItems> MOVES = List.of(
            TutorMoveItems.TUTOR_HYPNOSIS,
            TutorMoveItems.TUTOR_ROLEPLAY,
            TutorMoveItems.TUTOR_MAGNETRISE,
            TutorMoveItems.TUTOR_SYNTHESIS,
            TutorMoveItems.TUTOR_GASTROACID,
            TutorMoveItems.TUTOR_BLOCK,
            TutorMoveItems.TUTOR_HEALBELL,
            TutorMoveItems.TUTOR_MAGICCOAT,
            TutorMoveItems.TUTOR_STRINGSHOT,
            TutorMoveItems.TUTOR_WORRYSEED,
            TutorMoveItems.TUTOR_AFTERYOU,
            TutorMoveItems.TUTOR_LASERFOCUS,
            TutorMoveItems.TUTOR_CORROSIVEGAS
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
