package kiwiapollo.tmcraft;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class MoveTutorVillagerProfession {
    public static final String ID = "movetutor";

    private static final RegistryKey<PointOfInterestType> WORKSTATION = RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(TMCraft.MOD_ID, ID));

    public static final PointOfInterestType POINT_OF_INTEREST = new PointOfInterestType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateManager().getStates()), 1, 1);

    public static final VillagerProfession PROFESSION = new VillagerProfession(
            ID,
            (entry) -> entry.matchesKey(WORKSTATION),
            (entry) -> entry.matchesKey(WORKSTATION),
            ImmutableSet.of(),
            ImmutableSet.of(),
            null
    );
}
