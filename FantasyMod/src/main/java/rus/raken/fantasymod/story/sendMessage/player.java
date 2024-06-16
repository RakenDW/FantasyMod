import java.util.concurrent.TimeUnit;

public class player {
    public static void sendMessage(String name, String text){
        System.out.println("["+name+"] " +text);
    }
    public static void addddtimer(Runnable runnable, int timer){
        try {
            TimeUnit.SECONDS.sleep(timer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }runnable.run();
    }
}
