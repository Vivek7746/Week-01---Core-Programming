import java.util.*;
class checkNumber{
	
	// Method to Print after checking the number
	public static void CheckAndPrint(int number){
		
		// Checking the condition for Negative
		if(number < 0) System.out.print("The Given Number " + number + " is Negative");
		
		// Checking the condition for Positive
		if(number > 0) System.out.print("The Given Number " + number + " is Positive");
		
		// Checking the condition for Zero
		if(number == 0) System.out.print("The Given Number " + number + " is Zero");
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking number as input 
		int number = input.nextInt();
		
		// Checking and Printing by calling method
		CheckAndPrint(number);
	}
}