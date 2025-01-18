import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1, high = 100, guess;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!guessedCorrectly) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            String feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("Yay! I guessed it!");
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        }

        scanner.close();
    }
}
