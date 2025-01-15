import java.util.*;

class CollinearPoints {

    // Method to calculate Euclidean distance between two points
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
		
		// Slope formula
        double slope = (y2 - y1) / (x2 - x1); 
		// y-intercept formula
        double yIntercept = y1 - slope * x1;  
		// Returning slope and y-intercept as an array
        return new double[]{slope, yIntercept}; 
    }

    // Method to check if three points are collinear using the slope formula
    static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check if three points are collinear using the area of triangle formula
    static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Checking and displaying if points are collinear by slope formula
        boolean collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("The points are collinear by slope formula: " + collinearBySlope);

        // Checking and displaying if points are collinear by area formula
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("The points are collinear by area formula: " + collinearByArea);
    }
}
