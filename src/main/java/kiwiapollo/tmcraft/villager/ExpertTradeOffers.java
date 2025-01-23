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

public enum ExpertTradeOffers {
    TUTOR_HYPNOSIS(TutorMoveItems.TUTOR_HYPNOSIS),
    TUTOR_ROLEPLAY(TutorMoveItems.TUTOR_ROLEPLAY),
    TUTOR_MAGNETRISE(TutorMoveItems.TUTOR_MAGNETRISE),
    TUTOR_SYNTHESIS(TutorMoveItems.TUTOR_SYNTHESIS),
    TUTOR_GASTROACID(TutorMoveItems.TUTOR_GASTROACID),
    TUTOR_BLOCK(TutorMoveItems.TUTOR_BLOCK),
    TUTOR_HEALBELL(TutorMoveItems.TUTOR_HEALBELL),
    TUTOR_MAGICCOAT(TutorMoveItems.TUTOR_MAGICCOAT),
    TUTOR_STRINGSHOT(TutorMoveItems.TUTOR_STRINGSHOT),
    TUTOR_WORRYSEED(TutorMoveItems.TUTOR_WORRYSEED),
    TUTOR_AFTERYOU(TutorMoveItems.TUTOR_AFTERYOU),
    TUTOR_LASERFOCUS(TutorMoveItems.TUTOR_LASERFOCUS),
    TUTOR_CORROSIVEGAS(TutorMoveItems.TUTOR_CORROSIVEGAS);

    private static final int EMERALD = 26;
    private static final int TYPE_GEM = 1;

    private final TutorMoveItems move;

    ExpertTradeOffers(TutorMoveItems move) {
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
            List<ExpertTradeOffers> offers = Arrays.stream(ExpertTradeOffers.values()).collect(Collectors.toList());
            Collections.shuffle(offers);
            ExpertTradeOffers random = offers.get(0);

            return new TradeOffer(
                    random.getFirstBuyItem(),
                    random.getSecondBuyItem(),
                    random.getSellItem(),
                    10, 8, 0.05F
            );
        }
    }
}
