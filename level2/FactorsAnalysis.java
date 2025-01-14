import java.util.Scanner;

public class FactorsAnalysis {

    // Method to find factors of a number and save them in an array
    public static int[] findFactors(int number) {
		
        // Finding the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initializing the array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Saving the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        // Returning the array of factors
        return factors;
    }

    // Method to find the sum of factors using the factors array
    public static int findSumOfFactors(int[] factors) {
		
        // Calculating the sum of all factors
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        // Returning the sum
        return sum;
    }

    // Method to find the product of factors using the factors array
    public static long findProductOfFactors(int[] factors) {
		
        // Calculating the product of all factors
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        // Returning the product
        return product;
    }

    // Method to find the sum of squares of factors using Math.pow()
    public static int findSumOfSquaresOfFactors(int[] factors) 
	
        // Calculating the sum of squares of factors
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        // Returning the sum of squares
        return sumOfSquares;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the method to find factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating and displaying the sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Calculating and displaying the product of factors
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Calculating and displaying the sum of squares of factors
        int sumOfSquaresOfFactors = findSumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors);

        // Closing the scanner
        scanner.close();
    }
}
