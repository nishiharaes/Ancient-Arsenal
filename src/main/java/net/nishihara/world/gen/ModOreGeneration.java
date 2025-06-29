package net.nishihara.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.nishihara.world.ModPlacedFeatures;

public class ModOreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK, BiomeKeys.STONY_PEAKS),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TENEBRINE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.PIGSTEEL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLAZEBOUND_ORE_PLACED_KEY);
    }
}
