import java.util.Scanner;

public class NumberAnalyzer2 { // Analyze digits and find largest
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		// Taking input from the user
        int number = scanner.nextInt();
		
		// Initial max digit capacity
        int maxDigits = 10; 
        int[] digitArray = new int[maxDigits];
		
		// Letting index variable to be 0
        int index = 0;
		
		// Extract digits from the number
        while (number != 0) { 
            if (index == maxDigits) { 
				// Increment max digit capacity
                maxDigits += 10; 
				
				// Recreating the array with new maxDigit
                int[] tempArray = new int[maxDigits];
                System.arraycopy(digitArray, 0, tempArray, 0, digitArray.length);
                digitArray = tempArray;
            }
            digitArray[index] = number % 10;
            number /= 10; 
            index++;
        }
		
		// Initialize largest and second largest digit
        int largest = 0;
        int secondLargest = 0;
		
		// Traversing through the digits
        for (int i = 0; i < index; i++) {
            if (digitArray[i] > largest) {
				
				// Update second largest and largest
                secondLargest = largest; 
                largest = digitArray[i];
            } else if (digitArray[i] > secondLargest && digitArray[i] != largest) {
                secondLargest = digitArray[i];
            }
        }
		
		// Displaying the results
        System.out.println("Largest digit: " + largest); 
        System.out.println("Second largest digit: " + secondLargest);
    }
}
