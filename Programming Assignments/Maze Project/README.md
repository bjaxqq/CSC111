# Maze Project

Programming Problem 5 in Chapter 6 on pages 322-325. You are to write a program to navigate a rectangular maze from a starting position along the bottom row to an exit along the top row. For this program you will recursively test potential paths, backtracking if a path leads to a dead end.

You will create a class Maze to store the rectangular maze and methods to access it. You do not need to use the class Creature. For this problem the maze is stored as rectangular char array consisting of cells in columns and rows, `maze[ ][ ]`. Cell `maze[0][0]` is the upper-left corner. Columns increase going across each row designated by the number in the first bracket, and rows increase going down each column designated by the number in the second bracket. The cell in the fourth column and on the sixth row is designated `maze[3][5]`. Recall that arrays begin at zero, not one. Each cell is either a wall or is open. One cell along the bottom row is marked as the start cell and one cell along the top row is marked the exit cell.

The maze is stored in a text file formatted as describe in the textbook on page 345-346. Note that the file shows the width (number of columns) followed by the height (number of rows) on the first line. The exit cell and the start cell on the second and third lines, respectively, are shown column first followed by row. You will not be able to create the maze until you have read the first line of the file to determine its size. Before attempting to solve the rest of the problem, read the maze from a text file, mark the start and exit cells and display it. Define constants such as WALL, CLEAR, START, and FINISH of designate the state of each cell.

Find a solution by using the strategy suggested in the text. Write methods that update the state of the maze, such as goNorth(), goWest(), etc., attempting to extend the current path another step in the designated direction. A cell along the current path is marked PATH and cells that have led to a dead end are marked VISITED. The goNorth() method is detailed on page 346-347 of the textbook.

Complete the project in two phases: Read the file, create the maze, mark the start and exit cells, and display the initial maze. Solve the maze, and display the solved maze. You will have lab time in class to work on the first part of the project.

Your grade is based on design (40%), implementation (40%), and structure and readability (20%). Refer to the Programming Project Rubric for more detail. Please note that to receive any portion of the implementation grade the submitted project must compile and run. Your program will be tested on other Maze files with different sizes (columns and rows) and start and finish locations.

If you prefer, you may generate a maze randomly instead of reading it from a text file. You may do both for extra credit. 