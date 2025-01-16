import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
			// Append each character from start to end index
            substring.append(text.charAt(i)); 
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
			// Strings are not equal if lengths differ
            return false; 
        }
		
		// Checking each index's character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        // Taking user input for start and end indexes
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using charAt()
        String substringUsingCharAt = createSubstring(mainString, startIndex, endIndex);

        // Create substring using built-in substring() method
        String substringUsingBuiltIn = mainString.substring(startIndex, endIndex+1);

        // Compare the two substrings
        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);
    }
}
