package net.mcreator.dohess.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.command.Commands;

@Mod.EventBusSubscriber
public class ExpirementalCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("expiremental").requires(s -> s.hasPermissionLevel(2))

		);
	}

}
