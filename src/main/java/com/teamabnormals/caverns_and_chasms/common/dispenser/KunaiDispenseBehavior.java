package com.teamabnormals.caverns_and_chasms.common.dispenser;

import com.teamabnormals.caverns_and_chasms.common.entity.projectile.Kunai;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class KunaiDispenseBehavior extends AbstractProjectileDispenseBehavior {

	@Override
	protected Projectile getProjectile(Level level, Position pos, ItemStack stack) {
		Kunai entity = new Kunai(level, pos.x(), pos.y(), pos.z());
		entity.pickup = AbstractArrow.Pickup.ALLOWED;
		return entity;
	}
}