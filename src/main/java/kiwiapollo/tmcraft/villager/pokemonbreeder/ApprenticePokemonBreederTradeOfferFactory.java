package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItems;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
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

    private static final List<EggMoveItems> MOVES = List.of(
            EggMoveItems.EGG_FAKEOUT,
            EggMoveItems.EGG_AQUAJET,
            EggMoveItems.EGG_BULLETPUNCH,
            EggMoveItems.EGG_SHADOWSNEAK,
            EggMoveItems.EGG_CONFUSION,
            EggMoveItems.EGG_POISONFANG,
            EggMoveItems.EGG_CLEARSMOG,
            EggMoveItems.EGG_LASTRESPECTS,
            EggMoveItems.EGG_BITE,
            EggMoveItems.EGG_ANCIENTPOWER,
            EggMoveItems.EGG_WINGATTACK,
            EggMoveItems.EGG_FEINTATTACK,
            EggMoveItems.EGG_FLAMEWHEEL,
            EggMoveItems.EGG_ROLLINGKICK,
            EggMoveItems.EGG_SHADOWPUNCH,
            EggMoveItems.EGG_BARBBARRAGE,
            EggMoveItems.EGG_SLUDGE,
            EggMoveItems.EGG_AURORABEAM,
            EggMoveItems.EGG_OCTAZOOKA,
            EggMoveItems.EGG_NIGHTSLASH,
            EggMoveItems.EGG_CHIPAWAY,
            EggMoveItems.EGG_SMELLINGSALTS,
            EggMoveItems.EGG_FREEZEDRY,
            EggMoveItems.EGG_CRUSHCLAW
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
                10, 6, 0.05F
        );
    }
}
