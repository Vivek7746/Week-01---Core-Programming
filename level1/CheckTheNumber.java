import java.util.*;
class CheckTheNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a variable number
		int number;
		// Taking the value of number as an input
		number = input.nextInt();
		
		// Checking Positive condition
		if(number >= 1) System.out.print("Positive");
		
		// Checking Negative condition
		else if(number < 0) System.out.print("Negative");
		
		// Checking zero condition
		else if(number == 0) System.out.print("Zero");
	}
}