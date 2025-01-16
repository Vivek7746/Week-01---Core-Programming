import java.util.Scanner;

public class findBMI {

    // Method to calculate BMI and status
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine status based on BMI
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 40) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Return the result in an array: [height, weight, bmi, status]
        return new String[] {String.format("%.2f", weight), String.format("%.2f", height * 100), String.format("%.2f", bmi), status};
    }

    // Method to process the data for 10 people
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[10][4];
        
        // For each person, calculate BMI and get their status
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            result[i] = calculateBMI(weight, height);
        }
        
        return result;
    }

    // Method to display the result for each person
    public static void displayBMIData(String[][] data) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i+1) + ":");
            System.out.println("  Weight: " + data[i][0] + " kg");
            System.out.println("  Height: " + data[i][1] + " cm");
            System.out.println("  BMI: " + data[i][2]);
            System.out.println("  Status: " + data[i][3]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store weight and height of 10 people
        double[][] data = new double[10][2];
        
        // Take input for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Process the data to get BMI and status
        String[][] result = processBMIData(data);
        
        // Display the result
        displayBMIData(result);
        
        scanner.close();
    }
}
