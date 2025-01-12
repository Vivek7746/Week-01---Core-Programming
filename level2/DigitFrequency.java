import java.util.*;

public class DigitFrequency { // Class to find digit frequency
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number
        int number = scanner.nextInt();
	
		// Temporary variable to count digits
        int tempNumber = number; 
        int digitCount = 0;
		
		// Count the number of digits
        while (tempNumber != 0) { 
            tempNumber /= 10;
            digitCount++;
        }
		
		// Array to store digits
        int[] digits = new int[digitCount]; 
        tempNumber = number;
		
		// storing digits
        for (int i = 0; i < digitCount; i++) { 
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
		
		// Array to store frequency of digits
        int[] frequency = new int[10]; 

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
		
		// Display frequency of digits
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) { 
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
