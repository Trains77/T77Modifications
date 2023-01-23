/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.trains.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.Items;

public class T77modificationsModBrewingRecipes {
	public static void load() {
		PotionBrewing.addMix(Potions.AWKWARD, Items.INK_SAC, T77modificationsModPotions.BLINDNESS_POTION);
		PotionBrewing.addMix(Potions.POISON, Blocks.COAL_BLOCK.asItem(), T77modificationsModPotions.DECAY_POTION);
		PotionBrewing.addMix(T77modificationsModPotions.DECAY_POTION, Items.GLOWSTONE_DUST, T77modificationsModPotions.DECAY_STRONG);
		PotionBrewing.addMix(T77modificationsModPotions.DECAY_POTION, Items.REDSTONE, T77modificationsModPotions.DECAY_LONG);
		PotionBrewing.addMix(Potions.AWKWARD, Items.POISONOUS_POTATO, Potions.POISON);
	}
}
