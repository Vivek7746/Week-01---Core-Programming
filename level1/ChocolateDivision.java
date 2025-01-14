import java.util.Scanner;

public class ChocolateDivision {

    // Method to calculate the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
		
        // Calculate the quotient (chocolates each child gets)
        int quotient = number / divisor;

        // Calculate the remainder (remaining chocolates)
        int remainder = number % divisor;

        // Return an array containing the quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Taking the total number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Taking the total number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is not zero
        if (numberOfChildren != 0) {
			
            // Call the method to calculate the quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the number of chocolates each child will get
            System.out.println("Each child will get: " + result[0] + " chocolates");

            // Display the number of remaining chocolates
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
			
            // Handling zero case
            System.out.println("Number of children cannot be zero. Please enter a valid number.");
        }

        // Close the scanner
        scanner.close();
    }
}
