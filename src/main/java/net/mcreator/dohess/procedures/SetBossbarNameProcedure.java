package net.mcreator.dohess.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetBossbarNameProcedure {
	public static void execute(CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:hp" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " name "
								+ ("{\"text\":\"" + "" + StringArgumentType.getString(arguments, "bossbarname") + "\",\"color\":\"#" + StringArgumentType.getString(arguments, "bossbarhex") + "\"}")));
		}
	}
}
