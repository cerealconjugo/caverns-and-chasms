package com.teamabnormals.caverns_and_chasms.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class CCBiomeTags {
	public static final TagKey<Biome> HAS_SPINEL_ORE = biomeTag("has_feature/spinel_ore");
	public static final TagKey<Biome> HAS_SILVER_ORE = biomeTag("has_feature/silver_ore");
	public static final TagKey<Biome> HAS_EXTRA_SILVER_ORE = biomeTag("has_feature/extra_silver_ore");
	public static final TagKey<Biome> HAS_SOUL_SILVER_ORE = biomeTag("has_feature/soul_silver_ore");

	public static final TagKey<Biome> HAS_MIME = biomeTag("has_monster/mime");

	public static final TagKey<Biome> WITHOUT_CAVEFISH_SPAWNS = biomeTag("without_cavefish_spawns");

	private static TagKey<Biome> biomeTag(String name) {
		return TagUtil.biomeTag(CavernsAndChasms.MOD_ID, name);
	}
}
