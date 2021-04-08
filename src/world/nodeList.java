package world;

public class nodeList {

    private String listName;
    private Node head;
    private Node last;

    public nodeList(String listName) {
        this.listName = listName;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
            last = head;
        } else {
            last.setNext(node);
            last = last.getNext();
        }
    }

}
