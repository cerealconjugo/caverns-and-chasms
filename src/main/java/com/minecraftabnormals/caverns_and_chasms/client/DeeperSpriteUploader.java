package com.minecraftabnormals.caverns_and_chasms.client;

import com.minecraftabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.TextureAtlasHolder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.stream.Stream;

/**
 * @author Ocelot
 */
public class DeeperSpriteUploader extends TextureAtlasHolder {
	public static final ResourceLocation ATLAS_LOCATION = new ResourceLocation(CavernsAndChasms.MOD_ID, "textures/atlas/deeper.png");
	public static final ResourceLocation DEEPER_SPRITE = new ResourceLocation(CavernsAndChasms.MOD_ID, "deeper");
	public static final ResourceLocation EMISSIVE_SPRITE = new ResourceLocation(CavernsAndChasms.MOD_ID, "deeper_emissive");

	private static DeeperSpriteUploader uploader;

	public DeeperSpriteUploader(TextureManager textureManagerIn, ResourceLocation atlasTextureLocation, String prefixIn) {
		super(textureManagerIn, atlasTextureLocation, prefixIn);
	}

	@Override
	protected Stream<ResourceLocation> getResourcesToLoad() {
		return Stream.of(DEEPER_SPRITE, EMISSIVE_SPRITE);
	}

	/**
	 * Initializes this uploader under the mod bus.
	 *
	 * @param bus The bus to register to
	 */
	public static void init(IEventBus bus) {
		bus.addListener(EventPriority.NORMAL, false, ColorHandlerEvent.Block.class, event -> {
			Minecraft minecraft = Minecraft.getInstance();
			ResourceManager resourceManager = minecraft.getResourceManager();
			if (resourceManager instanceof ReloadableResourceManager) {
				((ReloadableResourceManager) resourceManager).registerReloadListener(uploader = new DeeperSpriteUploader(minecraft.textureManager, ATLAS_LOCATION, "entity/deeper"));
			}
		});
	}

	/**
	 * @return The sprite for the deeper
	 */
	public static TextureAtlasSprite getSprite() {
		return uploader.getSprite(DEEPER_SPRITE);
	}

	/**
	 * @return The sprite for the deeper outer layer
	 */
	public static TextureAtlasSprite getEmissiveSprite() {
		return uploader.getSprite(EMISSIVE_SPRITE);
	}
}
