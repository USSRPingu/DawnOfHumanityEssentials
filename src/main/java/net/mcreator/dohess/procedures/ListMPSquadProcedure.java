package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

public class ListMPSquadProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @s {\"text\":\"" + "" + DohessModVariables.WorldVariables.get(world).MPSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad1).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad2).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad3).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad4).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad5).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad6).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad7).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).MPSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad8).length() - 55)) + "\",\"color\":\"aqua\"}"));
		}
	}
}
