package Lab;

// Node class
// Mark Hoffman  3/16/13
//
// Implements Node class from textbook pp 251-253.
// Implemented for char items

public class Node{
	
	//Instance variables

    private char item;
    private Node next ;
    
    //Constructors

    public Node(char newItem){
	item = newItem;
	next = null;
    } // Node constructor

    public Node (char newItem, Node nextNode){
	item = newItem;
	next =nextNode;
    } // Node constructor
    
    //Instance methods

    // Update item value
	// Parameter: new item value (newItem)
	// Return: void

    public void setItem(char newItem){
	item = newItem;
    } // setItem

	// Update pointer value
	// Parameter: new pointer value (newNode)
	// Return: void
	
    public void setNext(Node nextNode){
	next = nextNode;
    } // setNext

	// Get value of item
	// Parameter: none
	// Return: item value (item)
	
    public char getItem(){
 	return item;
    } // getItem

	// Get value of pointer
	// Parameter: none
	// Return: pointer value (next)
	
    public Node getNext(){
	return next;
    } //
} // Node