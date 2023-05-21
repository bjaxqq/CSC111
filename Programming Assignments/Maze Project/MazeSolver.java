import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeSolver {
    private static final char WALL = '#';
    private static final char START = 'S';
    private static final char FINISH = 'F';
    private static final char PATH = '*';
    private static final char VISITED = '-';

    private static char[][] maze;
    private static int startRow, startCol;
    private static int exitRow, exitCol;

    public static void main(String[] args) {
        maze = new char[5][5];
        readMazeFromFile("MazeTemplate.txt");
        boolean solved = solveMaze(startRow, startCol);
        if (solved) {
            displayMaze();
        } else {
            System.out.println("Maze has no solution.");
        }
    }

    private static void readMazeFromFile(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));

            int numCols = input.nextInt();
            int numRows = input.nextInt();

            if (numCols != maze[0].length || numRows != maze.length) {
                System.out.println("Error: Maze dimensions do not match.");
                input.close();
                return;
            }

            maze = new char[numRows][numCols];

            exitCol = input.nextInt();
            exitRow = input.nextInt();
            startCol = input.nextInt();
            startRow = input.nextInt();

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (input.hasNext()) {
                        maze[row][col] = input.next().charAt(0);
                    } else {
                        System.out.println("Error: Maze file is incomplete.");
                        input.close();
                        return;
                    }
                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    private static boolean solveMaze(int row, int col) {
        // Check if the current position is the finish
        if (row == exitRow && col == exitCol) {
            return true;
        }

        // Check if the current position is a wall or has been visited before
        if (maze[row][col] == WALL || maze[row][col] == VISITED) {
            return false;
        }

        // Mark the current position as visited
        maze[row][col] = VISITED;

        // Check if the adjacent positions have a solution
        if (solveMaze(row - 1, col) || // Check North
                solveMaze(row + 1, col) || // Check South
                solveMaze(row, col - 1) || // Check West
                solveMaze(row, col + 1)) { // Check East

            // Mark the current position as part of the path
            maze[row][col] = PATH;
            return true;
        }

        return false;
    }

    private static void displayMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                if (row == startRow && col == startCol) {
                    System.out.print(START);
                } else if (row == exitRow && col == exitCol) {
                    System.out.print(FINISH);
                } else {
                    System.out.print(maze[row][col]);
                }
            }
            System.out.println();
        }
    }
}