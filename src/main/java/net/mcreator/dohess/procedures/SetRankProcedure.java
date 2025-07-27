package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetRankProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((DohessModVariables.WorldVariables.get(world).Rank1).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank1 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank2).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank2 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank3).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank3 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank4).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank4 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank5).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank5 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank6).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank6 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank7).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank7 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank8).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank8 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank9).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank9 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank10).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank10 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank11).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank11 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank12).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank12 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank13).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank13 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank14).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank14 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank15).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank15 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).Rank16).equals("{\"text\":\"No Rank. \",\"color\":\"#424242\"}]")) {
			DohessModVariables.WorldVariables.get(world).Rank16 = "{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + ". \",\"color\":\"#" + StringArgumentType.getString(arguments, "rankhex") + "\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "rankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("" + "tellraw @s {\"text\":\"You have reached the max ammount of ranks\",\"color\":\"red\"}"));
			}
		}
	}
}
