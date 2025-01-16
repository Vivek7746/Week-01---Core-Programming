import java.util.Scanner;

class StringOutOfBoundsException {

/*--------------This will throw an exception--------------------------------

    // Method to generate the StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
		
        // Try to access an index beyond the length of the string
        // This will generate a StringIndexOutOfBoundsException
        System.out.println(text.charAt(text.length())); 
        // This line will throw StringIndexOutOfBoundsException because index is out of bounds
    }
---------------------------------------------------------------------------*/

    // Method to demonstrate handling the StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
		
        // Start try-catch block to handle the exception
        try {
            // Try to access an index beyond the length of the string
            // This may throw StringIndexOutOfBoundsException
            System.out.println(text.charAt(text.length())); 
            // This line may throw StringIndexOutOfBoundsException
			
        } catch (StringIndexOutOfBoundsException e) {
			
            // Catch the StringIndexOutOfBoundsException and handle it
            System.out.println("Caught a StringIndexOutOfBoundsException");
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
        //System.out.println("Generating StringIndexOutOfBoundsException");
        //generateStringIndexOutOfBoundsException(inputString); 
        // This will throw StringIndexOutOfBoundsException

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling StringIndexOutOfBoundsException");
        handleStringIndexOutOfBoundsException(inputString); 
        // This will catch and handle the exception

    }
}
