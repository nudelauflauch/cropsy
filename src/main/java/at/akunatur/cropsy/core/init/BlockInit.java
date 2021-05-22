package at.akunatur.cropsy.core.init;

import at.akunatur.cropsy.Cropsy;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cropsy.MOD_ID);

	
	public static final RegistryObject<Block> WHEAT_POPPY = BLOCKS.register("wheat_poppy",
			() -> new CropsBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
					.zeroHardnessAndResistance().sound(SoundType.CROP)));
	
	public static final RegistryObject<Block> WHEAT_POPPY_1 = BLOCKS.register("wheat_poppy_1",
			() -> new CropsBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
					.zeroHardnessAndResistance().sound(SoundType.CROP)));
	
	public static final RegistryObject<Block> CARROTS_1 = BLOCKS.register("carrots_1",
			() -> new CropsBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
					.zeroHardnessAndResistance().sound(SoundType.CROP)));
	
	public static final RegistryObject<Block> POTATO_1 = BLOCKS.register("potato_1",
			() -> new CropsBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
					.zeroHardnessAndResistance().sound(SoundType.CROP)));
}
