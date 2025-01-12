import java.util.*;
class SwapProgram{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variables for both numbers
		int number1, number2;
		
		// Taking the value of both numbers from the user
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		// Using third variable to swap the numbers
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		// Displaying the Results
		System.out.print("After swapping number1 is " + number1 + " and number2 is " + number2);
	}
}