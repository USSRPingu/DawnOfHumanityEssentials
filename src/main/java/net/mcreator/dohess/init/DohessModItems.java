
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dohess.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Item;

import net.mcreator.dohess.procedures.SetKnifeModelProcedure;
import net.mcreator.dohess.item.UlivactoItem;
import net.mcreator.dohess.item.RenomorphisItem;
import net.mcreator.dohess.item.KnifeItem;
import net.mcreator.dohess.item.ItemKeyItem;
import net.mcreator.dohess.item.ItemHandcuffsItem;
import net.mcreator.dohess.item.HesterianItem;
import net.mcreator.dohess.item.CalostriophaItem;
import net.mcreator.dohess.item.BandagesItem;
import net.mcreator.dohess.DohessMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DohessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DohessMod.MODID);
	public static final RegistryObject<Item> BANDAGES = REGISTRY.register("bandages", () -> new BandagesItem());
	public static final RegistryObject<Item> HESTERIAN = REGISTRY.register("hesterian", () -> new HesterianItem());
	public static final RegistryObject<Item> RENOMORPHIS = REGISTRY.register("renomorphis", () -> new RenomorphisItem());
	public static final RegistryObject<Item> CALOSTRIOPHA = REGISTRY.register("calostriopha", () -> new CalostriophaItem());
	public static final RegistryObject<Item> ULIVACTO = REGISTRY.register("ulivacto", () -> new UlivactoItem());
	public static final RegistryObject<Item> ITEM_HANDCUFFS = REGISTRY.register("item_handcuffs", () -> new ItemHandcuffsItem());
	public static final RegistryObject<Item> ITEM_KEY = REGISTRY.register("item_key", () -> new ItemKeyItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemModelsProperties.registerProperty(KNIFE.get(), new ResourceLocation("dohess:knife_knife"), (itemStackToRender, clientWorld, entity) -> (float) SetKnifeModelProcedure.execute(itemStackToRender));
		});
	}
}
