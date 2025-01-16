import java.util.Scanner;

class VowelConsonantFinder {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert the character to lowercase
        char lowerChar = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;

        // Check if the character is a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelConsonantDetails(String text) {
        // Create a 2D array to store the character and its type
        String[][] result = new String[text.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Store the character and its type
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }

        // Return the 2D array
        return result;
    }

    // Method to display the 2D array in a simple format
    public static void displayCharacterDetails(String[][] details) {
        // Loop through the array and print each character and its type
        for (String[] row : details) {
            System.out.println("Character: " + row[0] + " - Type: " + row[1]);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the string input from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Call the method to find vowel and consonant details
        String[][] characterDetails = findVowelConsonantDetails(inputText);

        // Display the result in a simple format
        displayCharacterDetails(characterDetails);

        // Close the scanner resource
        scanner.close();
    }
}
