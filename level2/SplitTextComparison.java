import java.util.Scanner;

class SplitTextComparison {

    // Method to split the text into words without using the split() method
    public static String[] splitTextWithoutBuiltIn(String text) {
        // Count the number of words
        int wordCount = 1; // Start with 1 because there's at least one word
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++; // Increment word count for each space
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int start = 0; // Start index of the word
        int wordIndex = 0; // Index to insert words into the array

        // Loop through the text and extract words based on space positions
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                // Handle the case where the word ends with the last character
                if (i == text.length() - 1 && text.charAt(i) != ' ') {
                    i++; // Include the last character if it's not a space
                }
                words[wordIndex] = text.substring(start, i); // Extract the word
                wordIndex++; // Move to the next word
                start = i + 1; // Set the start index for the next word
            }
        }

        return words;
    }

    // Method to compare two String arrays and return true if they are equal
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays are not equal if lengths are different
        }

        // Compare each word in the two arrays
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; // Return false if any word is different
            }
        }

        return true; // Return true if both arrays are equal
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the complete text input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Split the text using the user-defined method
        String[] wordsWithoutBuiltIn = splitTextWithoutBuiltIn(inputText);

        // Split the text using the built-in split() method
        String[] wordsWithBuiltIn = inputText.split(" ");

        // Compare the two arrays
        boolean areArraysEqual = compareStringArrays(wordsWithoutBuiltIn, wordsWithBuiltIn);

        // Display the results
        System.out.println("\nWords using user-defined method:");
        for (String word : wordsWithoutBuiltIn) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : wordsWithBuiltIn) {
            System.out.println(word);
        }

        System.out.println("\nDo both methods produce the same result? " + areArraysEqual);
    }
}
