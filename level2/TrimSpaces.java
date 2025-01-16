import java.util.Scanner;

class TrimSpaces {

    // Method to find the start and end points without leading and trailing spaces
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end points as an array
        return new int[]{start, end};
    }

    // Method to create a substring from a string using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        // Append characters between start and end indexes
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the string input from the user
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Call the method to find the trim points
        int[] trimPoints = findTrimPoints(inputText);

        // If the string is entirely spaces, set start and end to -1
        if (trimPoints[0] > trimPoints[1]) {
            trimPoints[0] = -1;
            trimPoints[1] = -1;
        }

        // Get the trimmed string using user-defined methods
        String trimmedUsingCharAt = (trimPoints[0] == -1) ? "" : createSubstring(inputText, trimPoints[0], trimPoints[1]);

        // Get the trimmed string using the built-in trim() method
        String trimmedUsingTrim = inputText.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedUsingCharAt, trimmedUsingTrim);

        // Display the results
        System.out.println("String after trimming (using charAt()): \"" + trimmedUsingCharAt + "\"");
        System.out.println("String after trimming (using trim()): \"" + trimmedUsingTrim + "\"");
        System.out.println("Are the two results equal? " + (areEqual ? "Yes" : "No"));
	}
}
