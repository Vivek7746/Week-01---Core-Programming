import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their GCD and LCM:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("GCD: " + calculateGCD(num1, num2));
        System.out.println("LCM: " + calculateLCM(num1, num2));

        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        return b == 0 ? a : calculateGCD(b, a % b);
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}
