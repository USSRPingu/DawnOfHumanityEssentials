package net.mcreator.dohess.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

public class PDOffProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("discordsrv broadcast PD Is Disabled By:" + (entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("tellraw @a [\"\",{\"text\":\"Permadeath\",\"underlined\":true,\"color\":\"dark_red\"},{\"text\":\"\\n\"},{\"text\":\"PD: \",\"color\":\"gold\"},{\"text\":\"Disabled\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"By: \",\"color\":\"gold\"},{\"text\":\""
								+ "" + (entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser
								+ "\",\"color\":\"aqua\"},{\"text\":\"\\n\"},{\"text\":\"The following changes are enabled\",\"underlined\":true},{\"text\":\"\\n\"},{\"text\":\"Respawning: \",\"color\":\"gold\"},{\"text\":\"True\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"Keep Inventory:\",\"color\":\"gold\"},{\"text\":\" True\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"Death messages: \",\"color\":\"gold\"},{\"text\":\"True\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"Discord - Minecraft chat: \",\"color\":\"gold\"},{\"text\":\"True\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"Public Chat: \",\"color\":\"gold\"},{\"text\":\"True\",\"color\":\"green\"}]"));
		}
		if (world instanceof World)
			((World) world).getGameRules().get(GameRules.DO_IMMEDIATE_RESPAWN).set(false, ((World) world).getServer());
		if (world instanceof World)
			((World) world).getGameRules().get(GameRules.SHOW_DEATH_MESSAGES).set(true, ((World) world).getServer());
		if (world instanceof World)
			((World) world).getGameRules().get(GameRules.KEEP_INVENTORY).set(true, ((World) world).getServer());
		DohessModVariables.WorldVariables.get(world).PD = 0;
		DohessModVariables.WorldVariables.get(world).syncData(world);
	}
}
