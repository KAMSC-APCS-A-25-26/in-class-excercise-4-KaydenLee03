import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int correctNum = random.nextInt(100);
        int guess;


        System.out.println("Welcome to the Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.");

        do {
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();
            if (guess < correctNum) {
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("Too high! Try again");
            }
        } while (guess != correctNum);
        System.out.println("You got it!");
    }
}
