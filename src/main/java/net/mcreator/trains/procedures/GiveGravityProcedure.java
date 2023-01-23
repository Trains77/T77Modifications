package net.mcreator.trains.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.trains.init.T77modificationsModMobEffects;
import net.mcreator.trains.T77modificationsMod;

import java.util.Map;

public class GiveGravityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				T77modificationsMod.LOGGER.warn("Failed to load dependency entity for procedure GiveGravity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(T77modificationsModMobEffects.GRAVITY, 3600, 1, (false), (false)));
	}
}
