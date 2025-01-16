import java.util.Scanner;

class LowercaseComparison {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLowercase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        
        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // If the character is uppercase, convert it to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert uppercase to lowercase using ASCII difference of 32
                char lowercaseChar = (char) (currentChar + 32);
                lowercaseText.append(lowercaseChar);
            } else {
                // If the character is already lowercase or not a letter, add it as is
                lowercaseText.append(currentChar);
            }
        }
        
        return lowercaseText.toString();
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

        // Convert the text to lowercase using the user-defined method
        String convertedText = convertToLowercase(inputText);

        // Convert the text to lowercase using the built-in method
        String builtInLowercaseText = inputText.toLowerCase();

        // Compare the two strings
        boolean areStringsEqual = compareStrings(convertedText, builtInLowercaseText);

        // Display the results
        System.out.println("\nConverted Text (using charAt() method): " + convertedText);
        System.out.println("Built-in Lowercase Text (using toLowerCase() method): " + builtInLowercaseText);
        System.out.println("\nDo both methods produce the same result? " + areStringsEqual);
    }
}
