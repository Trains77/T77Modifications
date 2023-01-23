
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.mcreator.trains.command.CuriosityCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class T77modificationsModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			CuriosityCommand.register(dispatcher, commandBuildContext);
		});
	}
}
