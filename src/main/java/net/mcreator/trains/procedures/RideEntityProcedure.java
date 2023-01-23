package net.mcreator.trains.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.trains.T77modificationsMod;

import java.util.Map;

public class RideEntityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency entity for procedure RideEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure RideEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		sourceentity.startRiding(entity);
	}
}
