
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.trains.T77modificationsMod;

public class T77modificationsModPotions {
	public static Potion BLINDNESS_POTION;
	public static Potion DECAY_POTION;
	public static Potion DECAY_STRONG;
	public static Potion DECAY_LONG;

	public static void load() {
		BLINDNESS_POTION = Registry.register(Registry.POTION, new ResourceLocation(T77modificationsMod.MODID, "blindness_potion"),
				new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true)));
		DECAY_POTION = Registry.register(Registry.POTION, new ResourceLocation(T77modificationsMod.MODID, "decay_potion"),
				new Potion(new MobEffectInstance(MobEffects.WITHER, 3600, 0, false, true)));
		DECAY_STRONG = Registry.register(Registry.POTION, new ResourceLocation(T77modificationsMod.MODID, "decay_strong"),
				new Potion(new MobEffectInstance(MobEffects.WITHER, 1800, 1, false, true)));
		DECAY_LONG = Registry.register(Registry.POTION, new ResourceLocation(T77modificationsMod.MODID, "decay_long"),
				new Potion(new MobEffectInstance(MobEffects.WITHER, 6600, 0, false, true)));
	}
}
