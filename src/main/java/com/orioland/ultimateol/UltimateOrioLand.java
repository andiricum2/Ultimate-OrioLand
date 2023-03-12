package com.orioland.ultimateol;

import com.orioland.ultimateol.items.MainItems;
import com.orioland.ultimateol.itemgroups.ultimateorioland;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateOrioLand implements ModInitializer {
	public static final String ModID = "ultimateol";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		MainItems.registerMainItems();
		ultimateorioland.registerUltimateOrioLand();
	}
}
