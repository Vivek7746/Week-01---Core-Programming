import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate the length of the string without using the String length() method
    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);  // Try to access each character until we hit the end
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when we reach the end of the string
        }
        return length;
    }

    // Method to find unique characters in the string
    public static char[] findUniqueCharacters(String text) {
        // Get the length of the string using the custom method
        int length = getStringLength(text);
        
        // Array to store unique characters
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        
        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to compare current character with previous ones
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false; // Character already exists
                    break;
                }
            }

            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        // Create a new array with exact size for unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Display the result
        displayUniqueCharacters(uniqueChars);
        
        scanner.close();
    }
}
