
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.trains.enchantment.PoisonAspectEnchantment;
import net.mcreator.trains.T77modificationsMod;

public class T77modificationsModEnchantments {
	public static Enchantment POISON_ASPECT;

	public static void load() {
		POISON_ASPECT = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(T77modificationsMod.MODID, "poison_aspect"),
				new PoisonAspectEnchantment());
	}
}
