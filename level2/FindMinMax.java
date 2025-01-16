import java.util.Scanner;

class FindMinMax {

    // Method to split the text into words without using the split() method
    public static String[] splitTextWithoutBuiltIn(String text) {
        int wordCount = 1;

        // Count the number of words based on spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        // Extract words using spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1 && text.charAt(i) != ' ') {
                    i++; // Include the last character if it's not a space
                }
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        return words;
    }

    // Method to find the length of a string without using the length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;

        // Count characters until an exception occurs
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }

        return count;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];

        // Populate the 2D array with words and their lengths
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutBuiltIn(words[i]));
        }

        return result;
    }

    // Method to find the shortest and longest words from a 2D array
    public static String[] findShortestAndLongest(String[][] wordsAndLengths) {
        String shortestWord = wordsAndLengths[0][0];
        String longestWord = wordsAndLengths[0][0];
        int shortestLength = Integer.parseInt(wordsAndLengths[0][1]);
        int longestLength = Integer.parseInt(wordsAndLengths[0][1]);

        // Compare lengths to find the shortest and longest words
        for (int i = 1; i < wordsAndLengths.length; i++) {
            int length = Integer.parseInt(wordsAndLengths[i][1]);

            if (length < shortestLength) {
                shortestWord = wordsAndLengths[i][0];
                shortestLength = length;
            }

            if (length > longestLength) {
                longestWord = wordsAndLengths[i][0];
                longestLength = length;
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the complete text input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitTextWithoutBuiltIn(inputText);

        // Get the 2D array with words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsAndLengths);

        // Display the results
        System.out.println("\nWords and their lengths:");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println("Word: " + wordAndLength[0] + ", Length: " + wordAndLength[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

    }
}
