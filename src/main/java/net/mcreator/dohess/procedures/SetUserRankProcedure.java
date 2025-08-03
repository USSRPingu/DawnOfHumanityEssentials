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
		if ((StringArgumentType.getString(arguments, "rank")).equals(DohessModVariables.WorldVariables.get(world).Rank1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 55)))) {
			{
				String _setval = DohessModVariables.WorldVariables.get(world).Rank1;
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRank = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				String _setval = "a";
				(commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerRankP = _setval;
					capability.syncPlayerVariables((commandParameterEntity(arguments, "username")));
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
							+ DohessModVariables.WorldVariables.get(world).Rank1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).Rank1).length() - 55)) + " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
							+ ((commandParameterEntity(arguments, "username")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
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
