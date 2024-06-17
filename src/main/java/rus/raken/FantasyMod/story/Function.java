package rus.raken.FantasyMod.story;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import java.util.concurrent.TimeUnit;

public class Function {
    public static void sendMessage(String name,String text) {
        Minecraft.getInstance().player.sendSystemMessage(Component.literal(ChatFormatting.RED + "[" + name + "] " + ChatFormatting.RESET + text));
    }
    public static void sendMessage(String name) {
        Minecraft.getInstance().player.sendSystemMessage(Component.literal(name));
    }
    public static void addScene(Runnable runnable) {
        runnable.run();
    }
    public static void addTimer(Runnable runnable,int timer) {
        try {
            TimeUnit.SECONDS.sleep(timer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        runnable.run();
    }
}
