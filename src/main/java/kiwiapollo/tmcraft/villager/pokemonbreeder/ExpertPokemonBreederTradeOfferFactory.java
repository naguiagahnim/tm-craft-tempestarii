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

public class ExpertPokemonBreederTradeOfferFactory extends PokemonBreederTradeOfferFactory {
    private static final int EMERALD_COUNT = 16;
    private static final int TYPE_GEM_COUNT = 1;

    private static final List<EggMoveItems> MOVES = List.of(
            EggMoveItems.EGG_GRASSWHISTLE,
            EggMoveItems.EGG_INGRAIN,
            EggMoveItems.EGG_BELLYDRUM,
            EggMoveItems.EGG_MIST,
            EggMoveItems.EGG_FLAIL,
            EggMoveItems.EGG_FORESIGHT,
            EggMoveItems.EGG_MIRRORCOAT,
            EggMoveItems.EGG_YAWN,
            EggMoveItems.EGG_REFRESH,
            EggMoveItems.EGG_MUDSPORT,
            EggMoveItems.EGG_AQUARING,
            EggMoveItems.EGG_LIFEDEW,
            EggMoveItems.EGG_MEFIRST,
            EggMoveItems.EGG_FINALGAMBIT,
            EggMoveItems.EGG_DISABLE,
            EggMoveItems.EGG_SWITCHEROO,
            EggMoveItems.EGG_ROTOTILLER,
            EggMoveItems.EGG_VENOMDRENCH,
            EggMoveItems.EGG_PRESENT,
            EggMoveItems.EGG_WISH,
            EggMoveItems.EGG_TICKLE,
            EggMoveItems.EGG_HEALPULSE,
            EggMoveItems.EGG_HYPNOSIS,
            EggMoveItems.EGG_HOWL,
            EggMoveItems.EGG_MEMENTO,
            EggMoveItems.EGG_TEETERDANCE,
            EggMoveItems.EGG_STRENGTHSAP,
            EggMoveItems.EGG_WIDEGUARD,
            EggMoveItems.EGG_MORNINGSUN,
            EggMoveItems.EGG_ASSIST,
            EggMoveItems.EGG_ODORSLEUTH,
            EggMoveItems.EGG_PUNISHMENT,
            EggMoveItems.EGG_SIMPLEBEAM,
            EggMoveItems.EGG_MEDITATE,
            EggMoveItems.EGG_MINDREADER,
            EggMoveItems.EGG_BARRIER,
            EggMoveItems.EGG_POWERTRICK,
            EggMoveItems.EGG_GUARDSPLIT,
            EggMoveItems.EGG_PSYCHOSHIFT,
            EggMoveItems.EGG_ACUPRESSURE,
            EggMoveItems.EGG_AUTOTOMIZE,
            EggMoveItems.EGG_TRUMPCARD,
            EggMoveItems.EGG_PERISHSONG,
            EggMoveItems.EGG_ENTRAINMENT,
            EggMoveItems.EGG_POWERSPLIT,
            EggMoveItems.EGG_METALBURST,
            EggMoveItems.EGG_STUFFCHEEKS,
            EggMoveItems.EGG_CRAFTYSHIELD
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
