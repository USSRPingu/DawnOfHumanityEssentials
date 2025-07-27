package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class DeleteRankProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank1.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank1 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank2.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank2).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank2 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank3.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank3).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank3 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank4.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank4).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank4 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank5.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank5).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank5 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank6.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank6).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank6 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank7.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank7).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank7 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank7.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank7).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank8 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank9.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank9).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank9 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank10.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank10).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank10 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank11.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank11).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank11 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank12.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank12).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank12 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank13.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank13).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank13 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank14.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank14).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank14 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank15.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank15).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank15 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deleterankname")).equals(DohessModVariables.WorldVariables.get(world).Rank16.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank16).length() - 23)))) {
			DohessModVariables.WorldVariables.get(world).Rank16 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Rank \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "deleterankname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "tellraw @s {\"text\":\"No Rank with that name\",\"color\":\"red\"}");
			}
		}
	}
}
