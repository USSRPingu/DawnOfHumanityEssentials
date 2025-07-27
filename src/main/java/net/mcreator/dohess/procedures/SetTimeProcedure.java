package net.mcreator.dohess.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetTimeProcedure {
	public static void execute(CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "time");
			entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DOHTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar add " + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " {\"text\":\"Timer\"}"));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " players @a"));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " max "
								+ new java.text.DecimalFormat("##").format(DoubleArgumentType.getDouble(arguments, "time"))));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " value "
								+ new java.text.DecimalFormat("##").format(DoubleArgumentType.getDouble(arguments, "time"))));
		}
	}
}
