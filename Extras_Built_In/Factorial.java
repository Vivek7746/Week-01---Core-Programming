import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        System.out.println("The factorial of " + number + " is: " + calculateFactorial(number));

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
