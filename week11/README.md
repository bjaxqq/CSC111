# Tree Activity

### Objective
For this activity you will test the class ```BinaryTreeNode```. You will build a simple binary tree by linking nodes together. You will create a class ```BinaryTree``` that allows you to create an empty binary tree, has a method to determine whether the tree is empty, and has a method that inserts nodes such that items with lesser values than the value of a node are in the left subtree, otherwise they are in the right subtree. You will also create a method to perform an inorder traversal of the binary tree.

### References
- Textbook pp 570-586

### Sample Files
Download the file ```BinaryTreeNode.java``` from Blackboard.

### Activities
1. The class ```BinaryTreeNode``` contains methods to create, access and update binary tree nodes. This class is similar to the class ```TreeNode``` found on page 581-582.
2. Create a class ```TestBinaryTreeNode``` to do the exercises for this lab. Create three nodes. Choose one node as root. Attach the other two nodes as left and right child nodes. Print the value of each child node by referencing the root node. For example, if n1 is the root node, ```n1.getRightChild().getItem()``` accesses the value of its right child. Try other arrangements.
3.  Create a class ```BinaryTree```. The class must provide methods to create an empty binary tree, a method to return ```true``` if it is empty, a method to insert a node such that all nodes with values less than the value of a node are in its left subtree, otherwise it is inserted in the its right subtree, and a method to perform an inorder traversal. Insert nodes in the following order: ```'m' 'e' 'k' 'z' 'a'```. The tree you build is known as a *binary search tree*. An inorder traversal prints a sorted list of its contents.