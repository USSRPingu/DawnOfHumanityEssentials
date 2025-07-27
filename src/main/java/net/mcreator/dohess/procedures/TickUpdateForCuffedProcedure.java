package net.mcreator.dohess.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
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
			if (entity instanceof PlayerEntity) {
				PlayerEntity _player_ = (PlayerEntity) entity;
				if (!_player_.getHeldItemOffhand().isEmpty()) {
					_player_.dropItem(_player_.getHeldItemOffhand(), false, false);
					_player_.setHeldItem(Hand.OFF_HAND, ItemStack.EMPTY);
				}
			}
			if (entity instanceof PlayerEntity) {
				PlayerEntity _player_ = (PlayerEntity) entity;
				if (!_player_.getHeldItemMainhand().isEmpty()) {
					_player_.dropItem(_player_.getHeldItemMainhand(), false, false);
					_player_.setHeldItem(Hand.MAIN_HAND, ItemStack.EMPTY);
				}
			}
			ScaleTypes.REACH.getScaleData(entity).setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 0));
		} else if ((entity.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DohessModVariables.PlayerVariables())).handcuffed == false) {
			ScaleTypes.REACH.getScaleData(entity).setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.REACH.getScaleData(entity).getTargetScale(), 1));
		}
	}
}
