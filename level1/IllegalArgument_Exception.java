import java.util.Scanner;

class IllegalArgument_Exception{

    // Method to generate the IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
		
        // Try to use substring with invalid indices
        // The start index is greater than the end index
        // *** This will throw an error
		/*
			System.out.println(text.substring(5, 2));
		*/
        // This will throw IllegalArgumentException due to invalid indices
    }

    // Method to demonstrate handling the IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
		
        try {
            // Try to use substring with invalid indices
            // This may throw IllegalArgumentException
            System.out.println(text.substring(5, 2)); 
			
        } catch (IllegalArgumentException e) {
			
            // Catch the IllegalArgumentException and handle it
            System.out.println("Caught an IllegalArgumentException");
            // Print the exception message
        } catch (RuntimeException e) {
			
            // Catch any other runtime exceptions and handle them
            System.out.println("Caught a RuntimeException: " + e.getMessage());
            // Print the exception message
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the method to generate the exception
        System.out.println("Generating IllegalArgumentException...");
        generateIllegalArgumentException(inputString); 
        // This will throw IllegalArgumentException

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling IllegalArgumentException...");
        handleIllegalArgumentException(inputString); 
        // This will catch and handle the exception

    }
}
