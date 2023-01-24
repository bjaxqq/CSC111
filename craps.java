// This script simulates playing craps a large number of times.
import java.util.Scanner;
public class craps {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times should we play the game? ");
        int numGames = scan.nextInt();

        int wins = 0;
        int losses = 0;

        for (int i = 0; i <= numGames; i++) {
            int playerWins = playGame();
            if (playerWins)
                wins += 1;
            else
                losses += 1;
        }

        System.out.printf("\nThe player won %d out of %d games (%.2f%%)\n",
                            wins, numGames, 100.0*wins/numGames);
        System.out.printf("The house won %d out of %d games (%.2f%%)\n",
                            losses, numGames, 100.00*losses/numGames);
    }
    
    // The playGame function plays a single game of craps. It returns
    // true if the player wins, and false if the house wins.
    public static boolean playGame() {
        int roll = roll2Dice();
        if (roll == 7 || roll == 11)
            return true;
        else if (roll == 2 || roll == 3)
            return false;

        while (true) {
            int point = roll2Dice();
            if(point == 7)
                return false;
            else if (point == roll)
                return true;
        }
    }

    // The roll2Dice function simulates rolling two six-sided dice and
    // returns the sum of the rolls of those dice.
    public static int roll2Dice() {
        int roll1 = 1 + uniformInt(6);
        int roll2 = 1 + uniformInt(6);
        return roll1 + roll2;
    }

    // The uniformInt function creates a random integer.
    public static int uniformInt(int n) {
        return (int) (Math.random()*n);
    }
}