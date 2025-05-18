package Q_06;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("I'm thinking a number between 1 and 100. can u guess it? ");

        while (guess != targetNumber) {
            System.out.print("Enter you guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Lower");
            } else if (guess > targetNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }
        scanner.close();
    }
}
