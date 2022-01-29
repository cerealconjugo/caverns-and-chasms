package com.teamabnormals.caverns_and_chasms.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import com.teamabnormals.caverns_and_chasms.core.other.tags.CCBlockTags;
import com.teamabnormals.caverns_and_chasms.core.registry.CCBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CCBlockTagsProvider extends BlockTagsProvider {

	public CCBlockTagsProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
		super(generator, CavernsAndChasms.MOD_ID, fileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BlockTags.BEACON_BASE_BLOCKS).add(CCBlocks.SILVER_BLOCK.get(), CCBlocks.NECROMIUM_BLOCK.get());
		this.tag(BlockTags.BUTTONS).add(CCBlocks.SILVER_BUTTON.get(), CCBlocks.COPPER_BUTTON.get(), CCBlocks.EXPOSED_COPPER_BUTTON.get(), CCBlocks.WEATHERED_COPPER_BUTTON.get(), CCBlocks.OXIDIZED_COPPER_BUTTON.get(), CCBlocks.WAXED_COPPER_BUTTON.get(), CCBlocks.WAXED_EXPOSED_COPPER_BUTTON.get(), CCBlocks.WAXED_WEATHERED_COPPER_BUTTON.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BUTTON.get());
		this.tag(BlockTags.CAMPFIRES).add(CCBlocks.CURSED_CAMPFIRE.get());
		this.tag(BlockTags.DIRT).add(CCBlocks.ROCKY_DIRT.get(), CCBlocks.DIRT_BRICKS.get(), CCBlocks.DIRT_BRICK_STAIRS.get(), CCBlocks.DIRT_BRICK_SLAB.get(), CCBlocks.DIRT_BRICK_WALL.get(), CCBlocks.DIRT_BRICK_VERTICAL_SLAB.get(), CCBlocks.DIRT_TILES.get(), CCBlocks.DIRT_TILE_STAIRS.get(), CCBlocks.DIRT_TILE_SLAB.get(), CCBlocks.DIRT_TILE_WALL.get(), CCBlocks.DIRT_TILE_VERTICAL_SLAB.get());
		this.tag(BlockTags.FIRE).add(CCBlocks.CURSED_FIRE.get());
		this.tag(BlockTags.GUARDED_BY_PIGLINS).add(CCBlocks.GOLDEN_BARS.get(), CCBlocks.GOLDEN_LANTERN.get());
		this.tag(BlockTags.PIGLIN_REPELLENTS).add(CCBlocks.SOUL_BRAZIER.get());
		this.tag(BlockTags.PRESSURE_PLATES).add(CCBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get());
		this.tag(BlockTags.RAILS).add(CCBlocks.SPIKED_RAIL.get());
		this.tag(BlockTags.SLABS).add(CCBlocks.DIRT_BRICK_SLAB.get(), CCBlocks.DIRT_TILE_SLAB.get(), CCBlocks.COBBLESTONE_BRICK_SLAB.get(), CCBlocks.COBBLESTONE_TILE_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_SLAB.get(), CCBlocks.SPINEL_BRICK_SLAB.get(), CCBlocks.LAPIS_LAZULI_BRICK_SLAB.get(), CCBlocks.SANGUINE_SLAB.get(), CCBlocks.DRIPSTONE_SHINGLE_SLAB.get(), CCBlocks.CALCITE_SLAB.get(), CCBlocks.POLISHED_CALCITE_SLAB.get(), CCBlocks.TUFF_SLAB.get(), CCBlocks.POLISHED_TUFF_SLAB.get());
		this.tag(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(CCBlocks.SOUL_SILVER_ORE.get());
		this.tag(BlockTags.SOUL_SPEED_BLOCKS).add(CCBlocks.SOUL_SILVER_ORE.get());
		this.tag(BlockTags.STAIRS).add(CCBlocks.DIRT_BRICK_STAIRS.get(), CCBlocks.DIRT_TILE_STAIRS.get(), CCBlocks.COBBLESTONE_BRICK_STAIRS.get(), CCBlocks.COBBLESTONE_TILE_STAIRS.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_STAIRS.get(), CCBlocks.SPINEL_BRICK_STAIRS.get(), CCBlocks.LAPIS_LAZULI_BRICK_STAIRS.get(), CCBlocks.SANGUINE_STAIRS.get(), CCBlocks.DRIPSTONE_SHINGLE_STAIRS.get(), CCBlocks.CALCITE_STAIRS.get(), CCBlocks.POLISHED_CALCITE_STAIRS.get(), CCBlocks.TUFF_STAIRS.get(), CCBlocks.POLISHED_TUFF_STAIRS.get());
		this.tag(BlockTags.WALL_POST_OVERRIDE).add(CCBlocks.CURSED_TORCH.get());
		this.tag(BlockTags.WALLS).add(CCBlocks.DIRT_BRICK_WALL.get(), CCBlocks.DIRT_TILE_WALL.get(), CCBlocks.COBBLESTONE_BRICK_WALL.get(), CCBlocks.COBBLESTONE_TILE_WALL.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_WALL.get(), CCBlocks.SPINEL_BRICK_WALL.get(), CCBlocks.LAPIS_LAZULI_BRICK_WALL.get(), CCBlocks.DRIPSTONE_SHINGLE_WALL.get(), CCBlocks.CALCITE_WALL.get(), CCBlocks.TUFF_WALL.get());
		this.tag(BlockTags.PLANKS).add(CCBlocks.AZALEA_PLANKS.get(), CCBlocks.VERTICAL_AZALEA_PLANKS.get());
		this.tag(BlockTags.LOGS_THAT_BURN).addTag(CCBlockTags.AZALEA_LOGS);
		this.tag(BlockTags.WOODEN_SLABS).add(CCBlocks.AZALEA_SLAB.get());
		this.tag(BlockTags.WOODEN_STAIRS).add(CCBlocks.AZALEA_STAIRS.get());
		this.tag(BlockTags.WOODEN_FENCES).add(CCBlocks.AZALEA_FENCE.get());
		this.tag(BlockTags.WOODEN_DOORS).add(CCBlocks.AZALEA_DOOR.get());
		this.tag(BlockTags.WOODEN_TRAPDOORS).add(CCBlocks.AZALEA_TRAPDOOR.get());
		this.tag(BlockTags.WOODEN_BUTTONS).add(CCBlocks.AZALEA_BUTTON.get());
		this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(CCBlocks.AZALEA_PRESSURE_PLATE.get());
		this.tag(BlockTags.STANDING_SIGNS).add(CCBlocks.AZALEA_SIGN.getFirst().get());
		this.tag(BlockTags.WALL_SIGNS).add(CCBlocks.AZALEA_SIGN.getSecond().get());
		this.tag(BlockTags.CLIMBABLE).add(CCBlocks.AZALEA_LADDER.get());
		this.tag(BlockTags.BEEHIVES).add(CCBlocks.AZALEA_BEEHIVE.get());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(CCBlocks.ROCKY_DIRT.get(), CCBlocks.FRAGILE_STONE.get(), CCBlocks.SILVER_BLOCK.get(), CCBlocks.RAW_SILVER_BLOCK.get(), CCBlocks.SILVER_ORE.get(), CCBlocks.DEEPSLATE_SILVER_ORE.get(), CCBlocks.SILVER_BARS.get(), CCBlocks.MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), CCBlocks.SILVER_BUTTON.get(), CCBlocks.SPIKED_RAIL.get(), CCBlocks.SANGUINE_PLATES.get(), CCBlocks.SANGUINE_STAIRS.get(), CCBlocks.SANGUINE_SLAB.get(), CCBlocks.SANGUINE_VERTICAL_SLAB.get(), CCBlocks.CURSED_LANTERN.get(), CCBlocks.BRAZIER.get(), CCBlocks.SOUL_BRAZIER.get(), CCBlocks.CURSED_BRAZIER.get(), CCBlocks.ENDER_BRAZIER.get(), CCBlocks.GRAVESTONE.get(), CCBlocks.GOLDEN_LANTERN.get(), CCBlocks.GOLDEN_BARS.get(), CCBlocks.SPINEL_BLOCK.get(), CCBlocks.SPINEL_LAMP.get(), CCBlocks.SPINEL_PILLAR.get(), CCBlocks.SPINEL_BRICKS.get(), CCBlocks.SPINEL_BRICK_STAIRS.get(), CCBlocks.SPINEL_BRICK_SLAB.get(), CCBlocks.SPINEL_BRICK_WALL.get(), CCBlocks.SPINEL_BRICK_VERTICAL_SLAB.get(), CCBlocks.SPINEL_ORE.get(), CCBlocks.DEEPSLATE_SPINEL_ORE.get(), CCBlocks.NECROMIUM_BLOCK.get(), CCBlocks.LAPIS_LAZULI_LAMP.get(), CCBlocks.LAPIS_LAZULI_PILLAR.get(), CCBlocks.LAPIS_LAZULI_BRICKS.get(), CCBlocks.LAPIS_LAZULI_BRICK_STAIRS.get(), CCBlocks.LAPIS_LAZULI_BRICK_SLAB.get(), CCBlocks.LAPIS_LAZULI_BRICK_WALL.get(), CCBlocks.LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(), CCBlocks.COBBLESTONE_BRICKS.get(), CCBlocks.COBBLESTONE_BRICK_STAIRS.get(), CCBlocks.COBBLESTONE_BRICK_SLAB.get(), CCBlocks.COBBLESTONE_BRICK_WALL.get(), CCBlocks.COBBLESTONE_BRICK_VERTICAL_SLAB.get(), CCBlocks.COBBLESTONE_TILES.get(), CCBlocks.COBBLESTONE_TILE_STAIRS.get(), CCBlocks.COBBLESTONE_TILE_SLAB.get(), CCBlocks.COBBLESTONE_TILE_WALL.get(), CCBlocks.COBBLESTONE_TILE_VERTICAL_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_BRICKS.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_WALL.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_TILES.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_STAIRS.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_WALL.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB.get(), CCBlocks.COPPER_BARS.get(), CCBlocks.EXPOSED_COPPER_BARS.get(), CCBlocks.WEATHERED_COPPER_BARS.get(), CCBlocks.OXIDIZED_COPPER_BARS.get(), CCBlocks.WAXED_COPPER_BARS.get(), CCBlocks.WAXED_EXPOSED_COPPER_BARS.get(), CCBlocks.WAXED_WEATHERED_COPPER_BARS.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), CCBlocks.COPPER_BUTTON.get(), CCBlocks.EXPOSED_COPPER_BUTTON.get(), CCBlocks.WEATHERED_COPPER_BUTTON.get(), CCBlocks.OXIDIZED_COPPER_BUTTON.get(), CCBlocks.WAXED_COPPER_BUTTON.get(), CCBlocks.WAXED_EXPOSED_COPPER_BUTTON.get(), CCBlocks.WAXED_WEATHERED_COPPER_BUTTON.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BUTTON.get(), CCBlocks.DRIPSTONE_SHINGLES.get(), CCBlocks.DRIPSTONE_SHINGLE_STAIRS.get(), CCBlocks.DRIPSTONE_SHINGLE_SLAB.get(), CCBlocks.DRIPSTONE_SHINGLE_WALL.get(), CCBlocks.CHISELED_DRIPSTONE_SHINGLES.get(), CCBlocks.FLOODED_DRIPSTONE_SHINGLES.get(), CCBlocks.CALCITE_STAIRS.get(), CCBlocks.CALCITE_SLAB.get(), CCBlocks.CALCITE_WALL.get(), CCBlocks.CALCITE_VERTICAL_SLAB.get(), CCBlocks.POLISHED_CALCITE.get(), CCBlocks.POLISHED_CALCITE_STAIRS.get(), CCBlocks.POLISHED_CALCITE_SLAB.get(), CCBlocks.POLISHED_CALCITE_VERTICAL_SLAB.get(), CCBlocks.TUFF_STAIRS.get(), CCBlocks.TUFF_SLAB.get(), CCBlocks.TUFF_WALL.get(), CCBlocks.TUFF_VERTICAL_SLAB.get(), CCBlocks.POLISHED_TUFF.get(), CCBlocks.POLISHED_TUFF_STAIRS.get(), CCBlocks.POLISHED_TUFF_SLAB.get(), CCBlocks.POLISHED_TUFF_VERTICAL_SLAB.get());
		this.tag(BlockTags.MINEABLE_WITH_AXE).add(CCBlocks.CURSED_CAMPFIRE.get());
		this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(CCBlocks.ROCKY_DIRT.get(), CCBlocks.SOUL_SILVER_ORE.get(), CCBlocks.DIRT_BRICKS.get(), CCBlocks.DIRT_BRICK_STAIRS.get(), CCBlocks.DIRT_BRICK_SLAB.get(), CCBlocks.DIRT_BRICK_WALL.get(), CCBlocks.DIRT_BRICK_VERTICAL_SLAB.get(), CCBlocks.DIRT_TILES.get(), CCBlocks.DIRT_TILE_STAIRS.get(), CCBlocks.DIRT_TILE_SLAB.get(), CCBlocks.DIRT_TILE_WALL.get(), CCBlocks.DIRT_TILE_VERTICAL_SLAB.get());
		this.tag(BlockTags.MINEABLE_WITH_HOE).add(CCBlocks.ROTTEN_FLESH_BLOCK.get());
		this.tag(BlockTags.NEEDS_STONE_TOOL).add(CCBlocks.SPINEL_ORE.get(), CCBlocks.DEEPSLATE_SPINEL_ORE.get(), CCBlocks.SPINEL_BLOCK.get(), CCBlocks.SPINEL_LAMP.get(), CCBlocks.SPINEL_PILLAR.get(), CCBlocks.SPINEL_BRICKS.get(), CCBlocks.SPINEL_BRICK_STAIRS.get(), CCBlocks.SPINEL_BRICK_SLAB.get(), CCBlocks.SPINEL_BRICK_WALL.get(), CCBlocks.SPINEL_BRICK_VERTICAL_SLAB.get(), CCBlocks.LAPIS_LAZULI_LAMP.get(), CCBlocks.LAPIS_LAZULI_PILLAR.get(), CCBlocks.LAPIS_LAZULI_BRICKS.get(), CCBlocks.LAPIS_LAZULI_BRICK_STAIRS.get(), CCBlocks.LAPIS_LAZULI_BRICK_SLAB.get(), CCBlocks.LAPIS_LAZULI_BRICK_WALL.get(), CCBlocks.LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(), CCBlocks.COPPER_BARS.get(), CCBlocks.EXPOSED_COPPER_BARS.get(), CCBlocks.WEATHERED_COPPER_BARS.get(), CCBlocks.OXIDIZED_COPPER_BARS.get(), CCBlocks.WAXED_COPPER_BARS.get(), CCBlocks.WAXED_EXPOSED_COPPER_BARS.get(), CCBlocks.WAXED_WEATHERED_COPPER_BARS.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
		this.tag(BlockTags.NEEDS_IRON_TOOL).add(CCBlocks.SILVER_BLOCK.get(), CCBlocks.RAW_SILVER_BLOCK.get(), CCBlocks.SILVER_ORE.get(), CCBlocks.DEEPSLATE_SILVER_ORE.get());
		this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(CCBlocks.NECROMIUM_BLOCK.get());

		this.tag(CCBlockTags.BRAZIERS).add(CCBlocks.BRAZIER.get(), CCBlocks.SOUL_BRAZIER.get(), CCBlocks.ENDER_BRAZIER.get(), CCBlocks.CURSED_BRAZIER.get());
		this.tag(CCBlockTags.CURSED_FIRE_BASE_BLOCKS).add(CCBlocks.ROTTEN_FLESH_BLOCK.get());
		this.tag(CCBlockTags.DEEPER_SPAWNABLE_BLOCKS).add(Blocks.GRAVEL, CCBlocks.FRAGILE_STONE.get()).addTag(BlockTags.BASE_STONE_OVERWORLD).addTag(Tags.Blocks.ORES);
		this.tag(CCBlockTags.IGNORE_RAIL_PLACEMENT);
		this.tag(CCBlockTags.SILVER_ORES).add(CCBlocks.SILVER_ORE.get(), CCBlocks.DEEPSLATE_SILVER_ORE.get(), CCBlocks.SOUL_SILVER_ORE.get());
		this.tag(CCBlockTags.SPINEL_ORES).add(CCBlocks.SPINEL_ORE.get(), CCBlocks.DEEPSLATE_SPINEL_ORE.get());
		this.tag(CCBlockTags.PROSPECTING_METALS).addTag(Tags.Blocks.ORES_COPPER).addTag(Tags.Blocks.ORES_IRON).addTag(Tags.Blocks.ORES_GOLD).addTag(Tags.Blocks.ORES_NETHERITE_SCRAP).addTag(CCBlockTags.ORES_SILVER);
		this.tag(CCBlockTags.TREASURING_GEMS).addTag(CCBlockTags.ORES_AMETHYST).addTag(Tags.Blocks.ORES_DIAMOND).addTag(Tags.Blocks.ORES_EMERALD).addTag(Tags.Blocks.ORES_LAPIS).addTag(CCBlockTags.ORES_SPINEL);
		this.tag(CCBlockTags.AZALEA_LOGS).add(CCBlocks.AZALEA_LOG.get(), CCBlocks.STRIPPED_AZALEA_LOG.get(), CCBlocks.AZALEA_WOOD.get(), CCBlocks.STRIPPED_AZALEA_WOOD.get());

		this.tag(CCBlockTags.WAXABLE_COPPER_BLOCKS).add(Blocks.COPPER_BLOCK, Blocks.EXPOSED_COPPER, Blocks.WEATHERED_COPPER, Blocks.OXIDIZED_COPPER, Blocks.CUT_COPPER, Blocks.EXPOSED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER, Blocks.CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, CCBlocks.COPPER_BARS.get(), CCBlocks.EXPOSED_COPPER_BARS.get(), CCBlocks.WEATHERED_COPPER_BARS.get(), CCBlocks.OXIDIZED_COPPER_BARS.get(), CCBlocks.COPPER_BUTTON.get(), CCBlocks.EXPOSED_COPPER_BUTTON.get(), CCBlocks.WEATHERED_COPPER_BUTTON.get(), CCBlocks.OXIDIZED_COPPER_BUTTON.get());
		this.tag(CCBlockTags.WAXED_COPPER_BLOCKS).add(Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, CCBlocks.WAXED_COPPER_BARS.get(), CCBlocks.WAXED_EXPOSED_COPPER_BARS.get(), CCBlocks.WAXED_WEATHERED_COPPER_BARS.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), CCBlocks.WAXED_COPPER_BUTTON.get(), CCBlocks.WAXED_EXPOSED_COPPER_BUTTON.get(), CCBlocks.WAXED_WEATHERED_COPPER_BUTTON.get(), CCBlocks.WAXED_OXIDIZED_COPPER_BUTTON.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_SILVER).add(CCBlocks.SILVER_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_SPINEL).add(CCBlocks.SPINEL_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_NECROMIUM).add(CCBlocks.NECROMIUM_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_RAW_SILVER).add(CCBlocks.RAW_SILVER_BLOCK.get());
		this.tag(Tags.Blocks.STORAGE_BLOCKS).addTag(CCBlockTags.STORAGE_BLOCKS_SILVER).addTag(CCBlockTags.STORAGE_BLOCKS_SPINEL).addTag(CCBlockTags.STORAGE_BLOCKS_NECROMIUM).addTag(CCBlockTags.STORAGE_BLOCKS_RAW_SILVER);
		this.tag(Tags.Blocks.ORES).addTag(CCBlockTags.ORES_SILVER).addTag(CCBlockTags.ORES_SPINEL);
		this.tag(CCBlockTags.ORES_AMETHYST).add(Blocks.AMETHYST_BLOCK, Blocks.AMETHYST_CLUSTER, Blocks.BUDDING_AMETHYST, Blocks.LARGE_AMETHYST_BUD, Blocks.MEDIUM_AMETHYST_BUD, Blocks.SMALL_AMETHYST_BUD);
		this.tag(CCBlockTags.ORES_SILVER).addTag(CCBlockTags.SILVER_ORES);
		this.tag(CCBlockTags.ORES_SPINEL).addTag(CCBlockTags.SPINEL_ORES);
		this.tag(Tags.Blocks.ORE_RATES_DENSE).add(CCBlocks.SPINEL_ORE.get(), CCBlocks.DEEPSLATE_SPINEL_ORE.get());
		this.tag(Tags.Blocks.ORE_RATES_SINGULAR).add(CCBlocks.SILVER_ORE.get(), CCBlocks.DEEPSLATE_SILVER_ORE.get());
		this.tag(Tags.Blocks.ORE_RATES_SPARSE).add(CCBlocks.SOUL_SILVER_ORE.get());
		this.tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(CCBlocks.SILVER_ORE.get(), CCBlocks.SPINEL_ORE.get());
		this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(CCBlocks.DEEPSLATE_SILVER_ORE.get(), CCBlocks.DEEPSLATE_SPINEL_ORE.get());
		this.tag(Tags.Blocks.CHESTS_WOODEN).add(CCBlocks.AZALEA_CHEST.getFirst().get(), CCBlocks.AZALEA_CHEST.getSecond().get());
		this.tag(Tags.Blocks.CHESTS_TRAPPED).add(CCBlocks.AZALEA_CHEST.getSecond().get());
		this.tag(Tags.Blocks.FENCES_WOODEN).add(CCBlocks.AZALEA_FENCE.get());
		this.tag(Tags.Blocks.FENCE_GATES_WOODEN).add(CCBlocks.AZALEA_FENCE_GATE.get());

		this.tag(BlueprintBlockTags.LADDERS).add(CCBlocks.AZALEA_LADDER.get());
		this.tag(BlueprintBlockTags.VERTICAL_SLABS).add(CCBlocks.DIRT_BRICK_VERTICAL_SLAB.get(), CCBlocks.DIRT_TILE_VERTICAL_SLAB.get(), CCBlocks.COBBLESTONE_BRICK_VERTICAL_SLAB.get(), CCBlocks.COBBLESTONE_TILE_VERTICAL_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB.get(), CCBlocks.MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB.get(), CCBlocks.SPINEL_BRICK_VERTICAL_SLAB.get(), CCBlocks.LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(), CCBlocks.SANGUINE_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.WOODEN_VERTICAL_SLABS).add(CCBlocks.AZALEA_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.HEDGES).add(CCBlocks.AZALEA_HEDGE.get(), CCBlocks.FLOWERING_AZALEA_HEDGE.get());
	}
}