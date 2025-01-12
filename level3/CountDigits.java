import java.util.*;
class CountDigits{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Taking a temp variable and count of digits
		int tempNumber = number, countOfDigits = 0;
		
		// Breaking the number to get the count of digits
		while(tempNumber > 0){
			
			countOfDigits++;
			
			// Trimming down the tempNumber
			tempNumber /= 10;
		}
		
		// Displaying the result
		System.out.print(number + " has " + countOfDigits + " digits");
	}
}