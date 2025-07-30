package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.MessageArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;
import net.mcreator.dohess.DohessMod;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class SetTimeProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((DohessModVariables.WorldVariables.get(world).TimerName1).equals("{\"text\":\"No Time\",\"color\":\"#424242\"}")) {
			DohessModVariables.WorldVariables.get(world).TimerName1 = "{\"text\":\"" + "" + commandParameterMessage(arguments, "timename") + "\",\"color\":\"#" + commandParameterMessage(arguments, "timehex") + "\"}";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			DohessMod.queueServerWork(1, () -> {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("bossbar add tm" + DohessModVariables.WorldVariables.get(world).TimerName1.substring(9, 22)
								+ " {\"text\":\"" + commandParameterMessage(arguments, "timename") + "\",\"color\":\"#" + commandParameterMessage(arguments, "timehex") + "\"}"));
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("say bossbar add tm" + DohessModVariables.WorldVariables.get(world).TimerName1.substring(9, 22)
								+ " {\"text\":\"" + commandParameterMessage(arguments, "timename") + "\",\"color\":\"#" + commandParameterMessage(arguments, "timehex") + "\"}"));
				}
			});
		}
	}

	private static String commandParameterMessage(CommandContext<CommandSource> arguments, String parameter) {
		try {
			return MessageArgument.getMessage(arguments, parameter).getString();
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return "";
		}
	}
}
