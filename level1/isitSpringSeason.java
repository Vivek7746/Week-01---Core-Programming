import java.util.*;
class isitSpringSeason{

	// Method to checking if it's Spring or not
	public static boolean SpringOrNot(int month, int day){
			if(month <= 2 || month >= 7) return false;
			
			// Handeling days March and June case
			else if(month == 3 && day <= 19) return false;
			else if(month == 6 && day >= 21) return false;
			
			// The remaining case will be Automatically a Sprint season
			else return true;
		}
	public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			
			// Taking two variable month and day as Integers
			int month, day;
			
			// Taking month and day as inputs
			month = input.nextInt();
			day = input.nextInt();
			
			// Calling SpringOrNot method
			System.out.print(SpringOrNot(month, day));
		}
}