
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class T77modificationsModTabs {
	public static CreativeModeTab TAB_STICKS_OF_POWER;

	public static void load() {
		TAB_STICKS_OF_POWER = FabricItemGroupBuilder.create(new ResourceLocation("t77modifications", "sticks_of_power"))
				.icon(() -> new ItemStack(Items.DEBUG_STICK)).build();
	}
}
