import java.util.*;

public class NumberAnalyzer { // Analyze digits and find largest
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
		// Taking input from the user
        int number = scanner.nextInt();
		
		// Setting limit
        int maxDigits = 10;
        int[] digitArray = new int[maxDigits];
        int index = 0;
		
		// breaking down the given number
        while (number != 0) {
            if (index == maxDigits) break; // Stop if array is full
            digitArray[index] = number % 10;
            number /= 10;
            index++;
        }
		
		// Letting variables to check 
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digitArray[i] > largest) {
                secondLargest = largest;
                largest = digitArray[i];
            } else if (digitArray[i] > secondLargest && digitArray[i] != largest) {
                secondLargest = digitArray[i];
            }
        }
		// Displaying the result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
