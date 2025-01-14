import java.util.*;
public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
		
        // Conversion factor: 1 km = 0.621371 miles
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
		
        // Conversion factor: 1 mile = 1.60934 kilometers
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
		
        // Conversion factor: 1 meter = 3.28084 feet
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
		
        // Conversion factor: 1 foot = 0.3048 meters
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        // Creating a variable distance and converting it
		double distance = scanner.nextDouble();
		
        // Convert distance to miles
        System.out.println(distance + " kilometers is equal to " + convertKmToMiles(distance) + " miles.");

        // Convert distance to kilometers
        System.out.println(distance + " miles is equal to " + convertMilesToKm(distance) + " kilometers.");

        // Convert distance to feet
        System.out.println(distance + " meters is equal to " + convertMetersToFeet(distance) + " feet.");

        // Convert distance to meters
        System.out.println(distance + " feet is equal to " + convertFeetToMeters(distance) + " meters.");
    }
}
