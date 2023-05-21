import java.util.ArrayList;
import java.util.List;

public class Problem4 {

    // Section 7.3 - Activity 1: Recursive Sum of Array
    public static int recursiveSum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        else
            return recursiveSum(arr, n - 1) + arr[n - 1];
    }

    // Section 7.3 - Activity 2: Recursive Maximum in Array
    public static int recursiveMax(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else
            return Math.max(arr[n - 1], recursiveMax(arr, n - 1));
    }

    // Section 7.3 - Activity 3: Recursive Binary Search
    public static int recursiveBinarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return recursiveBinarySearch(arr, low, mid - 1, target);
        else
            return recursiveBinarySearch(arr, mid + 1, high, target);
    }

    // Section 7.5 - Activity 1: Recursive Permutations
    public static List<String> recursivePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        recursivePermutationsHelper("", str, permutations);
        return permutations;
    }

    private static void recursivePermutationsHelper(String prefix, String remaining, List<String> permutations) {
        if (remaining.length() == 0)
            permutations.add(prefix);
        else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                recursivePermutationsHelper(newPrefix, newRemaining, permutations);
            }
        }
    }

    // Section 7.5 - Activity 2: Recursive Power
    public static double recursivePower(double base, int exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent < 0)
            return 1 / recursivePower(base, -exponent);
        else {
            double halfPower = recursivePower(base, exponent / 2);
            if (exponent % 2 == 0)
                return halfPower * halfPower;
            else
                return base * halfPower * halfPower;
        }
    }

    // Section 7.6 - Activity 1: Recursive Factorial
    public static int recursiveFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * recursiveFactorial(n - 1);
    }

    // Section 7.6 - Activity 2: Recursive Fibonacci
    public static int recursiveFibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Test cases for the implemented recursive activities
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array elements: " + recursiveSum(arr, arr.length));
        System.out.println("Maximum element in the array: " + recursiveMax(arr, arr.length));

        int target = 3;
        int index = recursiveBinarySearch(arr, 0, arr.length - 1, target);
        if (index != -1)
            System.out.println("Element " + target + " found at index " + index);
        else
            System.out.println("Element " + target + " not found in the array");

        String str = "abc";
        List<String> permutations = recursivePermutations(str);
        System.out.println("Permutations of " + str + ": " + permutations);

        double base = 2;
        int exponent = 5;
        double power = recursivePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + power);

        int factorialNum = 5;
        int factorial = recursiveFactorial(factorialNum);
        System.out.println("Factorial of " + factorialNum + ": " + factorial);

        int fibonacciNum = 7;
        int fibonacci = recursiveFibonacci(fibonacciNum);
        System.out.println("Fibonacci number at position " + fibonacciNum + ": " + fibonacci);
    }
}