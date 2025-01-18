import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Fahrenheit to Celsius, or 2 to convert Celsius to Fahrenheit:");
        int choice = scanner.nextInt();

        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Converted to Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Converted to Fahrenheit: " + celsiusToFahrenheit(temp));
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
