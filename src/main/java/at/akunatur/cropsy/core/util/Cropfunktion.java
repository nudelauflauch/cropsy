package at.akunatur.cropsy.core.util;

import java.util.Random;

import at.akunatur.cropsy.config.RandomPlacer;
import at.akunatur.cropsy.core.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class Cropfunktion {

	/*
	 * looks for three blocks and generate a random number which is a float and this
	 * number should be in % so everything between 0-100 ch1 is the chance to spawn
	 * this 3 numbers should be together 99 because there is a 1% chance that it is
	 * not working
	 * 
	 * if the last variable(vegetables) is true there is a 1% chance that there
	 * spawns something else for example a potatoes
	 */

	public static Block random(int ch1, int ch2, int ch3, Block bl1, Block bl2, Block bl3, boolean vegetables) {
		Random rand = new Random();
		int zahl = rand.nextInt(100+RandomPlacer.random_picker.get());

		if (zahl > 0 && zahl < (0 + ch1)) {
			return bl1;
		} else if (zahl > ch1 && zahl < ((0 + ch1) + ch2)) {
			return bl2;
		} else if (zahl > (0 + ch1 + ch2) && zahl < (0 + ch1 + ch2 + ch3)) {
			return bl3;
		} else if (zahl > 100 && vegetables) {
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

	/*
	 * looks which block calls this block if it is called by a wrong item it returns
	 * air(nothing) Returns a block
	 */

	public static Block chooseBlock(Block block) {
		if (block == Blocks.CARROTS) {
			return random(80, 20, 0, Blocks.CARROTS, BlockInit.CARROTS_1.get(), Blocks.AIR, true);
		} else if (block == Blocks.WHEAT) {
			return random(50, 30, 20, Blocks.WHEAT, BlockInit.WHEAT_POPPY.get(), BlockInit.WHEAT_POPPY_1.get(), true);
		} else if (block == Blocks.POTATOES) {
			return random(50, 50, 0, Blocks.POTATOES, BlockInit.POTATO_1.get(), Blocks.AIR, true);
		} else {
			return Blocks.AIR;
		}
	}

}
