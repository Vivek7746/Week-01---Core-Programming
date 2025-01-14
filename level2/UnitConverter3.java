import java.util.*;

public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Conversion factor: (Fahrenheit - 32) * 5 / 9 = Celsius
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Conversion factor: (Celsius * 9 / 5) + 32 = Fahrenheit
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor: 1 pound = 0.453592 kilograms
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor: 1 kilogram = 2.20462 pounds
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor: 1 gallon = 3.78541 liters
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        // Conversion factor: 1 liter = 0.264172 gallons
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Taking string as an input 
        System.out.println("Enter the unit type you want to convert (fahrenheit, celsius, pounds, kilograms, gallons, liters): ");
		
		// Get input and convert to lowercase
        String unitType = scanner.nextLine().toLowerCase(); 

        // Initialize the input value variable
        double value;

        // Based on the unit type, ask for the corresponding value and perform the conversion
        if (unitType.equals("fahrenheit")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            value = scanner.nextDouble();
            System.out.println(value + " Fahrenheit is equal to " + convertFahrenheitToCelsius(value) + " Celsius.");
        } else if (unitType.equals("celsius")) {
            System.out.print("Enter the temperature in Celsius: ");
            value = scanner.nextDouble();
            System.out.println(value + " Celsius is equal to " + convertCelsiusToFahrenheit(value) + " Fahrenheit.");
        } else if (unitType.equals("pounds")) {
            System.out.print("Enter the weight in pounds: ");
            value = scanner.nextDouble();
            System.out.println(value + " pounds is equal to " + convertPoundsToKilograms(value) + " kilograms.");
        } else if (unitType.equals("kilograms")) {
            System.out.print("Enter the weight in kilograms: ");
            value = scanner.nextDouble();
            System.out.println(value + " kilograms is equal to " + convertKilogramsToPounds(value) + " pounds.");
        } else if (unitType.equals("gallons")) {
            System.out.print("Enter the volume in gallons: ");
            value = scanner.nextDouble();
            System.out.println(value + " gallons is equal to " + convertGallonsToLiters(value) + " liters.");
        } else if (unitType.equals("liters")) {
            System.out.print("Enter the volume in liters: ");
            value = scanner.nextDouble();
            System.out.println(value + " liters is equal to " + convertLitersToGallons(value) + " gallons.");
        } else {
			// Handling "Invalid" case
            System.out.println("Invalid unit type entered. Please enter one of the following: fahrenheit, celsius, pounds, kilograms, gallons, liters.");
        }

        // Close the scanner
        scanner.close();
    }
}
