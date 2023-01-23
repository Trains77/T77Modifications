
package net.mcreator.trains.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.trains.procedures.GravityeffectProcedure;

public class GravityMobEffect extends MobEffect {
	public GravityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.t77modifications.gravity";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GravityeffectProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
