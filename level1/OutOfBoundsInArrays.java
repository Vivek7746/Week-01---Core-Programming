import java.util.Scanner;

class OutOfBoundsInArrays {

    // Method to generate the ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Try to access an index that is out of bounds (e.g., larger than the array length)
        /*
			System.out.println(names[5]); 
		*/ 
		// This will throw ArrayIndexOutOfBoundsException if the array has fewer than 6 elements
    }

    // Method to demonstrate handling the ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Try to access an index that is out of bounds (e.g., larger than the array length)
            System.out.println(names[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
			
            // Catch the ArrayIndexOutOfBoundsException and handle it
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
			
            // Catch any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking the number of names from the user
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();

        // Create an array to hold the names
        String[] names = new String[numNames];

        // Taking user input for the names
        System.out.println("Enter the names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = scanner.next();
        }

        // Call the method to generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException");
        generateArrayIndexOutOfBoundsException(names); 
        // This will throw ArrayIndexOutOfBoundsException if the array length is smaller than 6

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling ArrayIndexOutOfBoundsException");
        handleArrayIndexOutOfBoundsException(names); 
        // This will catch and handle the exception
    }
}
