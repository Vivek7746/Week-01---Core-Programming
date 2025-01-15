import java.util.*;

class NumberChecker4 {

    // Method to count digits of the number
    static int countDigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;
        }
        return digits;
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

    // Method to reverse the digits array
    static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    // Method to compare two arrays and check if they are equal
    static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to avoid leading zero
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Method to check if a number is a prime number
    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Displaying the results
        System.out.println("The number " + number + " has " + countDigits(number) + " digits.");

        int[] digits = storeDigits(number);
        System.out.println("The digits of the number are: " + Arrays.toString(digits));

        int[] reversedDigits = reverseArray(digits);
        System.out.println("The reversed digits of the number are: " + Arrays.toString(reversedDigits));

        System.out.println("The statement that the number " + number + " is a palindrome is: " + isPalindrome(number));

        System.out.println("The statement that the number " + number + " is a duck number is: " + isDuckNumber(number));

        System.out.println("The statement that the number " + number + " is a prime number is: " + isPrime(number));

        System.out.println("The statement that the number " + number + " is a neon number is: " + isNeonNumber(number));

        System.out.println("The statement that the number " + number + " is a spy number is: " + isSpyNumber(number));

        System.out.println("The statement that the number " + number + " is an automorphic number is: " + isAutomorphicNumber(number));

        System.out.println("The statement that the number " + number + " is a buzz number is: " + isBuzzNumber(number));

        input.close();
    }
}
