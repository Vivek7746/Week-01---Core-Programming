import java.util.*;

public class SwitchCaseCalculator { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the operands and operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operation = scanner.next();

        // Perform the operation based on the operator
        switch (operation) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
