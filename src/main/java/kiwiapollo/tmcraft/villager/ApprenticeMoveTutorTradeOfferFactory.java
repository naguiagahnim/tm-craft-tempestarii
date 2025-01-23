package kiwiapollo.tmcraft.villager;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApprenticeMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory{
    private static final int EMERALD_COUNT = 18;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<TutorMoveItems> MOVES = List.of(
            TutorMoveItems.TUTOR_FEINTATTACK,
            TutorMoveItems.TUTOR_OMINOUSWIND,
            TutorMoveItems.TUTOR_SUCKERPUNCH,
            TutorMoveItems.TUTOR_ANCIENTPOWER,
            TutorMoveItems.TUTOR_SIGNALBEAM,
            TutorMoveItems.TUTOR_RELICSONG,
            TutorMoveItems.TUTOR_SECRETSWORD,
            TutorMoveItems.TUTOR_COVET,
            TutorMoveItems.TUTOR_RISINGVOLTAGE
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
                10, 5, 0.05F
        );
    }
}
