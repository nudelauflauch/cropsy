package at.akunatur.cropsy.config;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import at.akunatur.cropsy.Cropsy;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
	private static final Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;

	static {
		RandomPlacer.init(builder, builder);

		config = builder.build();
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		Cropsy.LOGGER.info("Loding config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		Cropsy.LOGGER.info("Built config: " + path);
		file.load();
		Cropsy.LOGGER.info("Loaded config:" + path);
		config.setConfig(file);
	}
}
