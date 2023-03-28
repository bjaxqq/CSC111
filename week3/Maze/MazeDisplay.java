import java.io.File;
import java.io.FileNotFoundException;

public class MazeDisplay {
    public static void main(String[] args) {
        try {
            MazeSolver maze = MazeSolver.loadMazeFromFile("maze.txt");
            maze.display(); // changed from MazeSolver.display()
            System.out.println("Solving maze...");
            maze.solve(); // changed from MazeSolver.solve()
            maze.display(); // changed from MazeSolver.display()
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}