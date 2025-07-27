
package net.mcreator.dohess.item;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dohess.init.DohessModTabs;

public class KnifeItem extends SwordItem {
	public KnifeItem() {
		super(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks();
			}
		}, 3, -1f, new Item.Properties().group(DohessModTabs.TAB_DOH_ESSENTAILS));
	}
}
