import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: when n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of n = n + sum of (n-1)
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        // Using the formula n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Taking the number from the user in integer
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
            scanner.close();
            return;  // Exit if the input is not a natural number
        }

        // Calculating the sum using recursion
        int sumByRecursion = sumUsingRecursion(number);

        // Calculating the sum using the formula
        int sumByFormula = sumUsingFormula(number);

        // Comparing the results from both methods and displaying them
        System.out.println("Sum using recursion: " + sumByRecursion);
        System.out.println("Sum using formula: " + sumByFormula);

        // Checking if both methods give the same result
        if (sumByRecursion == sumByFormula) {
            System.out.println("Both methods give the correct and same result.");
        } else {
            System.out.println("The results do not match! Something went wrong.");
        }

        // Closing the scanner
        scanner.close();
    }
}
