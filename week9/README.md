# Week 9: Node ADT Activity

### Instructions:
1. Implement the `Node` class shown in the handout. Test the class by implementing a `main` method that uses each constructor and each method.
2. Create four nodes with each `next` variable set to `null`. For example,
```
Node n1 = new Node('a', null);
```
Create a 4-node linked list by setting the `next` variable of the one node to a different node. For example,
```
n1.setNext(n2);
```
3. Print the contents of each node of the linked list using only the first node reference variable. For example, the contents of the second node may be accessed as follows.
```
n1.getNext().getItem()
```
4. Set the reference variable to the second, third, and fourth nodes to `null`. Do step 3 again.
5. Create a new `Node` reference variable `curr`. Set it to reference the first node. For example,
```
Node curr = n1;
```
Use `curr` to print the contents of the first node. now set `curr` to reference the second node.
```
curr = n1.getNext();
```
Use curr to print the contents of the second node. Now use `curr` to print the contents of the remaining nodes in the linked list. Can this be done with a loop? For example, a `while` loop could begin with `curr` set to reference the first node. Once the contents of the first node are printed, `curr` is set to reference the next node. This continues until the last node is printed and the `curr` is now set to `null`.
6. A linked list may be built from nodes with a node reference variable to only the first node. The reference variable is typically called `head` One way to build linked list is by placing new nodes at the beginning of the list. Use the sample below to build a 4-node linked list in this manner. Print its contents after it is complete.
```
Node head;  // create reference variable to linked list
head = new Node('c', null);     // create first node
head = new Node('a', head);     // create second node pointing to the first node