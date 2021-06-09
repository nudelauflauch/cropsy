package at.akunatur.cropsy.core.init;

import java.util.Random;

import at.akunatur.cropsy.Cropsy;
import at.akunatur.cropsy.core.util.CropItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cropsy.MOD_ID);
	public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			"minecraft");

	public static void liste(Block[] arg) {
		Block[] wheat_seeds = new Block[3];
		wheat_seeds[0] = BlockInit.WHEAT_POPPY_1.get();
		wheat_seeds[1] = BlockInit.WHEAT_POPPY.get();
		wheat_seeds[2] = Blocks.WHEAT;
	}
	
	Random block = new Random();
	
	public static final RegistryObject<BlockItem> WEET = ITEMS.register("weet",
			() -> new BlockItem(BlockInit.WHEAT_POPPY.get(), new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<CropItem> WHEAT_SEEDS = VANILLA_ITEMS.register("wheat_seeds",
			() -> new CropItem(Blocks.CARROTS, BlockInit.CARROTS_1.get(), Blocks.AIR, Blocks.AIR, 50, 50, 0, 0,
					new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<CropItem> CARROT = VANILLA_ITEMS.register("carrot",
			() -> new CropItem(Blocks.CARROTS, Blocks.AIR, Blocks.AIR, Blocks.AIR, 100, 0, 0, 0,
					new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<CropItem> POTATO = VANILLA_ITEMS.register("potato",
			() -> new CropItem(Blocks.POTATOES, Blocks.AIR, Blocks.AIR, Blocks.AIR, 100, 0, 0, 0,
					new Item.Properties().group(ItemGroup.MISC)));
}
