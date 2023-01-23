/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.trains;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.trains.init.T77modificationsModTabs;
import net.mcreator.trains.init.T77modificationsModSounds;
import net.mcreator.trains.init.T77modificationsModProcedures;
import net.mcreator.trains.init.T77modificationsModPotions;
import net.mcreator.trains.init.T77modificationsModMobEffects;
import net.mcreator.trains.init.T77modificationsModItems;
import net.mcreator.trains.init.T77modificationsModEnchantments;
import net.mcreator.trains.init.T77modificationsModCommands;
import net.mcreator.trains.init.T77modificationsModBrewingRecipes;

import net.fabricmc.api.ModInitializer;

public class T77modificationsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "t77modifications";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing T77modificationsMod");
		T77modificationsModTabs.load();

		T77modificationsModEnchantments.load();
		T77modificationsModPotions.load();
		T77modificationsModMobEffects.load();

		T77modificationsModItems.load();

		T77modificationsModProcedures.load();
		T77modificationsModCommands.load();

		T77modificationsModBrewingRecipes.load();
		T77modificationsModSounds.load();

	}
}
