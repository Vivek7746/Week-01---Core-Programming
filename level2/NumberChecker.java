import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0; 
    }

    // Method to check if a positive number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers and return 1, 0, or -1
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input for the 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Check if the number is positive or negative
            if (isPositive(numbers[i])) {
                System.out.println("Number " + (i + 1) + " is Positive.");
                // If positive, check if it's even or odd
                if (isEven(numbers[i])) {
                    System.out.println("Number " + (i + 1) + " is Even.");
                } else {
                    System.out.println("Number " + (i + 1) + " is Odd.");
                }
            } else {
                System.out.println("Number " + (i + 1) + " is Negative.");
            }
        }

        // Compare the first and last numbers in the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        // Close the scanner
        scanner.close();
    }
}
