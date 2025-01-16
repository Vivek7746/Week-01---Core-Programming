import java.util.Scanner;

class CalendarProgram {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];  // Month is 1-based, array is 0-based
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        // Days in each month for a common year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // If the month is February, check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;  // Leap year has 29 days in February
        }

        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month (using the Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        // Gregorian calendar formula to find the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  // The 1 is for the 1st day of the month
        return d0;  // Returns a number from 0 (Sunday) to 6 (Saturday)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the header of the calendar
        System.out.printf("        %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display the first week with spaces for days before the first day of the month
        int currentDay = 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // Print spaces for days before the first day
        }

        // Loop through the days of the month and display them
        for (int i = firstDay; currentDay <= daysInMonth; i++) {
            System.out.printf("%3d ", currentDay);  // Print each day right-justified
            currentDay++;

            // Move to the next line after Saturday
            if (i == 6) {
                System.out.println();
                i = -1;  // Reset i to 0 after Saturday
            }
        }
        System.out.println();  // Move to the next line after the last week
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }
}
