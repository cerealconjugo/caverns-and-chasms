package com.teamabnormals.caverns_and_chasms.core.other;

import com.teamabnormals.blueprint.common.advancement.EmptyTrigger;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = CavernsAndChasms.MOD_ID)
public class CCCriteriaTriggers {
	public static final EmptyTrigger USE_TUNING_FORK = CriteriaTriggers.register(new EmptyTrigger(prefix("use_tuning_fork")));
	public static final EmptyTrigger SPOTTED_BY_PEEPER = CriteriaTriggers.register(new EmptyTrigger(prefix("spotted_by_peeper")));
	public static final EmptyTrigger DISMANTLED_ITEM = CriteriaTriggers.register(new EmptyTrigger(prefix("dismantled_item")));

	private static ResourceLocation prefix(String name) {
		return new ResourceLocation(CavernsAndChasms.MOD_ID, name);
	}
}