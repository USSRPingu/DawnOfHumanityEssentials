package net.mcreator.dohess.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetBossbarProcedure {
	public static void execute(CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "bossbarlogic") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager()
							.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("bossbar add hp"
									+ (((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()
									+ " {\"text\":\"" + ((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser + "\"}"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("bossbar set minecraft:hp"
							+ (((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " players @a"));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("bossbar set minecraft:hp"
									+ (((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " max "
									+ (new java.text.DecimalFormat("##").format((commandParameterEntity(arguments, "bossbarname")) instanceof LivingEntity ? ((LivingEntity) (commandParameterEntity(arguments, "bossbarname"))).getMaxHealth() : -1))));
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("bossbar set minecraft:hp"
									+ (((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " value "
									+ (new java.text.DecimalFormat("##").format((commandParameterEntity(arguments, "bossbarname")) instanceof LivingEntity ? ((LivingEntity) (commandParameterEntity(arguments, "bossbarname"))).getHealth() : -1))));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("bossbar remove minecraft:hp"
							+ (((commandParameterEntity(arguments, "bossbarname")).getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
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
