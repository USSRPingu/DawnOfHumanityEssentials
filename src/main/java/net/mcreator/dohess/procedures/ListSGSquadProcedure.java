package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

public class ListSGSquadProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @s {\"text\":\"" + "" + DohessModVariables.WorldVariables.get(world).SGSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad1).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad2).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad3).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad4).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad5).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad6).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad7).length() - 55)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).SGSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad8).length() - 55)) + "\",\"color\":\"aqua\"}"));
		}
	}
}
