package world;

public class Node {

    Node north;
    Node south;
    Node west;
    Node east;
    Node next;
    Area area;
    int x;
    int y;

//TODO: constructor braucht: event, coord., nachbarn
    public Node(int x, i
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
