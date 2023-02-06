// Creates PresidentTest class
public class PresidentTest {
    // Creates main method
    public static void main(String[] args) {
        // Create President class #1 with name, age, and political party
        President p1 = new President("John F. Kennedy", 43, "Democrat");
        // Create President class #1 with name, age, and political party        
        President p2 = new President("Ronald Reagan", 69, "Republican");

        // Prints information about President 1
        System.out.println("President 1: ");
        // Calls the bio method from President class
        System.out.println(p1.bio());
        // Calls the ageStatus method from President class
        System.out.println("Age Status: " + p1.ageStatus());
        System.out.println();

        // Prints information about President 2
        System.out.println("President 2: ");
        // Calls the bio method from President class
        System.out.println(p2.bio());
        // Calls the ageStatus method from President class
        System.out.println("Age Status: " + p2.ageStatus());
    }
}
