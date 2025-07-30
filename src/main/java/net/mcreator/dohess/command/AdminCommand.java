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
import net.mcreator.dohess.procedures.SetUserSquadSGProcedure;
import net.mcreator.dohess.procedures.SetUserSquadProcedure;
import net.mcreator.dohess.procedures.SetUserSquadMPProcedure;
import net.mcreator.dohess.procedures.SetUserRankProcedure;
import net.mcreator.dohess.procedures.SetSquadNameSGProcedure;
import net.mcreator.dohess.procedures.SetSquadNameProcedure;
import net.mcreator.dohess.procedures.SetSquadNameMPProcedure;
import net.mcreator.dohess.procedures.SetRankProcedure;
import net.mcreator.dohess.procedures.SetCustomSquadProcedure;
import net.mcreator.dohess.procedures.SetCustomRankProcedure;
import net.mcreator.dohess.procedures.SetCadetProcedure;
import net.mcreator.dohess.procedures.SetBossbarYellowProcedure;
import net.mcreator.dohess.procedures.SetBossbarWhiteProcedure;
import net.mcreator.dohess.procedures.SetBossbarRedProcedure;
import net.mcreator.dohess.procedures.SetBossbarPurpleProcedure;
import net.mcreator.dohess.procedures.SetBossbarProcedure;
import net.mcreator.dohess.procedures.SetBossbarPinkProcedure;
import net.mcreator.dohess.procedures.SetBossbarNameProcedure;
import net.mcreator.dohess.procedures.SetBossbarGreenProcedure;
import net.mcreator.dohess.procedures.SetBossbarBlueProcedure;
import net.mcreator.dohess.procedures.RemoveSquadProcedure;
import net.mcreator.dohess.procedures.RemoveRankProcedure;
import net.mcreator.dohess.procedures.RedProcedure;
import net.mcreator.dohess.procedures.PDOnProcedure;
import net.mcreator.dohess.procedures.PDOffProcedure;
import net.mcreator.dohess.procedures.ListSLSquadProcedure;
import net.mcreator.dohess.procedures.ListSGSquadProcedure;
import net.mcreator.dohess.procedures.ListRankProcedure;
import net.mcreator.dohess.procedures.ListMPSquadProcedure;
import net.mcreator.dohess.procedures.LightpurpleProcedure;
import net.mcreator.dohess.procedures.GreenProcedure;
import net.mcreator.dohess.procedures.GrayProcedure;
import net.mcreator.dohess.procedures.EditmpSquadProcedure;
import net.mcreator.dohess.procedures.EditSGSquadProcedure;
import net.mcreator.dohess.procedures.EditRankProcedure;
import net.mcreator.dohess.procedures.DeleteSLSquadProcedure;
import net.mcreator.dohess.procedures.DeleteSGSquadProcedure;
import net.mcreator.dohess.procedures.DeleteRankProcedure;
import net.mcreator.dohess.procedures.DeleteMPSquadProcedure;
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

									SetBossbarNameProcedure.execute(arguments, entity);
									return 0;
								}))))))))
				.then(Commands.literal("members").then(Commands.literal("colours").then(Commands.argument("colourname", EntityArgument.player()).then(Commands.literal("aqua").executes(arguments -> {
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

					AquaProcedure.execute(arguments, entity);
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

					BlackProcedure.execute(arguments, entity);
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

					BlueProcedure.execute(arguments, entity);
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

					DarkaqauProcedure.execute(arguments, entity);
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

					DarkBlueProcedure.execute(arguments, entity);
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

					DarkgreenProcedure.execute(arguments, entity);
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

					DarkPurpleProcedure.execute(arguments, entity);
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

					DarkRedProcedure.execute(arguments, entity);
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

					DarkgrayProcedure.execute(arguments, entity);
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

					ColourGoldProcedure.execute(arguments, entity);
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

					GrayProcedure.execute(arguments, entity);
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

					GreenProcedure.execute(arguments, entity);
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

					LightpurpleProcedure.execute(arguments, entity);
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

					RedProcedure.execute(arguments, entity);
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

					WhiteProcedure.execute(arguments, entity);
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
				})))).then(Commands.literal("bossbar").then(Commands.argument("bossbarname", EntityArgument.player()).then(Commands.literal("display").then(Commands.argument("bossbarlogic", BoolArgumentType.bool()).executes(arguments -> {
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
				}))).then(Commands.literal("colour").then(Commands.literal("blue").executes(arguments -> {
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

					SetBossbarBlueProcedure.execute(arguments, entity);
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

					SetBossbarGreenProcedure.execute(arguments, entity);
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

					SetBossbarRedProcedure.execute(arguments, entity);
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

					SetBossbarYellowProcedure.execute(arguments, entity);
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

					SetBossbarWhiteProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("purple").executes(arguments -> {
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

					SetBossbarPurpleProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("pink").executes(arguments -> {
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

					SetBossbarPinkProcedure.execute(arguments, entity);
					return 0;
				}))).then(Commands.literal("setname").then(Commands.argument("bossbarname", StringArgumentType.string()).then(Commands.argument("bossbarhex", StringArgumentType.string()).executes(arguments -> {
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

					SetBossbarNameProcedure.execute(arguments, entity);
					return 0;
				})))))).then(Commands.literal("rank").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.literal("addrank").then(Commands.argument("setrankname", StringArgumentType.string()).executes(arguments -> {
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
				}))).then(Commands.literal("cadet").executes(arguments -> {
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

					SetCadetProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("removerank").executes(arguments -> {
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

					RemoveRankProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("customrank").then(Commands.argument("rankname", StringArgumentType.string()).then(Commands.argument("rankhex", StringArgumentType.string()).executes(arguments -> {
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

					SetCustomRankProcedure.execute(arguments, entity);
					return 0;
				})))))).then(Commands.literal("squad").then(Commands.literal("customsquad")
						.then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("squadname", StringArgumentType.string()).then(Commands.argument("squadhex", StringArgumentType.string()).executes(arguments -> {
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

							SetCustomSquadProcedure.execute(arguments, entity);
							return 0;
						}))))).then(Commands.literal("removesquad").then(Commands.argument("squaduser", EntityArgument.player()).executes(arguments -> {
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

							RemoveSquadProcedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("militarypolice").then(Commands.argument("squaduser", EntityArgument.player()).then(Commands.argument("setsquadname", StringArgumentType.string()).executes(arguments -> {
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
