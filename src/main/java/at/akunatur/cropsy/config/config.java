package at.akunatur.cropsy.config;

import at.akunatur.cropsy.Cropsy;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class config {
	private static final Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;

	static {
		RandomPlacer.init(server builder, client builder);
		
		config = builder.build();
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		Cropsy.LOGGER.info("Loding config: " + path);
	}
}
