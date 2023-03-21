public class TestSearchMethods {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 19, 32, 43, 59, 60, 78, 99};
        System.out.println("\nTest Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        
        int target = 43;
        System.out.println("Linear search for " + target);
        SearchMethods.linearSearch(arr, target);
        System.out.println();
        
        target = 80;
        System.out.println("Linear search for " + target);
        SearchMethods.linearSearch(arr, target);
        System.out.println();
        
        target = 9;
        System.out.println("Binary search for " + target);
        SearchMethods.binarySearch(arr, target);
        System.out.println();
        
        target = 80;
        System.out.println("Binary search for " + target);
        SearchMethods.binarySearch(arr, target);
        System.out.println();
    }
}
