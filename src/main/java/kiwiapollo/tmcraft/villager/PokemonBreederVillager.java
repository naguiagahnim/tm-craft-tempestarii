package kiwiapollo.tmcraft.villager;

import com.google.common.collect.ImmutableSet;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.block.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class PokemonBreederVillager {
    public static final String POI_ID = "pokemonbreeder_poi";
    public static final String PROFESSION_ID = "pokemonbreeder";

    public static final RegistryKey<PointOfInterestType> POI_KEY = RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(TMCraft.MOD_ID, PokemonBreederVillager.POI_ID));
    public static final PointOfInterestType POI_TYPE = PointOfInterestHelper.register(Identifier.of(TMCraft.MOD_ID, POI_ID), 1, 1, ModBlock.POKEMON_BREEDER_TABLE_BLOCK);
    public static final VillagerProfession PROFESSION = new VillagerProfession(
            PROFESSION_ID,
            entry -> entry.matchesKey(POI_KEY),
            entry -> entry.matchesKey(POI_KEY),
            ImmutableSet.of(),
            ImmutableSet.of(),
            null
    );

    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(TMCraft.MOD_ID, PokemonBreederVillager.PROFESSION_ID), PokemonBreederVillager.PROFESSION);
    }
}
