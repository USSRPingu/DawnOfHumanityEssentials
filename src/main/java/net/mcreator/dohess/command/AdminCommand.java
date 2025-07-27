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

import net.mcreator.dohess.procedures.SetUserSquadSGProcedure;
import net.mcreator.dohess.procedures.SetUserSquadProcedure;
import net.mcreator.dohess.procedures.SetUserSquadMPProcedure;
import net.mcreator.dohess.procedures.SetUserRankProcedure;
import net.mcreator.dohess.procedures.SetTimeProcedure;
import net.mcreator.dohess.procedures.SetSquadNameSGProcedure;
import net.mcreator.dohess.procedures.SetSquadNameProcedure;
import net.mcreator.dohess.procedures.SetSquadNameMPProcedure;
import net.mcreator.dohess.procedures.SetRankProcedure;
import net.mcreator.dohess.procedures.SetBossbarProcedure;
import net.mcreator.dohess.procedures.PDOnProcedure;
import net.mcreator.dohess.procedures.PDOffProcedure;
import net.mcreator.dohess.procedures.ListSLSquadProcedure;
import net.mcreator.dohess.procedures.ListSGSquadProcedure;
import net.mcreator.dohess.procedures.ListRankProcedure;
import net.mcreator.dohess.procedures.ListMPSquadProcedure;
import net.mcreator.dohess.procedures.EditmpSquadProcedure;
import net.mcreator.dohess.procedures.EditSLSquadProcedure;
import net.mcreator.dohess.procedures.EditSGSquadProcedure;
import net.mcreator.dohess.procedures.EditRankProcedure;
import net.mcreator.dohess.procedures.DeleteSLSquadProcedure;
import net.mcreator.dohess.procedures.DeleteSGSquadProcedure;
import net.mcreator.dohess.procedures.DeleteRankProcedure;
import net.mcreator.dohess.procedures.DeleteMPSquadProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class AdminCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("admin").requires(s -> s.hasPermissionLevel(2)).then(Commands.literal("pd").then(Commands.literal("enabled").executes(arguments -> {
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

			PDOnProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("disabled").executes(arguments -> {
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

			PDOffProcedure.execute(world, entity);
			return 0;
		}))).then(Commands.literal("timer").then(Commands.argument("time", DoubleArgumentType.doubleArg()).executes(arguments -> {
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

			SetTimeProcedure.execute(arguments, entity);
			return 0;
		}))).then(Commands.literal("manage").then(Commands.literal("rank").then(Commands.literal("list").executes(arguments -> {
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
		})).then(Commands.literal("add").then(Commands.argument("rankname", StringArgumentType.string()).then(Commands.argument("rankhex", StringArgumentType.word()).executes(arguments -> {
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
		})))).then(Commands.literal("delete").then(Commands.argument("deleterankname", StringArgumentType.string()).executes(arguments -> {
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
		}))).then(Commands.literal("edit")
				.then(Commands.argument("currentrankname", StringArgumentType.string()).then(Commands.argument("newrankname", StringArgumentType.string()).then(Commands.argument("newrankhex", StringArgumentType.word()).executes(arguments -> {
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

					EditRankProcedure.execute(world, arguments, entity);
					return 0;
				})))))).then(Commands.literal("squads").then(Commands.literal("militarypolice").then(Commands.literal("list").executes(arguments -> {
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

					ListMPSquadProcedure.execute(world, entity);
					return 0;
				})).then(Commands.literal("add").then(Commands.argument("squadname", StringArgumentType.string()).then(Commands.argument("squadhex", StringArgumentType.word()).executes(arguments -> {
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

					SetSquadNameMPProcedure.execute(world, arguments, entity);
					return 0;
				})))).then(Commands.literal("delete").then(Commands.argument("deletesquadname", StringArgumentType.string()).executes(arguments -> {
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

					DeleteMPSquadProcedure.execute(world, arguments, entity);
					return 0;
				}))).then(Commands.literal("edit").then(
						Commands.argument("currentsquadname", StringArgumentType.string()).then(Commands.argument("newsquadname", StringArgumentType.string()).then(Commands.argument("newsquadhex", StringArgumentType.word()).executes(arguments -> {
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

							EditmpSquadProcedure.execute(world, arguments, entity);
							return 0;
						})))))).then(Commands.literal("garrison").then(Commands.literal("list").executes(arguments -> {
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

							ListSGSquadProcedure.execute(world, entity);
							return 0;
						})).then(Commands.literal("add").then(Commands.argument("squadname", StringArgumentType.string()).then(Commands.argument("squadhex", StringArgumentType.word()).executes(arguments -> {
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

							SetSquadNameSGProcedure.execute(world, arguments, entity);
							return 0;
						})))).then(Commands.literal("delete").then(Commands.argument("deletesquadname", StringArgumentType.string()).executes(arguments -> {
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

							DeleteSGSquadProcedure.execute(world, arguments, entity);
							return 0;
						}))).then(Commands.literal("edit").then(Commands.argument("currentsquadname", StringArgumentType.string())
								.then(Commands.argument("newsquadname", StringArgumentType.string()).then(Commands.argument("newsquadhex", StringArgumentType.word()).executes(arguments -> {
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

									EditSGSquadProcedure.execute(world, arguments, entity);
									return 0;
								}))))))
						.then(Commands.literal("scouts").then(Commands.literal("list").executes(arguments -> {
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
						})).then(Commands.literal("add").then(Commands.argument("squadname", StringArgumentType.string()).then(Commands.argument("squadhex", StringArgumentType.word()).executes(arguments -> {
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
						})))).then(Commands.literal("delete").then(Commands.argument("deletesquadname", StringArgumentType.string()).executes(arguments -> {
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
						}))).then(Commands.literal("edit").then(Commands.argument("currentsquadname", StringArgumentType.string())
								.then(Commands.argument("newsquadname", StringArgumentType.string()).then(Commands.argument("newsquadhex", StringArgumentType.word()).executes(arguments -> {
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

									EditSLSquadProcedure.execute(world, arguments, entity);
									return 0;
								}))))))))
				.then(Commands.literal("members").then(Commands.literal("bossbar").then(Commands.argument("bossbarname", EntityArgument.player()).then(Commands.argument("bossbarlogic", BoolArgumentType.bool()).executes(arguments -> {
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

					SetBossbarProcedure.execute(arguments, entity);
					return 0;
				})))).then(Commands.literal("rank").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("setrankname", StringArgumentType.string()).executes(arguments -> {
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

					SetUserRankProcedure.execute(world, arguments, entity);
					return 0;
				})))).then(Commands.literal("squad").then(Commands.literal("militarypolice").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("setsquadname", StringArgumentType.string()).executes(arguments -> {
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

					SetUserSquadMPProcedure.execute(world, arguments, entity);
					return 0;
				})))).then(Commands.literal("scouts").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("setsquadname", StringArgumentType.string()).executes(arguments -> {
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
				})))).then(Commands.literal("garrison").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("setsquadname", StringArgumentType.string()).executes(arguments -> {
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

					SetUserSquadSGProcedure.execute(world, arguments, entity);
					return 0;
				})))))));
	}

}
