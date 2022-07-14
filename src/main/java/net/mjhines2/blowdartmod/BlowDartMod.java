package net.mjhines2.blowdartmod;

import net.fabricmc.api.ModInitializer;
import net.mjhines2.blowdartmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlowDartMod implements ModInitializer {

	//Mod ID
	public static final String MOD_ID = "blowdartmod";

	//log
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
