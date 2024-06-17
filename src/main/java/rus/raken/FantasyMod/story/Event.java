package rus.raken.FantasyMod.story;

import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rus.raken.FantasyMod.scrip.Scripts;

@Mod.EventBusSubscriber
public class Event {
    @SubscribeEvent
    public static void event(BlockEvent.BreakEvent event) {
        if (event.getPlayer() instanceof ServerPlayer serverPlayer) {
            Scripts.yes();
        }
    }
}
