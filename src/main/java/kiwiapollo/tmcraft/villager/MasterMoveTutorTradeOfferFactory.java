package kiwiapollo.tmcraft.villager;

import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterMoveTutorTradeOfferFactory extends MoveTutorTradeOfferFactory {
    private static final int EMERALD_COUNT = 42;
    private static final int TYPE_GEM_COUNT = 3;

    private static final List<TutorMoveItems> MOVES = List.of(
            TutorMoveItems.TUTOR_LASTRESORT,
            TutorMoveItems.TUTOR_DRAGONASCENT,
            TutorMoveItems.TUTOR_VOLTTACKLE,
            TutorMoveItems.TUTOR_STEELROLLER
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
