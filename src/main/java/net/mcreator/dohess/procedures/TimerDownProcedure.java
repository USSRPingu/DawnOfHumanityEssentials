package net.mcreator.dohess.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimerDownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.world, event.player);
		}
	}

	public static void execute(IWorld world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, IWorld world, Entity entity) {
		if (entity == null)
			return;
		DohessModVariables.WorldVariables.get(world).Timer1 = DohessModVariables.WorldVariables.get(world).Timer1 - 0.05;
		DohessModVariables.WorldVariables.get(world).syncData(world);
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set tm" + DohessModVariables.WorldVariables.get(world).TimerName1.substring(9, 22) + " value " + DohessModVariables.WorldVariables.get(world).Timer1));
		}
	}
}
