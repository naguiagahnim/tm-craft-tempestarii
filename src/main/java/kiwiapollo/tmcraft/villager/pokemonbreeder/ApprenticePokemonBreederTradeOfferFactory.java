package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApprenticePokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 10;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<EggMoveItem> MOVES = List.of(
            EggMoveItem.EGG_FAKEOUT,
            EggMoveItem.EGG_AQUAJET,
            EggMoveItem.EGG_BULLETPUNCH,
            EggMoveItem.EGG_SHADOWSNEAK,
            EggMoveItem.EGG_CONFUSION,
            EggMoveItem.EGG_POISONFANG,
            EggMoveItem.EGG_CLEARSMOG,
            EggMoveItem.EGG_LASTRESPECTS,
            EggMoveItem.EGG_BITE,
            EggMoveItem.EGG_ANCIENTPOWER,
            EggMoveItem.EGG_WINGATTACK,
            EggMoveItem.EGG_FEINTATTACK,
            EggMoveItem.EGG_FLAMEWHEEL,
            EggMoveItem.EGG_ROLLINGKICK,
            EggMoveItem.EGG_SHADOWPUNCH,
            EggMoveItem.EGG_BARBBARRAGE,
            EggMoveItem.EGG_SLUDGE,
            EggMoveItem.EGG_AURORABEAM,
            EggMoveItem.EGG_OCTAZOOKA,
            EggMoveItem.EGG_NIGHTSLASH,
            EggMoveItem.EGG_CHIPAWAY,
            EggMoveItem.EGG_SMELLINGSALTS,
            EggMoveItem.EGG_FREEZEDRY,
            EggMoveItem.EGG_CRUSHCLAW
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
                10, 6, 0.05F
        );
    }
}
