import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
		
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is negative, return an empty array (no real roots)
        if (delta < 0) {
            return new double[0]; 
        }
        
        // If delta is zero, only one root exists
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        
        // If delta is positive, calculate both roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        // Return the two roots
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        // Find the roots using the method
        double[] roots = findRoots(a, b, c);
        
        // Display the result based on the number of roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
