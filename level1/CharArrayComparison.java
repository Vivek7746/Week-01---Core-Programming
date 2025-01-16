import java.util.Scanner;

public class CharArrayComparison {

    // Method to return characters from a string without using toCharArray()
    public static char[] getCharsWithoutToCharArray(String text) {
        // Create an array to hold the characters
        char[] result = new char[text.length()];
        
        // Populate the array with characters from the string
        for (int i = 0; i < text.length(); i++) {
            // Adding each character to the array
            result[i] = text.charAt(i);
        }
        
        // Return the populated character array
        return result;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // Check if the lengths of the arrays are the same
        if (array1.length != array2.length) {
            // Return false if lengths are different
            return false;
        }
        
        // Compare each character in both arrays
        for (int i = 0; i < array1.length; i++) {
            // Return false if any characters do not match
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        // Return true if all characters match
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Getting characters using user-defined method
        char[] userDefinedCharArray = getCharsWithoutToCharArray(inputString);

        // Getting characters using built-in toCharArray() method
        char[] builtInCharArray = inputString.toCharArray();

        // Comparing the two character arrays
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);

        // Displaying the results for user-defined array
        System.out.println("Character array using user-defined method: ");
        for (char c : userDefinedCharArray) {
            // Print characters from user-defined array
            System.out.print(c + " ");
        }
        System.out.println();

        // Displaying the results for built-in array
        System.out.println("Character array using built-in toCharArray() method: ");
        for (char c : builtInCharArray) {
            // Print characters from built-in array
            System.out.print(c + " ");
        }
        System.out.println();

        // Display if arrays are equal
        System.out.println("Are the two character arrays equal? " + areArraysEqual);

    }
}
