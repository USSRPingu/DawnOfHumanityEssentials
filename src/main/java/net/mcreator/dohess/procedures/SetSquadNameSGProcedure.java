package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetSquadNameSGProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((DohessModVariables.WorldVariables.get(world).SGSquad1).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad2).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad3).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad4).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad5).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad6).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad7).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else if ((DohessModVariables.WorldVariables.get(world).SGSquad8).equals("[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},")) {
			DohessModVariables.WorldVariables.get(world).SGSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "squadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "squadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been made\",\"color\":\"green\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("" + "tellraw @s {\"text\":\"You have reached the max ammount of squads for your regiment\",\"color\":\"red\"}"));
			}
		}
	}
}
