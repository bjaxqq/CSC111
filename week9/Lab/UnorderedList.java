package Lab;

public class UnorderedList {
    private Node head;
    private int size;
    
    public UnorderedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void add(char newItem) {
        Node newNode = new Node(newItem);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
        size++;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node prev = head;
            Node curr = head.getNext();
            for (int i = 1; i < index; i++) {
                prev = curr;
                curr = curr.getNext();
            }
            prev.setNext(curr.getNext());
        }
        size--;
    }
    
    public void removeAll() {
        head = null;
        size = 0;
    }
    
    public char get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getItem();
    }
    
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getItem() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}