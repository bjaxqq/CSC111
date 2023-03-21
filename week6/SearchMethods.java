public class SearchMethods {
    public static int linearSearch(int[] arr, int target) {
        int comparisons = 0;
        System.out.println("index\tvalue\treturn");
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println(i + "\t" + arr[i] + "\t" + i);
                System.out.println("Comparisons = " + comparisons);
                return i;
            }
            System.out.println(i + "\t" + arr[i] + "\t-");
        }
        System.out.println("Not found");
        System.out.println("Comparisons = " + comparisons);
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int comparisons = 0;
        int first = 0;
        int last = arr.length - 1;
        int mid;

        System.out.println("first\tlast\tmid\tvalue\treturn");
        while (first <= last) {
            mid = (first + last) / 2;
            comparisons++;
            if (arr[mid] == target) {
                System.out.println(first + "\t" + last + "\t" + mid + "\t" + arr[mid] + "\t" + mid);
                System.out.println("Comparisons = " + comparisons);
                return mid;
            } else if (arr[mid] < target) {
                System.out.println(first + "\t" + last + "\t" + mid + "\t" + arr[mid] + "\t-");
                first = mid + 1;
            } else {
                System.out.println(first + "\t" + last + "\t" + mid + "\t" + arr[mid] + "\t-");
                last = mid - 1;
            }
        }
        System.out.println("Not found");
        System.out.println("Comparisons = " + comparisons);
        return -1;
    }
}