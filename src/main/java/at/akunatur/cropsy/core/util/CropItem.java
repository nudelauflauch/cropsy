package at.akunatur.cropsy.core.util;

import java.util.Random;

import javax.annotation.Nullable;

import at.akunatur.cropsy.config.RandomPlacer;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

public class CropItem extends BlockItem {

	@Deprecated
	private final Block block1;
	@Deprecated
	private final Block block2;
	@Deprecated
	private final Block block3;
	@Deprecated
	private final Block block4;
	private final int cha1;
	private final int cha2;
	private final int cha3;
	private final int cha4;

	public CropItem(Block blockIn1, Block blockIn2, Block blockIn3, Block blockIn4, int ch1, int ch2, int ch3, int ch4,
			Item.Properties builder) {
		super(blockIn1, builder);
		this.block1 = blockIn1;
		this.block2 = blockIn2;
		this.block3 = blockIn3;
		this.block4 = blockIn4;
		this.cha1 = ch1;
		this.cha2 = ch2;
		this.cha3 = ch3;
		this.cha4 = ch4;
	}

	/**
	 * Called when this item is used when targetting a Block
	 */

	public Block getBlock() {
		return this.getBlockRaw() == null ? null : this.getBlockRaw().delegate.get();
	}

	private Block getBlockRaw() {
		return random(block1, block2, block3, block4, cha1, cha2, cha3, cha4);
	}

	public static Block random(Block bl1, Block bl2, Block bl3, Block bl4, int ch1, int ch2, int ch3, int ch4) {
		Random rand = new Random();
		int zahl = rand.nextInt(100 + RandomPlacer.random_picker.get());

		if (zahl > 0 && zahl < (0 + ch1)) {
			return bl1;
		} else if (zahl > ch1 && zahl < ((0 + ch1) + ch2)) {
			return bl2;
		} else if (zahl > (0 + ch1 + ch2) && zahl < (0 + ch1 + ch2 + ch3)) {
			return bl3;
		} else if (zahl > 100) {
			int zahl1 = rand.nextInt(100);
			if (zahl1 > -1 && zahl1 < 26) {
				return Blocks.WHEAT;
			} else if (zahl1 > 24 && zahl1 < 51) {
				return Blocks.CARROTS;
			} else if (zahl1 > 39 && zahl1 < 71) {
				return Blocks.BEETROOTS;
			} else {
				return Blocks.POTATOES;
			}

		} else {
			return Blocks.AIR;
		}
	}
}
