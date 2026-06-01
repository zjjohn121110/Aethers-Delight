package net.zjjohn121110.aethersdelight.event;

import com.aetherteam.aether.event.PlacementBanEvent;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.Tags;
import net.zjjohn121110.aethersdelight.AethersDelight;
import vectorwing.farmersdelight.common.block.AbstractStoveBlock;

@EventBusSubscriber(modid = AethersDelight.MODID)
public class CommonEvents {

    @SubscribeEvent
    public static void checkItemBanBypass(PlacementBanEvent.CheckItem event) {
        var level = event.getLevel();
        var stack = event.getItemStack();
        var pos = event.getPos();
        var state = level.getBlockState(pos);

        if (stack.is(Tags.Items.TOOLS_IGNITER)) {
            if (state.getBlock() instanceof AbstractStoveBlock && !state.getValue(BlockStateProperties.LIT)) {
                event.setBanned(false);
            }
        }
    }
}
