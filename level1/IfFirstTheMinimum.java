import java.util.*;
class IfFirstTheMinimum{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking 3 numbers as inputs from the user
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Taking a boolean variable and assuming it is false
		boolean check = false;
		
		// Checking if number1 is the smallest among all
		if((number1 <= number2) && (number1 <= number3)) check = true;
		
		System.out.print("Is the first number the smallest? ");
		if(check) System.out.print("YES");
		else System.out.print("NO");
	}
}