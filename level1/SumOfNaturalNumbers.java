import java.util.*;
class SumOfNaturalNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking the the variable as the number
		// We will calculate the sum of the first "number" Natural numbers
		int number = input.nextInt();
		
		// Checking if the number is Natural of not
		if(number <= 0){
			System.out.print("The number " + number + " is not a natural number");
		}
		else{
			
			// If the number is Natural, we will find the sum 
			int Sum = (number * (number+1)) / 2;
			
			// Displaying the sum 
			System.out.print("The sum of " + number + " Natural number is " + Sum);
		}
	}
}