import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeSolver {
    public static final char WALL = '#';
    public static final char CLEAR = '.';
    public static final char START = 'S';
    public static final char FINISH = 'F';
    public static final char PATH = '+';
    public static final char VISITED = '-';
    
    private char[][] maze;
    private int startRow;
    private int startCol;
    public MazeSolver(char[][] maze, int startRow, int startCol, int finishRow, int finishCol) {
        this.maze = maze;
        this.startRow = startRow;
        this.startCol = startCol;
    }
    
    public void display() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
    }
    
    public boolean solve(int row, int col) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false; // out of bounds
        } else if (maze[row][col] == WALL || maze[row][col] == PATH || maze[row][col] == VISITED) {
            return false; // wall, visited or part of path already
        } else if (maze[row][col] == FINISH) {
            return true; // reached the finish
        } else {
            // mark cell as part of path and try to extend in all directions
            maze[row][col] = PATH;
            if (solve(row - 1, col)) { // go north
                return true;
            } else if (solve(row, col + 1)) { // go east
                return true;
            } else if (solve(row + 1, col)) { // go south
                return true;
            } else if (solve(row, col - 1)) { // go west
                return true;
            } else {
                // mark cell as visited (dead end)
                maze[row][col] = VISITED;
                return false;
            }
        }
    }
    
    public void solve() {
        solve(startRow, startCol);
    }
    
    public static MazeSolver loadMazeFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MazeTemplate.txt"));
        int numCols = scanner.nextInt();
        int numRows = scanner.nextInt();
        scanner.nextLine(); // skip rest of first line
        int finishCol = scanner.nextInt();
        int finishRow = scanner.nextInt();
        scanner.nextLine(); // skip rest of second line
        int startCol = scanner.nextInt();
        int startRow = scanner.nextInt();
        scanner.nextLine(); // skip rest of third line
        char[][] maze = new char[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < numCols; col++) {
                maze[row][col] = line.charAt(col);
            }
        }
        scanner.close();
        return new MazeSolver (maze, startRow, startCol, finishRow, finishCol);
    }
}