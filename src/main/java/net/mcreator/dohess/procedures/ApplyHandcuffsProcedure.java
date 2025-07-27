package net.mcreator.dohess.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.dohess.network.DohessModVariables;
import net.mcreator.dohess.init.DohessModItems;

import java.util.stream.Collectors;
import java.util.Comparator;

public class ApplyHandcuffsProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DohessModItems.ITEM_HANDCUFFS.get()) {
			if (entity.isSneaking()) {
				{
					final Vector3d _center = new Vector3d(
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).scale(2)), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
									.getX()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).scale(2)), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
									.getY()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getLook(1f).scale(2)), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
									.getZ()));
					for (Entity entityiterator : world.getLoadedEntitiesWithinAABB(Entity.class, new AxisAlignedBB(_center, _center).grow(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.getDistanceSq(_center)))
							.collect(Collectors.toList())) {
						if (entityiterator instanceof CowEntity) {
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
								_setstack.setCount(1);
								((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).inventory.markDirty();
							}
							{
								boolean _setval = true;
								entityiterator.getCapability(DohessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.handcuffed = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						}
					}
				}
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote() && _ent.world.getServer() != null)
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"tellraw @s [\"\",{\"text\":\"These can \",\"color\":\"#EB0004\"},{\"text\":\"ONLY\",\"underlined\":true,\"color\":\"#EB0004\"},{\"text\":\" be used in your main hand\",\"color\":\"#EB0004\"}]");
			}
		}
	}
}
