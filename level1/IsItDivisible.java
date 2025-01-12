import java.util.*;
class IsItDivisible{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a variable number;
		int number;
		
		// Taking the value of number from the user
		number = input.nextInt();
		
		// Checking if it is divisible by 5 or not
		boolean check = true;
		
		if(number%5 != 0) check = false;
		
		System.out.print("Is the number " + number + " divisible by 5? ");
		if(check) System.out.print("YES");
		else System.out.print("NO");
	}
}