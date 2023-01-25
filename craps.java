// This script simulates playing craps a large number of times.
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates a scanner that reads the input
        System.out.print("How many times should we play the game? "); // Prints how many times we should play the game
        int numGames = input.nextInt(); // Takes the user input for number of games

        int wins = 0; 
        int losses = 0;

        for (int i = 1; i <= numGames; i++) { // Loop that simulates a craps game until we reach the user input number
            boolean playerWins = playGame();
            if (playerWins) {
                wins++; // Adds wins to the player if conditions are met in the playGame method
            } else {
                losses++; // Adds losses to the player if conditions are not met in the playGame method
            }
        }

        System.out.printf("\nThe player won %d out of %d games (%.2f%%).\n", 
                            wins, numGames, 100.0*wins/numGames);
        System.out.printf("The house won %d out of %d games (%.2f%%).\n",
                            losses, numGames, 100.0*losses/numGames); // Prints the number and percentage of house wins
    }

    // The playGame method plays a single game of craps. It returns true if the player wins, and false if the house wins.
    public static boolean playGame() {
        int roll = roll2Dice(); // Pulls from the roll2Dice method to get working dice

        if (roll == 7 || roll == 11) {
            return true; // Player wins if dice roll is a 7 or an 11
        } else if (roll == 2 || roll == 3 || roll == 12) {
            return false; // Player loses if dice roll is a 2, a 3, or a 12
        } else {
            int point = roll;
            do {
                roll = roll2Dice(); // Game continues if neither conditions are met 
            } while (roll != 7 && roll != point);

            return (roll == point);
        }
    }

    // The roll2Dice method simulates rolling two six-sided dice and returns the sum of the rolls of those dice.
    public static int roll2Dice() {
        int roll1 = (int)(6*Math.random()) + 1;
        int roll2 = (int)(6*Math.random()) + 1;
        return roll1 + roll2;
    }
}