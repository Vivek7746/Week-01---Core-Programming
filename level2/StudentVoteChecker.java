import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate age for negative number
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }

        // Check if age is 18 or above
        if (age >= 18) {
            return true; 
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Create an instance of the StudentVoteChecker class
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Loop to take the input for all 10 students' ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); 

            // Check if the student can vote using the canStudentVote method
            if (voteChecker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
