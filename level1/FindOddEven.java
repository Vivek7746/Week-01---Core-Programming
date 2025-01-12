import java.util.*;
class FindOddEven{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a Number as an input
		int number = input.nextInt();
		
		// Initialising two arrays to store odd and even numbers separately
		int odd[] = new int[number/2 + 1];
		int even[] = new int[number/2 + 1];
		
		// creating two variable to keep the track of indices in arrays
		int oddindex = 0, evenindex = 0;
		
		// Iterating from 1 to number 
		for(int currNum = 1; currNum <= number; currNum++){
			
			// Odd condition
			if(currNum%2 == 1) odd[oddindex++] = currNum;
			
			// Even condition
			if(currNum%2 == 0) even[evenindex++] = currNum;
		}
		
		// Printing all the odd numbers 
		System.out.print("Odd numbers are ");
		for(int index = 0; index < oddindex; index++){
			System.out.print(odd[index] + " ");
		}
		
		// Printing all the even numbers 
		System.out.print("\nEven numbers are ");
		for(int index = 0; index < evenindex; index++){
			System.out.print(even[index] + " ");
		}
	}
}