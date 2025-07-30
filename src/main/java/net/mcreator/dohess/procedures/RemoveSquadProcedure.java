package net.mcreator.dohess.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class RemoveSquadProcedure {
	public static void execute(CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			(commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerSquad = _setval;
				capability.syncPlayerVariables((commandParameterEntity(arguments, "squaduser")));
			});
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("team modify " + (((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " prefix "
								+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
								+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @s [\"\",{\"text\":\"Successfully set \",\"color\":\"green\"},{\"text\":\"" + ""
								+ "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},".substring(41,
										(int) (("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},").length() - 55))
								+ " \",\"color\":\"aqua\"},{\"text\":\"to \",\"color\":\"green\"},{\"text\":\""
								+ ((commandParameterEntity(arguments, "squaduser")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\",\"color\":\"yellow\"}]"));
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
