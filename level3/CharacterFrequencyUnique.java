import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find the unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        boolean[] charPresence = new boolean[256]; // Array to track character presence
        int uniqueCount = 0;

        // Count unique characters in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!charPresence[currentChar]) {
                charPresence[currentChar] = true;
                uniqueCount++;
            }
        }

        // Store unique characters in an array
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charPresence[i]) {
                uniqueChars[index] = (char) i;
                index++;
            }
        }
        
        return uniqueChars;
    }

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findCharacterFrequency(String text) {
        // Get the unique characters from the string
        char[] uniqueChars = uniqueCharacters(text);

        // Array to store frequency of characters
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies of unique characters
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + ": " + frequencyResult[i][1]);
        }

        scanner.close();
    }
}
