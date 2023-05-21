public class Question13 {
    private int real;
    private int imaginary;

    public Question13(int r, int i) {
        real = r;
        imaginary = i;
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // a.
        Question13 c1 = new Question13(3, 2);
        System.out.println("c1: " + c1); // 3 + 2i

        // b.
        Question13 c2 = new Question13(4, -5);
        System.out.println("c2: " + c2); // 4 + -5i
    }
}