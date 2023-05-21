package week8;

import java.util.Arrays;

public class TestSortMethods {
    
    public static void main(String[] args) {
        
        // Exercise 2: Test selectionSort method
        int[] array = SortMethods.randomIntArray(10, 100);
        System.out.println("Original array:");
        SortMethods.printArray(array);
        SortMethods.selectionSort(array);
        System.out.println("Sorted array:");
        SortMethods.printArray(array);
        
        // Exercise 3: Test selectionSortComparisons method
        array = SortMethods.randomIntArray(10, 100);
        int[] copy = SortMethods.copyArray(array);
        int comparisons = SortMethods.selectionSortComparisons(copy);
        System.out.println("Number of comparisons: " + comparisons);
        
        // Exercise 4: Report number of comparisons for various array sizes
        int[] sizes = {50, 100, 250, 500, 750, 1000};
        int[] comparisonsArray = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            array = SortMethods.randomIntArray(sizes[i], 100);
            copy = SortMethods.copyArray(array);
            comparisons = SortMethods.selectionSortComparisons(copy);
            comparisonsArray[i] = comparisons;
            System.out.println("Array size: " + sizes[i] + ", comparisons: " + comparisons);
        }
        System.out.println("Comparisons array: " + Arrays.toString(comparisonsArray));   
    }   
}