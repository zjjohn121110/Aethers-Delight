package net.zjjohn121110.aethersdelight.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.zjjohn121110.aethersdelight.AethersDelight;
import net.zjjohn121110.aethersdelight.block.holystone_stove.HolystoneStoveBlockEntity;
import net.zjjohn121110.aethersdelight.registry.ADBlockEntities;
import vectorwing.farmersdelight.client.renderer.DefaultStoveRenderer;

@EventBusSubscriber(modid = AethersDelight.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ADBlockEntities.HOLYSTONE_STOVE.get(), DefaultStoveRenderer<HolystoneStoveBlockEntity>::new);
    }
}
