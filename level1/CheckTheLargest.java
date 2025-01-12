import java.util.*;
class CheckTheLargest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking 3 numbers as inputs from the user
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Taking 3 boolean variables and assuming it is false
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		
		// Checking if number1 is the largest among all
		if((number1 >= number2) && (number1 >= number3)) check1 = true;
		
		// Checking if number2 is the largest among all
		if((number2 >= number1) && (number2 >= number3)) check2 = true;
		
		// Checking if number3 is the largest among all
		if((number3 >= number1) && (number3 >= number2)) check3 = true;
		
		System.out.println("Is the first number the largest " + ((check1) ? "YES" : "NO"));
		System.out.println("Is the second number the largest " + ((check2) ? "YES" : "NO"));
		System.out.println("Is the third number the largest " + ((check3) ? "YES" : "NO"));
	}
}