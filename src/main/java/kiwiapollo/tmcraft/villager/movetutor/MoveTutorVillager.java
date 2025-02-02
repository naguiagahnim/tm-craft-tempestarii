package kiwiapollo.tmcraft.villager.movetutor;

import com.google.common.collect.ImmutableSet;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class MoveTutorVillager {
    public static final String POI_ID = "movetutor_poi";
    public static final String PROFESSION_ID = "movetutor";

    public static final RegistryKey<PointOfInterestType> POI_KEY = RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(TMCraft.MOD_ID, MoveTutorVillager.POI_ID));
    public static final PointOfInterestType POI_TYPE = PointOfInterestHelper.register(Identifier.of(TMCraft.MOD_ID, POI_ID), 1, 1, ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getBlock());
    public static final VillagerProfession PROFESSION = new VillagerProfession(
            PROFESSION_ID,
            entry -> entry.matchesKey(POI_KEY),
            entry -> entry.matchesKey(POI_KEY),
            ImmutableSet.of(),
            ImmutableSet.of(),
            null
    );
}
