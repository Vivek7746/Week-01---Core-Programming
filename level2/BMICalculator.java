import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100.0;
            // Calculate BMI
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating a 2D array "data" to store weight (kg), height (cm), and BMI for each person
        double[][] data = new double[10][3];

        // Taking input from the user for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();  // weight in kg
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();  // height in cm
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nDetails of each person:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] + " kg, Height = " + data[i][1] + " cm, BMI = " + String.format("%.2f", data[i][2]) + ", Status = " + bmiStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
