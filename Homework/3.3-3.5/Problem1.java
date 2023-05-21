public class Problem1 {
    public static int evaluateG(int n) {
        if (n > 0)
            return evaluateG(n - 3) + 1;
        else
            return 3 * n;
    }

    public static void main(String[] args) {
        int result = evaluateG(11);
        System.out.println("g(11) = " + result);
    }
}