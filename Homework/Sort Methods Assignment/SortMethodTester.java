import java.util.Arrays;
import java.util.Random;

public class SortMethodTester {
    public static void main(String[] args) {
        int[] arraySizes = { 2000, 4000, 6000, 8000, 10000 };
        int numRuns = 3;

        System.out.println("Array Size\tSelection Sort\tBubble Sort\tMerge Sort");

        for (int size : arraySizes) {
            long selectionSortComparisons = 0;
            long bubbleSortComparisons = 0;
            long mergeSortComparisons = 0;

            for (int run = 0; run < numRuns; run++) {
                int[] arr = generateRandomArray(size);

                int[] arrCopy1 = Arrays.copyOf(arr, arr.length);
                selectionSortComparisons += SortMethod.selectionSort(arrCopy1);

                int[] arrCopy2 = Arrays.copyOf(arr, arr.length);
                bubbleSortComparisons += SortMethod.bubbleSort(arrCopy2);

                int[] arrCopy3 = Arrays.copyOf(arr, arr.length);
                mergeSortComparisons += SortMethod.mergeSort(arrCopy3);
            }

            long selectionSortAverage = selectionSortComparisons / numRuns;
            long bubbleSortAverage = bubbleSortComparisons / numRuns;
            long mergeSortAverage = mergeSortComparisons / numRuns;

            System.out.println(
                    size + "\t\t" + selectionSortAverage + "\t\t" + bubbleSortAverage + "\t\t" + mergeSortAverage);
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }

        return arr;
    }
}