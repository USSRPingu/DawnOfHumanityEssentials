package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;
import net.mcreator.dohess.DohessMod;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class EditNameProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("team remove " + ((commandParameterEntity(arguments, "username")) instanceof LivingEntity && ((LivingEntity) (commandParameterEntity(arguments, "username"))).world.getScoreboard()
								.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "username"))) instanceof PlayerEntity
										? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "username")))).getGameProfile().getName()
										: ((LivingEntity) (commandParameterEntity(arguments, "username"))).getCachedUniqueIdString()) != null
												? ((LivingEntity) (commandParameterEntity(arguments, "username"))).world.getScoreboard()
														.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "username"))) instanceof PlayerEntity
																? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "username")))).getGameProfile().getName()
																: ((LivingEntity) (commandParameterEntity(arguments, "username"))).getCachedUniqueIdString())
														.getName()
												: "")));
		}
		DohessMod.queueServerWork(1, () -> {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team add " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquadP
									+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRankP
									+ (((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
			}
			DohessMod.queueServerWork(1, () -> {
				{
					Entity _ent = (commandParameterEntity(arguments, "username"));
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("team join " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquadP
										+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRankP
										+ (((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
				}
				DohessMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote() && _ent.world.getServer() != null)
							_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									("team modify " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquadP
											+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRankP
											+ (((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
											+ " prefix " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
											+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
					}
					DohessMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote() && _ent.world.getServer() != null)
								_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
										("team modify " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquadP
												+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRankP
												+ (((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
												+ " color " + ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerColour));
						}
					});
				});
			});
		});
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
