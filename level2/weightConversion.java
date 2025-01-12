import java.util.*;
class weightConversion{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variable weight in pounds
		double weight;
		
		// Taking weight as input from the user
		weight = input.nextDouble();
		
		// Converting pounds to kilograms
		double kilograms = weight/2.2;
		
		// Displaying the result
		System.out.print("The weight of the person in pound is " + weight + " and in kg is " + kilograms);
	}
}