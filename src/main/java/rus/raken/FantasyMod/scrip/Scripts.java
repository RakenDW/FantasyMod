package rus.raken.FantasyMod.scrip;

import rus.raken.FantasyMod.story.Function;

public class Scripts {
    public static void yes() {
        Function.addTimer(() -> {
            Function.sendMessage("???", "test");
        },5);
    }
}
