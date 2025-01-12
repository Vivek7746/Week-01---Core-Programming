import java.util.*;
class CheckNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising the array which will contain all the Numbers
		int Numbers[] = new int[5];
		
		// Taking Numbers as input from the user
		for(int index = 0; index < 5; index++){
			Numbers[index] = input.nextInt();
		}
		
		// Traversing the array of Numbers to check 
		for(int index = 0; index < 5; index++){
			
			// Taking a variable as Current Number
			int CurrentNumber = Numbers[index];
			
			// Handling Negative Case
			if(CurrentNumber < 0) System.out.println("Negative");
			
			// Handling Positive Case
			else if(CurrentNumber > 0) System.out.println("Positive");
			
			//Handling Zero Case 
			else System.out.println("Zero");
		}
		
		// Comparing first and last Numbers
		int firstNum = Numbers[0], lastNum = Numbers[4];
		
		if(firstNum > lastNum) System.out.print("The first number is greater than the last number");
		else if(firstNum < lastNum) System.out.print("The first number is smaller than the last number");
		else System.out.print("The first number is equal to the last number");
	}
}