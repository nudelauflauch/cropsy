package at.akunatur.cropsy.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RandomPlacer {
	public static ForgeConfigSpec.IntValue chance;

	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder clien) {
		server.comment("Spawn Chance");
		
		chance = server
				.comment("Init asdasnd")
				.defineInRange("baum.cropsy", 2, 1, 100);
	}
}
