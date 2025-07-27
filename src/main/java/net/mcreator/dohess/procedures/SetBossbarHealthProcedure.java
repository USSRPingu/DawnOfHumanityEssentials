package net.mcreator.dohess.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetBossbarHealthProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		String bossbarnamestring = "";
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote() && _ent.world.getServer() != null)
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						("bossbar set minecraft:hp" + ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).PlayerUser).toLowerCase() + " value "
								+ (new java.text.DecimalFormat("##").format(entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1))));
		}
	}
}
