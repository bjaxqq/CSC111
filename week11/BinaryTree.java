package week11;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(char newItem) {
        BinaryTreeNode newNode = new BinaryTreeNode(newItem);
        if (isEmpty()) {
            root = newNode;
        } else {
            BinaryTreeNode current = root;
            boolean inserted = false;
            while (!inserted) {
                if (newItem < current.getItem()) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(newNode);
                        inserted = true;
                    } else {
                        current = current.getLeftChild();
                    }
                } else {
                    if (current.getRightChild() == null) {
                        current.setRightChild(newNode);
                        inserted = true;
                    } else {
                        current = current.getRightChild();
                    }
                }
            }
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getItem() + " ");
            inorderTraversal(node.getRightChild());
        }
    }
}