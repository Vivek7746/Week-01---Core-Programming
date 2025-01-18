import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter any date in YYYY-MM-DD format : ");
        String currDate = input.nextLine();

        LocalDate formatedcurrDate = LocalDate.parse(currDate, form);
        LocalDate updatedDate = formatedcurrDate.plusDays(7).plusMonths(1).plusYears(2);

        // Displaying updated Date
        System.out.println("After +7 days +1 months +2 years : " + updatedDate.format(form));

        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Displaying final Date
        System.out.println("After -3 weeks : " + finalDate.format(form));

        input.close();
    }

}
