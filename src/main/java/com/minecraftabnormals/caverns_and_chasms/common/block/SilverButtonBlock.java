package com.minecraftabnormals.caverns_and_chasms.common.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class SilverButtonBlock extends ButtonBlock {

	public SilverButtonBlock(BlockBehaviour.Properties properties) {
		super(false, properties);
	}

	@Override
	public int getPressDuration() {
		return 50;
	}

	@Override
	protected SoundEvent getSound(boolean powered) {
		return powered ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
	}
}