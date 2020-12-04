
package net.mcreator.lukasmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.lukasmod.LukasModModElements;

import java.util.List;
import java.util.Collections;

@LukasModModElements.ModElement.Tag
public class CookieblockBlock extends LukasModModElements.ModElement {
	@ObjectHolder("lukas_mod:cookieblock")
	public static final Block block = null;
	public CookieblockBlock(LukasModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.field_226947_m_).hardnessAndResistance(11.25f, 113.5f).lightValue(1)
					.harvestLevel(1).harvestTool(ToolType.AXE).doesNotBlockMovement().slipperiness(2.3000000000000003f));
			setRegistryName("cookieblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Items.COOKIE, (int) (5)));
		}
	}
}
