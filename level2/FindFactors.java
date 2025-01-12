import java.util.*;
class FindFactors{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Finding all the factors
		System.out.print("The factors of " + number + " are ");
		for(int currnum = 1; currnum < number; currnum++){
			
			// if it's divisible
			if(number%currnum == 0) System.out.print(currnum + " ");
		}
	}
}