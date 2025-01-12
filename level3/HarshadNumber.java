import java.util.*;
class HarshadNumber{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Taking a temp variable and sum of digits
		int tempNumber = number, sumOfDigits = 0;
		
		// Breaking the number to get the sum of digits
		while(tempNumber > 0){
			
			sumOfDigits += (tempNumber%10);
			
			// Trimming down the tempNumber
			tempNumber /= 10;
		}
		
		// Displaying the result
		
		// if sumOfDigits can divide the number then it is a Harshad Number
		if(number%sumOfDigits == 0)System.out.print(number + " is a Harshad Number");
		else System.out.print(number + " is not a Harshad Number");
	}
}