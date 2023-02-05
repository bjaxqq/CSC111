public class PresidentTest {
    public static void main(String[] args) {
        President p1 = new President("John F. Kennedy", 43, "Democrat");
        President p2 = new President("Ronald Reagan", 69, "Republican");

        System.out.println("President 1: ");
        System.out.println(p1.bio());
        System.out.println("Age Status: " + p1.ageStatus());
        System.out.println();

        System.out.println("President 2: ");
        System.out.println(p2.bio());
        System.out.println("Age Status: " + p2.ageStatus());
    }
}