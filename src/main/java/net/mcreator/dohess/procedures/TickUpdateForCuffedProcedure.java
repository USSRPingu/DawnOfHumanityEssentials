package net.mcreator.dohess.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dohess.network.DohessModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TickUpdateForCuffedProcedure {
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
		if ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).handcuffed == true) {
			if (!(entity instanceof LivingEntity && ((LivingEntity) entity).isPotionActive(Effects.SLOWNESS))) {
				if ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).AbleWalk == false) {
					if (entity instanceof LivingEntity && !((LivingEntity) entity).world.isRemote())
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 1000000, 255, false, true));
				}
			}
			if (!(entity instanceof LivingEntity && ((LivingEntity) entity).isPotionActive(Effects.WEAKNESS))) {
				if (entity instanceof LivingEntity && !((LivingEntity) entity).world.isRemote())
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, 1000000, 255, false, true));
			}
		}
	}
}
