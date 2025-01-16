import java.util.*;
class NullPointerExceptionn {

/* --------------This will throw Null Pointer Exception-------------------

    // Method to generate the NullPointerException
    public static void generateNullPointerException() {
        // Initialize the variable 'text' to null
        String text = null;

        // Try to call a method on the null variable
        // This will generate a NullPointerException
        System.out.println(text.length()); 
        // This line will throw NullPointerException
    }
-------------------------------------------------------------------------*/

    // Method to demonstrate handling the NullPointerException
    public static void handleNullPointerException() {
        // Initialize the variable 'text' to null
        String text = null;

        // Start of try-catch block to handle exception
        try {
            // Try to call a method on the null variable
            // This may throw NullPointerException
            System.out.println(text.length()); 
			
        } catch (NullPointerException e) {
            // Catch the NullPointerException and handle it
            System.out.println("Caught a NullPointerException");
            // Print the exception message
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        //System.out.println("Generating NullPointerException...");
		// This will throw NullPointerException
        //generateNullPointerException(); 

        // Refactor the code to handle the exception using try-catch
        System.out.println("\nHandling NullPointerException");
		// This will catch and handle the exception
        handleNullPointerException(); 
        
    }
}
