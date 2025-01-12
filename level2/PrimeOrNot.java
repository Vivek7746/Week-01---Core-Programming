import java.util.*;
class PrimeOrNot{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking it as an input
			number = input.nextInt();
			
			// Creating a boolean variable to check the Prime condition
			boolean isPrime = true;
			
			// Checking if the number is Prime or not
			for(int currentNumber = 2; currentNumber < number; currentNumber++){
				
				// If the currentNumber divided the number then it's not Prime 
				if(number%currentNumber == 0){
					isPrime = false;
					break;
				}
			}
			
			// Displaying result
			if(isPrime) System.out.print(number + " is a Prime number");
			else System.out.print(number + " is not a Prime number");
	}
}