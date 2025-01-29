package net.zjjohn121110.aethersdelight.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.entity.AethersDelightBlockEntity;
import net.zjjohn121110.aethersdelight.block.entity.renderer.HolystoneStoveBlockEntityRenderer;

@EventBusSubscriber(modid = AethersDelight.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ADEventBusClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(AethersDelightBlockEntity.HOLYSTONE_STOVE.get(), HolystoneStoveBlockEntityRenderer::new);
    }
}
