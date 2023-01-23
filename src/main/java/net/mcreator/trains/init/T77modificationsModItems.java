
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.trains.item.StickOfNoobsItem;
import net.mcreator.trains.item.RidingStickItem;
import net.mcreator.trains.item.LaunchStickItem;
import net.mcreator.trains.item.InstantkillstickItem;
import net.mcreator.trains.item.GravityStickItem;
import net.mcreator.trains.item.DespawnstickItem;
import net.mcreator.trains.T77modificationsMod;

public class T77modificationsModItems {
	public static Item INSTANTKILLSTICK;
	public static Item RIDING_STICK;
	public static Item STICK_OF_NOOBS;
	public static Item LAUNCH_STICK;
	public static Item DESPAWNSTICK;
	public static Item GRAVITY_STICK;

	public static void load() {
		INSTANTKILLSTICK = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "instantkillstick"),
				new InstantkillstickItem());
		RIDING_STICK = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "riding_stick"), new RidingStickItem());
		STICK_OF_NOOBS = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "stick_of_noobs"), new StickOfNoobsItem());
		LAUNCH_STICK = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "launch_stick"), new LaunchStickItem());
		DESPAWNSTICK = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "despawnstick"), new DespawnstickItem());
		GRAVITY_STICK = Registry.register(Registry.ITEM, new ResourceLocation(T77modificationsMod.MODID, "gravity_stick"), new GravityStickItem());
	}
}
