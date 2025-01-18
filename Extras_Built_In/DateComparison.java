import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define the date format to parse user input
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Taking the first date input from the user in yyyy-MM-dd format
        System.out.println("Enter the first date (yyyy-MM-dd):");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, dateFormatter);

        // Taking the second date input from the user in yyyy-MM-dd format
        System.out.println("Enter the second date (yyyy-MM-dd):");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, dateFormatter);

        // Compare the two dates using isBefore, isAfter, and isEqual methods
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        // Close the scanner
        scanner.close();
    }
}
