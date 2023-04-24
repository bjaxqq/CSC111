package Lab;

// TestUnordered List Class
// Mark Hoffman  3/16/14
//
// Tests UnorderedList Class

public class TestUnorderedList{
	
	public static void main (String [] args){
		
		UnorderedList list = new UnorderedList();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
		
		list.display();
		
	
		System.out.println("--------");
		System.out.println("Add 'a' and 'c'");
		
		list.add('a');
		list.add('c');
		
		list.display();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
		
		System.out.println("--------");
		System.out.println("Add 'd' and 'f'");
		
		list.add('d');
		list.add('f');
		
		list.display();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());	
		System.out.println("The item at index 2 is " + list.get(2));
		
		System.out.println("--------");
		System.out.println("Remove 'c'");
		
		list.remove(1);
		
		list.display();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());		
			
		System.out.println("--------");
		System.out.println("Remove 'f'");
		
		list.remove(2);
		
		list.display();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());	
			
		System.out.println("--------");
		System.out.println("Remove All");
			
		list.removeAll();
		
		list.display();
		
		System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());		
	}
}