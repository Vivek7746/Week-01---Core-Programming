import java.util.*;
class FindMean{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising an array containing height of 11 football members
		double heights[] = new double[11];
		
		// Taking input as heights from the user
		for(int index = 0; index < 11; index++){
			heights[index] = input.nextDouble();
		}
		
		// Finding the sum of all the heights
		double sum = 0;
		for(int index = 0; index < 11; index++){
			sum += heights[index];
		}
		
		// Finding the Mean by Formula
		double Mean = sum/11;
		
		// Displaying the Mean 
		System.out.print("The mean height is " + Mean);
	}
}