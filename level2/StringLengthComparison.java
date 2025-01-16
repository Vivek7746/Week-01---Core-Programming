import java.util.Scanner;

class StringLengthComparison {

    // Method to find and return the length of a string without using the length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;

        // Use an infinite loop to count characters using charAt() until an exception is thrown
        try {
            while (true) {
                text.charAt(count);  // Access each character by index
                count++;  // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when the index exceeds the string length
        }

        return count;  // Return the final count
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the string input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.next();

        // Find the length using the user-defined method
        int lengthWithoutBuiltIn = findLengthWithoutBuiltIn(inputText);

        // Find the length using the built-in length() method
        int lengthWithBuiltIn = inputText.length();

        // Display the results
        System.out.println("\nLength using user-defined method: " + lengthWithoutBuiltIn);
        System.out.println("Length using built-in length() method: " + lengthWithBuiltIn);
	}
}
