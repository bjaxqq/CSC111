public class MagicSquareTester {
    public static void main(String[] args) {
        MagicSquare square = new MagicSquare();

        // Test with different sizes
        int[] sizes = { 3, 5, 7 };
        for (int size : sizes) {
            System.out.println("Testing magic square of size " + size);
            MagicSquare.generateMagicSquare(size);
            System.out.println();
        }
    }
}