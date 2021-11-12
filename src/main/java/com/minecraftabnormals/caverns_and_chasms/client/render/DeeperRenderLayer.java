package com.minecraftabnormals.caverns_and_chasms.client.render;

import com.minecraftabnormals.caverns_and_chasms.client.DeeperSpriteUploader;
import com.minecraftabnormals.caverns_and_chasms.client.model.DeeperModel;
import com.minecraftabnormals.caverns_and_chasms.common.entity.DeeperEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.teamabnormals.blueprint.client.BlueprintRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DeeperRenderLayer extends RenderLayer<DeeperEntity, DeeperModel<DeeperEntity>> {
	private final DeeperModel<DeeperEntity> model;

	public DeeperRenderLayer(RenderLayerParent<DeeperEntity, DeeperModel<DeeperEntity>> renderer) {
		super(renderer);
		this.model = new DeeperModel<>(true, DeeperModel.createLayerDefinition().bakeRoot());
	}

	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, DeeperEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		this.model.setupAnim(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.model.renderToBuffer(matrixStackIn, bufferIn.getBuffer(BlueprintRenderTypes.getEmissiveTranslucentEntity(DeeperSpriteUploader.ATLAS_LOCATION, false)), packedLightIn, LivingEntityRenderer.getOverlayCoords(entitylivingbaseIn, 0.0F), 1, 1, 1, 1);
	}
}