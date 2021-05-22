package at.akunatur.cropsy.core.init;

import at.akunatur.cropsy.Cropsy;
import at.akunatur.cropsy.core.util.CropItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cropsy.MOD_ID);
	public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			"minecraft");

	public static final RegistryObject<CropItem> WEET = ITEMS.register("weet",
			() -> new CropItem(BlockInit.WHEAT_POPPY.get(), new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<CropItem> WHEAT_SEEDS = VANILLA_ITEMS.register("wheat_seeds",
			() -> new CropItem(Blocks.WHEAT, new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<CropItem> CARROT = VANILLA_ITEMS.register("carrot",
			() -> new CropItem(Blocks.CARROTS, new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<CropItem> POTATO = VANILLA_ITEMS.register("potato",
			() -> new CropItem(Blocks.POTATOES, new Item.Properties().group(ItemGroup.MISC)));
}
