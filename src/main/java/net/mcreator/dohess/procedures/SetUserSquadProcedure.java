package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetUserSquadProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad1).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad1;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "a";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad1).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad2).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad2;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "b";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad2).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad3).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad3;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "c";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad3).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad4).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad4;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "d";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad4).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad5).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad5;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "e";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad5).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad6).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad6;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "f";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad6).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad7).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad7;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "g";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad7).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
		if ((StringArgumentType.getString(arguments, "squad")).equals(DohessModVariables.WorldVariables.get(world).SLSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad8).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad8;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "h";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquadP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "blue";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerColour = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SLSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SLSquad8).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
			EditNameProcedure.execute(world, arguments, entity);
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSource> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}
