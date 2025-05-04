package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JourneymanPokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 16;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<EggMoveItem> MOVES = List.of(
            EggMoveItem.EGG_SLAM,
            EggMoveItem.EGG_FIRSTIMPRESSION,
            EggMoveItem.EGG_SPARKLINGARIA,
            EggMoveItem.EGG_DRAGONHAMMER,
            EggMoveItem.EGG_DRAGONRUSH,
            EggMoveItem.EGG_CROSSCHOP,
            EggMoveItem.EGG_HAMMERARM
    );

    @Override
    public @Nullable TradeOffer create(Entity entity, Random random) {
        List<EggMoveItem> offers = new ArrayList<>(MOVES);
        Collections.shuffle(offers);
        EggMoveItem move = offers.get(0);

        return new TradeOffer(
                getEmeraldBuyItem(EMERALD_COUNT),
                getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                getEggMoveSellItem(move),
                10, 8, 0.05F
        );
    }
}
