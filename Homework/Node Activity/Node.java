public class Node {
    private char item;
    private Node next;

    public Node(char item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(char item) {
        this(item, null);
    }

    public char getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(char newItem) {
        item = newItem;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }
}