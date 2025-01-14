import java.util.*;
class findRounds{
	
	// Method to find total number of rounds to complete 5 km
	public static int numberofRounds(int perimeter){
		
		// Minimum rounds with the Ceil value of 5000 meter by perimeter
		return (5000+perimeter-1) / perimeter;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Sides of triangle in meter as input 
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		// One complete round or Perimeter of triangle 
		int perimeter = side1+side2+side3;
		
		System.out.print("The minimum number of rounds the athlete has to complete is " + numberofRounds(perimeter)); 
	}
}