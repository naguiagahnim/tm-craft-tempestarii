package kiwiapollo.tmcraft.villager.pokemonbreeder;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.eggmove.EggMoveTeachingItem;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;

import java.util.Optional;

public abstract class PokemonBreederTradeOfferFactory implements TradeOffers.Factory {
    protected TradedItem getEmeraldBuyItem(int count) {
        return new TradedItem(Items.EMERALD, count);
    }

    protected Optional<TradedItem> getTypeGemBuyItem(EggMoveItem move, int count) {
        ElementalType type = ((EggMoveTeachingItem) move.getItem()).getMoveType();
        return Optional.of(new TradedItem(new TypeGemFactory().create(type), count));
    }

    protected ItemStack getEggMoveSellItem(EggMoveItem move) {
        return new ItemStack(move.getItem());
    }
}
