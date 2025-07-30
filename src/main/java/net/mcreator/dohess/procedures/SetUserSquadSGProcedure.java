package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetUserSquadSGProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad1).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad1;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad1).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad2).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad2;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad2).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad3).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad3;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad3).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad4).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad4;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad4).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad5).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad5;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad5).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad6).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SLSquad6;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad6).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad7).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad7;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad7).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setsquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad8).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).SGSquad8;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerSquad = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " prefix " + ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("team modify "
							+ (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " color red"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).SGSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad8).length() - 55))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "tellraw @s {\"text\":\"No Squads with that name\",\"color\":\"red\"}");
			}
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
