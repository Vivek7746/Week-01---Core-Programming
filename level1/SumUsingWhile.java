import java.util.*;
class SumUsingWhile{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable and initializing it to the value 0
			int sum = 0;
			
			// To take input infinitely we'll using while loop with true statement
			while(true){
				
				// Taking Numbers as input from the user
				int number = input.nextInt();
				
				// Breaking condition
				if(number == 0) break;
				
				// Else we'll add the number to the sum 
				sum += number;
			}
		
		// Displaying the final sum 
		System.out.print("The final sum is " + sum);
	}
}