public class Problem3 {
    public static int evaluateF(int n, int m) {
        if (n > m)
            return evaluateF(n - m, m - 1) + 2;
        else
            return n + m;
    }

    public static void main(String[] args) {
        int result = evaluateF(12, 6);
        System.out.println("f(12, 6) = " + result);
    }
}