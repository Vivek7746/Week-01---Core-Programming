import java.util.*;
class findheight{
	
	// Method to find the sum
	static int sum(int height[], int n){
		
		// Initialising a sum variable
		int sum = 0;
		
		// Iterating over the height array to find the sum
		for(int i : height) sum += i;
		
		return sum;
	}
	
	// Method to find the mean height
	static int mean(int height[], int n){
		
		// using sum method to find sum 
		int totalsum = sum(height, n);
		
		return totalsum/n;
	}
	
	// Method to find the shortest
	static int findshortest(int height[], int n){
		
		// let the shortest be height[0];
		int shortest = height[0];
		
		for(int i : height) shortest = Math.min(shortest, i);
		
		return shortest;
	}
	
	// Method to find the tallest
	static int findtallest(int height[], int n){
		
		// let the tallest be height[0];
		int tallest = height[0];
		
		for(int i : height) tallest = Math.max(tallest, i);
		
		return tallest;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking height input from the user
		// Initialising an array of height to store inputs
		
		int height[] = new int[11];
		int n = 11;
		
		System.out.print("Enter the heights of the players in one go ");
		for(int i = 0; i < 11; i++){
			height[i] = input.nextInt();
		}
		
		// Displaying results
		
		String s = input.nextLine();
		
		// Displaying mean of heights
		System.out.println("Mean height is " + mean(height, n));
		
		// Displaying the shortest height
		System.out.println("Tallest height is " + findshortest(height, n));
		
		// Displaying the tallest height
		System.out.println("Tallest height is " + findtallest(height, n));
	}
}