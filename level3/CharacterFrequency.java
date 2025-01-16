import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Array to store frequency of each character (ASCII values from 0 to 255)
        int[] frequency = new int[256];

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment frequency of current character
        }

        // Count how many unique characters are present in the string
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the character and its frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop through the frequency array and store the characters with their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Character
                result[index][1] = String.valueOf(frequency[i]);  // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequency
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + ": " + frequencyResult[i][1]);
        }

        scanner.close();
    }
}
