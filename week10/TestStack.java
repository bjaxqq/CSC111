// Integer Stack
// Mark Hoffman  3/21/09
//
// Tests ADT Stack
package week10;

public class TestStack{
	public static void main (String [] args){
		
		// Create Stack
		IntStack s = new IntStack();
		
		System.out.println("Stack is empty = " + s.isEmpty());
		
		// Push two integers
		System.out.println("\nPush two intergers: 3 and 5");
		s.push(3);
		s.push(5);
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
		
		// Remove top item
		System.out.println("\nPop top item");
		s.pop();
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
		
		// Push two more integers
		System.out.println("\nPush two intergers: 9 and -6");
		s.push(9);
		s.push(-6);
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
		
		// Peek top item
		System.out.println("\nTop item on the stack is " + s.peek());
		
		// Pop top two items
		System.out.println("\nPop two items");
		s.pop();
		s.pop();
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
		
		// Push two more integers
		System.out.println("\nPush two intergers: 11 and 99");
		s.push(11);
		s.push(99);
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
		
		// Remove all integers from stack
		System.out.println("\nRemove all integers");
		s.popAll();
		
		System.out.println("Stack is empty = " + s.isEmpty());
		s.display();
	}
}