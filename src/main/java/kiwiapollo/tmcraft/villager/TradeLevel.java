package kiwiapollo.tmcraft.villager;

public enum TradeLevel {
    NOVICE(1),
    APPRENTICE(2),
    JOURNEYMAN(3),
    EXPERT(4),
    MASTER(5);

    private final int level;

    TradeLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
