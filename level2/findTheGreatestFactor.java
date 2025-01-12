import java.util.*;
class findTheGreatestFactor{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking it as an input
			number = input.nextInt();
			
			// Letting a Variable and assuming it to be the greatest
			int GreatestFactor = 1;
			
			// Iterating over number to find the factor
			for(int currnumber = 2; currnumber < number; currnumber++){
				
				// If currnumber divides the number, we will update the GreatestFactor
				if(number%currnumber == 0) GreatestFactor = currnumber;
			}
			
			// Displaying the Greatest Factor 
			System.out.print("The Greatest Factor of " + number + " is " + GreatestFactor);
	}
}