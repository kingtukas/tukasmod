
package net.mcreator.lukasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.lukasmod.LukasModModElements;

@LukasModModElements.ModElement.Tag
public class SWORDItem extends LukasModModElements.ModElement {
	@ObjectHolder("lukas_mod:sword")
	public static final Item block = null;
	public SWORDItem(LukasModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 99;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 27f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("sword"));
	}
}
