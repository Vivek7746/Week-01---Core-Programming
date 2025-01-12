import java.util.*;
class FindSum{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Initialising array which will store the given inputs in Integer
		int arr[] = new int[10];
		
		// Creating a variable index to keep track of the out of bounds
		int index = 0;
		
		while(index < 10){
			
			// Taking number as an input from the user
			int number = input.nextInt();
			
			// Checking 0 and less than 0 condition
			if(number <= 0) break;
			
			// Assigning the values in the array
			arr[index] = number;
			
			// Incrementing the value of index
			index++;
		}
		
		// We have number of input from 0 to index-1
		// So we will traverse the array till index-1 and also find Sum
		int sum = 0;
		
		for(int index2 = 0; index2 < index; index2++){
			sum += arr[index2];
			System.out.print(arr[index2] + " ");
		}
		System.out.print("\nThe sum is " + sum);
	}
}