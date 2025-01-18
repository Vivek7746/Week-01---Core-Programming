import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format 1: dd/MM/yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = currentDate.format(format1);

        // Format 2: yyyy-MM-dd
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = currentDate.format(format2);

        // Format 3: EEE, MMM dd, yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formattedDate3 = currentDate.format(format3);

        // Display the formatted dates
        System.out.println("Current date in format dd/MM/yyyy: " + formattedDate1);
        System.out.println("Current date in format yyyy-MM-dd: " + formattedDate2);
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + formattedDate3);
    }
}
