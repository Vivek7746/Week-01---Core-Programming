import java.util.*;
class findBonus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating two variables salary and year
			int salary, year;
			
			// Taking input from the user
			salary = input.nextInt();
			year = input.nextInt();
			
			// If the salary is 5 years of less
			if(year <= 5) System.out.print("Your Bonus amount is 0");
			else{
				
				// If the salary is above 5 years, then finding Bonus
				int Bonus = (salary*5)/100;
				
				// Displaying the Bonus
				System.out.print("Your Bonus amount is " + Bonus);
			}
	}
}