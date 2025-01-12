import java.util.*;
class ArmstrongNumber{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Taking a temp variable and final sum
		int tempNumber = number, finalsum = 0;
		
		// Breaking the number to get the digits
		while(tempNumber > 0){
			
			// Adding cube of last digit to the sum
			int remainder = tempNumber%10;
			finalsum += (remainder*remainder*remainder);
			
			// Trimming down the tempNumber
			tempNumber /= 10;
		}
		
		// Displaying the result
		if(finalsum == number) System.out.print("Yes " + number + " is an Armstrong number");
		else System.out.print("No " + number + " is not an Armstrong number");
	}
}