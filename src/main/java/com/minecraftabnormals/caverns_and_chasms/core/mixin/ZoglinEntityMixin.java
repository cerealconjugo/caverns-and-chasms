package com.minecraftabnormals.caverns_and_chasms.core.mixin;

import com.minecraftabnormals.caverns_and_chasms.core.CCConfig;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Zoglin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Zoglin.class)
public abstract class ZoglinEntityMixin {

	@Inject(at = @At("RETURN"), method = "isTargetable", cancellable = true)
	private void isTargetable(LivingEntity entity, CallbackInfoReturnable<Boolean> ci) {
		if (!CCConfig.COMMON.creeperExplosionsDestroyBlocks.get() && entity.getType() == EntityType.CREEPER)
			ci.setReturnValue(true);
	}
}
