import java.util.*;
class FindBonus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a Number as an input
		int number = input.nextInt();
		
		// Initialising Factor array to store factors of the number
		int factor[] = new int[100];
		
		// Tracking index of factor array
		int factorindex = 0;
		
		// Looking for factors of number
		for(int currNum = 1; currNum <= number; currNum++){
			if(number%currNum == 0) factor[factorindex++] = currNum;
		}
		
		// Displaying the factors 
		System.out.print("The factors of " + number + " are ");
		for(int index = 0; index < factorindex; index++){
			System.out.print(factor[index] + " ");
		}
	}
}