package world;

public class Node {

    Node north;
    Node south;
    Node west;
    Node east;
    private Node next;
    private String name;
    private Area area;
    private int x;
    private int y;

//TODO: constructor braucht: event, coord., nachbarn
    public Node(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node node)
    {
        next = node;
    }
}
