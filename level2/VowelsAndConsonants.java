import java.util.Scanner;

class VowelsAndConsonants {

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
    public static int[] findVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is a vowel or consonant
            String result = checkCharacterType(currentChar);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the string input from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Call the method to find vowels and consonants
        int[] counts = findVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
	}
}
