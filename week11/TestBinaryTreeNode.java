package week11;

public class TestBinaryTreeNode {
    public static void main(String[] args) {
        // Create three nodes
        BinaryTreeNode n1 = new BinaryTreeNode('A');
        BinaryTreeNode n2 = new BinaryTreeNode('B');
        BinaryTreeNode n3 = new BinaryTreeNode('C');

        // Attach n2 and n3 for the left and right child nodes
        n1.setLeftChild(n2);
        n1.setRightChild(n3);

        // Print value of each child node
        System.out.println(n1.getLeftChild().getItem()); // Output: B
        System.out.println(n1.getRightChild().getItem()); // Output: C

        // Attach n3 and n2 for the left and right child nodes
        n1.setLeftChild(n3);
        n1.setRightChild(n2);

        // Print value of each child node
        System.out.println(n1.getLeftChild().getItem());  // Output: C
        System.out.println(n1.getRightChild().getItem()); // Output: B
    }
}