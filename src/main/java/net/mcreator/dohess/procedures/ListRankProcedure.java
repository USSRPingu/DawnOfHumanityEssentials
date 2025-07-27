package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

public class ListRankProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @s {\"text\":\"" + "" + DohessModVariables.WorldVariables.get(world).Rank1.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank2.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank2).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank3.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank3).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank4.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank4).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank5.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank5).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank6.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank6).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank7.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank7).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank8.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank8).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank9.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank9).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank10.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank10).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank11.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank11).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank12.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank12).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank13.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank13).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank14.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank14).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank15.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank15).length() - 23)) + "\\n"
								+ DohessModVariables.WorldVariables.get(world).Rank16.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank16).length() - 23)) + "\",\"color\":\"aqua\"}"));
		}
	}
}
