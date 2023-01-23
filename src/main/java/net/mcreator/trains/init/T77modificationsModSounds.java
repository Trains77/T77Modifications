
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class T77modificationsModSounds {
	public static SoundEvent WIIMENUMUSIC = new SoundEvent(new ResourceLocation("t77modifications", "wiimenumusic"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("t77modifications", "wiimenumusic"), WIIMENUMUSIC);
	}
}
