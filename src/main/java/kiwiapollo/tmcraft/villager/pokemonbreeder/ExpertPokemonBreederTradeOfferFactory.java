package kiwiapollo.tmcraft.villager.pokemonbreeder;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpertPokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 16;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<EggMoveItem> MOVES = List.of(
            EggMoveItem.EGG_GRASSWHISTLE,
            EggMoveItem.EGG_INGRAIN,
            EggMoveItem.EGG_BELLYDRUM,
            EggMoveItem.EGG_MIST,
            EggMoveItem.EGG_FLAIL,
            EggMoveItem.EGG_FORESIGHT,
            EggMoveItem.EGG_MIRRORCOAT,
            EggMoveItem.EGG_YAWN,
            EggMoveItem.EGG_REFRESH,
            EggMoveItem.EGG_MUDSPORT,
            EggMoveItem.EGG_AQUARING,
            EggMoveItem.EGG_LIFEDEW,
            EggMoveItem.EGG_MEFIRST,
            EggMoveItem.EGG_FINALGAMBIT,
            EggMoveItem.EGG_DISABLE,
            EggMoveItem.EGG_SWITCHEROO,
            EggMoveItem.EGG_ROTOTILLER,
            EggMoveItem.EGG_VENOMDRENCH,
            EggMoveItem.EGG_PRESENT,
            EggMoveItem.EGG_WISH,
            EggMoveItem.EGG_TICKLE,
            EggMoveItem.EGG_HEALPULSE,
            EggMoveItem.EGG_HYPNOSIS,
            EggMoveItem.EGG_HOWL,
            EggMoveItem.EGG_MEMENTO,
            EggMoveItem.EGG_TEETERDANCE,
            EggMoveItem.EGG_STRENGTHSAP,
            EggMoveItem.EGG_WIDEGUARD,
            EggMoveItem.EGG_MORNINGSUN,
            EggMoveItem.EGG_ASSIST,
            EggMoveItem.EGG_ODORSLEUTH,
            EggMoveItem.EGG_PUNISHMENT,
            EggMoveItem.EGG_SIMPLEBEAM,
            EggMoveItem.EGG_MEDITATE,
            EggMoveItem.EGG_MINDREADER,
            EggMoveItem.EGG_BARRIER,
            EggMoveItem.EGG_POWERTRICK,
            EggMoveItem.EGG_GUARDSPLIT,
            EggMoveItem.EGG_PSYCHOSHIFT,
            EggMoveItem.EGG_ACUPRESSURE,
            EggMoveItem.EGG_AUTOTOMIZE,
            EggMoveItem.EGG_TRUMPCARD,
            EggMoveItem.EGG_PERISHSONG,
            EggMoveItem.EGG_ENTRAINMENT,
            EggMoveItem.EGG_POWERSPLIT,
            EggMoveItem.EGG_METALBURST,
            EggMoveItem.EGG_STUFFCHEEKS,
            EggMoveItem.EGG_CRAFTYSHIELD
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
