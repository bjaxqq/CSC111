package week10;

public class IntStack {
    private Node top; // Top of the stack
    private int size; // Number of items in the stack

    // Node class to represent each item in the stack
    private static class Node {
        private int data; // Data of the node
        private Node next; // Reference to the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to create an empty stack
    public void createStack() {
        top = null;
        size = 0;
    }

    // Determines whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Adds a new integer to the top of the stack
    public void push(int newItem) {
        Node newNode = new Node(newItem);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Returns and removes the top integer from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedItem = top.data;
        top = top.next;
        size--;
        return poppedItem;
    }

    // Removes all integers from the stack
    public void popAll() {
        top = null;
        size = 0;
    }

    // Returns the top integer on the stack
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Displays the entire stack from top to last item
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("top-->");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Returns the size of the stack
    public int size() {
        return size;
    }
}