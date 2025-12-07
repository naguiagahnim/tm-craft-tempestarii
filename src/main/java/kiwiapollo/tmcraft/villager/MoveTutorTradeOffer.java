package kiwiapollo.tmcraft.villager;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemMap;
import kiwiapollo.tmcraft.item.misc.ModSmithingTemplateItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveTeachingItem;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MoveTutorTradeOffer {
    public static void initialize() {
        register();
    }

    private static void register() {
        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.Novice())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.Apprentice())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.Journeyman())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.MoveUpgradeSmithingTemplate())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.Expert())
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add(new MoveTutorTradeOffer.Master())
        );
    }

    private static TradedItem getEmeraldBuyItem(int count) {
        return new TradedItem(Items.EMERALD, count);
    }

    private static Optional<TradedItem> getTypeGemBuyItem(Item move, int count) {
        ElementalType type = ((TutorMoveTeachingItem) move).getMoveType();
        return Optional.of(new TradedItem(new TypeGemMap().get(type), count));
    }

    private static ItemStack getTutorMoveSellItem(Item move) {
        return new ItemStack(move);
    }

    private static class Novice implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 6;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                TutorMoveItem.TUTOR_FAKEOUT,
                TutorMoveItem.TUTOR_TWISTER,
                TutorMoveItem.TUTOR_DUALCHOP,
                TutorMoveItem.TUTOR_BIND,
                TutorMoveItem.TUTOR_ZIPPYZAP,
                TutorMoveItem.TUTOR_TERRAINPULSE
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                    getTutorMoveSellItem(move),
                    10, 2, 0.05F
            );
        }
    }

    private static class Apprentice implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 10;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                TutorMoveItem.TUTOR_FEINTATTACK,
                TutorMoveItem.TUTOR_OMINOUSWIND,
                TutorMoveItem.TUTOR_SUCKERPUNCH,
                TutorMoveItem.TUTOR_ANCIENTPOWER,
                TutorMoveItem.TUTOR_SIGNALBEAM,
                TutorMoveItem.TUTOR_RELICSONG,
                TutorMoveItem.TUTOR_SECRETSWORD,
                TutorMoveItem.TUTOR_COVET,
                TutorMoveItem.TUTOR_RISINGVOLTAGE,
                TutorMoveItem.TUTOR_KNOCKOFF
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                    getTutorMoveSellItem(move),
                    10, 6, 0.05F
            );
        }
    }

    private static class Journeyman implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 16;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                TutorMoveItem.TUTOR_AQUATAIL,
                TutorMoveItem.TUTOR_FLOATYFALL,
                TutorMoveItem.TUTOR_SPLISHYSPLASH,
                TutorMoveItem.TUTOR_BOUNCYBUBBLE,
                TutorMoveItem.TUTOR_BUZZYBUZZ,
                TutorMoveItem.TUTOR_SIZZLYSLIDE,
                TutorMoveItem.TUTOR_BADDYBAD,
                TutorMoveItem.TUTOR_SAPPYSEED,
                TutorMoveItem.TUTOR_FREEZYFROST,
                TutorMoveItem.TUTOR_SPARKLYSWIRL,
                TutorMoveItem.TUTOR_GLITZYGLOW
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                    getTutorMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }

    private static class MoveUpgradeSmithingTemplate implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 22;

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(
                    new TradedItem(Items.EMERALD, EMERALD_COUNT),
                    ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(),
                    10, 8, 0.05F
            );
        }
    }

    private static class Expert implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 16;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                TutorMoveItem.TUTOR_HYPNOSIS,
                TutorMoveItem.TUTOR_ROLEPLAY,
                TutorMoveItem.TUTOR_MAGNETRISE,
                TutorMoveItem.TUTOR_SYNTHESIS,
                TutorMoveItem.TUTOR_GASTROACID,
                TutorMoveItem.TUTOR_BLOCK,
                TutorMoveItem.TUTOR_HEALBELL,
                TutorMoveItem.TUTOR_MAGICCOAT,
                TutorMoveItem.TUTOR_STRINGSHOT,
                TutorMoveItem.TUTOR_WORRYSEED,
                TutorMoveItem.TUTOR_AFTERYOU,
                TutorMoveItem.TUTOR_LASERFOCUS,
                TutorMoveItem.TUTOR_CORROSIVEGAS
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                    getTutorMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }

    private static class Master implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 22;
        private static final int TYPE_GEM_COUNT = 3;

        private static final List<Item> MOVES = List.of(
                TutorMoveItem.TUTOR_LASTRESORT,
                TutorMoveItem.TUTOR_DRAGONASCENT,
                TutorMoveItem.TUTOR_VOLTTACKLE,
                TutorMoveItem.TUTOR_STEELROLLER
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    getTypeGemBuyItem(move, TYPE_GEM_COUNT),
                    getTutorMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }
}
