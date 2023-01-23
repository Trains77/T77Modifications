package net.mcreator.trains.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.trains.T77modificationsMod;

import java.util.Map;

public class LaunchentityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency entity for procedure Launchentity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setDeltaMovement(new Vec3(0, 3, 0));
	}
}
