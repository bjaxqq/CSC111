package week11;

public class TestBinaryTree {
    public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert('m');
        tree.insert('e');
        tree.insert('k');
        tree.insert('z');
        tree.insert('a');
        tree.inorderTraversal();
    }
}
