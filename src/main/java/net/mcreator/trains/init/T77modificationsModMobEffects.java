
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.trains.potion.GravityMobEffect;
import net.mcreator.trains.T77modificationsMod;

public class T77modificationsModMobEffects {
	public static MobEffect GRAVITY;

	public static void load() {
		GRAVITY = Registry.register(Registry.MOB_EFFECT, new ResourceLocation(T77modificationsMod.MODID, "gravity"), new GravityMobEffect());
	}
}
