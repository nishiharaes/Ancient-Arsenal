package net.nishihara;

import net.fabricmc.api.ModInitializer;

import net.nishihara.block.ModBlocks;
import net.nishihara.item.ModItems;
import net.nishihara.world.gen.ModWorldGeneration;
import net.nishihara.world.loot.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientArsenal implements ModInitializer {
	public static final String MOD_ID = "ancientarsenal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();

	}
}