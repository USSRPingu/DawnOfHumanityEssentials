package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandSource;

import net.mcreator.dohess.network.DohessModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EditmpSquadProcedure {
	public static void execute(IWorld world, CommandContext<CommandSource> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad1.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad1).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad2.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad2).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad3.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad3).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad4.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad4).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad5.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad5).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad6.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad6).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad7.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad7).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
			}
		} else if ((StringArgumentType.getString(arguments, "currentsquadname")).equals(DohessModVariables.WorldVariables.get(world).MPSquad8.substring(41, (int) ((DohessModVariables.WorldVariables.get(world).MPSquad8).length() - 55)))) {
			DohessModVariables.WorldVariables.get(world).MPSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"#"
					+ StringArgumentType.getString(arguments, "newsquadhex") + "\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
			DohessModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("tellraw @s [\"\",{\"text\":\"New Squad has been changed from \",\"color\":\"green\"},{\"text\":\"" + "" + StringArgumentType.getString(arguments, "currentsquadname")
									+ "\",\"color\":\"aqua\"},{\"text\":\" to \",\"color\":\"green\"},{\"text\":\"" + StringArgumentType.getString(arguments, "newsquadname") + "\",\"color\":\"aqua\"}]"));
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
