package com.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import java.util.stream.IntStream;

public class AttackTechnicalRecord extends MoveTutorItem {
    private final IntStream power;

    public AttackTechnicalRecord(IntStream power) {
        super(new FabricItemSettings());
        this.power = power;
    }

    @Override
    protected boolean isSingleUseItem() {
        return true;
    }
}
