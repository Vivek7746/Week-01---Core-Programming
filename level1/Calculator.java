import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking first number as input 
		float Number1 = input.nextFloat();
		
		// Taking Second number as input 
		float Number2 = input.nextFloat();
		
		// Performing Addition
		float addition = Number1 + Number2;
		
		// Performing Subtraction
		float subtraction = Number1 - Number2;
		
		// Performing Multiplication
		float multiplication = Number1 * Number2;
		
		// Performing Division
		float division = Number1 / Number2;
		
		// Showing results
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + Number1 + " and " + Number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
	}
}