package net.mcreator.dohess.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class VisableNameProcedure {
	public static void execute(CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "setvisablename") == false) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + ((commandParameterEntity(arguments, "playername")) instanceof LivingEntity && ((LivingEntity) (commandParameterEntity(arguments, "playername"))).world.getScoreboard()
									.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "playername"))) instanceof PlayerEntity
											? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "playername")))).getGameProfile().getName()
											: ((LivingEntity) (commandParameterEntity(arguments, "playername"))).getCachedUniqueIdString()) != null
													? ((LivingEntity) (commandParameterEntity(arguments, "playername"))).world.getScoreboard()
															.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "playername"))) instanceof PlayerEntity
																	? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "playername")))).getGameProfile().getName()
																	: ((LivingEntity) (commandParameterEntity(arguments, "playername"))).getCachedUniqueIdString())
															.getName()
													: "")
									+ " nametagVisibility never"));
			}
			{
				boolean _setval = false;
				(commandParameterEntity(arguments, "playername")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.VisableName = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "playername")));
				});
			}
		} else if (BoolArgumentType.getBool(arguments, "setvisablename") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("team modify " + ((commandParameterEntity(arguments, "playername")) instanceof LivingEntity && ((LivingEntity) (commandParameterEntity(arguments, "playername"))).world.getScoreboard()
									.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "playername"))) instanceof PlayerEntity
											? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "playername")))).getGameProfile().getName()
											: ((LivingEntity) (commandParameterEntity(arguments, "playername"))).getCachedUniqueIdString()) != null
													? ((LivingEntity) (commandParameterEntity(arguments, "playername"))).world.getScoreboard()
															.getPlayersTeam(((LivingEntity) (commandParameterEntity(arguments, "playername"))) instanceof PlayerEntity
																	? ((PlayerEntity) ((LivingEntity) (commandParameterEntity(arguments, "playername")))).getGameProfile().getName()
																	: ((LivingEntity) (commandParameterEntity(arguments, "playername"))).getCachedUniqueIdString())
															.getName()
													: "")
									+ " nametagVisibility always"));
			}
			{
				boolean _setval = true;
				(commandParameterEntity(arguments, "playername")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.VisableName = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "playername")));
				});
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
