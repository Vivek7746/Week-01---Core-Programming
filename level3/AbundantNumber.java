import java.util.*;
class AbundantNumber{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Taking a Factor Sum variable to Store the summition of factors
		int sumOfFactors = 0;
		
		// Finding the factors 
		for(int tempNum = 1; tempNum < number; tempNum++){
			
			// Checking if factor or not 
			if(number%tempNum == 0) sumOfFactors += tempNum;
		}
		
		// Displaying the result
		
		if(sumOfFactors > number)System.out.print(number + " is an Abundant Number");
		else System.out.print(number + " is not an Abundant Number");
	}
}