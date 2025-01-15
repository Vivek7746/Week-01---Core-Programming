import java.util.*;

class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    static int[] findFactors(int number) {
        // First loop to count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop to store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last factor (excluding the number itself)
    }

    // Method to find the sum of the factors using factors array
    static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using factors array
    static long productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    static boolean isStrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to store the digits of the number in an array
    static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digitsArray = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }
        return digitsArray;
    }

    // Method to count digits of the number
    static int countDigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Displaying the results
        System.out.println("Factors of the number: " + Arrays.toString(findFactors(number)));
        System.out.println("Greatest factor of the number (excluding itself): " + greatestFactor(number));
        System.out.println("Sum of factors: " + sumOfFactors(number));
        System.out.println("Product of factors: " + productOfFactors(number));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(number));
        System.out.println("The statement that the number is a perfect number: " + isPerfectNumber(number));
        System.out.println("The statement that the number is an abundant number: " + isAbundantNumber(number));
        System.out.println("The statement that the number is a deficient number: " + isDeficientNumber(number));
        System.out.println("The statement that the number is a strong number: " + isStrongNumber(number));

        input.close();
    }
}
