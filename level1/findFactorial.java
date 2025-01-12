import java.util.*;
class findFactorial{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking input from the user
			number = input.nextInt();
			
			// Initializing Factorial and currentnumber to 1
			int Factorial = 1, currentnumber = 1;
			
			// Iterating from 1 to number
			
			while(currentnumber <= number){
				
				// Multiplying it to the Factorial 
				Factorial *= currentnumber;
				
				currentnumber++;
			}
			
			System.out.print("The Factorial of number " + number + " is " + Factorial);
	}
}