package net.mcreator.dohess.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.Commands;

import net.mcreator.dohess.procedures.SetUserSquadProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class SquadCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("squad").requires(s -> s.hasPermissionLevel(2))
				.then(Commands.literal("sl").then(Commands.argument("username", EntityArgument.player()).then(Commands.argument("squad", StringArgumentType.string()).executes(arguments -> {
					World world = arguments.getSource().getWorld();
					double x = arguments.getSource().getPos().getX();
					double y = arguments.getSource().getPos().getY();
					double z = arguments.getSource().getPos().getZ();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerWorld)
						entity = FakePlayerFactory.getMinecraft((ServerWorld) world);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getHorizontalFacing();

					SetUserSquadProcedure.execute(world, arguments, entity);
					return 0;
				})))));
	}

}
