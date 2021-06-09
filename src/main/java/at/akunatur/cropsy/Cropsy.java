package at.akunatur.cropsy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import at.akunatur.cropsy.config.Config;
import at.akunatur.cropsy.core.init.BlockInit;
import at.akunatur.cropsy.core.init.ItemInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(Cropsy.MOD_ID)
public class Cropsy {
	public static final String MOD_ID = "cropsy";
	public static final Logger LOGGER = LogManager.getLogger();
	IEventBus forgeBus = MinecraftForge.EVENT_BUS;

	public Cropsy() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.config);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("cropsy-common.toml").toString());
		
		ItemInit.ITEMS.register(bus);
		ItemInit.VANILLA_ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.CARROTS_1.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WHEAT_POPPY.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WHEAT_POPPY_1.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POTATO_1.get(), RenderType.getCutout());

	}

}
