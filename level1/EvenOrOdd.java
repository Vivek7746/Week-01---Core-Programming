import java.util.*;
class EvenOrOdd{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable number
			int number;
			
			// Taking input from the user
			number = input.nextInt();
			
			// Finding which number is odd or even using for loop will number
			for(int currentnumber = 1; currentnumber <= number; currentnumber++){
				
				// Checking even condition
				if(currentnumber%2 == 0) System.out.println(currentnumber + " is an even number");
				
				// Checking odd condition
				else if(currentnumber%2 == 1) System.out.println(currentnumber + " is an odd number");
			}
	}
}