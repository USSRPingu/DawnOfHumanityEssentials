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

import net.mcreator.dohess.procedures.YellowProcedure;
import net.mcreator.dohess.procedures.WhiteProcedure;
import net.mcreator.dohess.procedures.VisableNameProcedure;
import net.mcreator.dohess.procedures.SetSquadNameProcedure;
import net.mcreator.dohess.procedures.SetRankProcedure;
import net.mcreator.dohess.procedures.RedProcedure;
import net.mcreator.dohess.procedures.ListSLSquadProcedure;
import net.mcreator.dohess.procedures.ListRankProcedure;
import net.mcreator.dohess.procedures.LightpurpleProcedure;
import net.mcreator.dohess.procedures.GreenProcedure;
import net.mcreator.dohess.procedures.GrayProcedure;
import net.mcreator.dohess.procedures.DeleteSLSquadProcedure;
import net.mcreator.dohess.procedures.DeleteRankProcedure;
import net.mcreator.dohess.procedures.DarkgreenProcedure;
import net.mcreator.dohess.procedures.DarkgrayProcedure;
import net.mcreator.dohess.procedures.DarkaqauProcedure;
import net.mcreator.dohess.procedures.DarkRedProcedure;
import net.mcreator.dohess.procedures.DarkPurpleProcedure;
import net.mcreator.dohess.procedures.DarkBlueProcedure;
import net.mcreator.dohess.procedures.ColourGoldProcedure;
import net.mcreator.dohess.procedures.BlueProcedure;
import net.mcreator.dohess.procedures.BlackProcedure;
import net.mcreator.dohess.procedures.AquaProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class ManageCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("manage").requires(s -> s.hasPermissionLevel(2)).then(Commands.literal("rank").then(Commands.literal("list").executes(arguments -> {
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

			ListRankProcedure.execute(world, entity);
			return 0;
		})).then(
				Commands.literal("add").then(Commands.argument("rankname", StringArgumentType.string()).then(Commands.argument("rankhex", StringArgumentType.word()).then(Commands.argument("priority", StringArgumentType.word()).executes(arguments -> {
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

					SetRankProcedure.execute(world, arguments, entity);
					return 0;
				}))))).then(Commands.literal("delete").then(Commands.argument("deleterankname", StringArgumentType.string()).executes(arguments -> {
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

					DeleteRankProcedure.execute(world, arguments, entity);
					return 0;
				})))).then(Commands.literal("squad").then(Commands.literal("sl").then(Commands.literal("list").executes(arguments -> {
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

					ListSLSquadProcedure.execute(world, entity);
					return 0;
				})).then(Commands.literal("add")
						.then(Commands.argument("squadname", StringArgumentType.string()).then(Commands.argument("squadhex", StringArgumentType.word()).then(Commands.argument("priority", StringArgumentType.word()).executes(arguments -> {
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

							SetSquadNameProcedure.execute(world, arguments, entity);
							return 0;
						}))))).then(Commands.literal("delete").then(Commands.argument("deletesquadname", StringArgumentType.string()).executes(arguments -> {
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

							DeleteSLSquadProcedure.execute(world, arguments, entity);
							return 0;
						})))))
				.then(Commands.literal("colouredname").then(Commands.argument("username", EntityArgument.player()).then(Commands.literal("aqua").executes(arguments -> {
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

					AquaProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("black").executes(arguments -> {
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

					BlackProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("blue").executes(arguments -> {
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

					BlueProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_aqua").executes(arguments -> {
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

					DarkaqauProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_blue").executes(arguments -> {
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

					DarkBlueProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_green").executes(arguments -> {
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

					DarkgreenProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_purple").executes(arguments -> {
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

					DarkPurpleProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_red").executes(arguments -> {
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

					DarkRedProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("dark_gray").executes(arguments -> {
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

					DarkgrayProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("gold").executes(arguments -> {
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

					ColourGoldProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("gray").executes(arguments -> {
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

					GrayProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("green").executes(arguments -> {
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

					GreenProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("light_purple").executes(arguments -> {
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

					LightpurpleProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("red").executes(arguments -> {
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

					RedProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("white").executes(arguments -> {
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

					WhiteProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("yellow").executes(arguments -> {
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

					YellowProcedure.execute(arguments, entity);
					return 0;
				})))).then(Commands.literal("visablename").then(Commands.argument("playername", EntityArgument.player()).then(Commands.argument("setvisablename", BoolArgumentType.bool()).executes(arguments -> {
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

					VisableNameProcedure.execute(arguments, entity);
					return 0;
				})))));
	}

}
