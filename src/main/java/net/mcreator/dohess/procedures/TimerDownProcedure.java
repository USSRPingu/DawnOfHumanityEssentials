package net.mcreator.dohess.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimerDownProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).DOHTimer - 0.05;
			entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DOHTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " value "
								+ new java.text.DecimalFormat("##").format((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).DOHTimer)));
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " name {\"text\":\"Timer: "
								+ new java.text.DecimalFormat("##").format((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).DOHTimer) + "\"}"));
		}
		if ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).DOHTimer < 0) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("bossbar remove minecraft:" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
			}
		}
	}
}
