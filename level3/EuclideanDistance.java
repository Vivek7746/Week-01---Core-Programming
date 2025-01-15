import java.util.*;

class EuclideanDistance {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculating and displaying the distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f\n", distance);

        // Calculating and displaying the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }
}
