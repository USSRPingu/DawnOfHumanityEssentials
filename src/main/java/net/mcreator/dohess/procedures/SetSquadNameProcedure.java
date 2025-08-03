package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetSquadNameProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "priority")).equals("1")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad1).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("2")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad2).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("3")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad3).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("4")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad4).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("5")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad5).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("6")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad6).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("7")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad7).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
		if ((StringArgumentType.getString(arguments, "priority")).equals("8")) {
			if ((DohessModVariables.WorldVariables.get(world).SLSquad8).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
				DohessModVariables.WorldVariables.get(world).SLSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
						+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
				DohessModVariables.WorldVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("" + "/tellraw @s {\"text\":\"You have reached your max squads\\n\\nor\\n\\nYou put a number thats not 1- 16\",\"color\":\"red\"}"));
				}
			}
		}
	}
}
