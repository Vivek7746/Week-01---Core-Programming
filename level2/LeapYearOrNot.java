import java.util.*;
class LeapYearOrNot{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable year
			int year;
			
			// Taking year as an input from the user
			year = input.nextInt();
			
			// Checking if it's divisible by 4 or not
			if(year%4 == 0){
				
				// Now it shouldn't be divisible by 100
				if(year%100 == 0){
					
					// It has to be divisible by 400 to be a Leap year
					if(year%400 == 0) System.out.print(year + " is a Leap Year");
					else System.out.print(year + " is not a Leap Year");
				}
				
				// 
				else System.out.print(year + " is a Leap Year");
			}
			// If it is not divisible by 4 then it's not a Leap Year
			else System.out.print(year + " is not a Leap Year");
	}
}