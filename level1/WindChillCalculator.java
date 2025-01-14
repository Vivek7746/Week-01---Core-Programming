import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Calculate the wind chill using the given formula
        return 35.74 
               + 0.6215 * temperature 
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Taking temperature as an input from the user as double datatye
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        // Taking speed of the wind as an input from the user as double datatye
        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        // Check if the wind speed is greater than 3 mph
        if (windSpeed > 3) {
			
            // Call the method to calculate the wind chill temperature
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the calculated wind chill temperature
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
			
        } else {
            // Handling less than or equal to 3 case
            System.out.println("Wind chill calculation is not valid for wind speeds less than or equal to 3 mph");
        }

        // Close the scanner
        scanner.close();
    }
}
