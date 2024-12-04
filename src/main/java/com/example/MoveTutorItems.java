package com.example;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.stream.IntStream;

public enum MoveTutorItems {
    COPPER_TECHNICAL_RECORD(Identifier.of(TemplateMod.MOD_ID, "copper_technical_record"), new AttackTechnicalRecord(IntStream.range(0, 30))),
    IRON_TECHNICAL_RECORD(Identifier.of(TemplateMod.MOD_ID, "iron_technical_record"), new AttackTechnicalRecord(IntStream.range(30, 60))),
    GOLD_TECHNICAL_RECORD(Identifier.of(TemplateMod.MOD_ID, "gold_technical_record"), new AttackTechnicalRecord(IntStream.range(60, 90))),
    DIAMOND_TECHNICAL_RECORD(Identifier.of(TemplateMod.MOD_ID, "diamond_technical_record"), new AttackTechnicalRecord(IntStream.range(90, 120))),
    EMERALD_TECHNICAL_RECORD(Identifier.of(TemplateMod.MOD_ID, "emerald_technical_record"), new StatusTechnicalRecord());

    private final Item item;
    private final Identifier identifier;

    MoveTutorItems(Identifier identifier, Item item) {
        this.identifier = identifier;
        this.item = item;
    }

    Identifier getIdentifier() {
        return identifier;
    }

    Item getItem() {
        return item;
    }
}
