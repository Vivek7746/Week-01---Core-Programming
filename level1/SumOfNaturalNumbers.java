import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a variable and taking it as an input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
		
		// Handling in case n is 0
        if (n > 0) {
            // Call the method and display the result
			// Calling the method
            int result = findSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive integer greater than 0");
        }

        scanner.close();
    }
}