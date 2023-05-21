public class MagicSquare {
    public static void generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position of 1
        int row = n / 2;
        int col = n - 1;

        // Fill the magic square
        for (int num = 1; num <= n * n;) {
            if (row == -1 && col == n) {
                row = 0;
                col = n - 2;
            } else {
                if (col == n)
                    col = 0;
                if (row < 0)
                    row = n - 1;
            }
            if (magicSquare[row][col] != 0) {
                row++;
                col -= 2;
                continue;
            } else
                magicSquare[row][col] = num++;
            row--;
            col++;
        }

        // Print the magic square
        System.out.println("Magic Square Of Size " + n + ":");
        System.out.println("--------------------");
        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = 0; index2 < n; index2++)
                System.out.print(magicSquare[index1][index2] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3; // Change this to the desired size of the magic square
        generateMagicSquare(size);
    }
}