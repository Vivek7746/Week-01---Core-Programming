import java.util.*;
class LeapYearOrNot2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable year
			int year;
			
			// Taking year as an input from the user
			year = input.nextInt();
			
			if((year%4 == 0) && ((year%100 != 0) || ((year%400 == 0)))) System.out.print(year + " is a Leap year");
			else System.out.print(year + " is not a Leap year");
	}
}