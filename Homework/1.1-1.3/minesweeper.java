package Homework;

/*
* Description: This program creates and prints a Minesweeper game board.
* The user is prompted for the height and width of the board,
* as well as the number of mines. The program is written in a
* more imperative programming style in scala.
*
* To Compile: N/A
* To Run: scala Minesweeper_imperative.scala
*/
// The import is necessary because readInt (and the other read functions) have been
// moved to the scala.io.StdIn library in scala 2.11 (and this code was developed using
// scala 2.11). If you run this code with an earlier version of scala you should comment
// out this line.
import java.util.Scanner;

// Three type aliases to clean up the code.

// A Row is an Array of Char
public class Minesweeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the width of the minefield: ");
        int width = input.nextInt();
        System.out.println("Enter the height of the minefield: ");
        int height = input.nextInt();
        System.out.println("Enter the number of mines in the minefield: ");
        int num = input.nextInt();
        // Create the minefield using the ofDim of the Array class
        // Note that the minefield is created with a buffer around the edges to simply calculations
        char[][] minefield = new char[height+2][width+2];
        // Populate the minefield using nested loops
        int i = 0;                   // Loop counter for number of mines placed in the field
        while (i < num) {
             // Create variables for randomely generated rows and columns in outer scope
            int row = 0;
            int col = 0;
            // do/while to generate random locations for mines until a novel one is found
            do {
                // Generate the random positions inside the buffer
                row = (int)(Math.random() * height + 1);
                col = (int)(Math.random() * width + 1);
            } while (minefield[row][col] == '*');
            minefield[row][col] = '*'; // Set found location to the mine character
            i++;                       // Increment mine counter
        }
        // Start row/col at 1 because of buffer
        for (int row = 1; row < height + 1; row++) {
            for (int col = 1; col < width + 1; col++) {
                if (minefield[row][col] != '*') {
                    // Check the surrounding positions and count the number of mines there
                    int n = 0;
                    for (int r = -1; r <= 1; r++) {
                        for (int c = -1; c <= 1; c++) {
                            n += (minefield[row+r][col+c] == '*') ? 1 : 0;

                        }
                    }
                    // Stick a number in to the field
                    minefield[row][col] = (char)('0' + n);
                }
                // Print the minefield as it is created
                System.out.print(minefield[row][col]);
                if (col == width) {
                    System.out.println();
                } else {
                    System.out.print(' ');
                }
            }
        }
    }
}