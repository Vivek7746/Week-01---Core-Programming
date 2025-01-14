import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
		
        // Converting the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculating the sine of the angle
        double sine = Math.sin(radians);

        // Calculating the cosine of the angle
        double cosine = Math.cos(radians);

        // Calculating the tangent of the angle
        double tangent = Math.tan(radians);

        // Return an array containing sine, cosine, and tangent
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input from the user i.e. angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calling the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the sine of the angle
        System.out.printf("Sine of %.2f degrees: %.4f%n", angle, results[0]);

        // Display the cosine of the angle
        System.out.printf("Cosine of %.2f degrees: %.4f%n", angle, results[1]);

        // Display the tangent of the angle
        System.out.printf("Tangent of %.2f degrees: %.4f%n", angle, results[2]);

        // Close the scanner
        scanner.close();
    }
}
