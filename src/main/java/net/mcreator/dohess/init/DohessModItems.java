
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dohess.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.item.Item;

import net.mcreator.dohess.item.UlivactoItem;
import net.mcreator.dohess.item.RenomorphisItem;
import net.mcreator.dohess.item.KnifeItem;
import net.mcreator.dohess.item.ItemKeyItem;
import net.mcreator.dohess.item.ItemHandcuffsItem;
import net.mcreator.dohess.item.HesterianItem;
import net.mcreator.dohess.item.CalostriophaItem;
import net.mcreator.dohess.item.BandagesItem;
import net.mcreator.dohess.DohessMod;

public class DohessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DohessMod.MODID);
	public static final RegistryObject<Item> BANDAGES = REGISTRY.register("bandages", () -> new BandagesItem());
	public static final RegistryObject<Item> HESTERIAN = REGISTRY.register("hesterian", () -> new HesterianItem());
	public static final RegistryObject<Item> RENOMORPHIS = REGISTRY.register("renomorphis", () -> new RenomorphisItem());
	public static final RegistryObject<Item> CALOSTRIOPHA = REGISTRY.register("calostriopha", () -> new CalostriophaItem());
	public static final RegistryObject<Item> ULIVACTO = REGISTRY.register("ulivacto", () -> new UlivactoItem());
	public static final RegistryObject<Item> ITEM_HANDCUFFS = REGISTRY.register("item_handcuffs", () -> new ItemHandcuffsItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> ITEM_KEY = REGISTRY.register("item_key", () -> new ItemKeyItem());
	// Start of user code block custom items
	// End of user code block custom items
}
