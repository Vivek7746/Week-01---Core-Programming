import java.util.Scanner;
class heightConversion{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Height in "cm" as an input from the user
		double height = input.nextDouble();
		
		// Converting height to only inches (1 inch = 2.54)
		double inches = height/2.54;
		
		// Transforming inches to (feet and inches)
		int feet = (int)(inches/12);
		int remainingInches = ((int)(inches)) % 12;
		
		System.out.print("Your height in cm is " + height + " while in feet is " + feet + " and inches is " + remainingInches);
	}
}