package net.mcreator.dohess.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;
import net.mcreator.dohess.DohessMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer().world, event.getPlayer());
	}

	public static void execute(IWorld world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, IWorld world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team leave @s");
		}
		DohessMod.queueServerWork(1, () -> {
			{
				String _setval = entity.getDisplayName().getString();
				entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerUser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			DohessMod.queueServerWork(1, () -> {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote() && _ent.world.getServer() != null)
						_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								("team add " + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
				}
				DohessMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote() && _ent.world.getServer() != null)
							_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									("team join " + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase()));
					}
					DohessMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote() && _ent.world.getServer() != null)
								_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
										("say team modify " + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " prefix "
												+ (entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerSquad
												+ (entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerRank));
						}
					});
				});
			});
		});
	}
}
