import java.util.Arrays;

public class SortMethod {
    // Selection Sort
    public static int selectionSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int index1 = 0; index1 < n - 1; index1++) {
            int minIndex = index1;

            for (int index2 = index1 + 1; index2 < n; index2++) {
                if (arr[index2] < arr[minIndex]) {
                    minIndex = index2;
                }
                comparisons++;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[index1];
            arr[index1] = temp;
        }

        return comparisons;
    }

    // Bubble Sort
    public static int bubbleSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int index1 = 0; index1 < n - 1; index1++) {
            for (int index2 = 0; index2 < n - index1 - 1; index2++) {
                if (arr[index2] > arr[index2 + 1]) {
                    int temp = arr[index2];
                    arr[index2] = arr[index2 + 1];
                    arr[index2 + 1] = temp;
                }
                comparisons++;
            }
        }

        return comparisons;
    }

    // Merge Sort
    public static int mergeSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            comparisons += mergeSort(left);
            comparisons += mergeSort(right);
            comparisons += merge(arr, left, right);
        }

        return comparisons;
    }

    private static int merge(int[] arr, int[] left, int[] right) {
        int comparisons = 0;
        int index1 = 0, index2 = 0, index3 = 0;

        while (index1 < left.length && index2 < right.length) {
            if (left[index1] <= right[index2]) {
                arr[index3] = left[index1];
                index1++;
            } else {
                arr[index3] = right[index2];
                index2++;
            }
            index3++;
            comparisons++;
        }

        while (index1 < left.length) {
            arr[index3] = left[index1];
            index1++;
            index3++;
        }

        while (index2 < right.length) {
            arr[index3] = right[index2];
            index2++;
            index3++;
        }

        return comparisons;
    }
}