import java.util.*;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Conversion factor: 1 yard = 3 feet
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Conversion factor: 1 foot = 0.333333 yards
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion factor: 1 meter = 39.3701 inches
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion factor: 1 inch = 0.0254 meters
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        // Conversion factor: 1 inch = 2.54 centimeters
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Taking string as an input of unit 
        System.out.println("Enter the unit type you want to convert (yards, feet, meters, inches): ");
        String unitType = scanner.nextLine().toLowerCase(); // Get input and convert to lowercase

        // Initialize the input value variable
        double distance;

        // Based on the unit type, ask for the corresponding value and perform the conversion
        if (unitType.equals("yards")) {
            System.out.print("Enter the distance in yards: ");
            distance = scanner.nextDouble();
            System.out.println(distance + " yards is equal to " + convertYardsToFeet(distance) + " feet.");
            System.out.println(distance + " yards is equal to " + convertMetersToInches(distance * 0.9144) + " inches.");
        } else if (unitType.equals("feet")) {
            System.out.print("Enter the distance in feet: ");
            distance = scanner.nextDouble();
            System.out.println(distance + " feet is equal to " + convertFeetToYards(distance) + " yards.");
            System.out.println(distance + " feet is equal to " + convertMetersToInches(distance * 0.3048) + " inches."); 
        } else if (unitType.equals("meters")) {
            System.out.print("Enter the distance in meters: ");
            distance = scanner.nextDouble();
            System.out.println(distance + " meters is equal to " + convertMetersToInches(distance) + " inches.");
            System.out.println(distance + " meters is equal to " + convertYardsToFeet(distance / 0.9144) + " feet."); 
        } else if (unitType.equals("inches")) {
            System.out.print("Enter the distance in inches: ");
            distance = scanner.nextDouble();
            System.out.println(distance + " inches is equal to " + convertInchesToMeters(distance) + " meters.");
            System.out.println(distance + " inches is equal to " + convertInchesToCm(distance) + " centimeters.");
        } else {
            System.out.println("Invalid unit type entered. Please enter one of the following: yards, feet, meters, inches.");
        }

        // Close the scanner
        scanner.close();
    }
}
