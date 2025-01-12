import java.util.Scanner;
class Kilometers_to_Miles{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking input in Kilometers
		double Kilometers = input.nextInt();
		
		// Converting Kilometers to Miles
		double Miles = Kilometers*0.62; 
		
		System.out.print("The total miles is " + Miles + " mile for the given " + Kilometers + " km");
	}
}