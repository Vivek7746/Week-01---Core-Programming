import java.util.Scanner;

public class findSmallestAndLargest {

    // Method to find the smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        
		// Assume the first number is both the smallest and largest
		int smallest = number1; 
        int largest = number1; 

        // Compare to find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Compare to find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating three variables and taking it input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method and get the result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}
