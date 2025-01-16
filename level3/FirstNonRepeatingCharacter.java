import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store frequency of each character (ASCII values from 0 to 255)
        int[] frequency = new int[256];

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment frequency of current character
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;  // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a special character (could be any indication)
        return '-';  // Indicating no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Display the result
        if (result == '-') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
        
        scanner.close();
    }
}
