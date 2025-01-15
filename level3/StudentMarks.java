import java.util.Random;

public class StudentMarks {

    public static void main(String[] args) {
        // Get the number of students from the user
        int numStudents = getUserInput("Enter the number of students: ");

        // Generate random marks for each student in Physics, Chemistry, and Math
        int[][] studentMarks = generateRandomMarks(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] studentResults = calculateResults(studentMarks);

        // Display the scorecard of all students
        displayScorecard(studentMarks, studentResults);
    }

    // Get user input as an integer
    private static int getUserInput(String message) {
        // Implement input validation and error handling here
        return 5; 
    }

    // Generate random marks for each student in PCM
    private static int[][] generateRandomMarks(int numStudents) {
		// 2D array to store marks
        int[][] marks = new int[numStudents][3]; 
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
				// Generate random marks between 0 and 100
                marks[i][j] = rand.nextInt(101); 
            }
        }

        return marks;
    }

    // Calculate total, average, and percentage for each student
    private static double[][] calculateResults(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
			
			// Total marks
            results[i][0] = total; 
			// Average marks
            results[i][1] = (double) total / 3; 
			// Percentage
            results[i][2] = (double) total / 300 * 100; 
        }

        return results;
    }

    // Display the scorecard of all students
    private static void displayScorecard(int[][] marks, double[][] results) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Math: " + marks[i][2]);
            System.out.println("Total: " + String.format("%.2f", results[i][0]));
            System.out.println("Average: " + String.format("%.2f", results[i][1]));
            System.out.println("Percentage: " + String.format("%.2f", results[i][2]) + "%");
            System.out.println("Grade: " + getGrade(results[i][2]));
            System.out.println("Remarks: " + getRemarks(results[i][2]));
            System.out.println();
        }
    }

    // Determine the grade based on percentage
    private static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // Determine the remarks based on percentage
    private static String getRemarks(double percentage) {
        String remarks;
        if (percentage >= 80) {
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            remarks = "(Remedial standards)";
        }
        return remarks;
    }
}