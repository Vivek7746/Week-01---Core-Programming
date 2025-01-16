import java.util.Scanner;

class UppercaseComparison {

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUppercase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        
        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // If the character is lowercase, convert it to uppercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase to uppercase using ASCII difference of 32
                char uppercaseChar = (char) (currentChar - 32);
                uppercaseText.append(uppercaseChar);
            } else {
                // If the character is already uppercase or not a letter, add it as is
                uppercaseText.append(currentChar);
            }
        }
        
        return uppercaseText.toString();
    }

    // Method to compare two strings and return true if they are equal
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the complete text input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Convert the text to uppercase using the user-defined method
        String convertedText = convertToUppercase(inputText);

        // Convert the text to uppercase using the built-in method
        String builtInUppercaseText = inputText.toUpperCase();

        // Compare the two strings
        boolean areStringsEqual = compareStrings(convertedText, builtInUppercaseText);

        // Display the results
        System.out.println("\nConverted Text (using charAt() method): " + convertedText);
        System.out.println("Built-in Uppercase Text (using toUpperCase() method): " + builtInUppercaseText);
        System.out.println("\nDo both methods produce the same result? " + areStringsEqual);
    }
}
