import java.util.*;
class MultiplicationTable{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking input from the user
			number = input.nextInt();
			
			// Printing table of the given number using For Loop
			for(int times = 6; times <= 9; times++){
				
				// Displaying the Table 
				System.out.println(number + " * " + times + " = " + (number*times));
			}
	}
}