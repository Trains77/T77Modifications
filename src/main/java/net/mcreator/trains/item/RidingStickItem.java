
package net.mcreator.trains.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.trains.procedures.RideEntityProcedure;
import net.mcreator.trains.init.T77modificationsModTabs;

import java.util.List;

public class RidingStickItem extends Item {
	public RidingStickItem() {
		super(new Item.Properties().tab(T77modificationsModTabs.TAB_STICKS_OF_POWER).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Ride any mob with this stick"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RideEntityProcedure.execute(
				com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).put("sourceentity", sourceentity).build());
		return retval;
	}
}
