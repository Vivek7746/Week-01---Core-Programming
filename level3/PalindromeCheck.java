import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end of the string
    public static boolean isPalindromeByComparing(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from start and end of the string
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true;  // If all characters matched, it's a palindrome
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursively(String text, int start, int end) {
        if (start >= end) {
            return true;  // Base case: start index is greater than or equal to end index
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;  // If characters at start and end don't match
        }
        return isPalindromeRecursively(text, start + 1, end - 1);  // Recursive call
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();  // Convert string to character array
        char[] reversedArray = new char[originalArray.length];
        
        // Reverse the string using charAt() method
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - i - 1];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;  // If characters don't match, it's not a palindrome
            }
        }
        return true;  // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Check if the text is a palindrome using all three methods
        boolean result1 = isPalindromeByComparing(text);
        boolean result2 = isPalindromeRecursively(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        // Display the results
        System.out.println("Logic 1 (Comparing start and end): " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursive method): " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Using character arrays): " + (result3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
