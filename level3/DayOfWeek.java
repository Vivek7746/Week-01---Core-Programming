import java.util.*;

public class DayOfWeek { 
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		// Taking inputs i.e, month, day and year from the User 
        int m = input.nextInt();
        int d = input.nextInt();
        int y = input.nextInt();

        // Applying formulas for Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
		
        // Printing the result
		// 0 for Sunday, 1 for Monday and so on
        System.out.println("Day of the week: " + d0);
    }
}
