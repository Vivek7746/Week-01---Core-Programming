import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two strings are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        // Create frequency arrays for both strings (assuming ASCII characters)
        int[] frequency1 = new int[256];  // ASCII range
        int[] frequency2 = new int[256];

        // Count the frequency of each character in both strings
        for (int i = 0; i < text1.length(); i++) {
            frequency1[charArray1[i]]++;
            frequency2[charArray2[i]]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  // If frequencies don't match, not anagrams
            }
        }

        // If all frequencies match, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
