package rus.raken.fantasymod.story.npc;

public class NpcJS {
    String name;
    int x,y,z;
    public NpcJS(String name,int x,int y,int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void create() {
        System.out.println("НПС СОЗДАН В " + x + " " + y + " " + z);
    }
    public void setMessage(String text) {
        System.out.println("[" + name + "] " + text);
    }
}
