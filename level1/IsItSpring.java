import java.util.*;
class IsItSpring{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// 3 20 to 6 20
		// Taking two variable month and day as Integers
		int month, day;
		
		// Taking month and day as inputs
		month = input.nextInt();
		day = input.nextInt();
		
		// Handeling Non Spring months
		if(month <= 2 || month >= 7) System.out.print("Not a Spring Season");
		
		// Handeling days March and June case
		else if(month == 3 && day <= 19) System.out.print("Not a Spring Season");
		else if(month == 6 && day >= 21) System.out.print("Not a Spring Season");
		
		// The remaining case will be Automatically a Sprint season
		else System.out.print("It's a Spring Season");
	}
}