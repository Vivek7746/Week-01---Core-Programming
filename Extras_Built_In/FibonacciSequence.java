import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = scanner.nextInt();

        generateFibonacci(terms);

        scanner.close();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
