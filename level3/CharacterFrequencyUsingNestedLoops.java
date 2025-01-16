import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        
        // Array to store frequency of each character, initialized to 0
        int[] frequency = new int[characters.length];
        
        // Loop through each character in the text (outer loop)
        for (int i = 0; i < characters.length; i++) {
            // If the character is already counted, continue
            if (characters[i] == '0') {
                continue;
            }
            
            // Initialize the frequency for this character
            frequency[i] = 1;
            
            // Check for duplicates of the current character (inner loop)
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    // Mark the character as counted by setting it to '0'
                    characters[j] = '0';
                }
            }
        }
        
        // Create a result array to store characters and their frequencies
        String[] result = new String[characters.length];
        int index = 0;
        
        // Iterate through the characters and store the character and frequency in the result
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + ": " + frequency[i];
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

        // Find the frequency of characters in the string
        String[] frequencyResult = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("Character Frequency:");
        for (String res : frequencyResult) {
            if (res != null) {
                System.out.println(res);
            }
        }

        scanner.close();
    }
}
