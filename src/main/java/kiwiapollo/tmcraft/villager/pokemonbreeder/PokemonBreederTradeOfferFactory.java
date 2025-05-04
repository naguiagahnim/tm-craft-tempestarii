package kiwiapollo.tmcraft.villager.pokemonbreeder;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.eggmove.EggMoveTeachingItem;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;

public abstract class PokemonBreederTradeOfferFactory implements TradeOffers.Factory {
    protected ItemStack getEmeraldBuyItem(int count) {
        return new ItemStack(Items.EMERALD, count);
    }

    protected ItemStack getTypeGemBuyItem(EggMoveItem move, int count) {
        ElementalType type = ((EggMoveTeachingItem) move.getItem()).getMoveType();
        return new ItemStack(new TypeGemFactory().create(type), count);
    }

    protected ItemStack getEggMoveSellItem(EggMoveItem move) {
        return new ItemStack(move.getItem());
    }
}
