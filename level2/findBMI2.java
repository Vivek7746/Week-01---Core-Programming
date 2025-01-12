import java.util.*;
class findBMI2 {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Asking for the number of persons
        int numPersons = input.nextInt();

        // Creating a 2D array to store weight, height, and BMI 
        double[][] personData = new double[numPersons][3]; 
        String[] weightStatus = new String[numPersons]; 

        // Taking input and calculating BMI 
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
			
                System.out.print("Enter the weight in kg : ");
                personData[i][0] = input.nextDouble();
                
                System.out.print("Enter the height in cm : ");
                personData[i][1] = input.nextDouble();
              

            // Convert height from cm to meters
            double heightInMeters = personData[i][1] / 100;

            // Calculate BMI and store it in the personData array
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            // Determine weight status and store it in the weightStatus array
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results for each person
        System.out.println("\nDetails of each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height (m): " + personData[i][1] / 100);  
            System.out.println("Weight (kg): " + personData[i][0]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}