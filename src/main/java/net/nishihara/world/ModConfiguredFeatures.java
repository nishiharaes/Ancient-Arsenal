package net.nishihara.world;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.nishihara.AncientArsenal;
import net.nishihara.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TENEBRINE_ORE_KEY = registerKey("tenebrine_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PIGSTEEL_ORE_KEY = registerKey("pigsteel_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLAZEBOUND_ORE_KEY = registerKey("blazebound_ore_key");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> overworldTenebrineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TENEBRINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TENEBRINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherPigsteelOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.PIGSTEEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherBlazeboundOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.BLAZEBOUND_ORE.getDefaultState()));

        register(context, TENEBRINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTenebrineOres, 4));
        register(context, PIGSTEEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherPigsteelOres, 5));
        register(context, BLAZEBOUND_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBlazeboundOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AncientArsenal.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}