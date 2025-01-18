import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (add, subtract, multiply, divide):");
        String operation = scanner.next();

        double result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double performOperation(double a, double b, String op) {
        switch (op) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return b != 0 ? a / b : Double.NaN;
            default:
                System.out.println("Invalid operation.");
                return 0;
        }
    }
}
