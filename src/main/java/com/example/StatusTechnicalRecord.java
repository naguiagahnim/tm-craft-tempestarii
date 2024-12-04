package com.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class StatusTechnicalRecord extends MoveTutorItem {
    public StatusTechnicalRecord() {
        super(new FabricItemSettings());
    }

    @Override
    protected boolean isSingleUseItem() {
        return true;
    }
}
