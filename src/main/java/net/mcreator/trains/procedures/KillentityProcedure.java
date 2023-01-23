package net.mcreator.trains.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.trains.T77modificationsMod;

import java.util.Map;

public class KillentityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency entity for procedure Killentity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.hurt(DamageSource.GENERIC, 7777);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
	}
}
