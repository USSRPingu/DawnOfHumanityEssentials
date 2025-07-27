
package net.mcreator.dohess.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

import net.mcreator.dohess.init.DohessModTabs;

public class UlivactoItem extends Item {
	public UlivactoItem() {
		super(new Item.Properties().group(DohessModTabs.TAB_DOH_ESSENTAILS).maxStackSize(64).rarity(Rarity.COMMON));
	}
}
