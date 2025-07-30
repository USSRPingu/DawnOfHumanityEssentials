package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetUserRankProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank1.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank1;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank1.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank2.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank2).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank2;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank2.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank2).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank3.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank3).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank3;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank3.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank3).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank4.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank4).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank4;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank4.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank4).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank5.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank5).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank5;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank5.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank5).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank6.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank6).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank6;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank6.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank6).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank7.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank7).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank7;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank7.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank7).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank8.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank8).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank8;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank8.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank8).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank9.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank9).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank9;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank9.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank9).length() - 23)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank10.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank10).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank10;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank10.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank10).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank11.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank11).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank11;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank11.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank11).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank12.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank12).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank12;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank12.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank12).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank13.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank13).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank13;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank13.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank13).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank14.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank14).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank14;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank14.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank14).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank15.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank15).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank15;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank15.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank15).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "setrankname")).equals(DohessModVariables.WorldVariables.get(world).Rank16.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank16).length() - 23)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank16;
				(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
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
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
									+ DohessModVariables.WorldVariables.get(world).Rank16.substring(9, (int) ((DohessModVariables.WorldVariables.get(world).Rank16).length() - 23))
									+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
									+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "tellraw @s {\"text\":\"No Rank with that name\",\"color\":\"red\"}");
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
