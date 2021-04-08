package events;
import world.*;
import creatures.*;
import objects.*;

public class WorldDesc {
    String name;
    private String text;

    public WorldDesc(String text, String name) {
        this.text = text;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + '\n' + text;
    }
}
