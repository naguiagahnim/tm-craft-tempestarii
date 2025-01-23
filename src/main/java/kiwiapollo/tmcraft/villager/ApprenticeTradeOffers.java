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

public enum ApprenticeTradeOffers {
    TUTOR_FEINTATTACK(TutorMoveItems.TUTOR_FEINTATTACK),
    TUTOR_OMINOUSWIND(TutorMoveItems.TUTOR_OMINOUSWIND),
    TUTOR_SUCKERPUNCH(TutorMoveItems.TUTOR_SUCKERPUNCH),
    TUTOR_ANCIENTPOWER(TutorMoveItems.TUTOR_ANCIENTPOWER),
    TUTOR_SIGNALBEAM(TutorMoveItems.TUTOR_SIGNALBEAM),
    TUTOR_RELICSONG(TutorMoveItems.TUTOR_RELICSONG),
    TUTOR_SECRETSWORD(TutorMoveItems.TUTOR_SECRETSWORD),
    TUTOR_COVET(TutorMoveItems.TUTOR_COVET),
    TUTOR_RISINGVOLTAGE(TutorMoveItems.TUTOR_RISINGVOLTAGE);

    private static final int EMERALD = 18;
    private static final int TYPE_GEM = 1;

    private final TutorMoveItems move;

    ApprenticeTradeOffers(TutorMoveItems move) {
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
            List<ApprenticeTradeOffers> offers = Arrays.stream(ApprenticeTradeOffers.values()).collect(Collectors.toList());
            Collections.shuffle(offers);
            ApprenticeTradeOffers random = offers.get(0);

            return new TradeOffer(
                    random.getFirstBuyItem(),
                    random.getSecondBuyItem(),
                    random.getSellItem(),
                    10, 8, 0.05F
            );
        }
    }
}
