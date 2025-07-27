package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class DeleteSGSquadProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad1).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad2).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad3).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad4).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad5).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad6).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad7).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "deletesquadname")).equals(DohessModVariables.WorldVariables.get(world).SGSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).SGSquad8).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).SGSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), ("tellraw @a [\"\",{\"text\":\"Squad \",\"color\":\"green\"},{\"text\":\"" + ""
							+ StringArgumentType.getString(arguments, "deletesquadname") + " \",\"color\":\"aqua\"},{\"text\":\"has been deleted\",\"color\":\"green\"}]"));
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "tellraw @s {\"text\":\"No Squads with that name\",\"color\":\"red\"}");
			}
		}
	}
}
