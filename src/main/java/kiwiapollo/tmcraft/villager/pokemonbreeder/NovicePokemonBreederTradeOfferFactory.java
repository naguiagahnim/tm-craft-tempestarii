package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItems;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NovicePokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 6;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<EggMoveItems> MOVES = List.of(
            EggMoveItems.EGG_TIDYUP,
            EggMoveItems.EGG_CHILLYRECEPTION,
            EggMoveItems.EGG_SHEDTAIL,
            EggMoveItems.EGG_POWERTRIP,
            EggMoveItems.EGG_ASTONISH,
            EggMoveItems.EGG_ICEBALL,
            EggMoveItems.EGG_LICK
    );

    @Override
    public @Nullable TradeOffer create(Entity entity, Random random) {
        List<EggMoveItems> offers = new ArrayList<>(MOVES);
        Collections.shuffle(offers);
        EggMoveItems move = offers.get(0);

        return new TradeOffer(
                getEmeraldBuyItem(EMERALD_COUNT),
                getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                getEggMoveSellItem(move),
                10, 2, 0.05F
        );
    }
}
