import java.util.Scanner;

class VotingEligibility {

    // Method to take age input for students
    public static int[] takeAgesInput(int numStudents, Scanner scanner) {
        int[] ages = new int[numStudents];

        // Loop to take input for each student's age
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        // Loop through each age and determine eligibility
        for (int i = 0; i < ages.length; i++) {
            // Store the age as a string
            results[i][0] = String.valueOf(ages[i]);

            // Determine eligibility
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age: Cannot Vote";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Method to display the results without tabular formatting
    public static void displayResults(String[][] results) {
        // Loop through the results and print each row
        for (String[] row : results) {
            System.out.println("Age: " + row[0] + " - " + row[1]);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numStudents = scanner.nextInt();

        // Take age input for each student
        int[] ages = takeAgesInput(numStudents, scanner);

        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display the results
        displayResults(eligibilityResults);
    }
}
