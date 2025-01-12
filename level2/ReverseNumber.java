import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        int number = scanner.nextInt();

        // Temporary variable to store the number for digit extraction
        int tempNumber = number; 
        int digitCount = 0;

        // Counting the number of digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Array to store digits
        int[] digits = new int[digitCount]; 
        tempNumber = number;

        // Store digits of the number in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Displaying the reversed number
        System.out.print("Reversed number is ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
