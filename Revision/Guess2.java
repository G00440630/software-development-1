import java.util.Scanner;
import java.util.Random;

public class Guess2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(10) + 1; // Random number between 1-10
        boolean playAgain = true;

        while (playAgain) {
            int guess;
            int attempts = 0;
            
            System.out.println("Guess the number:");
            
            do {
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                }
            } while (guess != targetNumber);
            
            System.out.println("Good guess. It is " + targetNumber + ". It took you " + attempts + " attempts to guess the number.");

            // Ask if the user wants to play again
            System.out.print("Play again (y/n)? ");
            char response = scanner.next().charAt(0);

            if (response == 'y' || response == 'Y') {
                // Modify the number to guess (increase or decrease)
                targetNumber += (random.nextBoolean() ? 1 : -1);
                System.out.println("New number has been set.");
            } else {
                playAgain = false;
                System.out.println("Game Over");
            }
        }

        scanner.close();
    }
}
