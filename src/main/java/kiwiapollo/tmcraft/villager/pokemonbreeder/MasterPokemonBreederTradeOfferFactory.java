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

public class MasterPokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 22;
    private static final int TYPE_GEM_COUNT = 3;

    private static final List<EggMoveItems> MOVES = List.of(
            EggMoveItems.EGG_PETALDANCE,
            EggMoveItems.EGG_POWERWHIP,
            EggMoveItems.EGG_THRASH,
            EggMoveItems.EGG_SYNCHRONOISE,
            EggMoveItems.EGG_RAGINGFURY,
            EggMoveItems.EGG_BURNUP,
            EggMoveItems.EGG_LASTRESORT,
            EggMoveItems.EGG_BOOMBURST,
            EggMoveItems.EGG_WATERSPOUT,
            EggMoveItems.EGG_HEADSMASH
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
                10, 8, 0.05F
        );
    }
}
