package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

public class ListSLSquadProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @s {\"text\":\"1 - " + "" + DohessModVariables.WorldVariables.get(world).SLSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad1).length() - 55)) + "\\n2 - "
								+ DohessModVariables.WorldVariables.get(world).SLSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad2).length() - 55)) + "\\n3 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad3).length() - 55)) + "\\n4 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad4).length() - 55)) + "\\n5 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad5).length() - 55)) + "\\n6 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad6).length() - 55)) + "\\n7 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad7).length() - 55)) + "\\n8 -"
								+ DohessModVariables.WorldVariables.get(world).SLSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad8).length() - 55)) + "\",\"color\":\"aqua\"}"));
		}
	}
}
