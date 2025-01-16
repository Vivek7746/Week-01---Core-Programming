import java.util.Scanner;

class NumberFormat_Exception {

    // Method to generate the NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This will throw a NumberFormatException if the text is not a valid integer
        
		/* This will throw an exception 
		
			System.out.println(Integer.parseInt(text)); 

		*/
    }

    // Method to demonstrate handling the NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // Try to parse the string into an integer
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException and handle it
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the method to generate the exception
        System.out.println("Generating NumberFormatException");
        generateNumberFormatException(inputString); 
        // This will throw NumberFormatException if the input is not a valid number

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling NumberFormatException");
        handleNumberFormatException(inputString); 
        // This will catch and handle the exception
    }
}
