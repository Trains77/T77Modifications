
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trains.init;

import net.mcreator.trains.procedures.RideEntityProcedure;
import net.mcreator.trains.procedures.PoisonAspectEffectProcedure;
import net.mcreator.trains.procedures.NoobDeathProcedure;
import net.mcreator.trains.procedures.LaunchentityProcedure;
import net.mcreator.trains.procedures.KillentityProcedure;
import net.mcreator.trains.procedures.GravityeffectProcedure;
import net.mcreator.trains.procedures.GiveGravityProcedure;
import net.mcreator.trains.procedures.DespawnentityProcedure;
import net.mcreator.trains.procedures.CuriosityactionProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class T77modificationsModProcedures {
	public static void load() {
		new GravityeffectProcedure();
		new KillentityProcedure();
		new RideEntityProcedure();
		new NoobDeathProcedure();
		new LaunchentityProcedure();
		new DespawnentityProcedure();
		new GiveGravityProcedure();
		new CuriosityactionProcedure();
		new PoisonAspectEffectProcedure();
	}
}
