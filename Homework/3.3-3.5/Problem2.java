public class Problem2 {
    public static int evaluateH(int n) {
        if (n > 5)
            return evaluateH(n - 7) + 1;
        else if (n >= 0 && n <= 5)
            return n;
        else
            return evaluateH(n + 3);
    }

    public static void main(String[] args) {
        int result = evaluateH(13);
        System.out.println("h(13) = " + result);
    }
}