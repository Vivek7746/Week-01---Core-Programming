import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
		
        // Leap year conditions
        if (year >= 1582) { // The year should be greater than or equal to 1582
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
		// Taking year as an input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the entered year is a valid year
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582.");
        } else {
            // Calling the method to check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
