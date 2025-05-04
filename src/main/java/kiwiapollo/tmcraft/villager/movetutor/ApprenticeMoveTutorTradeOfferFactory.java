package kiwiapollo.tmcraft.villager.movetutor;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApprenticeMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory{
    private static final int EMERALD_COUNT = 10;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<TutorMoveItem> MOVES = List.of(
            TutorMoveItem.TUTOR_FEINTATTACK,
            TutorMoveItem.TUTOR_OMINOUSWIND,
            TutorMoveItem.TUTOR_SUCKERPUNCH,
            TutorMoveItem.TUTOR_ANCIENTPOWER,
            TutorMoveItem.TUTOR_SIGNALBEAM,
            TutorMoveItem.TUTOR_RELICSONG,
            TutorMoveItem.TUTOR_SECRETSWORD,
            TutorMoveItem.TUTOR_COVET,
            TutorMoveItem.TUTOR_RISINGVOLTAGE,
            TutorMoveItem.TUTOR_KNOCKOFF
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
                10, 6, 0.05F
        );
    }
}
