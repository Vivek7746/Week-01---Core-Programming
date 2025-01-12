import java.util.*;
class FizzBuzz{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking it as an input
			number = input.nextInt();
			
			// Iterating from 0 to the number
			for(int currentNumber = 0; currentNumber <= number; currentNumber++){
				
				// if it's a factor of 3
				if(currentNumber%3 == 0) System.out.print("Fizz");
				
				// if it's a factor of 5
				if(currentNumber%5 == 0) System.out.print("Buzz");
				
				// else we will just print the number 
				else if(currentNumber%3 != 0 && currentNumber%5 != 0) System.out.print(currentNumber);
				
				System.out.println();
			}
	}
}