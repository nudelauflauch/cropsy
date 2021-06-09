package at.akunatur.cropsy.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RandomPlacer {
	public static ForgeConfigSpec.IntValue random_picker;
	public static ForgeConfigSpec.BooleanValue spawn;

	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder clien) {
		server.comment("Spawn Chance");

		random_picker = server.comment(
				"random_picker is the percent that not the selected block spawn but a carrot, a potato, wheat or a beetroot\nNormaly set to 2")
				.defineInRange("random_picker", 2, 0, 100);
		
		spawn = server.comment(
				"I that is false there is no chance that vegetables that are selected\nNormaly set to true")
				.define("random_picker", true);
	}
}