import java.util.Random;

public class StudentGradeCalculator {

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100) + 1; // Generate random scores between 1 and 100
            }
        }

        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            stats[i][0] = total; // Total
            stats[i][1] = (double) total / 3; // Average
            stats[i][2] = Math.round((double) total / 3 * 100) / 100; // Percentage (rounded to 2 decimal places)
        }

        return stats;
    }

    public static char[] calculateGrades(double[][] percentages) {
        int numStudents = percentages.length;
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
			
			// Checking all the condition
            if (percentages[i][2] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i][2] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i][2] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i][2] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i][2] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        int numStudents = scores.length;

        for (int i = 0; i < numStudents; i++) {
			
			// Printing all the stats
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Math: " + scores[i][2]);
            System.out.println("Total: " + stats[i][0]);
            System.out.println("Average: " + stats[i][1]);
            System.out.println("Percentage: " + stats[i][2] + "%");
            System.out.println("Grade: " + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
		
		// Calling methods
        int[][] scores = generateRandomScores(numStudents);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);

		// Displaying the results
        displayScorecard(scores, stats, grades);
    }
}