import java.util.*;
class findFactorialUsingFor{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking input from the user
			number = input.nextInt();
			
			// Initializing Factorial to 1
			int Factorial = 1;
			
			// Iterating from 1 to number
			for(int currentnumber = 1; currentnumber <= number; currentnumber++){
				// Multiplying it to the Factorial 
				Factorial *= currentnumber;
			}
			
			System.out.print("The Factorial of number " + number + " is " + Factorial);
	}
}