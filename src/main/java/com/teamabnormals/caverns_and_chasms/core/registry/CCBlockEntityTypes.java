package com.teamabnormals.caverns_and_chasms.core.registry;

import com.teamabnormals.blueprint.core.util.registry.BlockEntitySubRegistryHelper;
import com.teamabnormals.caverns_and_chasms.common.block.entity.CCSkullBlockEntity;
import com.teamabnormals.caverns_and_chasms.common.block.entity.CupricCampfireBlockEntity;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = CavernsAndChasms.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CCBlockEntityTypes {
	public static final BlockEntitySubRegistryHelper HELPER = CavernsAndChasms.REGISTRY_HELPER.getBlockEntitySubHelper();

	public static final RegistryObject<BlockEntityType<CupricCampfireBlockEntity>> CUPRIC_CAMPFIRE = HELPER.createBlockEntity("cupric_campfire", CupricCampfireBlockEntity::new, () -> new Block[]{CCBlocks.CUPRIC_CAMPFIRE.get()});
//	public static final RegistryObject<BlockEntityType<InductorBlockEntity>> INDUCTOR = HELPER.createBlockEntity("inductor", InductorBlockEntity::new, () -> new Block[]{CCBlocks.INDUCTOR.get()});
	public static final RegistryObject<BlockEntityType<CCSkullBlockEntity>> SKULL = HELPER.createBlockEntity("skull", CCSkullBlockEntity::new, () -> new Block[]{CCBlocks.MIME_HEAD.get(), CCBlocks.MIME_WALL_HEAD.get()});
}