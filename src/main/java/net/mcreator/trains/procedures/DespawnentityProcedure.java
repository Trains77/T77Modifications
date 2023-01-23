package net.mcreator.trains.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.trains.T77modificationsMod;

import java.util.Map;

public class DespawnentityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency entity for procedure Despawnentity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
