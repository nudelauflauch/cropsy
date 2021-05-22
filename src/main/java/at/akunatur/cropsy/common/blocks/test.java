package at.akunatur.cropsy.common.blocks;

import at.akunatur.cropsy.core.init.BlockInit;
import at.akunatur.cropsy.core.util.Cropfunktion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class test extends Cropfunktion {
	public static Block chooseBlock(Block block) {
		if (block == Blocks.WHEAT) {
			return random(60, 40, 0, Blocks.WHEAT, BlockInit.WHEAT_POPPY.get(), Blocks.AIR, true);
		} else {
			return Blocks.AIR;
		}
	}
}
