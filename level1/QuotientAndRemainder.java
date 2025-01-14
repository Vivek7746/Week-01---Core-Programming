import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to calculate the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
		
        // Compute the quotient using the division operator
        int quotient = number / divisor;

        // Compute the remainder using the modulus operator
        int remainder = number % divisor;

        // Return an array containing the quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Taking the number from the user
        System.out.print("Enter the number (dividend): ");
        int number = scanner.nextInt();

        // Taking the divisor from the user
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero
        if (divisor != 0) {
			
            // Call the method to calculate quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient
            System.out.println("The quotient is: " + result[0]);

            // Display the remainder
            System.out.println("The remainder is: " + result[1]);
        } else {
			
            // Handling zero case
            System.out.println("Divisor cannot be zero. Please enter a valid number.");
        }

        // Close the scanner
        scanner.close();
    }
}
