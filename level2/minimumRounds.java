import java.util.*;
class minimumRounds{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variables for all three sides in meters
		int side1, side2, side3;
		
		// Taking the value of sides from the user
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		
		// Perimeter of the Triangle will be the Round's Length
		int roundLength = side1 + side2 + side3;
		
		// Minimum rounds will be ceil value of roundLength per 5 km or 5000 meters 
		int minimumRotations = (5000 + roundLength-1)/roundLength;
		
		// Displaying the Results
		System.out.print("The total number of rounds the athlete will run is " + minimumRotations + " to complete 5 km");
	}
}