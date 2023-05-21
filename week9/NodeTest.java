public class NodeTest {
    public static void main(String[] args) {
        // Test Node constructors and methods
        Node n1 = new Node('a');
        Node n2 = new Node('b', n1);
        System.out.println(n2.getItem()); // Output: 'b'
        System.out.println(n2.getNext().getItem()); // Output: 'a'
        n2.setItem('c');
        System.out.println(n2.getItem()); // Output: 'c'

        // Create 4-node linked list
        Node head = new Node('a');
        Node n3 = new Node('b');
        Node n4 = new Node('c');
        Node n5 = new Node('d');
        head.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        // Print contents of linked list
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }

        // Set reference variables to null and print contents again
        n3 = null;
        n4 = null;
        n5 = null;
        curr = head;
        while (curr != null) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }

        // Build linked list by placing new nodes at beginning
        Node newHead = new Node('c', null);
        newHead = new Node('a', newHead);
        newHead = new Node('b', newHead);
        newHead = new Node('d', newHead);

        // Print contents of linked list
        curr = newHead;
        while (curr != null) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }
    }
}