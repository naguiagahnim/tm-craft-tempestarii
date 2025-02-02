package kiwiapollo.tmcraft.villager.pokemonbreeder;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItems;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;

public abstract class PokemonBreederTradeOfferFactory implements TradeOffers.Factory {
    protected ItemStack getEmeraldBuyItem(int count) {
        return new ItemStack(Items.EMERALD, count);
    }

    protected ItemStack getTypeGemBuyItem(EggMoveItems move, int count) {
        ElementalType type = ((EggMoveItem) move.getItem()).getMoveType();
        return new ItemStack(new TypeGemFactory().create(type), count);
    }

    protected ItemStack getEggMoveSellItem(EggMoveItems move) {
        return new ItemStack(move.getItem());
    }
}
