package com.minecraftabnormals.caverns_and_chasms.common.entity.skeleton;

import com.minecraftabnormals.caverns_and_chasms.core.registry.CCEntityTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;

public class SkeletonCatEntity extends Cat {

	public SkeletonCatEntity(EntityType<? extends SkeletonCatEntity> type, Level worldIn) {
		super(type, worldIn);
	}

	@Override
	public SkeletonCatEntity getBreedOffspring(ServerLevel world, AgeableMob entity) {
		SkeletonCatEntity cat = CCEntityTypes.SKELETON_CAT.get().create(world);
		if (this.random.nextBoolean()) {
			cat.setCatType(this.getCatType());
		} else {
			cat.setCatType(cat.getCatType());
		}

		if (this.isTame()) {
			cat.setOwnerUUID(this.getOwnerUUID());
			cat.setTame(true);
			if (this.random.nextBoolean()) {
				cat.setCollarColor(this.getCollarColor());
			} else {
				cat.setCollarColor(cat.getCollarColor());
			}
		}

		return cat;
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.SKELETON_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.SKELETON_DEATH;
	}
}